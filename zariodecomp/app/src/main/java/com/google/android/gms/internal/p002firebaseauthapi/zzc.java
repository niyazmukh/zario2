package com.google.android.gms.internal.p002firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzc.smali */
final class zzc extends zza {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zza
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }

    private zzc() {
    }
}
