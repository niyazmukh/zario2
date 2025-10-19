package o2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.internal.p002firebaseauthapi.zzak;
import i1.AbstractC0596a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\G.smali */
public final class G extends AbstractC0596a {
    public static final Parcelable.Creator<G> CREATOR = new g1.m(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f9178a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9179b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9180c;

    public G(String str, String str2, String str3) {
        this.f9178a = str;
        this.f9179b = str2;
        this.f9180c = str3;
    }

    public static zzah c(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzah.zzg();
        }
        zzak zzakVarZzf = zzah.zzf();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzakVarZzf.zza(new G(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzakVarZzf.zza();
    }

    public static final G d(JSONObject jSONObject) {
        return new G(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9178a, false);
        S0.f.n0(parcel, 2, this.f9179b, false);
        S0.f.n0(parcel, 3, this.f9180c, false);
        S0.f.w0(iV0, parcel);
    }
}
