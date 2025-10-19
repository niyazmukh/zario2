package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractBinderC0363a;
import com.google.android.gms.common.internal.InterfaceC0375m;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;
import h1.C0588a;
import h1.C0591d;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\Y.smali */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5607a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5609c;

    public /* synthetic */ Y(int i, Object obj, Object obj2) {
        this.f5607a = i;
        this.f5609c = obj;
        this.f5608b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0375m interfaceC0375m;
        Set set;
        InterfaceC0375m q5 = null;
        switch (this.f5607a) {
            case 0:
                if (((A) this.f5609c).f5542a) {
                    C0588a c0588a = ((X) this.f5608b).f5606b;
                    if ((c0588a.f7621b == 0 || c0588a.f7622c == null) ? false : true) {
                        A a5 = (A) this.f5609c;
                        InterfaceC0351m interfaceC0351m = a5.mLifecycleFragment;
                        Activity activity = a5.getActivity();
                        PendingIntent pendingIntent = c0588a.f7622c;
                        com.google.android.gms.common.internal.C.f(pendingIntent);
                        int i = ((X) this.f5608b).f5605a;
                        int i5 = GoogleApiActivity.f5526b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i);
                        intent.putExtra("notify_manager", false);
                        interfaceC0351m.startActivityForResult(intent, 1);
                        return;
                    }
                    A a6 = (A) this.f5609c;
                    if (a6.f5545d.a(a6.getActivity(), c0588a.f7621b, null) != null) {
                        A a7 = (A) this.f5609c;
                        C0591d c0591d = a7.f5545d;
                        Activity activity2 = a7.getActivity();
                        A a8 = (A) this.f5609c;
                        c0591d.h(activity2, a8.mLifecycleFragment, c0588a.f7621b, a8);
                        return;
                    }
                    if (c0588a.f7621b != 18) {
                        A a9 = (A) this.f5609c;
                        int i6 = ((X) this.f5608b).f5605a;
                        a9.f5543b.set(null);
                        a9.f5547f.h(c0588a, i6);
                        return;
                    }
                    A a10 = (A) this.f5609c;
                    C0591d c0591d2 = a10.f5545d;
                    Activity activity3 = a10.getActivity();
                    A a11 = (A) this.f5609c;
                    c0591d2.getClass();
                    ProgressBar progressBar = new ProgressBar(activity3, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
                    builder.setView(progressBar);
                    builder.setMessage(com.google.android.gms.common.internal.v.b(activity3, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    C0591d.f(activity3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", a11);
                    A a12 = (A) this.f5609c;
                    C0591d c0591d3 = a12.f5545d;
                    Context applicationContext = a12.getActivity().getApplicationContext();
                    C0362z c0362z = new C0362z(this, alertDialogCreate);
                    c0591d3.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    H h = new H(c0362z);
                    zao.zaa(applicationContext, h, intentFilter);
                    h.f5574a = applicationContext;
                    if (h1.h.a(applicationContext)) {
                        return;
                    }
                    A a13 = (A) this.f5609c;
                    a13.f5543b.set(null);
                    zau zauVar = a13.f5547f.f5638n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (h) {
                        try {
                            Context context = h.f5574a;
                            if (context != null) {
                                context.unregisterReceiver(h);
                            }
                            h.f5574a = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                F f2 = (F) this.f5609c;
                D d5 = (D) ((C0346h) f2.f5572g).f5634j.get((C0339a) f2.f5569d);
                if (d5 == null) {
                    return;
                }
                C0588a c0588a2 = (C0588a) this.f5608b;
                if (!(c0588a2.f7621b == 0)) {
                    d5.p(c0588a2, null);
                    return;
                }
                f2.f5567b = true;
                com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) f2.f5568c;
                if (gVar.requiresSignIn()) {
                    if (!f2.f5567b || (interfaceC0375m = (InterfaceC0375m) f2.f5570e) == null) {
                        return;
                    }
                    gVar.getRemoteService(interfaceC0375m, (Set) f2.f5571f);
                    return;
                }
                try {
                    gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e5) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e5);
                    gVar.disconnect("Failed to get service from broker.");
                    d5.p(new C0588a(10), null);
                    return;
                }
            default:
                z1.g gVar2 = (z1.g) this.f5608b;
                C0588a c0588a3 = gVar2.f11212b;
                boolean z4 = c0588a3.f7621b == 0;
                N n5 = (N) this.f5609c;
                if (z4) {
                    com.google.android.gms.common.internal.z zVar = gVar2.f11213c;
                    com.google.android.gms.common.internal.C.f(zVar);
                    C0588a c0588a4 = zVar.f5768c;
                    if (c0588a4.f7621b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c0588a4)), new Exception());
                        n5.i.e(c0588a4);
                        n5.f5594f.disconnect();
                        return;
                    }
                    F f3 = n5.i;
                    IBinder iBinder = zVar.f5767b;
                    if (iBinder != null) {
                        int i7 = AbstractBinderC0363a.f5696a;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        q5 = iInterfaceQueryLocalInterface instanceof InterfaceC0375m ? (InterfaceC0375m) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.Q(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    f3.getClass();
                    if (q5 == null || (set = n5.f5592d) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        f3.e(new C0588a(4));
                    } else {
                        f3.f5570e = q5;
                        f3.f5571f = set;
                        if (f3.f5567b) {
                            ((com.google.android.gms.common.api.g) f3.f5568c).getRemoteService(q5, set);
                        }
                    }
                } else {
                    n5.i.e(c0588a3);
                }
                n5.f5594f.disconnect();
                return;
        }
    }
}
