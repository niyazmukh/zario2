package p2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import i1.AbstractC0596a;
import o2.D;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\c.smali */
public final class c extends AbstractC0596a implements D {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public String f9320a;

    /* renamed from: b, reason: collision with root package name */
    public String f9321b;

    /* renamed from: c, reason: collision with root package name */
    public String f9322c;

    /* renamed from: d, reason: collision with root package name */
    public String f9323d;

    /* renamed from: e, reason: collision with root package name */
    public String f9324e;

    /* renamed from: f, reason: collision with root package name */
    public String f9325f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9326k;

    /* renamed from: l, reason: collision with root package name */
    public String f9327l;

    public c(String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7) {
        this.f9320a = str;
        this.f9321b = str2;
        this.f9324e = str3;
        this.f9325f = str4;
        this.f9322c = str5;
        this.f9323d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.f9326k = z4;
        this.f9327l = str7;
    }

    public static c c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e5) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaao(e5);
        }
    }

    @Override // o2.D
    public final String b() {
        return this.f9321b;
    }

    public final String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f9320a);
            jSONObject.putOpt("providerId", this.f9321b);
            jSONObject.putOpt("displayName", this.f9322c);
            jSONObject.putOpt("photoUrl", this.f9323d);
            jSONObject.putOpt("email", this.f9324e);
            jSONObject.putOpt("phoneNumber", this.f9325f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f9326k));
            jSONObject.putOpt("rawUserInfo", this.f9327l);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaao(e5);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9320a, false);
        S0.f.n0(parcel, 2, this.f9321b, false);
        S0.f.n0(parcel, 3, this.f9322c, false);
        S0.f.n0(parcel, 4, this.f9323d, false);
        S0.f.n0(parcel, 5, this.f9324e, false);
        S0.f.n0(parcel, 6, this.f9325f, false);
        S0.f.u0(parcel, 7, 4);
        parcel.writeInt(this.f9326k ? 1 : 0);
        S0.f.n0(parcel, 8, this.f9327l, false);
        S0.f.w0(iV0, parcel);
    }
}
