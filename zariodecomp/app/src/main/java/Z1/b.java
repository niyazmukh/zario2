package Z1;

import D0.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z1\b.smali */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new k(7);

    /* renamed from: a, reason: collision with root package name */
    public float f3949a;

    /* renamed from: b, reason: collision with root package name */
    public float f3950b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3951c;

    /* renamed from: d, reason: collision with root package name */
    public float f3952d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3953e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f3949a);
        parcel.writeFloat(this.f3950b);
        parcel.writeList(this.f3951c);
        parcel.writeFloat(this.f3952d);
        parcel.writeBooleanArray(new boolean[]{this.f3953e});
    }
}
