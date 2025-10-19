package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzca.smali */
public final class zzca {
    private static final CopyOnWriteArrayList<zzbx> zza = new CopyOnWriteArrayList<>();

    public static zzbx zza(String str) throws GeneralSecurityException {
        Iterator<zzbx> it = zza.iterator();
        while (it.hasNext()) {
            zzbx next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(AbstractC0854a.b("No KMS client does support: ", str));
    }
}
