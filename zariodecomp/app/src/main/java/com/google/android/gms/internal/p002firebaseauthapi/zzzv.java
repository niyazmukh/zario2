package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzzv.smali */
public final class zzzv implements zzzp<MessageDigest> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzp
    public final /* synthetic */ MessageDigest zza(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
