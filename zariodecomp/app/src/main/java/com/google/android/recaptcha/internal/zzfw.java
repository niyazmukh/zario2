package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import f4.C;
import f4.E;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzfw.smali */
public final class zzfw {
    private final WebView zza;
    private final C zzb;

    public zzfw(WebView webView, C c5) {
        this.zza = webView;
        this.zzb = c5;
    }

    public final void zzb(String str, String... strArr) {
        E.t(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
