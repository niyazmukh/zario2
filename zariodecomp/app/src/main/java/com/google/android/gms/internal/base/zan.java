package com.google.android.gms.internal.base;

import android.os.Build;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\base\zan.smali */
final class zan {
    public static boolean zaa() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
