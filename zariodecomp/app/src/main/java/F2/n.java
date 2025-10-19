package F2;

import android.net.Uri;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import r.AbstractC0854a;
import w2.C1024a;
import w2.E;
import w2.t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\n.smali */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f1723a = new ConcurrentHashMap();

    public static void a(String str, boolean z4) {
        if (!z4) {
            throw new RuntimeException("Hard assert failed: ".concat(str));
        }
    }

    public static Object b(Object obj, m mVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        int i = mVar.f1720a;
        if (i > 500) {
            throw c(mVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                return obj;
            }
            throw c(mVar, "Numbers of type " + obj.getClass().getSimpleName() + " are not supported, please use an int, long, float or double");
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Character) {
            throw c(mVar, "Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw c(mVar, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                map.put(str, b(entry.getValue(), new m(mVar, str, i + 1)));
            }
            return map;
        }
        if (obj instanceof Collection) {
            if (!(obj instanceof List)) {
                throw c(mVar, "Serializing Collections is not supported, please use Lists instead");
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (int i5 = 0; i5 < list.size(); i5++) {
                arrayList.add(b(list.get(i5), new m(mVar, B.a.i("[", i5, "]"), i + 1)));
            }
            return arrayList;
        }
        if (obj.getClass().isArray()) {
            throw c(mVar, "Serializing Arrays is not supported, please use Lists instead");
        }
        if (obj instanceof Enum) {
            String strName = ((Enum) obj).name();
            try {
                Field field = obj.getClass().getField(strName);
                String strB = l.b(field);
                return strB != null ? strB : field.getName();
            } catch (NoSuchFieldException unused) {
                return strName;
            }
        }
        if ((obj instanceof Date) || (obj instanceof l2.o) || (obj instanceof t) || (obj instanceof C1024a) || (obj instanceof w2.g) || (obj instanceof w2.n) || (obj instanceof E)) {
            return obj;
        }
        if ((obj instanceof Uri) || (obj instanceof URI) || (obj instanceof URL)) {
            return obj.toString();
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = f1723a;
        l lVar = (l) concurrentHashMap.get(cls);
        if (lVar == null) {
            lVar = new l(cls);
            concurrentHashMap.put(cls, lVar);
        }
        Class<?> cls2 = obj.getClass();
        Class cls3 = lVar.f1712a;
        if (!cls3.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls3);
        }
        HashMap map2 = new HashMap();
        for (String str2 : lVar.f1713b.values()) {
            if (!lVar.f1718g.contains(str2)) {
                HashMap map3 = lVar.f1714c;
                if (map3.containsKey(str2)) {
                    try {
                        objInvoke = ((Method) map3.get(str2)).invoke(obj, null);
                    } catch (IllegalAccessException e5) {
                        throw new RuntimeException(e5);
                    } catch (InvocationTargetException e6) {
                        throw new RuntimeException(e6);
                    }
                } else {
                    Field field2 = (Field) lVar.f1716e.get(str2);
                    if (field2 == null) {
                        throw new IllegalStateException(AbstractC0854a.b("Bean property without field or getter: ", str2));
                    }
                    try {
                        objInvoke = field2.get(obj);
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException(e7);
                    }
                }
                map2.put(str2, (lVar.f1717f.contains(str2) && objInvoke == null) ? w2.n.f10937a : b(objInvoke, new m(mVar, str2, i + 1)));
            }
        }
        return map2;
    }

    public static IllegalArgumentException c(m mVar, String str) {
        String strConcat = "Could not serialize object. ".concat(str);
        if (mVar.f1720a > 0) {
            strConcat = strConcat + " (found in field '" + mVar.toString() + "')";
        }
        return new IllegalArgumentException(strConcat);
    }
}
