package com.google.android.gms.internal.p002firebaseauthapi;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import o1.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahv.smali */
public class zzahv extends AbstractC0596a implements zzaez<zzahv> {
    public static final Parcelable.Creator<zzahv> CREATOR = new zzahu();
    private static final String zza = "zzahv";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahv() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahv zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = c.a(jSONObject.optString("refresh_token"));
            this.zzc = c.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = c.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw zzajk.zza(e5, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.n0(parcel, 2, this.zzb, false);
        f.n0(parcel, 3, this.zzc, false);
        f.l0(parcel, 4, Long.valueOf(zza()));
        f.n0(parcel, 5, this.zze, false);
        Long l4 = this.zzf;
        l4.getClass();
        f.l0(parcel, 6, l4);
        f.w0(iV0, parcel);
    }

    public final long zza() {
        Long l4 = this.zzd;
        if (l4 == null) {
            return 0L;
        }
        return l4.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzaao(e5);
        }
    }

    public final boolean zzg() {
        return System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue();
    }

    public static zzahv zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahv zzahvVar = new zzahv();
            zzahvVar.zzb = jSONObject.optString("refresh_token", null);
            zzahvVar.zzc = jSONObject.optString("access_token", null);
            zzahvVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahvVar.zze = jSONObject.optString("token_type", null);
            zzahvVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahvVar;
        } catch (JSONException e5) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzaao(e5);
        }
    }

    public final void zzc(String str) {
        C.d(str);
        this.zzb = str;
    }

    public zzahv(String str, String str2, Long l4, String str3, Long l5) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l4;
        this.zze = str3;
        this.zzf = l5;
    }

    public final String zzd() {
        return this.zzb;
    }

    public zzahv(String str, String str2, Long l4, String str3) {
        this(str, str2, l4, str3, Long.valueOf(System.currentTimeMillis()));
    }
}
