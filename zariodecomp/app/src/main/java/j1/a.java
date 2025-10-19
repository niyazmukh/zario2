package J1;

import D0.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J1\a.smali */
public final class a extends View.BaseSavedState {
    public static final Parcelable.Creator<a> CREATOR = new k(2);

    /* renamed from: a, reason: collision with root package name */
    public int f2071a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f2071a;
        return B.a.m(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f2071a));
    }
}
