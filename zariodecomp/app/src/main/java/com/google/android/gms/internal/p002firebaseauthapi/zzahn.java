package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahn.smali */
public final class zzahn {
    private List<zzahk> zza;

    public zzahn() {
        this.zza = new ArrayList();
    }

    public final List<zzahk> zza() {
        return this.zza;
    }

    public zzahn(List<zzahk> list) {
        this.zza = Collections.unmodifiableList(list);
    }
}
