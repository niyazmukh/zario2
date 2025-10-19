package Q1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q1\a.smali */
public final class a extends U.b {
    public static final Parcelable.Creator<a> CREATOR = new F1.f(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2724c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2724c = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2724c ? 1 : 0);
    }
}
