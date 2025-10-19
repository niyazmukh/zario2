package com.google.android.gms.internal.auth;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import m1.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbz.smali */
public abstract class zzbz extends c {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e5) {
            Log.e("AUTH", "Error serializing object.", e5);
            return null;
        }
    }
}
