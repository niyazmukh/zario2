package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\G.smali */
public final class G extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0368f f5668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5669b;

    public G(AbstractC0368f abstractC0368f, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f5668a = abstractC0368f;
        this.f5669b = i;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i5) {
        int i6 = this.f5669b;
        if (i == 1) {
            int i7 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
            zzc.zzf(parcel);
            C.g(this.f5668a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f5668a.onPostInitHandler(i7, strongBinder, bundle, i6);
            this.f5668a = null;
        } else if (i == 2) {
            parcel.readInt();
            zzc.zzf(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i8 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            K k5 = (K) zzc.zzb(parcel, K.CREATOR);
            zzc.zzf(parcel);
            AbstractC0368f abstractC0368f = this.f5668a;
            C.g(abstractC0368f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C.f(k5);
            abstractC0368f.zzc(k5);
            Bundle bundle2 = k5.f5674a;
            C.g(this.f5668a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f5668a.onPostInitHandler(i8, strongBinder2, bundle2, i6);
            this.f5668a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
