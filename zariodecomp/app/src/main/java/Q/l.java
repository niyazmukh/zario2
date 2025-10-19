package Q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q\l.smali */
public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new D0.k(3);

    /* renamed from: a, reason: collision with root package name */
    public int f2706a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2706a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2706a);
    }
}
