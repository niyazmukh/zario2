package g0;

import a.AbstractC0183a;
import android.app.Dialog;
import android.view.View;

/* renamed from: g0.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\l.1.smali */
public final class C0560l extends AbstractC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0564p f7468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0561m f7469b;

    public C0560l(DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m, C0564p c0564p) {
        this.f7469b = dialogInterfaceOnCancelListenerC0561m;
        this.f7468a = c0564p;
    }

    @Override // a.AbstractC0183a
    public final View Y(int i) {
        C0564p c0564p = this.f7468a;
        if (c0564p.Z()) {
            return c0564p.Y(i);
        }
        Dialog dialog = this.f7469b.f7481l0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // a.AbstractC0183a
    public final boolean Z() {
        return this.f7468a.Z() || this.f7469b.f7485p0;
    }
}
