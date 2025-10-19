package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzpn.smali */
public final class zzpn<P> {
    private final Map<zzaaj, List<P>> zza = new HashMap();

    public final zzpn<P> zza(zzaaj zzaajVar, P p5) throws GeneralSecurityException {
        List<P> list;
        if (zzaajVar.zza() != 0 && zzaajVar.zza() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        if (this.zza.containsKey(zzaajVar)) {
            list = this.zza.get(zzaajVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.zza.put(zzaajVar, arrayList);
            list = arrayList;
        }
        list.add(p5);
        return this;
    }

    public final zzpl<P> zza() {
        return new zzpl<>(this.zza, (zzpp) null);
    }
}
