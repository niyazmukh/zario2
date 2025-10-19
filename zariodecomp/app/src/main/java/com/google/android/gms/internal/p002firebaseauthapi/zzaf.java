package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaf.smali */
public class zzaf<E> extends zzai<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzaf(int i) {
        zzae.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzaf<E> zza(E e5) {
        zzu.zza(e5);
        Object[] objArr = this.zza;
        int iZza = zzai.zza(objArr.length, this.zzb + 1);
        if (iZza > objArr.length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZza);
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr2[i] = e5;
        return this;
    }
}
