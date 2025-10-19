package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaz.smali */
public final class zzaz implements zzbv {
    private final InputStream zza;

    private zzaz(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzbv zza(byte[] bArr) {
        return new zzaz(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbv
    public final zzxh zzb() throws IOException {
        try {
            return zzxh.zza(this.zza, zzaku.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbv
    public final zzvv zza() throws IOException {
        try {
            return zzvv.zza(this.zza, zzaku.zza());
        } finally {
            this.zza.close();
        }
    }
}
