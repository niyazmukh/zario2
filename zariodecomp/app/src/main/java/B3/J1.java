package B3;

import z3.C1092p;
import z3.InterfaceC1085i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\J1.smali */
public final class J1 implements O1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f446b;

    public /* synthetic */ J1(Object obj, int i) {
        this.f445a = i;
        this.f446b = obj;
    }

    @Override // B3.O1
    public final void a(V1 v12) {
        switch (this.f445a) {
            case 0:
                v12.f577a.a((InterfaceC1085i) this.f446b);
                break;
            case 1:
                v12.f577a.f((C1092p) this.f446b);
                break;
            default:
                v12.f577a.c((z3.r) this.f446b);
                break;
        }
    }
}
