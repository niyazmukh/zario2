package g0;

import a.AbstractC0183a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a0;
import z2.C1071b;

/* renamed from: g0.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\m.1.smali */
public class DialogInterfaceOnCancelListenerC0561m extends AbstractComponentCallbacksC0567t implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a0, reason: collision with root package name */
    public Handler f7470a0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f7479j0;

    /* renamed from: l0, reason: collision with root package name */
    public Dialog f7481l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f7482m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f7483n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f7484o0;

    /* renamed from: b0, reason: collision with root package name */
    public final B3.N f7471b0 = new B3.N(this, 25);

    /* renamed from: c0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0557i f7472c0 = new DialogInterfaceOnCancelListenerC0557i(this);

    /* renamed from: d0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0558j f7473d0 = new DialogInterfaceOnDismissListenerC0558j(this);

    /* renamed from: e0, reason: collision with root package name */
    public int f7474e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public int f7475f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f7476g0 = true;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f7477h0 = true;

    /* renamed from: i0, reason: collision with root package name */
    public int f7478i0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    public final C0559k f7480k0 = new C0559k(this);

    /* renamed from: p0, reason: collision with root package name */
    public boolean f7485p0 = false;

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        this.f7522T.e(this.f7480k0);
        if (this.f7484o0) {
            return;
        }
        this.f7483n0 = false;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public void D(Bundle bundle) {
        super.D(bundle);
        this.f7470a0 = new Handler();
        this.f7477h0 = this.f7505B == 0;
        if (bundle != null) {
            this.f7474e0 = bundle.getInt("android:style", 0);
            this.f7475f0 = bundle.getInt("android:theme", 0);
            this.f7476g0 = bundle.getBoolean("android:cancelable", true);
            this.f7477h0 = bundle.getBoolean("android:showsDialog", this.f7477h0);
            this.f7478i0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        Dialog dialog = this.f7481l0;
        if (dialog != null) {
            this.f7482m0 = true;
            dialog.setOnDismissListener(null);
            this.f7481l0.dismiss();
            if (!this.f7483n0) {
                onDismiss(this.f7481l0);
            }
            this.f7481l0 = null;
            this.f7485p0 = false;
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void H() {
        this.f7510H = true;
        if (!this.f7484o0 && !this.f7483n0) {
            this.f7483n0 = true;
        }
        this.f7522T.i(this.f7480k0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:29:0x0050, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0068), top: B:48:0x001a }] */
    @Override // g0.AbstractComponentCallbacksC0567t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater I(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.I(r8)
            boolean r0 = r7.f7477h0
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L9a
            boolean r3 = r7.f7479j0
            if (r3 == 0) goto L11
            goto L9a
        L11:
            if (r0 != 0) goto L14
            goto L71
        L14:
            boolean r0 = r7.f7485p0
            if (r0 != 0) goto L71
            r0 = 0
            r3 = 1
            r7.f7479j0 = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.Z()     // Catch: java.lang.Throwable -> L4e
            r7.f7481l0 = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f7477h0     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.f7474e0     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3b
            if (r5 == r1) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r4 = r7.n()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.f7481l0     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r4 = r7.f7481l0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f7476g0     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f7481l0     // Catch: java.lang.Throwable -> L4e
            g0.i r5 = r7.f7472c0     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f7481l0     // Catch: java.lang.Throwable -> L4e
            g0.j r5 = r7.f7473d0     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.f7485p0 = r3     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r3 = 0
            r7.f7481l0 = r3     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.f7479j0 = r0
            goto L71
        L6e:
            r7.f7479j0 = r0
            throw r8
        L71:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " from dialog context"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L8d:
            android.app.Dialog r7 = r7.f7481l0
            if (r7 == 0) goto L99
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r7)
        L99:
            return r8
        L9a:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r7 = r7.f7477h0
            if (r7 != 0) goto Lc4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "mShowsDialog = false: "
            r7.<init>(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r2, r7)
            goto Ld5
        Lc4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "mCreatingDialog = true: "
            r7.<init>(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r2, r7)
        Ld5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.DialogInterfaceOnCancelListenerC0561m.I(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public void L(Bundle bundle) {
        Dialog dialog = this.f7481l0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f7474e0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i5 = this.f7475f0;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z4 = this.f7476g0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z5 = this.f7477h0;
        if (!z5) {
            bundle.putBoolean("android:showsDialog", z5);
        }
        int i6 = this.f7478i0;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public void M() {
        this.f7510H = true;
        Dialog dialog = this.f7481l0;
        if (dialog != null) {
            this.f7482m0 = false;
            dialog.show();
            View decorView = this.f7481l0.getWindow().getDecorView();
            a0.k(decorView, this);
            decorView.setTag(2131231338, this);
            C1071b.j(decorView, this);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public void N() {
        this.f7510H = true;
        Dialog dialog = this.f7481l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void P(Bundle bundle) {
        Bundle bundle2;
        this.f7510H = true;
        if (this.f7481l0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f7481l0.onRestoreInstanceState(bundle2);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void Q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Q(layoutInflater, viewGroup, bundle);
        if (this.f7512J != null || this.f7481l0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f7481l0.onRestoreInstanceState(bundle2);
    }

    public final void Y(boolean z4, boolean z5) {
        if (this.f7483n0) {
            return;
        }
        this.f7483n0 = true;
        this.f7484o0 = false;
        Dialog dialog = this.f7481l0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f7481l0.dismiss();
            if (!z5) {
                if (Looper.myLooper() == this.f7470a0.getLooper()) {
                    onDismiss(this.f7481l0);
                } else {
                    this.f7470a0.post(this.f7471b0);
                }
            }
        }
        this.f7482m0 = true;
        if (this.f7478i0 >= 0) {
            C0542J c0542jP = p();
            int i = this.f7478i0;
            if (i < 0) {
                throw new IllegalArgumentException(B.a.g(i, "Bad id: "));
            }
            c0542jP.v(new C0540H(c0542jP, null, i), z4);
            this.f7478i0 = -1;
            return;
        }
        C0549a c0549a = new C0549a(p());
        c0549a.f7427p = true;
        C0542J c0542j = this.f7545w;
        if (c0542j != null && c0542j != c0549a.f7428q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0549a.b(new Q(3, this));
        if (z4) {
            c0549a.d(true);
        } else {
            c0549a.d(false);
        }
    }

    public Dialog Z() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new b.m(S(), this.f7475f0);
    }

    public final Dialog a0() {
        Dialog dialog = this.f7481l0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void b0(C0542J c0542j, String str) {
        this.f7483n0 = false;
        this.f7484o0 = true;
        c0542j.getClass();
        C0549a c0549a = new C0549a(c0542j);
        c0549a.f7427p = true;
        c0549a.e(0, this, str, 1);
        c0549a.d(false);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final AbstractC0183a i() {
        return new C0560l(this, new C0564p(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f7482m0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        Y(true, true);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void z() {
        this.f7510H = true;
    }
}
