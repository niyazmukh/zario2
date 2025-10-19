package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzbc.smali */
public final class zzbc implements zzby {
    private final OutputStream zza;

    private zzbc(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzby zza(OutputStream outputStream) {
        return new zzbc(outputStream);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzby
    public final void zza(zzvv zzvvVar) throws IOException {
        try {
            ((zzvv) ((zzalf) zzvvVar.zzn().zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzby
    public final void zza(zzxh zzxhVar) throws IOException {
        try {
            zzxhVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
