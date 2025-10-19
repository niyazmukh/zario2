package o2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o2.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\B.smali */
public final class C0796B extends t {
    public static final Parcelable.Creator<C0796B> CREATOR = new g1.m(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f9165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9166b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9167c;

    /* renamed from: d, reason: collision with root package name */
    public final zzaiz f9168d;

    public C0796B(String str, String str2, long j5, zzaiz zzaizVar) {
        com.google.android.gms.common.internal.C.d(str);
        this.f9165a = str;
        this.f9166b = str2;
        this.f9167c = j5;
        com.google.android.gms.common.internal.C.g(zzaizVar, "totpInfo cannot be null.");
        this.f9168d = zzaizVar;
    }

    public static C0796B e(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new C0796B(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzaiz());
    }

    @Override // o2.t
    public final String c() {
        return "totp";
    }

    @Override // o2.t
    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f9165a);
            jSONObject.putOpt("displayName", this.f9166b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f9167c));
            jSONObject.putOpt("totpInfo", this.f9168d);
            return jSONObject;
        } catch (JSONException e5) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e5);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9165a, false);
        S0.f.n0(parcel, 2, this.f9166b, false);
        S0.f.u0(parcel, 3, 8);
        parcel.writeLong(this.f9167c);
        S0.f.m0(parcel, 4, this.f9168d, i, false);
        S0.f.w0(iV0, parcel);
    }
}
