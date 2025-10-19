package m1;

import N2.AbstractC0156x;
import N2.n0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m1.1\e.smali */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH0 = AbstractC0156x.h0(parcel);
        int iX = 0;
        int iX2 = 0;
        boolean zV = false;
        int iX3 = 0;
        boolean zV2 = false;
        int iX4 = 0;
        String strU = null;
        String strU2 = null;
        l1.b bVar = null;
        while (parcel.dataPosition() < iH0) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iX = AbstractC0156x.X(i, parcel);
                    break;
                case 2:
                    iX2 = AbstractC0156x.X(i, parcel);
                    break;
                case 3:
                    zV = AbstractC0156x.V(i, parcel);
                    break;
                case 4:
                    iX3 = AbstractC0156x.X(i, parcel);
                    break;
                case 5:
                    zV2 = AbstractC0156x.V(i, parcel);
                    break;
                case 6:
                    strU = AbstractC0156x.u(i, parcel);
                    break;
                case 7:
                    iX4 = AbstractC0156x.X(i, parcel);
                    break;
                case '\b':
                    strU2 = AbstractC0156x.u(i, parcel);
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    bVar = (l1.b) AbstractC0156x.t(parcel, i, l1.b.CREATOR);
                    break;
                default:
                    AbstractC0156x.g0(i, parcel);
                    break;
            }
        }
        AbstractC0156x.E(iH0, parcel);
        return new C0742a(iX, iX2, zV, iX3, zV2, strU, iX4, strU2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0742a[i];
    }
}
