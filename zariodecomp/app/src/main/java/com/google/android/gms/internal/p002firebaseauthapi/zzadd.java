package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.C0800d;
import o2.o;
import p2.e;
import p2.u;
import p2.z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadd.smali */
final class zzadd extends zzaff<z, u> {
    private final C0800d zzv;

    public zzadd(C0800d c0800d) {
        super(2);
        C.g(c0800d, "credential cannot be null");
        this.zzv = c0800d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkEmailAuthCredential";
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
        C0800d c0800d = this.zzv;
        o oVar = this.zzd;
        c0800d.getClass();
        c0800d.f9213d = ((e) oVar).f9328a.zzf();
        c0800d.f9214e = true;
        zzaeoVar.zza(new zzagx(c0800d, null, null), this.zzb);
    }
}
