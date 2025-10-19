package com.google.android.recaptcha.internal;

import L3.x;
import X3.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzat.smali */
final class zzat extends j implements a {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.a0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // X3.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
