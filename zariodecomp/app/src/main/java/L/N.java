package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\N.smali */
public final class N extends View.BaseSavedState {
    public static final Parcelable.Creator<N> CREATOR = new g1.m(3);

    /* renamed from: a, reason: collision with root package name */
    public boolean f8479a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f8479a ? (byte) 1 : (byte) 0);
    }
}
