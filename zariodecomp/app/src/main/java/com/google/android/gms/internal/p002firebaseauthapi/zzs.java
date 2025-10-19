package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzs.smali */
final class zzs implements zzq {
    private zzs() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzq
    public final zzl zza(String str) {
        return new zzo(Pattern.compile(str));
    }
}
