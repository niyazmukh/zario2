package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: g0.K, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\K.smali */
public final class C0543K implements Parcelable {
    public static final Parcelable.Creator<C0543K> CREATOR = new c1.s(27);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f7353a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7354b;

    /* renamed from: c, reason: collision with root package name */
    public C0550b[] f7355c;

    /* renamed from: d, reason: collision with root package name */
    public int f7356d;

    /* renamed from: e, reason: collision with root package name */
    public String f7357e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f7358f;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f7359k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f7360l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f7353a);
        parcel.writeStringList(this.f7354b);
        parcel.writeTypedArray(this.f7355c, i);
        parcel.writeInt(this.f7356d);
        parcel.writeString(this.f7357e);
        parcel.writeStringList(this.f7358f);
        parcel.writeTypedList(this.f7359k);
        parcel.writeTypedList(this.f7360l);
    }
}
