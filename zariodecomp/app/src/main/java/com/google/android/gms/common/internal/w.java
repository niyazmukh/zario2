package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC0351m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\w.smali */
public final class w implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f5758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5759c;

    public /* synthetic */ w(Intent intent, Object obj, int i) {
        this.f5757a = i;
        this.f5758b = intent;
        this.f5759c = obj;
    }

    public final void a() {
        switch (this.f5757a) {
            case 0:
                Intent intent = this.f5758b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f5759c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f5758b;
                if (intent2 != null) {
                    ((InterfaceC0351m) this.f5759c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e5) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e5);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
