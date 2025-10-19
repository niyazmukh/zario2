package com.google.android.gms.internal.p002firebaseauthapi;

import o1.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaii.smali */
public class zzaii implements zzaez<zzaii> {
    private static final String zza = "zzaii";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaii zza(String str) throws zzacn {
        try {
            this.zzb = c.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw zzajk.zza(e5, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
