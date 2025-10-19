package h1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\b.smali */
public final class DialogFragmentC0589b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f7624a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f7625b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f7626c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7625b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f7624a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f7626c == null) {
            Activity activity = getActivity();
            C.f(activity);
            this.f7626c = new AlertDialog.Builder(activity).create();
        }
        return this.f7626c;
    }
}
