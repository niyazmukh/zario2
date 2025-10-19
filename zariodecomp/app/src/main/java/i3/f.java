package I3;

import z3.C1088l;
import z3.L;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\f.smali */
public final class f implements L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1941a;

    /* renamed from: b, reason: collision with root package name */
    public final L f1942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f1943c;

    public /* synthetic */ f(b bVar, L l4, int i) {
        this.f1941a = i;
        this.f1943c = bVar;
        this.f1942b = l4;
    }

    @Override // z3.L
    public final void a(C1088l c1088l) {
        switch (this.f1941a) {
            case 0:
                this.f1942b.a(c1088l);
                ((g) this.f1943c).f1945b.a(c1088l);
                break;
            default:
                r rVar = (r) this.f1943c;
                rVar.f1976d = c1088l;
                if (!rVar.f1975c) {
                    this.f1942b.a(c1088l);
                    break;
                }
                break;
        }
    }
}
