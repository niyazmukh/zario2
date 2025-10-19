package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import l2.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafz.smali */
public final class zzafz {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzafz(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        String str;
        String str2;
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        f fVar = this.zza.f6368a;
        fVar.a();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", fVar.f8773c.f8783a);
        FirebaseAuth firebaseAuth = this.zza;
        synchronized (firebaseAuth.h) {
            str = firebaseAuth.i;
        }
        if (!TextUtils.isEmpty(str)) {
            FirebaseAuth firebaseAuth2 = this.zza;
            synchronized (firebaseAuth2.h) {
                str2 = firebaseAuth2.i;
            }
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", str2);
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzafc.zza().zzb());
        f fVar2 = this.zza.f6368a;
        fVar2.a();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", fVar2.f8772b);
        this.zza.getClass();
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", (String) null);
        this.zzb.startActivity(intent);
    }
}
