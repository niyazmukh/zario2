package r1;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import q1.BinderC0847b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r1\f.smali */
public final class f extends zza {
    public final q1.a a(BinderC0847b binderC0847b, int i) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC0847b);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(2, parcelZza);
        q1.a aVarA = BinderC0847b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final q1.a b(BinderC0847b binderC0847b, int i) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC0847b);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(4, parcelZza);
        q1.a aVarA = BinderC0847b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final q1.a d(BinderC0847b binderC0847b, boolean z4, long j5) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC0847b);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(z4 ? 1 : 0);
        parcelZza.writeLong(j5);
        Parcel parcelZzB = zzB(7, parcelZza);
        q1.a aVarA = BinderC0847b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final q1.a f(BinderC0847b binderC0847b, int i, BinderC0847b binderC0847b2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC0847b);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i);
        zzc.zze(parcelZza, binderC0847b2);
        Parcel parcelZzB = zzB(8, parcelZza);
        q1.a aVarA = BinderC0847b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }
}
