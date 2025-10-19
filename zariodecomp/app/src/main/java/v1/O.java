package v1;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\O.smali */
public final class O implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10588a;

    public /* synthetic */ O(int i) {
        this.f10588a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10588a) {
            case 0:
                try {
                    return EnumC0980c.b(parcel.readString());
                } catch (C0979b e5) {
                    throw new RuntimeException(e5);
                }
            case 1:
                int iH0 = AbstractC0156x.h0(parcel);
                boolean zV = false;
                while (parcel.dataPosition() < iH0) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        AbstractC0156x.g0(i, parcel);
                    } else {
                        zV = AbstractC0156x.V(i, parcel);
                    }
                }
                AbstractC0156x.E(iH0, parcel);
                return new c0(zV);
            case 2:
                int iH02 = AbstractC0156x.h0(parcel);
                long jA0 = 0;
                while (parcel.dataPosition() < iH02) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        AbstractC0156x.g0(i5, parcel);
                    } else {
                        jA0 = AbstractC0156x.a0(i5, parcel);
                    }
                }
                AbstractC0156x.E(iH02, parcel);
                return new P(jA0);
            case 3:
                int iH03 = AbstractC0156x.h0(parcel);
                boolean zV2 = false;
                while (parcel.dataPosition() < iH03) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        AbstractC0156x.g0(i6, parcel);
                    } else {
                        zV2 = AbstractC0156x.V(i6, parcel);
                    }
                }
                AbstractC0156x.E(iH03, parcel);
                return new Q(zV2);
            case 4:
                int iH04 = AbstractC0156x.h0(parcel);
                boolean zV3 = false;
                while (parcel.dataPosition() < iH04) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        AbstractC0156x.g0(i7, parcel);
                    } else {
                        zV3 = AbstractC0156x.V(i7, parcel);
                    }
                }
                AbstractC0156x.E(iH04, parcel);
                return new w(zV3);
            case 5:
                int iH05 = AbstractC0156x.h0(parcel);
                String strU = null;
                while (parcel.dataPosition() < iH05) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        AbstractC0156x.g0(i8, parcel);
                    } else {
                        strU = AbstractC0156x.u(i8, parcel);
                    }
                }
                AbstractC0156x.E(iH05, parcel);
                return new S(strU);
            case 6:
                int iH06 = AbstractC0156x.h0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (parcel.dataPosition() < iH06) {
                        int i9 = parcel.readInt();
                        if (((char) i9) != 1) {
                            AbstractC0156x.g0(i9, parcel);
                        } else {
                            int iC0 = AbstractC0156x.c0(i9, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iC0 == 0) {
                                break;
                            }
                            int i10 = parcel.readInt();
                            byte[][] bArr2 = new byte[i10][];
                            for (int i11 = 0; i11 < i10; i11++) {
                                bArr2[i11] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iC0);
                            bArr = bArr2;
                        }
                    }
                    AbstractC0156x.E(iH06, parcel);
                    return new T(bArr);
                    break;
                }
            case 7:
                int iH07 = AbstractC0156x.h0(parcel);
                C c5 = null;
                F f2 = null;
                byte[] bArrP = null;
                ArrayList arrayListY = null;
                Double dW = null;
                ArrayList arrayListY2 = null;
                C0990m c0990m = null;
                Integer numY = null;
                TokenBinding tokenBinding = null;
                String strU2 = null;
                C0983f c0983f = null;
                while (parcel.dataPosition() < iH07) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            c5 = (C) AbstractC0156x.t(parcel, i12, C.CREATOR);
                            break;
                        case 3:
                            f2 = (F) AbstractC0156x.t(parcel, i12, F.CREATOR);
                            break;
                        case 4:
                            bArrP = AbstractC0156x.p(i12, parcel);
                            break;
                        case 5:
                            arrayListY = AbstractC0156x.y(parcel, i12, A.CREATOR);
                            break;
                        case 6:
                            dW = AbstractC0156x.W(i12, parcel);
                            break;
                        case 7:
                            arrayListY2 = AbstractC0156x.y(parcel, i12, C1000z.CREATOR);
                            break;
                        case '\b':
                            c0990m = (C0990m) AbstractC0156x.t(parcel, i12, C0990m.CREATOR);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            numY = AbstractC0156x.Y(i12, parcel);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            tokenBinding = (TokenBinding) AbstractC0156x.t(parcel, i12, TokenBinding.CREATOR);
                            break;
                        case 11:
                            strU2 = AbstractC0156x.u(i12, parcel);
                            break;
                        case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            c0983f = (C0983f) AbstractC0156x.t(parcel, i12, C0983f.CREATOR);
                            break;
                        default:
                            AbstractC0156x.g0(i12, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH07, parcel);
                return new C0999y(c5, f2, bArrP, arrayListY, dW, arrayListY2, c0990m, numY, tokenBinding, strU2, c0983f);
            case 8:
                int iH08 = AbstractC0156x.h0(parcel);
                String strU3 = null;
                String strU4 = null;
                byte[] bArrP2 = null;
                C0987j c0987j = null;
                C0986i c0986i = null;
                C0988k c0988k = null;
                C0984g c0984g = null;
                String strU5 = null;
                while (parcel.dataPosition() < iH08) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strU3 = AbstractC0156x.u(i13, parcel);
                            break;
                        case 2:
                            strU4 = AbstractC0156x.u(i13, parcel);
                            break;
                        case 3:
                            bArrP2 = AbstractC0156x.p(i13, parcel);
                            break;
                        case 4:
                            c0987j = (C0987j) AbstractC0156x.t(parcel, i13, C0987j.CREATOR);
                            break;
                        case 5:
                            c0986i = (C0986i) AbstractC0156x.t(parcel, i13, C0986i.CREATOR);
                            break;
                        case 6:
                            c0988k = (C0988k) AbstractC0156x.t(parcel, i13, C0988k.CREATOR);
                            break;
                        case 7:
                            c0984g = (C0984g) AbstractC0156x.t(parcel, i13, C0984g.CREATOR);
                            break;
                        case '\b':
                            strU5 = AbstractC0156x.u(i13, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i13, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH08, parcel);
                return new C0998x(strU3, strU4, bArrP2, c0987j, c0986i, c0988k, c0984g, strU5);
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                int iH09 = AbstractC0156x.h0(parcel);
                String strU6 = null;
                byte[] bArrP3 = null;
                ArrayList arrayListY3 = null;
                while (parcel.dataPosition() < iH09) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 2) {
                        strU6 = AbstractC0156x.u(i14, parcel);
                    } else if (c6 == 3) {
                        bArrP3 = AbstractC0156x.p(i14, parcel);
                    } else if (c6 != 4) {
                        AbstractC0156x.g0(i14, parcel);
                    } else {
                        arrayListY3 = AbstractC0156x.y(parcel, i14, Transport.CREATOR);
                    }
                }
                AbstractC0156x.E(iH09, parcel);
                return new C1000z(strU6, bArrP3, arrayListY3);
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                int iH010 = AbstractC0156x.h0(parcel);
                String strU7 = null;
                Integer numY2 = null;
                while (parcel.dataPosition() < iH010) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 2) {
                        strU7 = AbstractC0156x.u(i15, parcel);
                    } else if (c7 != 3) {
                        AbstractC0156x.g0(i15, parcel);
                    } else {
                        numY2 = AbstractC0156x.Y(i15, parcel);
                    }
                }
                AbstractC0156x.E(iH010, parcel);
                return new A(strU7, numY2.intValue());
            case 11:
                int iH011 = AbstractC0156x.h0(parcel);
                byte[] bArrP4 = null;
                Double dW2 = null;
                String strU8 = null;
                ArrayList arrayListY4 = null;
                Integer numY3 = null;
                TokenBinding tokenBinding2 = null;
                String strU9 = null;
                C0983f c0983f2 = null;
                Long lB0 = null;
                while (parcel.dataPosition() < iH011) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            bArrP4 = AbstractC0156x.p(i16, parcel);
                            break;
                        case 3:
                            dW2 = AbstractC0156x.W(i16, parcel);
                            break;
                        case 4:
                            strU8 = AbstractC0156x.u(i16, parcel);
                            break;
                        case 5:
                            arrayListY4 = AbstractC0156x.y(parcel, i16, C1000z.CREATOR);
                            break;
                        case 6:
                            numY3 = AbstractC0156x.Y(i16, parcel);
                            break;
                        case 7:
                            tokenBinding2 = (TokenBinding) AbstractC0156x.t(parcel, i16, TokenBinding.CREATOR);
                            break;
                        case '\b':
                            strU9 = AbstractC0156x.u(i16, parcel);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            c0983f2 = (C0983f) AbstractC0156x.t(parcel, i16, C0983f.CREATOR);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            lB0 = AbstractC0156x.b0(i16, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i16, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH011, parcel);
                return new B(bArrP4, dW2, strU8, arrayListY4, numY3, tokenBinding2, strU9, c0983f2, lB0);
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int iH012 = AbstractC0156x.h0(parcel);
                String strU10 = null;
                String strU11 = null;
                String strU12 = null;
                while (parcel.dataPosition() < iH012) {
                    int i17 = parcel.readInt();
                    char c8 = (char) i17;
                    if (c8 == 2) {
                        strU10 = AbstractC0156x.u(i17, parcel);
                    } else if (c8 == 3) {
                        strU11 = AbstractC0156x.u(i17, parcel);
                    } else if (c8 != 4) {
                        AbstractC0156x.g0(i17, parcel);
                    } else {
                        strU12 = AbstractC0156x.u(i17, parcel);
                    }
                }
                AbstractC0156x.E(iH012, parcel);
                return new C(strU10, strU11, strU12);
            case 13:
                try {
                    return E.b(parcel.readString());
                } catch (D e6) {
                    throw new RuntimeException(e6);
                }
            case 14:
                int iH013 = AbstractC0156x.h0(parcel);
                byte[] bArrP5 = null;
                String strU13 = null;
                String strU14 = null;
                String strU15 = null;
                while (parcel.dataPosition() < iH013) {
                    int i18 = parcel.readInt();
                    char c9 = (char) i18;
                    if (c9 == 2) {
                        bArrP5 = AbstractC0156x.p(i18, parcel);
                    } else if (c9 == 3) {
                        strU13 = AbstractC0156x.u(i18, parcel);
                    } else if (c9 == 4) {
                        strU14 = AbstractC0156x.u(i18, parcel);
                    } else if (c9 != 5) {
                        AbstractC0156x.g0(i18, parcel);
                    } else {
                        strU15 = AbstractC0156x.u(i18, parcel);
                    }
                }
                AbstractC0156x.E(iH013, parcel);
                return new F(bArrP5, strU13, strU14, strU15);
            case 15:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return I.b(string);
                } catch (H e7) {
                    throw new RuntimeException(e7);
                }
            case 16:
                try {
                    return J.b(parcel.readString());
                } catch (K e8) {
                    throw new RuntimeException(e8);
                }
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                int iH014 = AbstractC0156x.h0(parcel);
                String strU16 = null;
                String strU17 = null;
                while (parcel.dataPosition() < iH014) {
                    int i19 = parcel.readInt();
                    char c10 = (char) i19;
                    if (c10 == 2) {
                        strU16 = AbstractC0156x.u(i19, parcel);
                    } else if (c10 != 3) {
                        AbstractC0156x.g0(i19, parcel);
                    } else {
                        strU17 = AbstractC0156x.u(i19, parcel);
                    }
                }
                AbstractC0156x.E(iH014, parcel);
                return new TokenBinding(strU16, strU17);
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iH015 = AbstractC0156x.h0(parcel);
                boolean zV4 = false;
                while (parcel.dataPosition() < iH015) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        AbstractC0156x.g0(i20, parcel);
                    } else {
                        zV4 = AbstractC0156x.V(i20, parcel);
                    }
                }
                AbstractC0156x.E(iH015, parcel);
                return new L(zV4);
            case 19:
                try {
                    return V.b(parcel.readString());
                } catch (U e9) {
                    throw new RuntimeException(e9);
                }
            case 20:
                int iH016 = AbstractC0156x.h0(parcel);
                ArrayList arrayListY5 = null;
                while (parcel.dataPosition() < iH016) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        AbstractC0156x.g0(i21, parcel);
                    } else {
                        arrayListY5 = AbstractC0156x.y(parcel, i21, N.CREATOR);
                    }
                }
                AbstractC0156x.E(iH016, parcel);
                return new M(arrayListY5);
            case 21:
                try {
                    return EnumC0982e.b(parcel.readString());
                } catch (C0981d e10) {
                    throw new RuntimeException(e10);
                }
            case 22:
                int iH017 = AbstractC0156x.h0(parcel);
                int iX = 0;
                short s4 = 0;
                short s5 = 0;
                while (parcel.dataPosition() < iH017) {
                    int i22 = parcel.readInt();
                    char c11 = (char) i22;
                    if (c11 == 1) {
                        iX = AbstractC0156x.X(i22, parcel);
                    } else if (c11 == 2) {
                        AbstractC0156x.i0(parcel, i22, 4);
                        s4 = (short) parcel.readInt();
                    } else if (c11 != 3) {
                        AbstractC0156x.g0(i22, parcel);
                    } else {
                        AbstractC0156x.i0(parcel, i22, 4);
                        s5 = (short) parcel.readInt();
                    }
                }
                AbstractC0156x.E(iH017, parcel);
                return new N(iX, s4, s5);
            case 23:
                int iH018 = AbstractC0156x.h0(parcel);
                M m5 = null;
                W w4 = null;
                C0985h c0985h = null;
                X x3 = null;
                while (parcel.dataPosition() < iH018) {
                    int i23 = parcel.readInt();
                    char c12 = (char) i23;
                    if (c12 == 1) {
                        m5 = (M) AbstractC0156x.t(parcel, i23, M.CREATOR);
                    } else if (c12 == 2) {
                        w4 = (W) AbstractC0156x.t(parcel, i23, W.CREATOR);
                    } else if (c12 == 3) {
                        c0985h = (C0985h) AbstractC0156x.t(parcel, i23, C0985h.CREATOR);
                    } else if (c12 != 4) {
                        AbstractC0156x.g0(i23, parcel);
                    } else {
                        x3 = (X) AbstractC0156x.t(parcel, i23, X.CREATOR);
                    }
                }
                AbstractC0156x.E(iH018, parcel);
                return new C0984g(m5, w4, c0985h, x3);
            case 24:
                int iH019 = AbstractC0156x.h0(parcel);
                C0997v c0997v = null;
                a0 a0Var = null;
                L l4 = null;
                c0 c0Var = null;
                P p5 = null;
                Q q5 = null;
                b0 b0Var = null;
                S s6 = null;
                w wVar = null;
                T t4 = null;
                while (parcel.dataPosition() < iH019) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            c0997v = (C0997v) AbstractC0156x.t(parcel, i24, C0997v.CREATOR);
                            break;
                        case 3:
                            a0Var = (a0) AbstractC0156x.t(parcel, i24, a0.CREATOR);
                            break;
                        case 4:
                            l4 = (L) AbstractC0156x.t(parcel, i24, L.CREATOR);
                            break;
                        case 5:
                            c0Var = (c0) AbstractC0156x.t(parcel, i24, c0.CREATOR);
                            break;
                        case 6:
                            p5 = (P) AbstractC0156x.t(parcel, i24, P.CREATOR);
                            break;
                        case 7:
                            q5 = (Q) AbstractC0156x.t(parcel, i24, Q.CREATOR);
                            break;
                        case '\b':
                            b0Var = (b0) AbstractC0156x.t(parcel, i24, b0.CREATOR);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            s6 = (S) AbstractC0156x.t(parcel, i24, S.CREATOR);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            wVar = (w) AbstractC0156x.t(parcel, i24, w.CREATOR);
                            break;
                        case 11:
                            t4 = (T) AbstractC0156x.t(parcel, i24, T.CREATOR);
                            break;
                        default:
                            AbstractC0156x.g0(i24, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH019, parcel);
                return new C0983f(c0997v, a0Var, l4, c0Var, p5, q5, b0Var, s6, wVar, t4);
            case 25:
                int iH020 = AbstractC0156x.h0(parcel);
                boolean zV5 = false;
                while (parcel.dataPosition() < iH020) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        AbstractC0156x.g0(i25, parcel);
                    } else {
                        zV5 = AbstractC0156x.V(i25, parcel);
                    }
                }
                AbstractC0156x.E(iH020, parcel);
                return new C0985h(zV5);
            case 26:
                int iH021 = AbstractC0156x.h0(parcel);
                byte[] bArrP6 = null;
                byte[] bArrP7 = null;
                while (parcel.dataPosition() < iH021) {
                    int i26 = parcel.readInt();
                    char c13 = (char) i26;
                    if (c13 == 1) {
                        bArrP6 = AbstractC0156x.p(i26, parcel);
                    } else if (c13 != 2) {
                        AbstractC0156x.g0(i26, parcel);
                    } else {
                        bArrP7 = AbstractC0156x.p(i26, parcel);
                    }
                }
                AbstractC0156x.E(iH021, parcel);
                return new W(bArrP6, bArrP7);
            case 27:
                int iH022 = AbstractC0156x.h0(parcel);
                byte[] bArrP8 = null;
                boolean zV6 = false;
                while (parcel.dataPosition() < iH022) {
                    int i27 = parcel.readInt();
                    char c14 = (char) i27;
                    if (c14 == 1) {
                        zV6 = AbstractC0156x.V(i27, parcel);
                    } else if (c14 != 2) {
                        AbstractC0156x.g0(i27, parcel);
                    } else {
                        bArrP8 = AbstractC0156x.p(i27, parcel);
                    }
                }
                AbstractC0156x.E(iH022, parcel);
                return new X(zV6, bArrP8);
            case 28:
                int iH023 = AbstractC0156x.h0(parcel);
                byte[] bArrP9 = null;
                byte[] bArrP10 = null;
                byte[] bArrP11 = null;
                byte[] bArrP12 = null;
                byte[] bArrP13 = null;
                while (parcel.dataPosition() < iH023) {
                    int i28 = parcel.readInt();
                    char c15 = (char) i28;
                    if (c15 == 2) {
                        bArrP9 = AbstractC0156x.p(i28, parcel);
                    } else if (c15 == 3) {
                        bArrP10 = AbstractC0156x.p(i28, parcel);
                    } else if (c15 == 4) {
                        bArrP11 = AbstractC0156x.p(i28, parcel);
                    } else if (c15 == 5) {
                        bArrP12 = AbstractC0156x.p(i28, parcel);
                    } else if (c15 != 6) {
                        AbstractC0156x.g0(i28, parcel);
                    } else {
                        bArrP13 = AbstractC0156x.p(i28, parcel);
                    }
                }
                AbstractC0156x.E(iH023, parcel);
                return new C0986i(bArrP9, bArrP10, bArrP11, bArrP12, bArrP13);
            default:
                int iH024 = AbstractC0156x.h0(parcel);
                byte[] bArrP14 = null;
                byte[] bArrP15 = null;
                byte[] bArrP16 = null;
                String[] strArrV = null;
                while (parcel.dataPosition() < iH024) {
                    int i29 = parcel.readInt();
                    char c16 = (char) i29;
                    if (c16 == 2) {
                        bArrP14 = AbstractC0156x.p(i29, parcel);
                    } else if (c16 == 3) {
                        bArrP15 = AbstractC0156x.p(i29, parcel);
                    } else if (c16 == 4) {
                        bArrP16 = AbstractC0156x.p(i29, parcel);
                    } else if (c16 != 5) {
                        AbstractC0156x.g0(i29, parcel);
                    } else {
                        strArrV = AbstractC0156x.v(i29, parcel);
                    }
                }
                AbstractC0156x.E(iH024, parcel);
                return new C0987j(bArrP14, bArrP15, bArrP16, strArrV);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f10588a) {
            case 0:
                return new EnumC0980c[i];
            case 1:
                return new c0[i];
            case 2:
                return new P[i];
            case 3:
                return new Q[i];
            case 4:
                return new w[i];
            case 5:
                return new S[i];
            case 6:
                return new T[i];
            case 7:
                return new C0999y[i];
            case 8:
                return new C0998x[i];
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return new C1000z[i];
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return new A[i];
            case 11:
                return new B[i];
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new C[i];
            case 13:
                return new E[i];
            case 14:
                return new F[i];
            case 15:
                return new I[i];
            case 16:
                return new J[i];
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return new TokenBinding[i];
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new L[i];
            case 19:
                return new V[i];
            case 20:
                return new M[i];
            case 21:
                return new EnumC0982e[i];
            case 22:
                return new N[i];
            case 23:
                return new C0984g[i];
            case 24:
                return new C0983f[i];
            case 25:
                return new C0985h[i];
            case 26:
                return new W[i];
            case 27:
                return new X[i];
            case 28:
                return new C0986i[i];
            default:
                return new C0987j[i];
        }
    }
}
