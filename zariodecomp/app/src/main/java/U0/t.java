package u0;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\t.smali */
public final class t extends Binder implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f10442a;

    public t(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f10442a = multiInstanceInvalidationService;
        attachInterface(this, n.h);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        String str = n.h;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        m callback = null;
        m callback2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                m mVarQueryLocalInterface = strongBinder.queryLocalInterface(m.g);
                if (mVarQueryLocalInterface == null || !(mVarQueryLocalInterface instanceof m)) {
                    l lVar = new l();
                    lVar.f10421a = strongBinder;
                    callback = lVar;
                } else {
                    callback = mVarQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            kotlin.jvm.internal.i.e(callback, "callback");
            int i6 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f10442a;
                synchronized (multiInstanceInvalidationService.f4800c) {
                    try {
                        int i7 = multiInstanceInvalidationService.f4798a + 1;
                        multiInstanceInvalidationService.f4798a = i7;
                        if (multiInstanceInvalidationService.f4800c.register(callback, Integer.valueOf(i7))) {
                            multiInstanceInvalidationService.f4799b.put(Integer.valueOf(i7), string);
                            i6 = i7;
                        } else {
                            multiInstanceInvalidationService.f4798a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i6);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                m mVarQueryLocalInterface2 = strongBinder2.queryLocalInterface(m.g);
                if (mVarQueryLocalInterface2 == null || !(mVarQueryLocalInterface2 instanceof m)) {
                    l lVar2 = new l();
                    lVar2.f10421a = strongBinder2;
                    callback2 = lVar2;
                } else {
                    callback2 = mVarQueryLocalInterface2;
                }
            }
            int i8 = parcel.readInt();
            kotlin.jvm.internal.i.e(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f10442a;
            synchronized (multiInstanceInvalidationService2.f4800c) {
                multiInstanceInvalidationService2.f4800c.unregister(callback2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i5);
            }
            int i9 = parcel.readInt();
            String[] tables = parcel.createStringArray();
            kotlin.jvm.internal.i.e(tables, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f10442a;
            synchronized (multiInstanceInvalidationService3.f4800c) {
                String str2 = (String) multiInstanceInvalidationService3.f4799b.get(Integer.valueOf(i9));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.f4800c.beginBroadcast();
                    for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f4800c.getBroadcastCookie(i10);
                            kotlin.jvm.internal.i.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f4799b.get(num);
                            if (i9 != iIntValue && str2.equals(str3)) {
                                try {
                                    multiInstanceInvalidationService3.f4800c.getBroadcastItem(i10).c(tables);
                                } catch (RemoteException e5) {
                                    Log.w("ROOM", "Error invoking a remote callback", e5);
                                }
                            }
                        } finally {
                            multiInstanceInvalidationService3.f4800c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
