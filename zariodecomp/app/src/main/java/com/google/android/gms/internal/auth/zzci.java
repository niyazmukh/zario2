package com.google.android.gms.internal.auth;

import android.net.Uri;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzci.smali */
public final class zzci {
    private final C0834k zza;

    public zzci(C0834k c0834k) {
        this.zza = c0834k;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C0834k c0834k = (C0834k) this.zza.getOrDefault(uri.toString(), null);
        if (c0834k == null) {
            return null;
        }
        return (String) c0834k.getOrDefault("".concat(String.valueOf(str3)), null);
    }
}
