package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.C0800d;
import p2.e;
import p2.u;
import p2.z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadc.smali */
final class zzadc extends zzaff<z, u> {
    private final C0800d zzv;
    private final String zzw;

    public zzadc(C0800d c0800d, String str) {
        super(2);
        C.g(c0800d, "credential cannot be null");
        this.zzv = c0800d;
        C.e(c0800d.f9210a, "email cannot be null");
        C.e(c0800d.f9211b, "password cannot be null");
        this.zzw = str;
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
        String str = c0800d.f9210a;
        String str2 = c0800d.f9211b;
        C.d(str2);
        zzaeoVar.zza(str, str2, ((e) this.zzd).f9328a.zzf(), this.zzd.c(), this.zzw, this.zzb);
    }
}
