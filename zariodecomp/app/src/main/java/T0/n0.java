package t0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\n0.smali */
public final class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new g1.m(28);

    /* renamed from: a, reason: collision with root package name */
    public int f10076a;

    /* renamed from: b, reason: collision with root package name */
    public int f10077b;

    /* renamed from: c, reason: collision with root package name */
    public int f10078c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f10079d;

    /* renamed from: e, reason: collision with root package name */
    public int f10080e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10081f;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f10082k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10083l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10084m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10085n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10076a);
        parcel.writeInt(this.f10077b);
        parcel.writeInt(this.f10078c);
        if (this.f10078c > 0) {
            parcel.writeIntArray(this.f10079d);
        }
        parcel.writeInt(this.f10080e);
        if (this.f10080e > 0) {
            parcel.writeIntArray(this.f10081f);
        }
        parcel.writeInt(this.f10083l ? 1 : 0);
        parcel.writeInt(this.f10084m ? 1 : 0);
        parcel.writeInt(this.f10085n ? 1 : 0);
        parcel.writeList(this.f10082k);
    }
}
