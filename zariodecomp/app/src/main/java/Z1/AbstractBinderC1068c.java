package z1;

import N2.n0;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.N;
import com.google.android.gms.common.api.internal.Y;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z1.1\c.smali */
public abstract class AbstractBinderC1068c extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i5) {
        switch (i) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                g gVar = (g) zac.zaa(parcel, g.CREATOR);
                zac.zab(parcel);
                N n5 = (N) this;
                n5.f5590b.post(new Y(2, n5, gVar));
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
