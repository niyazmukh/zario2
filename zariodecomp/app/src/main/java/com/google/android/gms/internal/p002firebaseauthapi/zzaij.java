package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaij.smali */
public final class zzaij implements zzafa {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private zzagm zzj;

    public zzaij(String str, long j5, boolean z4, String str2, String str3, String str4, String str5, String str6, boolean z5) {
        C.d(str);
        this.zza = str;
        this.zzb = j5;
        this.zzc = z4;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = z5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzagm zzagmVar = this.zzj;
        if (zzagmVar != null) {
            jSONObject.put("autoRetrievalInfo", zzagmVar.zza());
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        String str4 = this.zzh;
        if (str4 != null) {
            zzajk.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final void zza(zzagm zzagmVar) {
        this.zzj = zzagmVar;
    }
}
