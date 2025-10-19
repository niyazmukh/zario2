package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import p2.e;
import p2.j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzact.smali */
final class zzact extends zzaff<Void, j> {
    public zzact() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        a.p(this.zze);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(((e) this.zzd).f9328a.zzf(), this.zzb);
    }
}
