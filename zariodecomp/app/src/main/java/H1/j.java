package h1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.common.internal.C;
import g0.DialogInterfaceOnCancelListenerC0561m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\j.smali */
public class j extends DialogInterfaceOnCancelListenerC0561m {

    /* renamed from: q0, reason: collision with root package name */
    public AlertDialog f7642q0;

    /* renamed from: r0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f7643r0;

    /* renamed from: s0, reason: collision with root package name */
    public AlertDialog f7644s0;

    @Override // g0.DialogInterfaceOnCancelListenerC0561m
    public final Dialog Z() {
        AlertDialog alertDialog = this.f7642q0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f7477h0 = false;
        if (this.f7644s0 == null) {
            Context contextN = n();
            C.f(contextN);
            this.f7644s0 = new AlertDialog.Builder(contextN).create();
        }
        return this.f7644s0;
    }

    @Override // g0.DialogInterfaceOnCancelListenerC0561m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7643r0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
