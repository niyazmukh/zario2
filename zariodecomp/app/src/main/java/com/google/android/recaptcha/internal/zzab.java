package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import android.os.Build;
import java.util.MissingResourceException;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzab.smali */
public final class zzab implements zzy {
    private final zzek zza;

    public zzab(zzek zzekVar) {
        this.zza = zzekVar;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, d dVar) throws MissingResourceException {
        zzen zzenVarZzb = zzz.zzb(this, str);
        int i = Build.VERSION.SDK_INT;
        zzenVarZzb.zza();
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(String.valueOf(i));
        zztfVarZzf.zze(b.B(zztgVarZzf.zzk()));
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, d dVar) throws MissingResourceException {
        zzz.zzc(this).zza();
        return k.f2288a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return true;
    }
}
