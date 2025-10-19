package b;

import androidx.lifecycle.C0242x;
import androidx.lifecycle.InterfaceC0239t;
import androidx.lifecycle.InterfaceC0241v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\u.smali */
public final class u implements InterfaceC0239t, InterfaceC0246c {

    /* renamed from: a, reason: collision with root package name */
    public final C0242x f4935a;

    /* renamed from: b, reason: collision with root package name */
    public final n f4936b;

    /* renamed from: c, reason: collision with root package name */
    public v f4937c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f4938d;

    public u(x xVar, C0242x c0242x, n onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.f4938d = xVar;
        this.f4935a = c0242x;
        this.f4936b = onBackPressedCallback;
        c0242x.a(this);
    }

    @Override // b.InterfaceC0246c
    public final void cancel() {
        this.f4935a.f(this);
        this.f4936b.f4921b.remove(this);
        v vVar = this.f4937c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f4937c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0239t
    public final void onStateChanged(InterfaceC0241v interfaceC0241v, androidx.lifecycle.n nVar) {
        if (nVar != androidx.lifecycle.n.ON_START) {
            if (nVar != androidx.lifecycle.n.ON_STOP) {
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                v vVar = this.f4937c;
                if (vVar != null) {
                    vVar.cancel();
                    return;
                }
                return;
            }
        }
        x xVar = this.f4938d;
        xVar.getClass();
        n onBackPressedCallback = this.f4936b;
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        xVar.f4943b.addLast(onBackPressedCallback);
        v vVar2 = new v(xVar, onBackPressedCallback);
        onBackPressedCallback.f4921b.add(vVar2);
        xVar.d();
        onBackPressedCallback.f4922c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f4937c = vVar2;
    }
}
