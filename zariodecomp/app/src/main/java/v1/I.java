package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\I.smali */
public enum I implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<I> CREATOR = new O(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f10580a;

    I(String str) {
        this.f10580a = str;
    }

    public static I b(String str) {
        for (I i : values()) {
            if (str.equals(i.f10580a)) {
                return i;
            }
        }
        throw new H(B.a.l("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10580a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10580a);
    }
}
