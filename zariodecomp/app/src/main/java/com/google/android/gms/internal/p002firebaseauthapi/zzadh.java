package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.C0800d;
import p2.e;
import p2.u;
import p2.z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadh.smali */
final class zzadh extends zzaff<z, u> {
    private final zzagx zzv;

    public zzadh(C0800d c0800d, String str) {
        super(2);
        C.g(c0800d, "credential cannot be null or empty");
        this.zzv = new zzagx(c0800d, null, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        e eVarZza = zzacq.zza(this.zzc, this.zzk);
        if (!((e) this.zzd).f9329b.f9320a.equalsIgnoreCase(eVarZza.f9329b.f9320a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((u) this.zze).a(this.zzj, eVarZza);
            zzb(new z(eVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
