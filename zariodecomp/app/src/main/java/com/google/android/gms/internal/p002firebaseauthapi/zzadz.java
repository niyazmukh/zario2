package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.w;
import o2.y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadz.smali */
final class zzadz extends zzaff<Void, w> {
    private final zzaaq zzv;

    public zzadz(y yVar, String str, String str2, long j5, boolean z4, boolean z5, String str3, String str4, String str5, boolean z6) {
        super(8);
        C.f(yVar);
        C.d(str);
        this.zzv = new zzaaq(yVar, str, str2, j5, z4, z5, str3, str4, str5, z6);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
