package androidx.versionedparcelable;

import D0.k;
import H0.b;
import H0.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\versionedparcelable\ParcelImpl.smali */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(1);

    /* renamed from: a, reason: collision with root package name */
    public final c f4838a;

    public ParcelImpl(Parcel parcel) {
        this.f4838a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new b(parcel).i(this.f4838a);
    }
}
