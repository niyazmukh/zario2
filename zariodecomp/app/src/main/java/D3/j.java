package D3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\j.smali */
public final class j implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1367a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1368b;

    /* renamed from: c, reason: collision with root package name */
    public String f1369c;

    public j(ArrayList arrayList) {
        this.f1367a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = n.f1387a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f1368b = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f1367a;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.f1369c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f1369c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f1369c = (String) objArr[0];
        return null;
    }
}
