package u0;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\l.smali */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f10421a;

    public final IBinder asBinder() {
        return this.f10421a;
    }

    public final void c(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(m.g);
            parcelObtain.writeStringArray(strArr);
            this.f10421a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
