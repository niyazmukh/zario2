package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import p2.e;
import p2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadm.smali */
final class zzadm extends zzaff<Void, u> {
    private final zzaan zzv;

    public zzadm(o2.u uVar, String str) {
        super(2);
        C.g(uVar, "credential cannot be null");
        uVar.f9228d = false;
        this.zzv = new zzaan(uVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithPhoneCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        e eVarZza = zzacq.zza(this.zzc, this.zzk);
        if (!((e) this.zzd).f9329b.f9320a.equalsIgnoreCase(eVarZza.f9329b.f9320a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((u) this.zze).a(this.zzj, eVarZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
