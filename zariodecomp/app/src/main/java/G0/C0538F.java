package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g0.F, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\F.smali */
public final class C0538F implements Parcelable {
    public static final Parcelable.Creator<C0538F> CREATOR = new c1.s(26);

    /* renamed from: a, reason: collision with root package name */
    public String f7308a;

    /* renamed from: b, reason: collision with root package name */
    public int f7309b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7308a);
        parcel.writeInt(this.f7309b);
    }
}
