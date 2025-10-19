package C3;

import B3.H;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\a.smali */
public final class a extends H {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f1108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i) {
        super(cVar, 1);
        this.f1107c = i;
        switch (i) {
            case 1:
                this.f1108d = cVar;
                super(cVar, 1);
                J3.b.b();
                break;
            default:
                this.f1108d = cVar;
                J3.b.b();
                break;
        }
    }

    @Override // B3.H
    public final void b() {
        c cVar;
        int i;
        c cVar2;
        switch (this.f1107c) {
            case 0:
                q4.d dVar = new q4.d();
                J3.b.c();
                try {
                    J3.a aVar = J3.b.f2098a;
                    aVar.getClass();
                    synchronized (this.f1108d.f1111a) {
                        q4.d dVar2 = this.f1108d.f1112b;
                        dVar.b(dVar2, dVar2.a());
                        cVar = this.f1108d;
                        cVar.f1116f = false;
                        i = cVar.f1123q;
                    }
                    cVar.f1119m.b(dVar, dVar.f9515b);
                    synchronized (this.f1108d.f1111a) {
                        this.f1108d.f1123q -= i;
                    }
                    aVar.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        J3.b.f2098a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                q4.d dVar3 = new q4.d();
                J3.b.c();
                try {
                    J3.a aVar2 = J3.b.f2098a;
                    aVar2.getClass();
                    synchronized (this.f1108d.f1111a) {
                        q4.d dVar4 = this.f1108d.f1112b;
                        dVar3.b(dVar4, dVar4.f9515b);
                        cVar2 = this.f1108d;
                        cVar2.f1117k = false;
                    }
                    cVar2.f1119m.b(dVar3, dVar3.f9515b);
                    this.f1108d.f1119m.flush();
                    aVar2.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        J3.b.f2098a.getClass();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
