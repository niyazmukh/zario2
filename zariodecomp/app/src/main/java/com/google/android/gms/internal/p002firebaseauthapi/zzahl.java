package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import o1.c;
import o2.G;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahl.smali */
public class zzahl implements zzaez<zzahl> {
    private static final String zza = "zzahl";
    private zzahn zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahl zza(String str) throws JSONException, zzacn {
        zzahn zzahnVar;
        int i;
        zzahk zzahkVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzahnVar = new zzahn(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z4 = false;
                    int i5 = 0;
                    while (i5 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i5);
                        if (jSONObject2 == null) {
                            zzahkVar = new zzahk();
                            i = i5;
                        } else {
                            i = i5;
                            zzahkVar = new zzahk(c.a(jSONObject2.optString("localId", null)), c.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z4), c.a(jSONObject2.optString("displayName", null)), c.a(jSONObject2.optString("photoUrl", null)), zzaia.zza(jSONObject2.optJSONArray("providerUserInfo")), c.a(jSONObject2.optString("rawPassword", null)), c.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzahy.zza(jSONObject2.optJSONArray("mfaInfo")), G.c(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzahkVar);
                        i5 = i + 1;
                        z4 = false;
                    }
                    zzahnVar = new zzahn(arrayList);
                }
            } else {
                zzahnVar = new zzahn();
            }
            this.zzb = zzahnVar;
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw zzajk.zza(e5, zza, str);
        }
    }

    public final List<zzahk> zza() {
        return this.zzb.zza();
    }
}
