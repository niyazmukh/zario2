package h1;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC0351m;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import g0.AbstractActivityC0570w;
import g0.C0542J;
import o1.AbstractC0794a;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\d.smali */
public final class C0591d extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7630c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final C0591d f7631d = new C0591d();

    public static AlertDialog e(Activity activity, int i, w wVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(v.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(2131886167) : resources.getString(2131886177) : resources.getString(2131886170);
        if (string != null) {
            builder.setPositiveButton(string, wVar);
        }
        String strC = v.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", B.a.g(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0570w) {
                C0542J c0542jM = ((AbstractActivityC0570w) activity).m();
                j jVar = new j();
                C.g(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f7642q0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f7643r0 = onCancelListener;
                }
                jVar.b0(c0542jM, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC0589b dialogFragmentC0589b = new DialogFragmentC0589b();
        C.g(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC0589b.f7624a = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC0589b.f7625b = onCancelListener;
        }
        dialogFragmentC0589b.show(fragmentManager, str);
    }

    @Override // h1.e
    public final int b(Context context) {
        return c(context, e.f7632a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, new w(super.a(googleApiActivity, i, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i5;
        Log.w("GoogleApiAvailability", B.a.i("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? v.e(context, "common_google_play_services_resolution_required_title") : v.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(2131886174);
        }
        String strD = (i == 6 || i == 19) ? v.d(context, "common_google_play_services_resolution_required_text", v.a(context)) : v.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        C.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        A.k kVar = new A.k(context, null);
        kVar.f19k = true;
        kVar.c(true);
        kVar.f15e = A.k.b(strE);
        S0.c cVar = new S0.c(1);
        cVar.f2848c = A.k.b(strD);
        kVar.d(cVar);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0794a.f9157b == null) {
            AbstractC0794a.f9157b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC0794a.f9157b.booleanValue()) {
            kVar.f23o.icon = context.getApplicationInfo().icon;
            kVar.h = 2;
            if (AbstractC0794a.c(context)) {
                kVar.f12b.add(new A.i(resources.getString(2131886182), pendingIntent));
            } else {
                kVar.f17g = pendingIntent;
            }
        } else {
            kVar.f23o.icon = R.drawable.stat_sys_warning;
            kVar.f23o.tickerText = A.k.b(resources.getString(2131886174));
            kVar.f23o.when = System.currentTimeMillis();
            kVar.f17g = pendingIntent;
            kVar.f16f = A.k.b(strD);
        }
        synchronized (f7630c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(2131886173);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        kVar.f21m = "com.google.android.gms.availability";
        Notification notificationA = kVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.f7634a.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, notificationA);
    }

    public final void h(Activity activity, InterfaceC0351m interfaceC0351m, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new w(super.a(activity, i, "d"), interfaceC0351m, 1), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
