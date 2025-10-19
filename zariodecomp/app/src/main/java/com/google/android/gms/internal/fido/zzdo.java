package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzdo.smali */
public final class zzdo extends zzdr {
    private final int zza;
    private final zzbg zzb;

    public zzdo(zzbg zzbgVar) throws zzdh {
        zzbgVar.getClass();
        this.zzb = zzbgVar;
        zzcb it = zzbgVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iZzb = ((zzdr) entry.getKey()).zzb();
            i = i < iZzb ? iZzb : i;
            int iZzb2 = ((zzdr) entry.getValue()).zzb();
            if (i < iZzb2) {
                i = iZzb2;
            }
        }
        int i5 = i + 1;
        this.zza = i5;
        if (i5 > 4) {
            throw new zzdh("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iCompareTo;
        zzdr zzdrVar = (zzdr) obj;
        if (zzdr.zzd((byte) -96) != zzdrVar.zza()) {
            return zzdr.zzd((byte) -96) - zzdrVar.zza();
        }
        zzdo zzdoVar = (zzdo) zzdrVar;
        if (this.zzb.size() != zzdoVar.zzb.size()) {
            return this.zzb.size() - zzdoVar.zzb.size();
        }
        zzcb it = this.zzb.entrySet().iterator();
        zzcb it2 = zzdoVar.zzb.entrySet().iterator();
        do {
            if (!it.hasNext() && !it2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int iCompareTo2 = ((zzdr) entry.getKey()).compareTo((zzdr) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((zzdr) entry.getValue()).compareTo((zzdr) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdo.class == obj.getClass()) {
            return this.zzb.equals(((zzdo) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.zzd((byte) -96)), this.zzb});
    }

    public final String toString() {
        if (this.zzb.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzcb it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((zzdr) entry.getKey()).toString().replace("\n", "\n  "), ((zzdr) entry.getValue()).toString().replace("\n", "\n  "));
        }
        zzag zzagVarZza = zzag.zza(",\n  ");
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            zzaf.zza(sb, linkedHashMap.entrySet().iterator(), zzagVarZza, " : ");
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.zzd((byte) -96);
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zzb() {
        return this.zza;
    }

    public final zzbg zzc() {
        return this.zzb;
    }
}
