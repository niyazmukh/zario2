package com.google.android.gms.internal.p002firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zza.smali */
public abstract class zza {
    private static zza zza = new zzc();

    public static synchronized zza zza() {
        return zza;
    }

    public abstract URLConnection zza(URL url, String str);
}
