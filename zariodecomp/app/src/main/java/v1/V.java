package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\V.smali */
public enum V implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<V> CREATOR = new O(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f10594a;

    V(String str) {
        this.f10594a = str;
    }

    public static V b(String str) throws U {
        for (V v4 : values()) {
            if (str.equals(v4.f10594a)) {
                return v4;
            }
        }
        throw new U(B.a.l("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10594a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10594a);
    }
}
