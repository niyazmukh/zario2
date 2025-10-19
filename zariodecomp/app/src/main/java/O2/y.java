package o2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\y.smali */
public final class y extends t {
    public static final Parcelable.Creator<y> CREATOR = new g1.m(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f9230a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9231b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9232c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9233d;

    public y(String str, String str2, long j5, String str3) {
        com.google.android.gms.common.internal.C.d(str);
        this.f9230a = str;
        this.f9231b = str2;
        this.f9232c = j5;
        com.google.android.gms.common.internal.C.d(str3);
        this.f9233d = str3;
    }

    public static y e(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new y(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // o2.t
    public final String c() {
        return "phone";
    }

    @Override // o2.t
    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f9230a);
            jSONObject.putOpt("displayName", this.f9231b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f9232c));
            jSONObject.putOpt("phoneNumber", this.f9233d);
            return jSONObject;
        } catch (JSONException e5) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e5);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9230a, false);
        S0.f.n0(parcel, 2, this.f9231b, false);
        S0.f.u0(parcel, 3, 8);
        parcel.writeLong(this.f9232c);
        S0.f.n0(parcel, 4, this.f9233d, false);
        S0.f.w0(iV0, parcel);
    }
}
