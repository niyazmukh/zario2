package Y1;

import F1.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y1\b.smali */
public final class b extends U.b {
    public static final Parcelable.Creator<b> CREATOR = new f(4);

    /* renamed from: c, reason: collision with root package name */
    public final int f3873c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3873c = parcel.readInt();
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3873c);
    }

    public b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f3873c = sideSheetBehavior.h;
    }
}
