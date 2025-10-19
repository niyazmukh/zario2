package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import o1.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahs.smali */
public class zzahs implements zzaez<zzahs> {
    private static final String zza = "zzahs";
    private String zzb;
    private zzah<zzaid> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahs zza(String str) throws JSONException, zzacn {
        zzah<zzaid> zzahVarZzg;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = c.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzahVarZzg = zzah.zzg();
                } else {
                    zzak zzakVarZzf = zzah.zzf();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        zzakVarZzf.zza(jSONObject2 == null ? zzaid.zza(null, null) : zzaid.zza(c.a(jSONObject2.optString("provider")), c.a(jSONObject2.optString("enforcementState"))));
                    }
                    zzahVarZzg = zzakVarZzf.zza();
                }
                this.zzc = zzahVarZzg;
            }
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw zzajk.zza(e5, zza, str);
        }
    }

    public final String zzb(String str) {
        C.d(str);
        zzah<zzaid> zzahVar = this.zzc;
        if (zzahVar != null && !zzahVar.isEmpty()) {
            zzah<zzaid> zzahVar2 = this.zzc;
            int size = zzahVar2.size();
            int i = 0;
            while (i < size) {
                zzaid zzaidVar = zzahVar2.get(i);
                i++;
                zzaid zzaidVar2 = zzaidVar;
                String strZza = zzaidVar2.zza();
                String strZzb = zzaidVar2.zzb();
                if (strZza != null && strZzb != null && strZzb.equals(str)) {
                    return zzaidVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String strZzb = zzb(str);
        if (strZzb == null) {
            return false;
        }
        return strZzb.equals("ENFORCE") || strZzb.equals("AUDIT");
    }

    public final String zza() {
        return this.zzb;
    }
}
