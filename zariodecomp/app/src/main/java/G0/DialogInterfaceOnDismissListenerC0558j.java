package g0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\j.1.smali */
public final class DialogInterfaceOnDismissListenerC0558j implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0561m f7466a;

    public DialogInterfaceOnDismissListenerC0558j(DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m) {
        this.f7466a = dialogInterfaceOnCancelListenerC0561m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = this.f7466a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0561m.f7481l0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0561m.onDismiss(dialog);
        }
    }
}
