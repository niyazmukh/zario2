package com.google.android.recaptcha.internal;

import S0.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzgc.smali */
public final class zzgc {
    public static final Class zza(Object obj) throws ClassNotFoundException, zzce {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            Class cls = iIntValue == 1 ? Integer.TYPE : iIntValue == 2 ? Short.TYPE : iIntValue == 3 ? Byte.TYPE : iIntValue == 4 ? Long.TYPE : iIntValue == 5 ? Character.TYPE : iIntValue == 6 ? Float.TYPE : iIntValue == 7 ? Double.TYPE : iIntValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            throw new zzce(4, 6, null);
        }
        if (!(obj instanceof String)) {
            throw new zzce(4, 5, null);
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i = zzav.zza;
            if (((zzfu) f.P(zzgb.zza).getValue()).zzb(str)) {
                return cls2;
            }
            throw new zzce(6, 47, null);
        } catch (Exception e5) {
            throw new zzce(6, 8, e5);
        }
    }
}
