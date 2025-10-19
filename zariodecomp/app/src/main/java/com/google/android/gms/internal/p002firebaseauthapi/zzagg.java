package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzagg.smali */
final class zzagg extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzagc zzb;

    public zzagg(zzagc zzagcVar, String str) {
        Objects.requireNonNull(zzagcVar);
        this.zzb = zzagcVar;
        this.zza = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f5535a == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzagj zzagjVar = (zzagj) this.zzb.zzd.get(this.zza);
                if (zzagjVar == null) {
                    zzagc.zza.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String strZza = zzagc.zza(str);
                    zzagjVar.zze = strZza;
                    if (strZza == null) {
                        zzagc.zza.c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzac.zzc(zzagjVar.zzd)) {
                        zzagc.zzb(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
