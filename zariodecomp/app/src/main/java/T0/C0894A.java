package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t0.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\A.smali */
public final class C0894A implements Parcelable {
    public static final Parcelable.Creator<C0894A> CREATOR = new g1.m(26);

    /* renamed from: a, reason: collision with root package name */
    public int f9872a;

    /* renamed from: b, reason: collision with root package name */
    public int f9873b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9874c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9872a);
        parcel.writeInt(this.f9873b);
        parcel.writeInt(this.f9874c ? 1 : 0);
    }
}
