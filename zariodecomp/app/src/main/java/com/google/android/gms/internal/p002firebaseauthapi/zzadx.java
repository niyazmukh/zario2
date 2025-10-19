package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import p2.g;
import p2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzadx.smali */
final class zzadx extends zzaff<Void, u> {
    private final boolean zzaa;
    private final String zzab;
    private final String zzac;
    private final String zzad;
    private final boolean zzae;
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final long zzy;
    private final boolean zzz;

    public zzadx(g gVar, String str, String str2, long j5, boolean z4, boolean z5, String str3, String str4, String str5, boolean z6) {
        super(8);
        C.f(gVar);
        C.d(str);
        String str6 = gVar.f9343a;
        C.d(str6);
        this.zzv = str6;
        this.zzw = str;
        this.zzx = str2;
        this.zzy = j5;
        this.zzz = z4;
        this.zzaa = z5;
        this.zzab = str3;
        this.zzac = str4;
        this.zzad = str5;
        this.zzae = z6;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzb);
    }
}
