package com.google.android.gms.internal.auth;

import B.a;
import android.util.Log;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzcv.smali */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l4, boolean z4) {
        super(zzczVar, str, l4, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbO = a.o("Invalid long value for ", this.zzc(), ": ");
            sbO.append((String) obj);
            Log.e("PhenotypeFlag", sbO.toString());
            return null;
        }
    }
}
