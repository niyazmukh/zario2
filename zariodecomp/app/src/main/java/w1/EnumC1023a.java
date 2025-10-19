package w1;

import android.os.Parcel;
import android.os.Parcelable;
import v1.Y;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w1.1\a.smali */
public enum EnumC1023a implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    ABSENT(0),
    STRING(1),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(2);

    public static final Parcelable.Creator<EnumC1023a> CREATOR = new Y(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f10899a;

    EnumC1023a(int i) {
        this.f10899a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10899a);
    }
}
