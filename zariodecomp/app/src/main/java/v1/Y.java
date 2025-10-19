package v1;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import h1.C0588a;
import java.util.ArrayList;
import w1.EnumC1023a;
import z1.C1067b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\Y.smali */
public final class Y implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10597a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10597a) {
            case 0:
                int iH0 = AbstractC0156x.h0(parcel);
                int iX = 0;
                String strU = null;
                int iX2 = 0;
                while (parcel.dataPosition() < iH0) {
                    int i = parcel.readInt();
                    char c5 = (char) i;
                    if (c5 == 2) {
                        iX = AbstractC0156x.X(i, parcel);
                    } else if (c5 == 3) {
                        strU = AbstractC0156x.u(i, parcel);
                    } else if (c5 != 4) {
                        AbstractC0156x.g0(i, parcel);
                    } else {
                        iX2 = AbstractC0156x.X(i, parcel);
                    }
                }
                AbstractC0156x.E(iH0, parcel);
                return new C0988k(iX, strU, iX2);
            case 1:
                int iH02 = AbstractC0156x.h0(parcel);
                String strU2 = null;
                Boolean boolValueOf = null;
                String strU3 = null;
                String strU4 = null;
                while (parcel.dataPosition() < iH02) {
                    int i5 = parcel.readInt();
                    char c6 = (char) i5;
                    if (c6 == 2) {
                        strU2 = AbstractC0156x.u(i5, parcel);
                    } else if (c6 == 3) {
                        int iC0 = AbstractC0156x.c0(i5, parcel);
                        if (iC0 == 0) {
                            boolValueOf = null;
                        } else {
                            AbstractC0156x.j0(parcel, iC0, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c6 == 4) {
                        strU3 = AbstractC0156x.u(i5, parcel);
                    } else if (c6 != 5) {
                        AbstractC0156x.g0(i5, parcel);
                    } else {
                        strU4 = AbstractC0156x.u(i5, parcel);
                    }
                }
                AbstractC0156x.E(iH02, parcel);
                return new C0990m(strU2, boolValueOf, strU3, strU4);
            case 2:
                int iH03 = AbstractC0156x.h0(parcel);
                C0999y c0999y = null;
                Uri uri = null;
                byte[] bArrP = null;
                while (parcel.dataPosition() < iH03) {
                    int i6 = parcel.readInt();
                    char c7 = (char) i6;
                    if (c7 == 2) {
                        c0999y = (C0999y) AbstractC0156x.t(parcel, i6, C0999y.CREATOR);
                    } else if (c7 == 3) {
                        uri = (Uri) AbstractC0156x.t(parcel, i6, Uri.CREATOR);
                    } else if (c7 != 4) {
                        AbstractC0156x.g0(i6, parcel);
                    } else {
                        bArrP = AbstractC0156x.p(i6, parcel);
                    }
                }
                AbstractC0156x.E(iH03, parcel);
                return new n(c0999y, uri, bArrP);
            case 3:
                int iH04 = AbstractC0156x.h0(parcel);
                B b5 = null;
                Uri uri2 = null;
                byte[] bArrP2 = null;
                while (parcel.dataPosition() < iH04) {
                    int i7 = parcel.readInt();
                    char c8 = (char) i7;
                    if (c8 == 2) {
                        b5 = (B) AbstractC0156x.t(parcel, i7, B.CREATOR);
                    } else if (c8 == 3) {
                        uri2 = (Uri) AbstractC0156x.t(parcel, i7, Uri.CREATOR);
                    } else if (c8 != 4) {
                        AbstractC0156x.g0(i7, parcel);
                    } else {
                        bArrP2 = AbstractC0156x.p(i7, parcel);
                    }
                }
                AbstractC0156x.E(iH04, parcel);
                return new C0991o(b5, uri2, bArrP2);
            case 4:
                try {
                    return r.b(parcel.readInt());
                } catch (C0993q e5) {
                    throw new RuntimeException(e5);
                }
            case 5:
                int iH05 = AbstractC0156x.h0(parcel);
                byte[] bArrP3 = null;
                byte[] bArrP4 = null;
                byte[] bArrP5 = null;
                long jA0 = 0;
                while (parcel.dataPosition() < iH05) {
                    int i8 = parcel.readInt();
                    char c9 = (char) i8;
                    if (c9 == 1) {
                        jA0 = AbstractC0156x.a0(i8, parcel);
                    } else if (c9 == 2) {
                        bArrP3 = AbstractC0156x.p(i8, parcel);
                    } else if (c9 == 3) {
                        bArrP4 = AbstractC0156x.p(i8, parcel);
                    } else if (c9 != 4) {
                        AbstractC0156x.g0(i8, parcel);
                    } else {
                        bArrP5 = AbstractC0156x.p(i8, parcel);
                    }
                }
                AbstractC0156x.E(iH05, parcel);
                return new Z(jA0, bArrP3, bArrP4, bArrP5);
            case 6:
                int iH06 = AbstractC0156x.h0(parcel);
                ArrayList arrayListY = null;
                while (parcel.dataPosition() < iH06) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        AbstractC0156x.g0(i9, parcel);
                    } else {
                        arrayListY = AbstractC0156x.y(parcel, i9, Z.CREATOR);
                    }
                }
                AbstractC0156x.E(iH06, parcel);
                return new a0(arrayListY);
            case 7:
                int iH07 = AbstractC0156x.h0(parcel);
                boolean zV = false;
                while (parcel.dataPosition() < iH07) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        AbstractC0156x.g0(i10, parcel);
                    } else {
                        zV = AbstractC0156x.V(i10, parcel);
                    }
                }
                AbstractC0156x.E(iH07, parcel);
                return new b0(zV);
            case 8:
                try {
                    return EnumC0996u.b(parcel.readInt());
                } catch (C0995t e6) {
                    throw new IllegalArgumentException(e6);
                }
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                int iH08 = AbstractC0156x.h0(parcel);
                String strU5 = null;
                while (parcel.dataPosition() < iH08) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 2) {
                        AbstractC0156x.g0(i11, parcel);
                    } else {
                        strU5 = AbstractC0156x.u(i11, parcel);
                    }
                }
                AbstractC0156x.E(iH08, parcel);
                return new C0997v(strU5);
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                try {
                    return w1.c.c(parcel.readInt());
                } catch (w1.b e7) {
                    throw new RuntimeException(e7);
                }
            case 11:
                int iH09 = AbstractC0156x.h0(parcel);
                String strU6 = null;
                int iX3 = 0;
                String strU7 = null;
                while (parcel.dataPosition() < iH09) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 2) {
                        iX3 = AbstractC0156x.X(i12, parcel);
                    } else if (c10 == 3) {
                        strU6 = AbstractC0156x.u(i12, parcel);
                    } else if (c10 != 4) {
                        AbstractC0156x.g0(i12, parcel);
                    } else {
                        strU7 = AbstractC0156x.u(i12, parcel);
                    }
                }
                AbstractC0156x.E(iH09, parcel);
                return new w1.c(strU6, iX3, strU7);
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int iH010 = AbstractC0156x.h0(parcel);
                byte[] bArrP6 = null;
                ArrayList arrayListY2 = null;
                int iX4 = 0;
                String strU8 = null;
                while (parcel.dataPosition() < iH010) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iX4 = AbstractC0156x.X(i13, parcel);
                    } else if (c11 == 2) {
                        bArrP6 = AbstractC0156x.p(i13, parcel);
                    } else if (c11 == 3) {
                        strU8 = AbstractC0156x.u(i13, parcel);
                    } else if (c11 != 4) {
                        AbstractC0156x.g0(i13, parcel);
                    } else {
                        arrayListY2 = AbstractC0156x.y(parcel, i13, Transport.CREATOR);
                    }
                }
                AbstractC0156x.E(iH010, parcel);
                return new w1.d(iX4, bArrP6, strU8, arrayListY2);
            case 13:
                try {
                    return w1.f.b(parcel.readString());
                } catch (w1.e e8) {
                    throw new RuntimeException(e8);
                }
            case 14:
                int iH011 = AbstractC0156x.h0(parcel);
                String strU9 = null;
                String strU10 = null;
                int iX5 = 0;
                byte[] bArrP7 = null;
                while (parcel.dataPosition() < iH011) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iX5 = AbstractC0156x.X(i14, parcel);
                    } else if (c12 == 2) {
                        strU9 = AbstractC0156x.u(i14, parcel);
                    } else if (c12 == 3) {
                        bArrP7 = AbstractC0156x.p(i14, parcel);
                    } else if (c12 != 4) {
                        AbstractC0156x.g0(i14, parcel);
                    } else {
                        strU10 = AbstractC0156x.u(i14, parcel);
                    }
                }
                AbstractC0156x.E(iH011, parcel);
                return new w1.g(iX5, strU9, bArrP7, strU10);
            case 15:
                int iH012 = AbstractC0156x.h0(parcel);
                Integer numY = null;
                Double dW = null;
                Uri uri3 = null;
                ArrayList arrayListY3 = null;
                ArrayList arrayListY4 = null;
                w1.c cVar = null;
                String strU11 = null;
                while (parcel.dataPosition() < iH012) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            numY = AbstractC0156x.Y(i15, parcel);
                            break;
                        case 3:
                            dW = AbstractC0156x.W(i15, parcel);
                            break;
                        case 4:
                            uri3 = (Uri) AbstractC0156x.t(parcel, i15, Uri.CREATOR);
                            break;
                        case 5:
                            arrayListY3 = AbstractC0156x.y(parcel, i15, w1.g.CREATOR);
                            break;
                        case 6:
                            arrayListY4 = AbstractC0156x.y(parcel, i15, w1.h.CREATOR);
                            break;
                        case 7:
                            cVar = (w1.c) AbstractC0156x.t(parcel, i15, w1.c.CREATOR);
                            break;
                        case '\b':
                            strU11 = AbstractC0156x.u(i15, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i15, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH012, parcel);
                return new RegisterRequestParams(numY, dW, uri3, arrayListY3, arrayListY4, cVar, strU11);
            case 16:
                int iH013 = AbstractC0156x.h0(parcel);
                w1.d dVar = null;
                String strU12 = null;
                String strU13 = null;
                while (parcel.dataPosition() < iH013) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 2) {
                        dVar = (w1.d) AbstractC0156x.t(parcel, i16, w1.d.CREATOR);
                    } else if (c13 == 3) {
                        strU12 = AbstractC0156x.u(i16, parcel);
                    } else if (c13 != 4) {
                        AbstractC0156x.g0(i16, parcel);
                    } else {
                        strU13 = AbstractC0156x.u(i16, parcel);
                    }
                }
                AbstractC0156x.E(iH013, parcel);
                return new w1.h(dVar, strU12, strU13);
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                int iH014 = AbstractC0156x.h0(parcel);
                Integer numY2 = null;
                Double dW2 = null;
                Uri uri4 = null;
                byte[] bArrP8 = null;
                ArrayList arrayListY5 = null;
                w1.c cVar2 = null;
                String strU14 = null;
                while (parcel.dataPosition() < iH014) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            numY2 = AbstractC0156x.Y(i17, parcel);
                            break;
                        case 3:
                            dW2 = AbstractC0156x.W(i17, parcel);
                            break;
                        case 4:
                            uri4 = (Uri) AbstractC0156x.t(parcel, i17, Uri.CREATOR);
                            break;
                        case 5:
                            bArrP8 = AbstractC0156x.p(i17, parcel);
                            break;
                        case 6:
                            arrayListY5 = AbstractC0156x.y(parcel, i17, w1.h.CREATOR);
                            break;
                        case 7:
                            cVar2 = (w1.c) AbstractC0156x.t(parcel, i17, w1.c.CREATOR);
                            break;
                        case '\b':
                            strU14 = AbstractC0156x.u(i17, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i17, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH014, parcel);
                return new SignRequestParams(numY2, dW2, uri4, bArrP8, arrayListY5, cVar2, strU14);
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iH015 = AbstractC0156x.h0(parcel);
                int iX6 = 0;
                Intent intent = null;
                int iX7 = 0;
                while (parcel.dataPosition() < iH015) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        iX6 = AbstractC0156x.X(i18, parcel);
                    } else if (c14 == 2) {
                        iX7 = AbstractC0156x.X(i18, parcel);
                    } else if (c14 != 3) {
                        AbstractC0156x.g0(i18, parcel);
                    } else {
                        intent = (Intent) AbstractC0156x.t(parcel, i18, Intent.CREATOR);
                    }
                }
                AbstractC0156x.E(iH015, parcel);
                return new C1067b(iX6, iX7, intent);
            case 19:
                int iH016 = AbstractC0156x.h0(parcel);
                ArrayList arrayListW = null;
                String strU15 = null;
                while (parcel.dataPosition() < iH016) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        arrayListW = AbstractC0156x.w(i19, parcel);
                    } else if (c15 != 2) {
                        AbstractC0156x.g0(i19, parcel);
                    } else {
                        strU15 = AbstractC0156x.u(i19, parcel);
                    }
                }
                AbstractC0156x.E(iH016, parcel);
                return new z1.e(strU15, arrayListW);
            case 20:
                int iH017 = AbstractC0156x.h0(parcel);
                int iX8 = 0;
                com.google.android.gms.common.internal.y yVar = null;
                while (parcel.dataPosition() < iH017) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        iX8 = AbstractC0156x.X(i20, parcel);
                    } else if (c16 != 2) {
                        AbstractC0156x.g0(i20, parcel);
                    } else {
                        yVar = (com.google.android.gms.common.internal.y) AbstractC0156x.t(parcel, i20, com.google.android.gms.common.internal.y.CREATOR);
                    }
                }
                AbstractC0156x.E(iH017, parcel);
                return new z1.f(iX8, yVar);
            default:
                int iH018 = AbstractC0156x.h0(parcel);
                int iX9 = 0;
                C0588a c0588a = null;
                com.google.android.gms.common.internal.z zVar = null;
                while (parcel.dataPosition() < iH018) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        iX9 = AbstractC0156x.X(i21, parcel);
                    } else if (c17 == 2) {
                        c0588a = (C0588a) AbstractC0156x.t(parcel, i21, C0588a.CREATOR);
                    } else if (c17 != 3) {
                        AbstractC0156x.g0(i21, parcel);
                    } else {
                        zVar = (com.google.android.gms.common.internal.z) AbstractC0156x.t(parcel, i21, com.google.android.gms.common.internal.z.CREATOR);
                    }
                }
                AbstractC0156x.E(iH018, parcel);
                return new z1.g(iX9, c0588a, zVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f10597a) {
            case 0:
                return new C0988k[i];
            case 1:
                return new C0990m[i];
            case 2:
                return new n[i];
            case 3:
                return new C0991o[i];
            case 4:
                return new r[i];
            case 5:
                return new Z[i];
            case 6:
                return new a0[i];
            case 7:
                return new b0[i];
            case 8:
                return new EnumC0996u[i];
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return new C0997v[i];
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return new EnumC1023a[i];
            case 11:
                return new w1.c[i];
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new w1.d[i];
            case 13:
                return new w1.f[i];
            case 14:
                return new w1.g[i];
            case 15:
                return new RegisterRequestParams[i];
            case 16:
                return new w1.h[i];
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return new SignRequestParams[i];
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new C1067b[i];
            case 19:
                return new z1.e[i];
            case 20:
                return new z1.f[i];
            default:
                return new z1.g[i];
        }
    }
}
