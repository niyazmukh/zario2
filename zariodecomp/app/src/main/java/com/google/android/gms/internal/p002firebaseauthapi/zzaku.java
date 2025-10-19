package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaku.smali */
public final class zzaku {
    static final zzaku zza = new zzaku(true);
    private static volatile boolean zzb;
    private final Map<zzakt, zzalf.zzf<?, ?>> zzc;

    public zzaku() {
        this.zzc = new HashMap();
    }

    public static zzaku zza() {
        return zza;
    }

    public final <ContainingType extends zzamm> zzalf.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzalf.zzf) this.zzc.get(new zzakt(containingtype, i));
    }

    private zzaku(boolean z4) {
        this.zzc = Collections.emptyMap();
    }
}
