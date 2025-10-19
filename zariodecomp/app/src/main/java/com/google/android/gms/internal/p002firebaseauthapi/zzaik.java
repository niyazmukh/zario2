package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import o1.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaik.smali */
public class zzaik implements zzaez<zzaik> {
    private static final String zza = "zzaik";
    private String zzb;
    private zzaia zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaik zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = c.a(jSONObject.optString("email"));
            c.a(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            c.a(jSONObject.optString("displayName"));
            c.a(jSONObject.optString("photoUrl"));
            this.zzc = zzaia.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = c.a(jSONObject.optString("idToken"));
            this.zze = c.a(jSONObject.optString("refreshToken"));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw zzajk.zza(e5, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzaib> zze() {
        zzaia zzaiaVar = this.zzc;
        if (zzaiaVar != null) {
            return zzaiaVar.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
