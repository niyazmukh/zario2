package com.google.android.recaptcha.internal;

import L3.s;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzga.smali */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!i.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? L3.i.q0(objArr) : s.f2351a);
        return true;
    }
}
