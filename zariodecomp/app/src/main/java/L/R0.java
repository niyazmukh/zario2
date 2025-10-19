package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\R0.smali */
public final class R0 extends U.b {
    public static final Parcelable.Creator<R0> CREATOR = new F1.f(6);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8493c;

    public R0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8493c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f8493c + "}";
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f8493c));
    }
}
