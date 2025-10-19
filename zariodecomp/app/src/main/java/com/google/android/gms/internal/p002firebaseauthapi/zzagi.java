package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzagi.smali */
public final class zzagi {
    public static String zza(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
