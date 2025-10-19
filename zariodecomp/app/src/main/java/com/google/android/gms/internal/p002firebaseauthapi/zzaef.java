package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import p2.e;
import p2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaef.smali */
final class zzaef extends zzaff<Void, u> {
    private final o2.u zzv;

    public zzaef(o2.u uVar) {
        super(2);
        C.f(uVar);
        this.zzv = uVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        ((u) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(new zzahz(((e) this.zzd).f9328a.zzf(), zzafw.zza(this.zzv)), this.zzb);
    }
}
