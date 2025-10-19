package p2;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import java.util.ArrayList;
import o2.C0796B;
import o2.G;
import o2.H;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\b.smali */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9319a;

    public /* synthetic */ b(int i) {
        this.f9319a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9319a) {
            case 0:
                int iH0 = AbstractC0156x.h0(parcel);
                String strU = null;
                String strU2 = null;
                String strU3 = null;
                String strU4 = null;
                String strU5 = null;
                String strU6 = null;
                String strU7 = null;
                boolean zV = false;
                while (parcel.dataPosition() < iH0) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strU = AbstractC0156x.u(i, parcel);
                            break;
                        case 2:
                            strU2 = AbstractC0156x.u(i, parcel);
                            break;
                        case 3:
                            strU5 = AbstractC0156x.u(i, parcel);
                            break;
                        case 4:
                            strU4 = AbstractC0156x.u(i, parcel);
                            break;
                        case 5:
                            strU3 = AbstractC0156x.u(i, parcel);
                            break;
                        case 6:
                            strU6 = AbstractC0156x.u(i, parcel);
                            break;
                        case 7:
                            zV = AbstractC0156x.V(i, parcel);
                            break;
                        case '\b':
                            strU7 = AbstractC0156x.u(i, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH0, parcel);
                return new c(strU, strU2, strU3, strU4, strU5, strU6, zV, strU7);
            case 1:
                int iH02 = AbstractC0156x.h0(parcel);
                ArrayList arrayListY = null;
                zzahv zzahvVar = null;
                c cVar = null;
                String strU8 = null;
                String strU9 = null;
                ArrayList arrayListY2 = null;
                ArrayList arrayListW = null;
                String strU10 = null;
                Boolean boolValueOf = null;
                f fVar = null;
                boolean zV2 = false;
                H h = null;
                m mVar = null;
                while (parcel.dataPosition() < iH02) {
                    int i5 = parcel.readInt();
                    ArrayList arrayList = arrayListY;
                    switch ((char) i5) {
                        case 1:
                            zzahvVar = (zzahv) AbstractC0156x.t(parcel, i5, zzahv.CREATOR);
                            break;
                        case 2:
                            cVar = (c) AbstractC0156x.t(parcel, i5, c.CREATOR);
                            break;
                        case 3:
                            strU8 = AbstractC0156x.u(i5, parcel);
                            break;
                        case 4:
                            strU9 = AbstractC0156x.u(i5, parcel);
                            break;
                        case 5:
                            arrayListY2 = AbstractC0156x.y(parcel, i5, c.CREATOR);
                            break;
                        case 6:
                            arrayListW = AbstractC0156x.w(i5, parcel);
                            break;
                        case 7:
                            strU10 = AbstractC0156x.u(i5, parcel);
                            break;
                        case '\b':
                            int iC0 = AbstractC0156x.c0(i5, parcel);
                            if (iC0 != 0) {
                                AbstractC0156x.j0(parcel, iC0, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            fVar = (f) AbstractC0156x.t(parcel, i5, f.CREATOR);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            zV2 = AbstractC0156x.V(i5, parcel);
                            break;
                        case 11:
                            h = (H) AbstractC0156x.t(parcel, i5, H.CREATOR);
                            break;
                        case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            mVar = (m) AbstractC0156x.t(parcel, i5, m.CREATOR);
                            break;
                        case '\r':
                            arrayListY = AbstractC0156x.y(parcel, i5, G.CREATOR);
                            continue;
                        default:
                            AbstractC0156x.g0(i5, parcel);
                            break;
                    }
                    arrayListY = arrayList;
                }
                AbstractC0156x.E(iH02, parcel);
                e eVar = new e();
                eVar.f9328a = zzahvVar;
                eVar.f9329b = cVar;
                eVar.f9330c = strU8;
                eVar.f9331d = strU9;
                eVar.f9332e = arrayListY2;
                eVar.f9333f = arrayListW;
                eVar.f9334k = strU10;
                eVar.f9335l = boolValueOf;
                eVar.f9336m = fVar;
                eVar.f9337n = zV2;
                eVar.f9338o = h;
                eVar.f9339p = mVar;
                eVar.f9340q = arrayListY;
                return eVar;
            case 2:
                int iH03 = AbstractC0156x.h0(parcel);
                long jA0 = 0;
                long jA02 = 0;
                while (parcel.dataPosition() < iH03) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        jA0 = AbstractC0156x.a0(i6, parcel);
                    } else if (c5 != 2) {
                        AbstractC0156x.g0(i6, parcel);
                    } else {
                        jA02 = AbstractC0156x.a0(i6, parcel);
                    }
                }
                AbstractC0156x.E(iH03, parcel);
                return new f(jA0, jA02);
            case 3:
                int iH04 = AbstractC0156x.h0(parcel);
                String strU11 = null;
                String strU12 = null;
                ArrayList arrayListY3 = null;
                ArrayList arrayListY4 = null;
                e eVar2 = null;
                while (parcel.dataPosition() < iH04) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        strU11 = AbstractC0156x.u(i7, parcel);
                    } else if (c6 == 2) {
                        strU12 = AbstractC0156x.u(i7, parcel);
                    } else if (c6 == 3) {
                        arrayListY3 = AbstractC0156x.y(parcel, i7, o2.y.CREATOR);
                    } else if (c6 == 4) {
                        arrayListY4 = AbstractC0156x.y(parcel, i7, C0796B.CREATOR);
                    } else if (c6 != 5) {
                        AbstractC0156x.g0(i7, parcel);
                    } else {
                        eVar2 = (e) AbstractC0156x.t(parcel, i7, e.CREATOR);
                    }
                }
                AbstractC0156x.E(iH04, parcel);
                g gVar = new g();
                gVar.f9343a = strU11;
                gVar.f9344b = strU12;
                gVar.f9345c = arrayListY3;
                gVar.f9346d = arrayListY4;
                gVar.f9347e = eVar2;
                return gVar;
            case 4:
                int iH05 = AbstractC0156x.h0(parcel);
                ArrayList arrayListY5 = null;
                ArrayList arrayListY6 = null;
                while (parcel.dataPosition() < iH05) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        arrayListY5 = AbstractC0156x.y(parcel, i8, o2.y.CREATOR);
                    } else if (c7 != 2) {
                        AbstractC0156x.g0(i8, parcel);
                    } else {
                        arrayListY6 = AbstractC0156x.y(parcel, i8, C0796B.CREATOR);
                    }
                }
                AbstractC0156x.E(iH05, parcel);
                return new m(arrayListY5, arrayListY6);
            case 5:
                int iH06 = AbstractC0156x.h0(parcel);
                String strU13 = null;
                boolean zV3 = false;
                String strU14 = null;
                while (parcel.dataPosition() < iH06) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        strU13 = AbstractC0156x.u(i9, parcel);
                    } else if (c8 == 2) {
                        strU14 = AbstractC0156x.u(i9, parcel);
                    } else if (c8 != 3) {
                        AbstractC0156x.g0(i9, parcel);
                    } else {
                        zV3 = AbstractC0156x.V(i9, parcel);
                    }
                }
                AbstractC0156x.E(iH06, parcel);
                return new y(strU13, strU14, zV3);
            default:
                int iH07 = AbstractC0156x.h0(parcel);
                e eVar3 = null;
                y yVar = null;
                H h5 = null;
                while (parcel.dataPosition() < iH07) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        eVar3 = (e) AbstractC0156x.t(parcel, i10, e.CREATOR);
                    } else if (c9 == 2) {
                        yVar = (y) AbstractC0156x.t(parcel, i10, y.CREATOR);
                    } else if (c9 != 3) {
                        AbstractC0156x.g0(i10, parcel);
                    } else {
                        h5 = (H) AbstractC0156x.t(parcel, i10, H.CREATOR);
                    }
                }
                AbstractC0156x.E(iH07, parcel);
                z zVar = new z();
                zVar.f9382a = eVar3;
                zVar.f9383b = yVar;
                zVar.f9384c = h5;
                return zVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f9319a) {
            case 0:
                return new c[i];
            case 1:
                return new e[i];
            case 2:
                return new f[i];
            case 3:
                return new g[i];
            case 4:
                return new m[i];
            case 5:
                return new y[i];
            default:
                return new z[i];
        }
    }
}
