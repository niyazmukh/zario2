package com.google.android.recaptcha.internal;

import e4.m;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzeg.smali */
public final class zzeg {
    private zzeg() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String strV0 = m.v0("18.6.1", ".", "");
        int iP0 = m.p0(0, 6, strV0, "-", false);
        if (iP0 != -1) {
            strV0 = strV0.substring(0, iP0);
            i.d(strV0, "substring(...)");
        }
        return Integer.parseInt(strV0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(m.y0("18.6.1", "-", ""));
    }

    public /* synthetic */ zzeg(e eVar) {
    }
}
