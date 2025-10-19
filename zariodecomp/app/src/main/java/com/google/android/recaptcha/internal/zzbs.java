package com.google.android.recaptcha.internal;

import android.content.Context;
import h1.e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbs.smali */
public final class zzbs {
    private final e zza;

    public zzbs() {
        this.zza = e.f7633b;
    }

    public final int zza(Context context) {
        int iB = this.zza.b(context);
        return (iB == 1 || iB == 3 || iB == 9) ? 4 : 3;
    }

    public zzbs(e eVar) {
        this.zza = eVar;
    }
}
