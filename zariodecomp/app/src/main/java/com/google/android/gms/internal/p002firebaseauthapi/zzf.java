package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzf.smali */
public abstract class zzf {
    public int zza(CharSequence charSequence, int i) {
        int length = charSequence.length();
        zzu.zza(i, length, "index");
        while (i < length) {
            if (zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean zza(char c5);
}
