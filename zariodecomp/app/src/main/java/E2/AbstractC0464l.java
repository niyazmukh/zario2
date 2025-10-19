package e2;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e2.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\l.smali */
public abstract class AbstractC0464l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6882a = 0;

    static {
        AbstractC0464l.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(B.a.g(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
