package l2;

import S0.l;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0341c;
import com.google.android.gms.common.internal.C;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o1.AbstractC0794a;
import q.C0833j;
import q2.C0849a;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l2\f.smali */
public final class f {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f8769j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final q.b f8770k = new q.b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f8771a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8772b;

    /* renamed from: c, reason: collision with root package name */
    public final j f8773c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.f f8774d;

    /* renamed from: g, reason: collision with root package name */
    public final H2.b f8777g;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8775e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f8776f = new AtomicBoolean();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public f(Context context, String str, j jVar) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        final int i = 1;
        final int i5 = 0;
        this.f8771a = context;
        C.d(str);
        this.f8772b = str;
        this.f8773c = jVar;
        a aVar = FirebaseInitProvider.f6405a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new H2.b() { // from class: q2.c
                @Override // H2.b
                public final Object get() throws ClassNotFoundException {
                    int i6 = i5;
                    Object obj = str3;
                    switch (i6) {
                        case 0:
                            String str4 = (String) obj;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                                }
                                throw new l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused2) {
                                Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                                return null;
                            } catch (IllegalAccessException e5) {
                                throw new l(B.a.l("Could not instantiate ", str4, "."), e5);
                            } catch (InstantiationException e6) {
                                throw new l(B.a.l("Could not instantiate ", str4, "."), e6);
                            } catch (NoSuchMethodException e7) {
                                throw new l(AbstractC0854a.b("Could not instantiate ", str4), e7);
                            } catch (InvocationTargetException e8) {
                                throw new l(AbstractC0854a.b("Could not instantiate ", str4), e8);
                            }
                        default:
                            return (ComponentRegistrar) obj;
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        r2.i iVar = r2.i.f9634a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new H2.b() { // from class: q2.c
            @Override // H2.b
            public final Object get() throws ClassNotFoundException {
                int i6 = i;
                Object obj = firebaseCommonRegistrar;
                switch (i6) {
                    case 0:
                        String str4 = (String) obj;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e5) {
                            throw new l(B.a.l("Could not instantiate ", str4, "."), e5);
                        } catch (InstantiationException e6) {
                            throw new l(B.a.l("Could not instantiate ", str4, "."), e6);
                        } catch (NoSuchMethodException e7) {
                            throw new l(AbstractC0854a.b("Could not instantiate ", str4), e7);
                        } catch (InvocationTargetException e8) {
                            throw new l(AbstractC0854a.b("Could not instantiate ", str4), e8);
                        }
                    default:
                        return (ComponentRegistrar) obj;
                }
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new H2.b() { // from class: q2.c
            @Override // H2.b
            public final Object get() throws ClassNotFoundException {
                int i6 = i;
                Object obj = executorsRegistrar;
                switch (i6) {
                    case 0:
                        String str4 = (String) obj;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e5) {
                            throw new l(B.a.l("Could not instantiate ", str4, "."), e5);
                        } catch (InstantiationException e6) {
                            throw new l(B.a.l("Could not instantiate ", str4, "."), e6);
                        } catch (NoSuchMethodException e7) {
                            throw new l(AbstractC0854a.b("Could not instantiate ", str4), e7);
                        } catch (InvocationTargetException e8) {
                            throw new l(AbstractC0854a.b("Could not instantiate ", str4), e8);
                        }
                    default:
                        return (ComponentRegistrar) obj;
                }
            }
        });
        arrayList4.add(C0849a.a(context, Context.class, new Class[0]));
        arrayList4.add(C0849a.a(this, f.class, new Class[0]));
        arrayList4.add(C0849a.a(jVar, j.class, new Class[0]));
        J3.c cVar = new J3.c();
        if (I.n.a(context) && FirebaseInitProvider.f6406b.get()) {
            arrayList4.add(C0849a.a(aVar, a.class, new Class[0]));
        }
        q2.f fVar = new q2.f(arrayList3, arrayList4, cVar);
        this.f8774d = fVar;
        Trace.endSection();
        this.f8777g = fVar.b(G2.d.class);
        c cVar2 = new c(this);
        a();
        if (this.f8775e.get()) {
            ComponentCallbacks2C0341c.f5618e.f5619a.get();
        }
        this.h.add(cVar2);
        Trace.endSection();
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        synchronized (f8769j) {
            try {
                Iterator it = ((C0833j) f8770k.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    fVar.a();
                    arrayList.add(fVar.f8772b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static f c() {
        f fVar;
        synchronized (f8769j) {
            try {
                fVar = (f) f8770k.getOrDefault("[DEFAULT]", null);
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (AbstractC0794a.f9161f == null) {
                        AbstractC0794a.f9161f = Application.getProcessName();
                    }
                    sb.append(AbstractC0794a.f9161f);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((G2.d) fVar.f8777g.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f d(String str) {
        f fVar;
        String str2;
        synchronized (f8769j) {
            try {
                fVar = (f) f8770k.getOrDefault(str.trim(), null);
                if (fVar == null) {
                    ArrayList arrayListB = b();
                    if (arrayListB.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListB);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((G2.d) fVar.f8777g.get()).b();
            } finally {
            }
        }
        return fVar;
    }

    public static f g(Context context) {
        synchronized (f8769j) {
            try {
                if (f8770k.containsKey("[DEFAULT]")) {
                    return c();
                }
                j jVarA = j.a(context);
                if (jVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return h(context, jVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f h(Context context, j jVar) {
        f fVar;
        AtomicReference atomicReference = d.f8766a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f8766a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                while (true) {
                    if (atomicReference2.compareAndSet(null, dVar)) {
                        ComponentCallbacks2C0341c.b(application);
                        ComponentCallbacks2C0341c.f5618e.a(dVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f8769j) {
            q.b bVar = f8770k;
            C.h("FirebaseApp name [DEFAULT] already exists!", !bVar.containsKey("[DEFAULT]"));
            C.g(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", jVar);
            bVar.put("[DEFAULT]", fVar);
        }
        fVar.f();
        return fVar;
    }

    public final void a() {
        C.h("FirebaseApp was deleted", !this.f8776f.get());
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f8772b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f8773c.f8784b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.a();
        return this.f8772b.equals(fVar.f8772b);
    }

    public final void f() {
        HashMap map;
        if (!I.n.a(this.f8771a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f8772b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f8771a;
            AtomicReference atomicReference = e.f8767b;
            if (atomicReference.get() == null) {
                e eVar = new e(context);
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f8772b);
        Log.i("FirebaseApp", sb2.toString());
        q2.f fVar = this.f8774d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f8772b);
        AtomicReference atomicReference2 = fVar.f9482f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (fVar) {
                    map = new HashMap(fVar.f9477a);
                }
                fVar.i(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((G2.d) this.f8777g.get()).b();
    }

    public final int hashCode() {
        return this.f8772b.hashCode();
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.c(this.f8772b, "name");
        lVar.c(this.f8773c, "options");
        return lVar.toString();
    }
}
