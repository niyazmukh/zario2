package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzy.smali */
final class zzy extends zzaa {
    private final /* synthetic */ zzf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzt zztVar, CharSequence charSequence, zzf zzfVar) {
        super(zztVar, charSequence);
        this.zzb = zzfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    public final int zza(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    public final int zzb(int i) {
        return this.zzb.zza(((zzaa) this).zza, i);
    }
}
