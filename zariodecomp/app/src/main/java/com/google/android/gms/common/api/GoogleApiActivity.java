package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C0346h;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.base.zau;
import h1.C0588a;
import h1.C0591d;

@KeepName
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\GoogleApiActivity.smali */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5526b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f5527a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i5, Intent intent) {
        super.onActivityResult(i, i5, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5527a = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                C0346h c0346hG = C0346h.g(this);
                if (i5 == -1) {
                    zau zauVar = c0346hG.f5638n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                } else if (i5 == 0) {
                    c0346hG.h(new C0588a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f5527a = 0;
            setResult(i5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f5527a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5527a = bundle.getInt("resolution");
        }
        if (this.f5527a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                C.f(num);
                C0591d.f7631d.d(this, num.intValue(), this);
                this.f5527a = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f5527a = 1;
            } catch (ActivityNotFoundException e5) {
                if (extras.getBoolean("notify_manager", true)) {
                    C0346h.g(this).h(new C0588a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strL = B.a.l("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strL = strL.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strL, e5);
                }
                this.f5527a = 1;
                finish();
            } catch (IntentSender.SendIntentException e6) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e6);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5527a);
        super.onSaveInstanceState(bundle);
    }
}
