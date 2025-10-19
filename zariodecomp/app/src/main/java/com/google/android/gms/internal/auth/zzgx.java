package com.google.android.gms.internal.auth;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzgx.smali */
public final class zzgx extends RuntimeException {
    public zzgx(zzfw zzfwVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzfa zza() {
        return new zzfa(getMessage());
    }
}
