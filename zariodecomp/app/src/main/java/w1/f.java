package w1;

import android.os.Parcel;
import android.os.Parcelable;
import v1.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w1.1\f.smali */
public enum f implements Parcelable {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    V1("U2F_V1"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("U2F_V2");

    public static final Parcelable.Creator<f> CREATOR = new Y(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f10905a;

    f(String str) {
        this.f10905a = str;
    }

    public static f b(String str) throws e {
        if (str == null) {
            return UNKNOWN;
        }
        for (f fVar : values()) {
            if (str.equals(fVar.f10905a)) {
                return fVar;
            }
        }
        throw new e(B.a.l("Protocol version ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10905a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10905a);
    }
}
