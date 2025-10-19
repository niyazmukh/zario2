package g0;

import android.os.Bundle;
import androidx.lifecycle.a0;

/* renamed from: g0.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\o.1.smali */
public final class C0563o extends AbstractC0566s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0567t f7487a;

    public C0563o(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        this.f7487a = abstractComponentCallbacksC0567t;
    }

    @Override // g0.AbstractC0566s
    public final void a() {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7487a;
        abstractComponentCallbacksC0567t.f7524V.f();
        a0.f(abstractComponentCallbacksC0567t);
        Bundle bundle = abstractComponentCallbacksC0567t.f7528b;
        abstractComponentCallbacksC0567t.f7524V.h(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
