package com.google.android.gms.internal.auth;

import B.a;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzcy.smali */
final class zzcy extends zzdc {
    final /* synthetic */ zzhu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z4, zzhu zzhuVar, byte[] bArr) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhuVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhr.zzk(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder sbO = a.o("Invalid byte[] value for ", this.zzc(), ": ");
            sbO.append((String) obj);
            Log.e("PhenotypeFlag", sbO.toString());
            return null;
        }
    }
}
