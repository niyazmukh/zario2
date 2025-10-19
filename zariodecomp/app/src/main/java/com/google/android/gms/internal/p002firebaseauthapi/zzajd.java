package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C;
import java.util.List;
import o1.c;
import o2.H;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzajd.smali */
public class zzajd implements zzaez<zzajd> {
    private static final String zza = "zzajd";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List<zzahy> zzp;
    private String zzq;

    public final long zza() {
        return this.zze;
    }

    public final H zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        String str = this.zzg;
        String str2 = this.zzk;
        String str3 = this.zzj;
        String str4 = this.zzn;
        String str5 = this.zzl;
        C.e(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new H(str, str2, str3, null, str4, str5, null);
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List<zzahy> zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzq);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajd zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = c.a(jSONObject.optString("idToken", null));
            this.zzd = c.a(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            c.a(jSONObject.optString("localId", null));
            this.zzf = c.a(jSONObject.optString("email", null));
            c.a(jSONObject.optString("displayName", null));
            c.a(jSONObject.optString("photoUrl", null));
            this.zzg = c.a(jSONObject.optString("providerId", null));
            this.zzh = c.a(jSONObject.optString("rawUserInfo", null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", null);
            this.zzk = jSONObject.optString("oauthIdToken", null);
            this.zzm = c.a(jSONObject.optString("errorMessage", null));
            this.zzn = c.a(jSONObject.optString("pendingToken", null));
            this.zzo = c.a(jSONObject.optString("tenantId", null));
            this.zzp = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = c.a(jSONObject.optString("mfaPendingCredential", null));
            this.zzl = c.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw zzajk.zza(e5, zza, str);
        }
    }
}
