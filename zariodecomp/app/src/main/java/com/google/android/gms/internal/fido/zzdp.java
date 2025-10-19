package com.google.android.gms.internal.fido;

import B.a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzdp.smali */
public final class zzdp extends zzdr {
    private final String zza;

    public zzdp(String str) {
        this.zza = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzdr zzdrVar = (zzdr) obj;
        if (zzdr.zzd((byte) 96) != zzdrVar.zza()) {
            return zzdr.zzd((byte) 96) - zzdrVar.zza();
        }
        String str = this.zza;
        int length = str.length();
        String str2 = ((zzdp) zzdrVar).zza;
        return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdp.class == obj.getClass()) {
            return this.zza.equals(((zzdp) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.zzd((byte) 96)), this.zza});
    }

    public final String toString() {
        return a.l("\"", this.zza, "\"");
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.zzd((byte) 96);
    }
}
