package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahc.smali */
public final class zzahc implements zzahb {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzahc(String str, String str2, String str3, String str4, String str5) {
        C.d(str);
        C.d(str2);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
    }

    public static zzahc zza(String str, String str2, String str3, String str4) {
        C.d(str3);
        C.d(str2);
        return new zzahc("phone", str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzb;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zza);
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
