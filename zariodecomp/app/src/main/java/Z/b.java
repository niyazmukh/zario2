package Z;

import W.C0163e;
import W.InterfaceC0161c;
import W.O;
import W.T;
import android.content.Context;
import f4.C;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3926a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.i f3927b;

    /* renamed from: c, reason: collision with root package name */
    public final X3.l f3928c;

    /* renamed from: d, reason: collision with root package name */
    public final C f3929d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3930e;

    /* renamed from: f, reason: collision with root package name */
    public volatile h1.i f3931f;

    public b(String name, h1.i iVar, X3.l lVar, C c5) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f3926a = name;
        this.f3927b = iVar;
        this.f3928c = lVar;
        this.f3929d = c5;
        this.f3930e = new Object();
    }

    public final h1.i a(Context thisRef, c4.h property) {
        h1.i iVar;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        h1.i iVar2 = this.f3931f;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this.f3930e) {
            try {
                if (this.f3931f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    InterfaceC0161c eVar = this.f3927b;
                    X3.l lVar = this.f3928c;
                    kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    C c5 = this.f3929d;
                    P0.b bVar = new P0.b(2, applicationContext, this);
                    kotlin.jvm.internal.i.e(migrations, "migrations");
                    T t4 = new T(new O0.g(bVar, 2));
                    if (eVar == null) {
                        eVar = new G2.e();
                    }
                    this.f3931f = new h1.i(new h1.i(new O(t4, p1.b.B(new C0163e(migrations, null)), eVar, c5), 11), 11);
                }
                iVar = this.f3931f;
                kotlin.jvm.internal.i.b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }
}
