package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o1.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaiw.smali */
public final class zzaiw {
    private List<String> zza;

    public zzaiw() {
        this(null);
    }

    public static zzaiw zza() {
        return new zzaiw(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    private zzaiw(List<String> list) {
        this.zza = new ArrayList();
    }

    public zzaiw(int i, List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.set(i5, c.a(list.get(i5)));
            }
            this.zza = Collections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.emptyList();
    }
}
