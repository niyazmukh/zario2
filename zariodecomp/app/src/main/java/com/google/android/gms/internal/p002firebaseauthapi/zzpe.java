package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzpe.smali */
public final class zzpe {
    public static final zzaaj zza = zzaaj.zza(new byte[0]);

    public static final zzaaj zza(int i) {
        return zzaaj.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzaaj zzb(int i) {
        return zzaaj.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
