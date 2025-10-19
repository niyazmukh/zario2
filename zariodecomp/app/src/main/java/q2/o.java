package q2;

import A2.C0011k;
import E2.n;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\o.smali */
public final class o implements H2.b {

    /* renamed from: c, reason: collision with root package name */
    public static final n f9496c = new n(9);

    /* renamed from: d, reason: collision with root package name */
    public static final e f9497d = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public H2.a f9498a;

    /* renamed from: b, reason: collision with root package name */
    public volatile H2.b f9499b;

    public o(n nVar, H2.b bVar) {
        this.f9498a = nVar;
        this.f9499b = bVar;
    }

    public final void a(H2.a aVar) {
        H2.b bVar;
        H2.b bVar2;
        H2.b bVar3 = this.f9499b;
        e eVar = f9497d;
        if (bVar3 != eVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f9499b;
            if (bVar != eVar) {
                bVar2 = bVar;
            } else {
                this.f9498a = new C0011k(7, this.f9498a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override // H2.b
    public final Object get() {
        return this.f9499b.get();
    }
}
