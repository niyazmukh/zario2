package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.C;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaba.smali */
final class zzaba implements zzafv<zzaik> {
    private final /* synthetic */ zzail zza;
    private final /* synthetic */ zzahk zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzahv zzd;
    private final /* synthetic */ zzafs zze;
    private final /* synthetic */ zzaar zzf;

    public zzaba(zzaar zzaarVar, zzail zzailVar, zzahk zzahkVar, zzael zzaelVar, zzahv zzahvVar, zzafs zzafsVar) {
        this.zza = zzailVar;
        this.zzb = zzahkVar;
        this.zzc = zzaelVar;
        this.zzd = zzahvVar;
        this.zze = zzafsVar;
        Objects.requireNonNull(zzaarVar);
        this.zzf = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zze.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final void zza(zzaik zzaikVar) {
        zzaik zzaikVar2 = zzaikVar;
        if (this.zza.zzi("EMAIL")) {
            this.zzb.zzb(null);
        } else if (this.zza.zzc() != null) {
            this.zzb.zzb(this.zza.zzc());
        }
        if (this.zza.zzi("DISPLAY_NAME")) {
            this.zzb.zza((String) null);
        } else if (this.zza.zzb() != null) {
            this.zzb.zza(this.zza.zzb());
        }
        if (this.zza.zzi("PHOTO_URL")) {
            this.zzb.zzc(null);
        } else if (this.zza.zze() != null) {
            this.zzb.zzc(this.zza.zze());
        }
        if (!TextUtils.isEmpty(this.zza.zzd())) {
            byte[] bytes = "redacted".getBytes();
            C.d(bytes != null ? Base64.encodeToString(bytes, 0) : null);
        }
        if (this.zza.zzi("delete_passkey")) {
            this.zzb.zza(zzah.zzg());
        }
        List<zzaib> listZze = zzaikVar2.zze();
        if (listZze == null) {
            listZze = new ArrayList<>();
        }
        this.zzb.zza(listZze);
        zzael zzaelVar = this.zzc;
        zzahv zzahvVar = this.zzd;
        C.f(zzahvVar);
        String strZzc = zzaikVar2.zzc();
        String strZzd = zzaikVar2.zzd();
        if (!TextUtils.isEmpty(strZzc) && !TextUtils.isEmpty(strZzd)) {
            zzahvVar = new zzahv(strZzd, strZzc, Long.valueOf(zzaikVar2.zza()), zzahvVar.zze());
        }
        zzaelVar.zza(zzahvVar, this.zzb);
    }
}
