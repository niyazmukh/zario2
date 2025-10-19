package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzaa.smali */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i) {
    }

    public final zzaa zza(Object obj) {
        int i;
        obj.getClass();
        int length = this.zza.length;
        int i5 = this.zzb;
        int i6 = i5 + 1;
        if (i6 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i6 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i6) {
                int iHighestOneBit = Integer.highestOneBit(i5);
                i = iHighestOneBit + iHighestOneBit;
            }
            if (i < 0) {
                i = f.API_PRIORITY_OTHER;
            }
        }
        if (i > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr[i7] = obj;
        return this;
    }
}
