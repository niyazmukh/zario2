package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzai.smali */
public class zzai<E> {
    public static int zza(int i, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i5 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i5) {
            iHighestOneBit = Integer.highestOneBit(i5 - 1) << 1;
        }
        return iHighestOneBit < 0 ? f.API_PRIORITY_OTHER : iHighestOneBit;
    }
}
