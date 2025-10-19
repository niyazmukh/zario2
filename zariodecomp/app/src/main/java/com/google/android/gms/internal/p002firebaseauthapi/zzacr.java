package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import p2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzacr.smali */
final class zzacr extends zzaff<Void, u> {
    private final zzaic zzv;

    public zzacr(String str, String str2, String str3) {
        super(4);
        C.e(str, "code cannot be null or empty");
        C.e(str2, "new password cannot be null or empty");
        this.zzv = new zzaic(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "confirmPasswordReset";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
