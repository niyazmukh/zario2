package com.google.android.gms.internal.base;

import android.os.Build;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\base\zap.smali */
public final class zap {
    public static final int zaa;

    static {
        zaa = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
