package e2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e2.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\k.smali */
public abstract class AbstractBinderC0463k extends Binder implements IInterface {
    public AbstractBinderC0463k(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i, Parcel parcel, Parcel parcel2, int i5);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i5)) {
            return true;
        }
        return a(i, parcel, parcel2, i5);
    }
}
