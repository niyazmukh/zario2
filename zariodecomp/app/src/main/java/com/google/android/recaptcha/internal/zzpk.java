package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzpk.smali */
public final class zzpk extends RuntimeException {
    public zzpk(zzoi zzoiVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zznn zza() {
        return new zznn(getMessage());
    }
}
