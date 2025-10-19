package com.google.android.gms.internal.fido;

import B.a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzdk.smali */
public final class zzdk extends zzdr {
    private final zzcz zza;

    public zzdk(zzcz zzczVar) {
        this.zza = zzczVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzdr zzdrVar = (zzdr) obj;
        if (zzdr.zzd((byte) 64) != zzdrVar.zza()) {
            return zzdr.zzd((byte) 64) - zzdrVar.zza();
        }
        zzdk zzdkVar = (zzdk) zzdrVar;
        zzcz zzczVar = this.zza;
        int iZzd = zzczVar.zzd();
        zzcz zzczVar2 = zzdkVar.zza;
        if (iZzd != zzczVar2.zzd()) {
            return zzczVar.zzd() - zzczVar2.zzd();
        }
        return zzco.zza().compare(zzczVar.zzm(), zzdkVar.zza.zzm());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdk.class == obj.getClass()) {
            return this.zza.equals(((zzdk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.zzd((byte) 64)), this.zza});
    }

    public final String toString() {
        zzch zzchVarZzd = zzch.zzf().zzd();
        byte[] bArrZzm = this.zza.zzm();
        return a.l("h'", zzchVarZzd.zzg(bArrZzm, 0, bArrZzm.length), "'");
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.zzd((byte) 64);
    }

    public final zzcz zzc() {
        return this.zza;
    }
}
