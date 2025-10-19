package T0;

import B3.H;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\b.smali */
public final class b extends H {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K0.r f3134c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f3135d;

    public b(K0.r rVar, UUID uuid) {
        this.f3134c = rVar;
        this.f3135d = uuid;
    }

    @Override // B3.H
    public final void d() {
        K0.r rVar = this.f3134c;
        WorkDatabase workDatabase = rVar.f2174c;
        workDatabase.c();
        try {
            H.a(rVar, this.f3135d.toString());
            workDatabase.o();
            workDatabase.j();
            K0.k.b(rVar.f2173b, rVar.f2174c, rVar.f2176e);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
