package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\d1.smali */
public final class d1 extends U.b {
    public static final Parcelable.Creator<d1> CREATOR = new F1.f(7);

    /* renamed from: c, reason: collision with root package name */
    public int f8567c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8568d;

    public d1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8567c = parcel.readInt();
        this.f8568d = parcel.readInt() != 0;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8567c);
        parcel.writeInt(this.f8568d ? 1 : 0);
    }
}
