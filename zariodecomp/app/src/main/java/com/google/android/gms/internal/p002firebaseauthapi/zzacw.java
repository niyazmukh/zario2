package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import g1.i;
import java.util.List;
import p2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzacw.smali */
final class zzacw extends zzaff<Object, u> {
    private final String zzv;
    private final String zzw;

    public zzacw(String str, String str2) {
        super(3);
        C.e(str, "email cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        List<String> listZza;
        if (this.zzl.zza() == null) {
            listZza = zzah.zzg();
        } else {
            listZza = this.zzl.zza();
            C.f(listZza);
        }
        zzb(new i(listZza, 22));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zze(this.zzv, this.zzw, this.zzb);
    }
}
