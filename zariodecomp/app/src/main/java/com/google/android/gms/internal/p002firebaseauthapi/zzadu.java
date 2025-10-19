package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.AbstractC0799c;
import p2.e;
import p2.u;
import p2.z;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadu.smali */
final class zzadu extends zzaff<z, u> {
    private final zzajb zzv;

    public zzadu(AbstractC0799c abstractC0799c, String str) {
        super(2);
        C.g(abstractC0799c, "credential cannot be null");
        this.zzv = d.Y(abstractC0799c, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "signInWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        e eVarZza = zzacq.zza(this.zzc, this.zzk);
        ((u) this.zze).a(this.zzj, eVarZza);
        zzb(new z(eVarZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
