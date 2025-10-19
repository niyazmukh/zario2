package G1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G1\b.smali */
public final class b extends U.b {
    public static final Parcelable.Creator<b> CREATOR = new F1.f(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f1813c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f1813c = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1813c ? 1 : 0);
    }
}
