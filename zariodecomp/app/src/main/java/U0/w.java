package u0;

import A2.C0004d;
import android.app.ActivityManager;
import android.content.Context;
import e4.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import m.C0735b;
import m.ExecutorC0734a;
import v0.AbstractC0977a;
import y0.InterfaceC1043b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\w.smali */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10444a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f10445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10446c;

    /* renamed from: g, reason: collision with root package name */
    public Executor f10450g;
    public Executor h;
    public C0004d i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10451j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10454m;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f10458q;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10447d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10448e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10449f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f10452k = 1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10453l = true;

    /* renamed from: n, reason: collision with root package name */
    public final long f10455n = -1;

    /* renamed from: o, reason: collision with root package name */
    public final h1.i f10456o = new h1.i(23);

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f10457p = new LinkedHashSet();

    public w(Context context, Class cls, String str) {
        this.f10444a = context;
        this.f10445b = cls;
        this.f10446c = str;
    }

    public final void a(AbstractC0977a... migrations) {
        kotlin.jvm.internal.i.e(migrations, "migrations");
        if (this.f10458q == null) {
            this.f10458q = new HashSet();
        }
        for (AbstractC0977a abstractC0977a : migrations) {
            HashSet hashSet = this.f10458q;
            kotlin.jvm.internal.i.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC0977a.f10554a));
            HashSet hashSet2 = this.f10458q;
            kotlin.jvm.internal.i.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC0977a.f10555b));
        }
        this.f10456o.u((AbstractC0977a[]) Arrays.copyOf(migrations, migrations.length));
    }

    public final x b() throws ClassNotFoundException {
        int i;
        Executor executor = this.f10450g;
        if (executor == null && this.h == null) {
            ExecutorC0734a executorC0734a = C0735b.f8809c;
            this.h = executorC0734a;
            this.f10450g = executorC0734a;
        } else if (executor != null && this.h == null) {
            this.h = executor;
        } else if (executor == null) {
            this.f10450g = this.h;
        }
        HashSet hashSet = this.f10458q;
        LinkedHashSet linkedHashSet = this.f10457p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(B.a.g(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC1043b cVar = this.i;
        if (cVar == null) {
            cVar = new J3.c();
        }
        InterfaceC1043b interfaceC1043b = cVar;
        if (this.f10455n > 0) {
            if (this.f10446c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        ArrayList arrayList = this.f10447d;
        boolean z4 = this.f10451j;
        int i5 = this.f10452k;
        if (i5 == 0) {
            throw null;
        }
        Context context = this.f10444a;
        if (i5 != 1) {
            i = i5;
        } else {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null || activityManager.isLowRamDevice()) {
                i5 = 2;
                i = i5;
            } else {
                i = 3;
            }
        }
        Executor executor2 = this.f10450g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C0968i c0968i = new C0968i(context, this.f10446c, interfaceC1043b, this.f10456o, arrayList, z4, i, executor2, executor3, this.f10453l, this.f10454m, linkedHashSet, this.f10448e, this.f10449f);
        Class cls = this.f10445b;
        Package r22 = cls.getPackage();
        kotlin.jvm.internal.i.b(r22);
        String fullPackage = r22.getName();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.i.b(canonicalName);
        kotlin.jvm.internal.i.d(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.i.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = m.u0(canonicalName, '.').concat("_Impl");
        try {
            Class<?> cls2 = Class.forName(fullPackage.length() == 0 ? strConcat : fullPackage + '.' + strConcat, true, cls.getClassLoader());
            kotlin.jvm.internal.i.c(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            x xVar = (x) cls2.getDeclaredConstructor(null).newInstance(null);
            xVar.getClass();
            xVar.f10462d = xVar.e(c0968i);
            Set setH = xVar.h();
            BitSet bitSet = new BitSet();
            Iterator it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = xVar.h;
                ArrayList arrayList2 = c0968i.f10420n;
                int i6 = -1;
                if (zHasNext) {
                    Class cls3 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i7 = size - 1;
                            if (cls3.isAssignableFrom(arrayList2.get(size).getClass())) {
                                bitSet.set(size);
                                i6 = size;
                                break;
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size = i7;
                        }
                    }
                    if (i6 < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls3, arrayList2.get(i6));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i8 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i8 < 0) {
                                break;
                            }
                            size2 = i8;
                        }
                    }
                    Iterator it3 = xVar.f(linkedHashMap).iterator();
                    while (true) {
                        boolean zContainsKey = false;
                        if (!it3.hasNext()) {
                            break;
                        }
                        AbstractC0977a abstractC0977a = (AbstractC0977a) it3.next();
                        int i9 = abstractC0977a.f10554a;
                        h1.i iVar = c0968i.f10412d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) iVar.f7641b;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i9))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i9));
                            if (map == null) {
                                map = L3.t.f2352a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(abstractC0977a.f10555b));
                        }
                        if (!zContainsKey) {
                            iVar.u(abstractC0977a);
                        }
                    }
                    xVar.g().setWriteAheadLoggingEnabled(c0968i.f10415g == 3);
                    xVar.f10465g = c0968i.f10413e;
                    xVar.f10460b = c0968i.h;
                    xVar.f10461c = new T0.m(c0968i.i);
                    xVar.f10464f = c0968i.f10414f;
                    Map mapI = xVar.i();
                    BitSet bitSet2 = new BitSet();
                    Iterator it4 = mapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it4.hasNext();
                        ArrayList arrayList3 = c0968i.f10419m;
                        if (!zHasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i10 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i10 < 0) {
                                        break;
                                    }
                                    size3 = i10;
                                }
                            }
                            return xVar;
                        }
                        Map.Entry entry = (Map.Entry) it4.next();
                        Class cls4 = (Class) entry.getKey();
                        for (Class cls5 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i11 = size4 - 1;
                                    if (cls5.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i11 < 0) {
                                        break;
                                    }
                                    size4 = i11;
                                }
                            } else {
                                size4 = -1;
                            }
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls5 + ") for " + cls4.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            xVar.f10468l.put(cls5, arrayList3.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }
}
