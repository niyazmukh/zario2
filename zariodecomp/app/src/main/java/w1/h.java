package w1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import v1.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w1.1\h.smali */
public final class h extends AbstractC0596a {
    public static final Parcelable.Creator<h> CREATOR = new Y(16);

    /* renamed from: a, reason: collision with root package name */
    public final d f10910a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10911b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10912c;

    public h(d dVar, String str, String str2) {
        C.f(dVar);
        this.f10910a = dVar;
        this.f10912c = str;
        this.f10911b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f10912c;
        if (str == null) {
            if (hVar.f10912c != null) {
                return false;
            }
        } else if (!str.equals(hVar.f10912c)) {
            return false;
        }
        if (!this.f10910a.equals(hVar.f10910a)) {
            return false;
        }
        String str2 = hVar.f10911b;
        String str3 = this.f10911b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f10912c;
        int iHashCode = this.f10910a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f10911b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() throws JSONException {
        d dVar = this.f10910a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(dVar.b, 11));
            f fVar = dVar.c;
            if (fVar != f.UNKNOWN) {
                jSONObject.put("version", fVar.f10905a);
            }
            ArrayList arrayList = dVar.d;
            if (arrayList != null) {
                jSONObject.put("transports", arrayList.toString());
            }
            String str = this.f10912c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f10911b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 2, this.f10910a, i, false);
        S0.f.n0(parcel, 3, this.f10912c, false);
        S0.f.n0(parcel, 4, this.f10911b, false);
        S0.f.w0(iV0, parcel);
    }
}
