package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\a0.smali */
public final class a0 extends U.b {
    public static final Parcelable.Creator<a0> CREATOR = new F1.f(8);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f9949c;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9949c = parcel.readParcelable(classLoader == null ? AbstractC0910Q.class.getClassLoader() : classLoader);
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f9949c, 0);
    }
}
