package T0;

import B3.H;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\c.smali */
public final class c extends H {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K0.r f3136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3138e;

    public c(K0.r rVar, String str, boolean z4) {
        this.f3136c = rVar;
        this.f3137d = str;
        this.f3138e = z4;
    }

    @Override // B3.H
    public final void d() {
        K0.r rVar = this.f3136c;
        WorkDatabase workDatabase = rVar.f2174c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.v().j(this.f3137d).iterator();
            while (it.hasNext()) {
                H.a(rVar, (String) it.next());
            }
            workDatabase.o();
            workDatabase.j();
            if (this.f3138e) {
                K0.k.b(rVar.f2173b, rVar.f2174c, rVar.f2176e);
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
