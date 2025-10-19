package t0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\m0.smali */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new g1.m(27);

    /* renamed from: a, reason: collision with root package name */
    public int f10069a;

    /* renamed from: b, reason: collision with root package name */
    public int f10070b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f10071c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10072d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f10069a + ", mGapDir=" + this.f10070b + ", mHasUnwantedGapAfter=" + this.f10072d + ", mGapPerSpan=" + Arrays.toString(this.f10071c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10069a);
        parcel.writeInt(this.f10070b);
        parcel.writeInt(this.f10072d ? 1 : 0);
        int[] iArr = this.f10071c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f10071c);
        }
    }
}
