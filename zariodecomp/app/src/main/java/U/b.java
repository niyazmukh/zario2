package U;

import F1.f;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U\b.smali */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f3264a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f3263b = new a();
    public static final Parcelable.Creator<b> CREATOR = new f(3);

    public b() {
        this.f3264a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3264a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3264a = parcelable == f3263b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f3264a = parcelable == null ? f3263b : parcelable;
    }
}
