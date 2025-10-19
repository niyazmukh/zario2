package com.google.android.gms.internal.auth;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzer.smali */
final class zzer implements zzfu {
    private static final zzer zza = new zzer();

    private zzer() {
    }

    public static zzer zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzft zzb(Class cls) {
        if (!zzeu.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzft) zzeu.zza(cls.asSubclass(zzeu.class)).zzi(3, null, null);
        } catch (Exception e5) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzc(Class cls) {
        return zzeu.class.isAssignableFrom(cls);
    }
}
