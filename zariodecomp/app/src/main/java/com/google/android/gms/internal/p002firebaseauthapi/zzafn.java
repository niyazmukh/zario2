package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafn.smali */
final class zzafn implements Runnable {
    private final /* synthetic */ zzafm zza;
    private final /* synthetic */ zzafh zzb;

    public zzafn(zzafh zzafhVar, zzafm zzafmVar) {
        this.zza = zzafmVar;
        Objects.requireNonNull(zzafhVar);
        this.zzb = zzafhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            try {
                if (!this.zzb.zza.zzh.isEmpty()) {
                    this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
