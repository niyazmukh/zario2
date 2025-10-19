package r1;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import q1.BinderC0847b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r1\g.smali */
public final class g extends zza {
    public final q1.a a(BinderC0847b binderC0847b, int i, BinderC0847b binderC0847b2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC0847b);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i);
        zzc.zze(parcelZza, binderC0847b2);
        Parcel parcelZzB = zzB(2, parcelZza);
        q1.a aVarA = BinderC0847b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final q1.a b(BinderC0847b binderC0847b, int i, BinderC0847b binderC0847b2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC0847b);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i);
        zzc.zze(parcelZza, binderC0847b2);
        Parcel parcelZzB = zzB(3, parcelZza);
        q1.a aVarA = BinderC0847b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }
}
