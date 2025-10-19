package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzmq.smali */
final /* synthetic */ class zzmq {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[zzzi.values().length];
        zza = iArr;
        try {
            iArr[zzzi.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzzi.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[zzzi.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
