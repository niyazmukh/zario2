package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import o1.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzajh.smali */
public class zzajh implements zzaez<zzajh> {
    private static final String zza = "zzajh";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzahy> zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajh zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            c.a(jSONObject.optString("localId", null));
            c.a(jSONObject.optString("email", null));
            c.a(jSONObject.optString("displayName", null));
            this.zzb = c.a(jSONObject.optString("idToken", null));
            c.a(jSONObject.optString("photoUrl", null));
            this.zzc = c.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw zzajk.zza(e5, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzahy> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzf);
    }

    public final String zzb() {
        return this.zzb;
    }
}
