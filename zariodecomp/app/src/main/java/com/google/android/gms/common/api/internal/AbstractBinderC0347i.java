package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\i.1.smali */
public abstract class AbstractBinderC0347i extends zab implements InterfaceC0348j {
    public AbstractBinderC0347i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public static InterfaceC0348j asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0348j ? (InterfaceC0348j) iInterfaceQueryLocalInterface : new I(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zac.zaa(parcel, Status.CREATOR);
        zac.zab(parcel);
        onResult(status);
        return true;
    }
}
