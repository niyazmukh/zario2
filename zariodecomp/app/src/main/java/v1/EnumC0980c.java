package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v1.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\c.1.smali */
public enum EnumC0980c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC0980c> CREATOR = new O(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f10605a;

    EnumC0980c(String str) {
        this.f10605a = str;
    }

    public static EnumC0980c b(String str) {
        for (EnumC0980c enumC0980c : values()) {
            if (str.equals(enumC0980c.f10605a)) {
                return enumC0980c;
            }
        }
        throw new C0979b(B.a.l("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10605a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10605a);
    }
}
