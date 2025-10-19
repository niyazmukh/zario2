package g0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\i.1.smali */
public final class DialogInterfaceOnCancelListenerC0557i implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0561m f7465a;

    public DialogInterfaceOnCancelListenerC0557i(DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m) {
        this.f7465a = dialogInterfaceOnCancelListenerC0561m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = this.f7465a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0561m.f7481l0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0561m.onCancel(dialog);
        }
    }
}
