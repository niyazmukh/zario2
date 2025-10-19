package p2;

import android.os.Parcel;
import android.os.Parcelable;
import i1.InterfaceC0597b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\f.smali */
public final class f implements InterfaceC0597b {
    public static final Parcelable.Creator<f> CREATOR = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public final long f9341a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9342b;

    public f(long j5, long j6) {
        this.f9341a = j5;
        this.f9342b = j6;
    }

    public static f b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new f(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 8);
        parcel.writeLong(this.f9341a);
        S0.f.u0(parcel, 2, 8);
        parcel.writeLong(this.f9342b);
        S0.f.w0(iV0, parcel);
    }
}
