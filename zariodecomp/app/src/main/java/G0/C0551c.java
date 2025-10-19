package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\c.1.smali */
public final class C0551c implements Parcelable {
    public static final Parcelable.Creator<C0551c> CREATOR = new c1.s(25);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7446a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7447b;

    public C0551c(ArrayList arrayList, ArrayList arrayList2) {
        this.f7446a = arrayList;
        this.f7447b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f7446a);
        parcel.writeTypedList(this.f7447b);
    }

    public C0551c(Parcel parcel) {
        this.f7446a = parcel.createStringArrayList();
        this.f7447b = parcel.createTypedArrayList(C0550b.CREATOR);
    }
}
