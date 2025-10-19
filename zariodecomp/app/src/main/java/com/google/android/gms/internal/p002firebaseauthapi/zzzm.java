package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzzm.smali */
final class zzzm<JcePrimitiveT> implements zzzn<JcePrimitiveT> {
    private final zzzp<JcePrimitiveT> zza;

    public /* synthetic */ zzzm(zzzp zzzpVar, zzzq zzzqVar) {
        this(zzzpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzn
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzzj.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e5) {
                if (exc == null) {
                    exc = e5;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzzm(zzzp<JcePrimitiveT> zzzpVar) {
        this.zza = zzzpVar;
    }
}
