package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Objects;
import javax.crypto.Mac;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaad.smali */
final class zzaad extends ThreadLocal<Mac> {
    private final /* synthetic */ zzaae zza;

    public zzaad(zzaae zzaaeVar) {
        Objects.requireNonNull(zzaaeVar);
        this.zza = zzaaeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac macZza = zzzj.zzb.zza(this.zza.zzc);
            macZza.init(this.zza.zzd);
            return macZza;
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }
}
