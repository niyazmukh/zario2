package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzpa.smali */
public final class zzpa {
    private static zzpa zza = new zzpa();
    private final AtomicReference<zzpw> zzb = new AtomicReference<>(zzpw.zza().zza());

    public static zzpa zza() {
        return zza;
    }

    public final <KeyT extends zzbi, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.zzb.get().zza(keyt, cls);
    }

    public final synchronized <KeyT extends zzbi, PrimitiveT> void zza(zzps<KeyT, PrimitiveT> zzpsVar) {
        this.zzb.set(zzpw.zza(this.zzb.get()).zza(zzpsVar).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzpz<InputPrimitiveT, WrapperPrimitiveT> zzpzVar) {
        this.zzb.set(zzpw.zza(this.zzb.get()).zza(zzpzVar).zza());
    }
}
