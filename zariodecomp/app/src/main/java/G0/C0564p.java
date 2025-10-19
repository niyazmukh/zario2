package g0;

import a.AbstractC0183a;
import android.view.View;

/* renamed from: g0.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\p.1.smali */
public final class C0564p extends AbstractC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0567t f7488a;

    public C0564p(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        this.f7488a = abstractComponentCallbacksC0567t;
    }

    @Override // a.AbstractC0183a
    public final View Y(int i) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7488a;
        View view = abstractComponentCallbacksC0567t.f7512J;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0567t + " does not have a view");
    }

    @Override // a.AbstractC0183a
    public final boolean Z() {
        return this.f7488a.f7512J != null;
    }
}
