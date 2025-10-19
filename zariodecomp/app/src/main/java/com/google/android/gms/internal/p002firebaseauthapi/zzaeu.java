package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import h1.e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaeu.smali */
public final class zzaeu {
    private static Boolean zza;

    public static boolean zza(Context context) throws PackageManager.NameNotFoundException {
        if (zza == null) {
            int iC = e.f7633b.c(context, 12451000);
            zza = Boolean.valueOf(iC == 0 || iC == 2);
        }
        return zza.booleanValue();
    }
}
