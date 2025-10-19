package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\J.smali */
public enum J implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<J> CREATOR = new O(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f10582a;

    J(String str) {
        this.f10582a = str;
    }

    public static J b(String str) throws K {
        for (J j5 : values()) {
            if (str.equals(j5.f10582a)) {
                return j5;
            }
        }
        throw new K(B.a.l("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10582a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10582a);
    }
}
