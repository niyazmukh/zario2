package g1;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import h1.C0588a;
import h1.C0590c;
import java.util.ArrayList;
import l.N;
import m1.C0742a;
import o0.C0788k;
import o2.C;
import o2.C0796B;
import o2.C0797a;
import o2.C0800d;
import o2.C0801e;
import o2.E;
import o2.G;
import o2.H;
import o2.q;
import o2.r;
import o2.u;
import o2.v;
import o2.y;
import o2.z;
import t0.C0894A;
import t0.m0;
import t1.C0941a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\m.smali */
public final class m implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7596a;

    public /* synthetic */ m(int i) {
        this.f7596a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) throws C0941a {
        switch (this.f7596a) {
            case 0:
                int iH0 = AbstractC0156x.h0(inParcel);
                String strU = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (inParcel.dataPosition() < iH0) {
                    int i = inParcel.readInt();
                    char c5 = (char) i;
                    if (c5 == 2) {
                        strU = AbstractC0156x.u(i, inParcel);
                    } else if (c5 != 5) {
                        AbstractC0156x.g0(i, inParcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) AbstractC0156x.t(inParcel, i, GoogleSignInOptions.CREATOR);
                    }
                }
                AbstractC0156x.E(iH0, inParcel);
                return new SignInConfiguration(strU, googleSignInOptions);
            case 1:
                int iH02 = AbstractC0156x.h0(inParcel);
                PendingIntent pendingIntent = null;
                int iX = 0;
                int iX2 = 0;
                String strU2 = null;
                while (inParcel.dataPosition() < iH02) {
                    int i5 = inParcel.readInt();
                    char c6 = (char) i5;
                    if (c6 == 1) {
                        iX = AbstractC0156x.X(i5, inParcel);
                    } else if (c6 == 2) {
                        iX2 = AbstractC0156x.X(i5, inParcel);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) AbstractC0156x.t(inParcel, i5, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        AbstractC0156x.g0(i5, inParcel);
                    } else {
                        strU2 = AbstractC0156x.u(i5, inParcel);
                    }
                }
                AbstractC0156x.E(iH02, inParcel);
                return new C0588a(iX, iX2, pendingIntent, strU2);
            case 2:
                int iH03 = AbstractC0156x.h0(inParcel);
                long jA0 = -1;
                int iX3 = 0;
                String strU3 = null;
                while (inParcel.dataPosition() < iH03) {
                    int i6 = inParcel.readInt();
                    char c7 = (char) i6;
                    if (c7 == 1) {
                        strU3 = AbstractC0156x.u(i6, inParcel);
                    } else if (c7 == 2) {
                        iX3 = AbstractC0156x.X(i6, inParcel);
                    } else if (c7 != 3) {
                        AbstractC0156x.g0(i6, inParcel);
                    } else {
                        jA0 = AbstractC0156x.a0(i6, inParcel);
                    }
                }
                AbstractC0156x.E(iH03, inParcel);
                return new C0590c(strU3, jA0, iX3);
            case 3:
                N n5 = new N(inParcel);
                n5.f8479a = inParcel.readByte() != 0;
                return n5;
            case 4:
                int iH04 = AbstractC0156x.h0(inParcel);
                int iX4 = 0;
                l1.a aVar = null;
                while (inParcel.dataPosition() < iH04) {
                    int i7 = inParcel.readInt();
                    char c8 = (char) i7;
                    if (c8 == 1) {
                        iX4 = AbstractC0156x.X(i7, inParcel);
                    } else if (c8 != 2) {
                        AbstractC0156x.g0(i7, inParcel);
                    } else {
                        aVar = (l1.a) AbstractC0156x.t(inParcel, i7, l1.a.CREATOR);
                    }
                }
                AbstractC0156x.E(iH04, inParcel);
                return new l1.b(iX4, aVar);
            case 5:
                int iH05 = AbstractC0156x.h0(inParcel);
                int iX5 = 0;
                ArrayList arrayListY = null;
                while (inParcel.dataPosition() < iH05) {
                    int i8 = inParcel.readInt();
                    char c9 = (char) i8;
                    if (c9 == 1) {
                        iX5 = AbstractC0156x.X(i8, inParcel);
                    } else if (c9 != 2) {
                        AbstractC0156x.g0(i8, inParcel);
                    } else {
                        arrayListY = AbstractC0156x.y(inParcel, i8, l1.c.CREATOR);
                    }
                }
                AbstractC0156x.E(iH05, inParcel);
                return new l1.a(iX5, arrayListY);
            case 6:
                int iH06 = AbstractC0156x.h0(inParcel);
                int iX6 = 0;
                String strU4 = null;
                int iX7 = 0;
                while (inParcel.dataPosition() < iH06) {
                    int i9 = inParcel.readInt();
                    char c10 = (char) i9;
                    if (c10 == 1) {
                        iX6 = AbstractC0156x.X(i9, inParcel);
                    } else if (c10 == 2) {
                        strU4 = AbstractC0156x.u(i9, inParcel);
                    } else if (c10 != 3) {
                        AbstractC0156x.g0(i9, inParcel);
                    } else {
                        iX7 = AbstractC0156x.X(i9, inParcel);
                    }
                }
                AbstractC0156x.E(iH06, inParcel);
                return new l1.c(iX6, strU4, iX7);
            case 7:
                int iH07 = AbstractC0156x.h0(inParcel);
                int iX8 = 0;
                String strU5 = null;
                C0742a c0742a = null;
                while (inParcel.dataPosition() < iH07) {
                    int i10 = inParcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        iX8 = AbstractC0156x.X(i10, inParcel);
                    } else if (c11 == 2) {
                        strU5 = AbstractC0156x.u(i10, inParcel);
                    } else if (c11 != 3) {
                        AbstractC0156x.g0(i10, inParcel);
                    } else {
                        c0742a = (C0742a) AbstractC0156x.t(inParcel, i10, C0742a.CREATOR);
                    }
                }
                AbstractC0156x.E(iH07, inParcel);
                return new m1.g(c0742a, strU5, iX8);
            case 8:
                int iH08 = AbstractC0156x.h0(inParcel);
                int iX9 = 0;
                ArrayList arrayListY2 = null;
                String strU6 = null;
                while (inParcel.dataPosition() < iH08) {
                    int i11 = inParcel.readInt();
                    char c12 = (char) i11;
                    if (c12 == 1) {
                        iX9 = AbstractC0156x.X(i11, inParcel);
                    } else if (c12 == 2) {
                        arrayListY2 = AbstractC0156x.y(inParcel, i11, m1.f.CREATOR);
                    } else if (c12 != 3) {
                        AbstractC0156x.g0(i11, inParcel);
                    } else {
                        strU6 = AbstractC0156x.u(i11, inParcel);
                    }
                }
                AbstractC0156x.E(iH08, inParcel);
                return new m1.h(iX9, strU6, arrayListY2);
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                int iH09 = AbstractC0156x.h0(inParcel);
                int iX10 = 0;
                String strU7 = null;
                ArrayList arrayListY3 = null;
                while (inParcel.dataPosition() < iH09) {
                    int i12 = inParcel.readInt();
                    char c13 = (char) i12;
                    if (c13 == 1) {
                        iX10 = AbstractC0156x.X(i12, inParcel);
                    } else if (c13 == 2) {
                        strU7 = AbstractC0156x.u(i12, inParcel);
                    } else if (c13 != 3) {
                        AbstractC0156x.g0(i12, inParcel);
                    } else {
                        arrayListY3 = AbstractC0156x.y(inParcel, i12, m1.g.CREATOR);
                    }
                }
                AbstractC0156x.E(iH09, inParcel);
                return new m1.f(iX10, strU7, arrayListY3);
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                int iH010 = AbstractC0156x.h0(inParcel);
                int iX11 = 0;
                Parcel parcel = null;
                m1.h hVar = null;
                while (inParcel.dataPosition() < iH010) {
                    int i13 = inParcel.readInt();
                    char c14 = (char) i13;
                    if (c14 == 1) {
                        iX11 = AbstractC0156x.X(i13, inParcel);
                    } else if (c14 == 2) {
                        int iC0 = AbstractC0156x.c0(i13, inParcel);
                        int iDataPosition = inParcel.dataPosition();
                        if (iC0 == 0) {
                            parcel = null;
                        } else {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(inParcel, iDataPosition, iC0);
                            inParcel.setDataPosition(iDataPosition + iC0);
                            parcel = parcelObtain;
                        }
                    } else if (c14 != 3) {
                        AbstractC0156x.g0(i13, inParcel);
                    } else {
                        hVar = (m1.h) AbstractC0156x.t(inParcel, i13, m1.h.CREATOR);
                    }
                }
                AbstractC0156x.E(iH010, inParcel);
                return new m1.d(iX11, parcel, hVar);
            case 11:
                kotlin.jvm.internal.i.e(inParcel, "inParcel");
                return new C0788k(inParcel);
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int iH011 = AbstractC0156x.h0(inParcel);
                String strU8 = null;
                String strU9 = null;
                String strU10 = null;
                String strU11 = null;
                String strU12 = null;
                String strU13 = null;
                String strU14 = null;
                String strU15 = null;
                boolean zV = false;
                boolean zV2 = false;
                int iX12 = 0;
                while (inParcel.dataPosition() < iH011) {
                    int i14 = inParcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strU8 = AbstractC0156x.u(i14, inParcel);
                            break;
                        case 2:
                            strU9 = AbstractC0156x.u(i14, inParcel);
                            break;
                        case 3:
                            strU10 = AbstractC0156x.u(i14, inParcel);
                            break;
                        case 4:
                            strU11 = AbstractC0156x.u(i14, inParcel);
                            break;
                        case 5:
                            zV = AbstractC0156x.V(i14, inParcel);
                            break;
                        case 6:
                            strU12 = AbstractC0156x.u(i14, inParcel);
                            break;
                        case 7:
                            zV2 = AbstractC0156x.V(i14, inParcel);
                            break;
                        case '\b':
                            strU13 = AbstractC0156x.u(i14, inParcel);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            iX12 = AbstractC0156x.X(i14, inParcel);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            strU14 = AbstractC0156x.u(i14, inParcel);
                            break;
                        case 11:
                            strU15 = AbstractC0156x.u(i14, inParcel);
                            break;
                        default:
                            AbstractC0156x.g0(i14, inParcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH011, inParcel);
                return new C0797a(strU8, strU9, strU10, strU11, zV, strU12, zV2, strU13, iX12, strU14, strU15);
            case 13:
                int iH012 = AbstractC0156x.h0(inParcel);
                String strU16 = null;
                while (inParcel.dataPosition() < iH012) {
                    int i15 = inParcel.readInt();
                    if (((char) i15) != 1) {
                        AbstractC0156x.g0(i15, inParcel);
                    } else {
                        strU16 = AbstractC0156x.u(i15, inParcel);
                    }
                }
                AbstractC0156x.E(iH012, inParcel);
                return new q(strU16);
            case 14:
                int iH013 = AbstractC0156x.h0(inParcel);
                String strU17 = null;
                String strU18 = null;
                while (inParcel.dataPosition() < iH013) {
                    int i16 = inParcel.readInt();
                    char c15 = (char) i16;
                    if (c15 == 1) {
                        strU17 = AbstractC0156x.u(i16, inParcel);
                    } else if (c15 != 2) {
                        AbstractC0156x.g0(i16, inParcel);
                    } else {
                        strU18 = AbstractC0156x.u(i16, inParcel);
                    }
                }
                AbstractC0156x.E(iH013, inParcel);
                return new r(strU17, strU18);
            case 15:
                int iH014 = AbstractC0156x.h0(inParcel);
                String strU19 = null;
                String strU20 = null;
                String strU21 = null;
                while (inParcel.dataPosition() < iH014) {
                    int i17 = inParcel.readInt();
                    char c16 = (char) i17;
                    if (c16 == 1) {
                        strU19 = AbstractC0156x.u(i17, inParcel);
                    } else if (c16 == 2) {
                        strU20 = AbstractC0156x.u(i17, inParcel);
                    } else if (c16 != 3) {
                        AbstractC0156x.g0(i17, inParcel);
                    } else {
                        strU21 = AbstractC0156x.u(i17, inParcel);
                    }
                }
                AbstractC0156x.E(iH014, inParcel);
                return new G(strU19, strU20, strU21);
            case 16:
                int iH015 = AbstractC0156x.h0(inParcel);
                String strU22 = null;
                String strU23 = null;
                String strU24 = null;
                String strU25 = null;
                boolean zV3 = false;
                while (inParcel.dataPosition() < iH015) {
                    int i18 = inParcel.readInt();
                    char c17 = (char) i18;
                    if (c17 == 1) {
                        strU22 = AbstractC0156x.u(i18, inParcel);
                    } else if (c17 == 2) {
                        strU23 = AbstractC0156x.u(i18, inParcel);
                    } else if (c17 == 4) {
                        strU24 = AbstractC0156x.u(i18, inParcel);
                    } else if (c17 == 5) {
                        zV3 = AbstractC0156x.V(i18, inParcel);
                    } else if (c17 != 6) {
                        AbstractC0156x.g0(i18, inParcel);
                    } else {
                        strU25 = AbstractC0156x.u(i18, inParcel);
                    }
                }
                AbstractC0156x.E(iH015, inParcel);
                return new u(strU22, strU23, strU24, strU25, zV3);
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                int iH016 = AbstractC0156x.h0(inParcel);
                String strU26 = null;
                String strU27 = null;
                String strU28 = null;
                long jA02 = 0;
                while (inParcel.dataPosition() < iH016) {
                    int i19 = inParcel.readInt();
                    char c18 = (char) i19;
                    if (c18 == 1) {
                        strU26 = AbstractC0156x.u(i19, inParcel);
                    } else if (c18 == 2) {
                        strU27 = AbstractC0156x.u(i19, inParcel);
                    } else if (c18 == 3) {
                        jA02 = AbstractC0156x.a0(i19, inParcel);
                    } else if (c18 != 4) {
                        AbstractC0156x.g0(i19, inParcel);
                    } else {
                        strU28 = AbstractC0156x.u(i19, inParcel);
                    }
                }
                AbstractC0156x.E(iH016, inParcel);
                return new y(strU26, strU27, jA02, strU28);
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iH017 = AbstractC0156x.h0(inParcel);
                String strU29 = null;
                while (inParcel.dataPosition() < iH017) {
                    int i20 = inParcel.readInt();
                    if (((char) i20) != 1) {
                        AbstractC0156x.g0(i20, inParcel);
                    } else {
                        strU29 = AbstractC0156x.u(i20, inParcel);
                    }
                }
                AbstractC0156x.E(iH017, inParcel);
                return new z(strU29);
            case 19:
                int iH018 = AbstractC0156x.h0(inParcel);
                String strU30 = null;
                String strU31 = null;
                zzaiz zzaizVar = null;
                long jA03 = 0;
                while (inParcel.dataPosition() < iH018) {
                    int i21 = inParcel.readInt();
                    char c19 = (char) i21;
                    if (c19 == 1) {
                        strU30 = AbstractC0156x.u(i21, inParcel);
                    } else if (c19 == 2) {
                        strU31 = AbstractC0156x.u(i21, inParcel);
                    } else if (c19 == 3) {
                        jA03 = AbstractC0156x.a0(i21, inParcel);
                    } else if (c19 != 4) {
                        AbstractC0156x.g0(i21, inParcel);
                    } else {
                        zzaizVar = (zzaiz) AbstractC0156x.t(inParcel, i21, zzaiz.CREATOR);
                    }
                }
                AbstractC0156x.E(iH018, inParcel);
                return new C0796B(strU30, strU31, jA03, zzaizVar);
            case 20:
                int iH019 = AbstractC0156x.h0(inParcel);
                String strU32 = null;
                String strU33 = null;
                while (inParcel.dataPosition() < iH019) {
                    int i22 = inParcel.readInt();
                    char c20 = (char) i22;
                    if (c20 == 1) {
                        strU32 = AbstractC0156x.u(i22, inParcel);
                    } else if (c20 != 2) {
                        AbstractC0156x.g0(i22, inParcel);
                    } else {
                        strU33 = AbstractC0156x.u(i22, inParcel);
                    }
                }
                AbstractC0156x.E(iH019, inParcel);
                return new C(strU32, strU33);
            case 21:
                int iH020 = AbstractC0156x.h0(inParcel);
                boolean zV4 = false;
                String strU34 = null;
                String strU35 = null;
                boolean zV5 = false;
                while (inParcel.dataPosition() < iH020) {
                    int i23 = inParcel.readInt();
                    char c21 = (char) i23;
                    if (c21 == 2) {
                        strU34 = AbstractC0156x.u(i23, inParcel);
                    } else if (c21 == 3) {
                        strU35 = AbstractC0156x.u(i23, inParcel);
                    } else if (c21 == 4) {
                        zV4 = AbstractC0156x.V(i23, inParcel);
                    } else if (c21 != 5) {
                        AbstractC0156x.g0(i23, inParcel);
                    } else {
                        zV5 = AbstractC0156x.V(i23, inParcel);
                    }
                }
                AbstractC0156x.E(iH020, inParcel);
                E e5 = new E();
                e5.f9171a = strU34;
                e5.f9172b = strU35;
                e5.f9173c = zV4;
                e5.f9174d = zV5;
                e5.f9175e = TextUtils.isEmpty(strU35) ? null : Uri.parse(strU35);
                return e5;
            case 22:
                int iH021 = AbstractC0156x.h0(inParcel);
                while (inParcel.dataPosition() < iH021) {
                    AbstractC0156x.g0(inParcel.readInt(), inParcel);
                }
                AbstractC0156x.E(iH021, inParcel);
                return new v();
            case 23:
                int iH022 = AbstractC0156x.h0(inParcel);
                String strU36 = null;
                String strU37 = null;
                String strU38 = null;
                zzajb zzajbVar = null;
                String strU39 = null;
                String strU40 = null;
                String strU41 = null;
                while (inParcel.dataPosition() < iH022) {
                    int i24 = inParcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strU36 = AbstractC0156x.u(i24, inParcel);
                            break;
                        case 2:
                            strU37 = AbstractC0156x.u(i24, inParcel);
                            break;
                        case 3:
                            strU38 = AbstractC0156x.u(i24, inParcel);
                            break;
                        case 4:
                            zzajbVar = (zzajb) AbstractC0156x.t(inParcel, i24, zzajb.CREATOR);
                            break;
                        case 5:
                            strU39 = AbstractC0156x.u(i24, inParcel);
                            break;
                        case 6:
                            strU40 = AbstractC0156x.u(i24, inParcel);
                            break;
                        case 7:
                            strU41 = AbstractC0156x.u(i24, inParcel);
                            break;
                        default:
                            AbstractC0156x.g0(i24, inParcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH022, inParcel);
                return new H(strU36, strU37, strU38, zzajbVar, strU39, strU40, strU41);
            case 24:
                int iH023 = AbstractC0156x.h0(inParcel);
                String strU42 = null;
                String strU43 = null;
                String strU44 = null;
                String strU45 = null;
                boolean zV6 = false;
                while (inParcel.dataPosition() < iH023) {
                    int i25 = inParcel.readInt();
                    char c22 = (char) i25;
                    if (c22 == 1) {
                        strU42 = AbstractC0156x.u(i25, inParcel);
                    } else if (c22 == 2) {
                        strU43 = AbstractC0156x.u(i25, inParcel);
                    } else if (c22 == 3) {
                        strU44 = AbstractC0156x.u(i25, inParcel);
                    } else if (c22 == 4) {
                        strU45 = AbstractC0156x.u(i25, inParcel);
                    } else if (c22 != 5) {
                        AbstractC0156x.g0(i25, inParcel);
                    } else {
                        zV6 = AbstractC0156x.V(i25, inParcel);
                    }
                }
                AbstractC0156x.E(iH023, inParcel);
                return new C0800d(strU42, strU43, strU44, strU45, zV6);
            case 25:
                int iH024 = AbstractC0156x.h0(inParcel);
                String strU46 = null;
                while (inParcel.dataPosition() < iH024) {
                    int i26 = inParcel.readInt();
                    if (((char) i26) != 1) {
                        AbstractC0156x.g0(i26, inParcel);
                    } else {
                        strU46 = AbstractC0156x.u(i26, inParcel);
                    }
                }
                AbstractC0156x.E(iH024, inParcel);
                return new C0801e(strU46);
            case 26:
                C0894A c0894a = new C0894A();
                c0894a.f9872a = inParcel.readInt();
                c0894a.f9873b = inParcel.readInt();
                c0894a.f9874c = inParcel.readInt() == 1;
                return c0894a;
            case 27:
                m0 m0Var = new m0();
                m0Var.f10069a = inParcel.readInt();
                m0Var.f10070b = inParcel.readInt();
                m0Var.f10072d = inParcel.readInt() == 1;
                int i27 = inParcel.readInt();
                if (i27 > 0) {
                    int[] iArr = new int[i27];
                    m0Var.f10071c = iArr;
                    inParcel.readIntArray(iArr);
                }
                return m0Var;
            case 28:
                t0.n0 n0Var = new t0.n0();
                n0Var.f10076a = inParcel.readInt();
                n0Var.f10077b = inParcel.readInt();
                int i28 = inParcel.readInt();
                n0Var.f10078c = i28;
                if (i28 > 0) {
                    int[] iArr2 = new int[i28];
                    n0Var.f10079d = iArr2;
                    inParcel.readIntArray(iArr2);
                }
                int i29 = inParcel.readInt();
                n0Var.f10080e = i29;
                if (i29 > 0) {
                    int[] iArr3 = new int[i29];
                    n0Var.f10081f = iArr3;
                    inParcel.readIntArray(iArr3);
                }
                n0Var.f10083l = inParcel.readInt() == 1;
                n0Var.f10084m = inParcel.readInt() == 1;
                n0Var.f10085n = inParcel.readInt() == 1;
                n0Var.f10082k = inParcel.readArrayList(m0.class.getClassLoader());
                return n0Var;
            default:
                String string = inParcel.readString();
                try {
                    for (Transport transport : Transport.values()) {
                        if (string.equals(transport.f5773a)) {
                            return transport;
                        }
                    }
                    if (string.equals("hybrid")) {
                        return Transport.HYBRID;
                    }
                    throw new C0941a(B.a.l("Transport ", string, " not supported"));
                } catch (C0941a e6) {
                    throw new RuntimeException(e6);
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f7596a) {
            case 0:
                return new SignInConfiguration[i];
            case 1:
                return new C0588a[i];
            case 2:
                return new C0590c[i];
            case 3:
                return new N[i];
            case 4:
                return new l1.b[i];
            case 5:
                return new l1.a[i];
            case 6:
                return new l1.c[i];
            case 7:
                return new m1.g[i];
            case 8:
                return new m1.h[i];
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return new m1.f[i];
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return new m1.d[i];
            case 11:
                return new C0788k[i];
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new C0797a[i];
            case 13:
                return new q[i];
            case 14:
                return new r[i];
            case 15:
                return new G[i];
            case 16:
                return new u[i];
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return new y[i];
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new z[i];
            case 19:
                return new C0796B[i];
            case 20:
                return new C[i];
            case 21:
                return new E[i];
            case 22:
                return new v[i];
            case 23:
                return new H[i];
            case 24:
                return new C0800d[i];
            case 25:
                return new C0801e[i];
            case 26:
                return new C0894A[i];
            case 27:
                return new m0[i];
            case 28:
                return new t0.n0[i];
            default:
                return new Transport[i];
        }
    }
}
