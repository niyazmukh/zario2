package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzajx.smali */
final class zzajx implements Comparator<zzajv> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzajv zzajvVar, zzajv zzajvVar2) {
        zzajv zzajvVar3 = zzajvVar;
        zzajv zzajvVar4 = zzajvVar2;
        zzakb zzakbVar = (zzakb) zzajvVar3.iterator();
        zzakb zzakbVar2 = (zzakb) zzajvVar4.iterator();
        while (zzakbVar.hasNext() && zzakbVar2.hasNext()) {
            int iCompare = Integer.compare(zzajv.zza(zzakbVar.zza()), zzajv.zza(zzakbVar2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzajvVar3.zzb(), zzajvVar4.zzb());
    }
}
