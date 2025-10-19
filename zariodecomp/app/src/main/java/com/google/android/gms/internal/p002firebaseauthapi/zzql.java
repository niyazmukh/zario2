package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzql.smali */
public final class zzql extends RuntimeException {
    public zzql(String str) {
        super(str);
    }

    public static <T> T zza(zzqo<T> zzqoVar) {
        try {
            return (T) zzqoVar.zza();
        } catch (Exception e5) {
            throw new zzql(e5);
        }
    }

    public zzql(Throwable th) {
        super(th);
    }

    public zzql(String str, Throwable th) {
        super(str, th);
    }
}
