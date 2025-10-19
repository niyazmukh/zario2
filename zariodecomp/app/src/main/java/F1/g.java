package F1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F1\g.smali */
public final class g extends U.b {
    public static final Parcelable.Creator<g> CREATOR = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f1675c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1676d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1677e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1678f;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1679k;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1675c = parcel.readInt();
        this.f1676d = parcel.readInt();
        this.f1677e = parcel.readInt() == 1;
        this.f1678f = parcel.readInt() == 1;
        this.f1679k = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1675c);
        parcel.writeInt(this.f1676d);
        parcel.writeInt(this.f1677e ? 1 : 0);
        parcel.writeInt(this.f1678f ? 1 : 0);
        parcel.writeInt(this.f1679k ? 1 : 0);
    }

    public g(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f1675c = bottomSheetBehavior.f5824L;
        this.f1676d = bottomSheetBehavior.f5846e;
        this.f1677e = bottomSheetBehavior.f5840b;
        this.f1678f = bottomSheetBehavior.f5821I;
        this.f1679k = bottomSheetBehavior.f5822J;
    }
}
