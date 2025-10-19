package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v1.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\e.1.smali */
public enum EnumC0982e implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC0982e> CREATOR = new O(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f10608a;

    EnumC0982e(String str) {
        this.f10608a = str;
    }

    public static EnumC0982e b(String str) throws C0981d {
        for (EnumC0982e enumC0982e : values()) {
            if (str.equals(enumC0982e.f10608a)) {
                return enumC0982e;
            }
        }
        throw new C0981d(B.a.l("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10608a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10608a);
    }
}
