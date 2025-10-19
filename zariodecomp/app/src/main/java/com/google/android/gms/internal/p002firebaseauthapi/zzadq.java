package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.C0797a;
import p2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadq.smali */
final class zzadq extends zzaff<Void, u> {
    private final zzahm zzv;

    public zzadq(String str, C0797a c0797a) {
        super(6);
        C.e(str, "token cannot be null or empty");
        zzahm zzahmVar = new zzahm(4);
        this.zzv = zzahmVar;
        zzahmVar.zzd(str);
        if (c0797a != null) {
            zzahmVar.zza(c0797a);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "sendEmailVerification";
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
