package androidx.lifecycle;

import f4.C0516n;
import f4.InterfaceC0506g0;
import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\P.smali */
public final class P implements InterfaceC0239t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f4602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f4603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f4.C f4604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f4605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0516n f4606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o4.c f4607f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q3.j f4608k;

    /* JADX WARN: Multi-variable type inference failed */
    public P(n nVar, kotlin.jvm.internal.r rVar, f4.C c5, n nVar2, C0516n c0516n, o4.c cVar, X3.p pVar) {
        this.f4602a = nVar;
        this.f4603b = rVar;
        this.f4604c = c5;
        this.f4605d = nVar2;
        this.f4606e = c0516n;
        this.f4607f = cVar;
        this.f4608k = (Q3.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Q3.j, X3.p] */
    @Override // androidx.lifecycle.InterfaceC0239t
    public final void onStateChanged(InterfaceC0241v interfaceC0241v, n nVar) {
        kotlin.jvm.internal.r rVar = this.f4603b;
        if (nVar == this.f4602a) {
            rVar.f8431a = f4.E.t(this.f4604c, null, null, new O(this.f4607f, this.f4608k, null), 3);
            return;
        }
        if (nVar == this.f4605d) {
            InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) rVar.f8431a;
            if (interfaceC0506g0 != null) {
                interfaceC0506g0.cancel((CancellationException) null);
            }
            rVar.f8431a = null;
        }
        if (nVar == n.ON_DESTROY) {
            this.f4606e.resumeWith(K3.k.f2288a);
        }
    }
}
