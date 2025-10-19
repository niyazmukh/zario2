package com.google.android.gms.internal.p002firebaseauthapi;

import o1.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzait.smali */
public class zzait implements zzaez<zzait> {
    private static final String zza = "zzait";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzait zza(String str) throws zzacn {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (jSONObjectOptJSONObject != null) {
                this.zzb = c.a(jSONObjectOptJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw zzajk.zza(e5, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
