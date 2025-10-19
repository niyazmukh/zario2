package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Base64;
import com.google.android.gms.common.internal.C;
import java.io.UnsupportedEncodingException;
import java.util.List;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahx.smali */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzahwVarZzb = zzb(str);
        return zzahwVarZzb.zza().longValue() - zzahwVarZzb.zzb().longValue();
    }

    private static zzahw zzb(String str) {
        C.d(str);
        List<String> listZza = zzt.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(AbstractC0854a.b("Invalid idToken ", str));
        }
        String str2 = listZza.get(1);
        try {
            return zzahw.zza(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("Unable to decode token", e5);
        }
    }
}
