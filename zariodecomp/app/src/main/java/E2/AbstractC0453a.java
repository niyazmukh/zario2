package e2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\a.1.smali */
public abstract class AbstractC0453a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f6858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6859b;

    public AbstractC0453a(IBinder iBinder, String str) {
        this.f6858a = iBinder;
        this.f6859b = str;
    }

    public final void a(int i, Parcel parcel) {
        try {
            this.f6858a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6858a;
    }
}
