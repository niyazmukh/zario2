package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzcr.smali */
final class zzcr implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzcz zzczVar = (zzcz) obj;
        zzcz zzczVar2 = (zzcz) obj2;
        zzcs zzcqVar = new zzcq(zzczVar);
        zzcs zzcqVar2 = new zzcq(zzczVar2);
        while (zzcqVar.hasNext() && zzcqVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzcqVar.zza() & 255).compareTo(Integer.valueOf(zzcqVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzczVar.zzd()).compareTo(Integer.valueOf(zzczVar2.zzd()));
    }
}
