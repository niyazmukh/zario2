package g0;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0241v;

/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\k.1.smali */
public final class C0559k implements androidx.lifecycle.H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0561m f7467a;

    public C0559k(DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m) {
        this.f7467a = dialogInterfaceOnCancelListenerC0561m;
    }

    @Override // androidx.lifecycle.H
    public final void a(Object obj) {
        if (((InterfaceC0241v) obj) != null) {
            DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = this.f7467a;
            if (dialogInterfaceOnCancelListenerC0561m.f7477h0) {
                View viewT = dialogInterfaceOnCancelListenerC0561m.T();
                if (viewT.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0561m.f7481l0 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0561m.f7481l0);
                    }
                    dialogInterfaceOnCancelListenerC0561m.f7481l0.setContentView(viewT);
                }
            }
        }
    }
}
