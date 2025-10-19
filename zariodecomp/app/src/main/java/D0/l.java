package D0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D0\l.smali */
public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new k(0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1313a;

    public l(Parcelable parcelable, boolean z4) {
        super(parcelable);
        this.f1313a = z4;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f1313a ? (byte) 1 : (byte) 0);
    }

    public l(Parcel parcel) {
        super(parcel);
        this.f1313a = parcel.readByte() != 0;
    }
}
