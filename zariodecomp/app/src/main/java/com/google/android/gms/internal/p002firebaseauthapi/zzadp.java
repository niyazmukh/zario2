package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.C0797a;
import p2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadp.smali */
final class zzadp extends zzaff<Void, u> {
    private final zzahm zzv;
    private final String zzw;

    public zzadp(String str, C0797a c0797a, String str2, String str3, String str4) {
        super(4);
        C.e(str, "email cannot be null or empty");
        zzahm zzahmVar = new zzahm(c0797a.f9204m);
        this.zzv = zzahmVar;
        zzahmVar.zzb(str);
        zzahmVar.zza(c0797a);
        zzahmVar.zzc(str2);
        zzahmVar.zza(str3);
        this.zzw = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
