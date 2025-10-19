package D0;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import X0.b;
import a1.C0185a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import b1.C0259a;
import c1.C0334a;
import c1.C0335b;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D0\k.smali */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1312a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1312a) {
            case 0:
                return new l(parcel);
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                J1.a aVar = new J1.a(parcel);
                aVar.f2071a = ((Integer) parcel.readValue(J1.a.class.getClassLoader())).intValue();
                return aVar;
            case 3:
                Q.l lVar = new Q.l(parcel);
                lVar.f2706a = parcel.readInt();
                return lVar;
            case 4:
                int iH0 = AbstractC0156x.h0(parcel);
                int iX = 0;
                int iX2 = 0;
                int iX3 = 0;
                long jA0 = 0;
                String strU = null;
                String strU2 = null;
                while (parcel.dataPosition() < iH0) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iX = AbstractC0156x.X(i, parcel);
                            break;
                        case 2:
                            jA0 = AbstractC0156x.a0(i, parcel);
                            break;
                        case 3:
                            strU = AbstractC0156x.u(i, parcel);
                            break;
                        case 4:
                            iX2 = AbstractC0156x.X(i, parcel);
                            break;
                        case 5:
                            iX3 = AbstractC0156x.X(i, parcel);
                            break;
                        case 6:
                            strU2 = AbstractC0156x.u(i, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH0, parcel);
                return new X0.a(iX, jA0, strU, iX2, iX3, strU2);
            case 5:
                int iH02 = AbstractC0156x.h0(parcel);
                int iX4 = 0;
                String strU3 = null;
                Account account = null;
                int iX5 = 0;
                while (parcel.dataPosition() < iH02) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        iX4 = AbstractC0156x.X(i5, parcel);
                    } else if (c5 == 2) {
                        iX5 = AbstractC0156x.X(i5, parcel);
                    } else if (c5 == 3) {
                        strU3 = AbstractC0156x.u(i5, parcel);
                    } else if (c5 != 4) {
                        AbstractC0156x.g0(i5, parcel);
                    } else {
                        account = (Account) AbstractC0156x.t(parcel, i5, Account.CREATOR);
                    }
                }
                AbstractC0156x.E(iH02, parcel);
                return new b(iX4, iX5, strU3, account);
            case 6:
                int iH03 = AbstractC0156x.h0(parcel);
                int iX6 = 0;
                ArrayList arrayListY = null;
                while (parcel.dataPosition() < iH03) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 1) {
                        iX6 = AbstractC0156x.X(i6, parcel);
                    } else if (c6 != 2) {
                        AbstractC0156x.g0(i6, parcel);
                    } else {
                        arrayListY = AbstractC0156x.y(parcel, i6, X0.a.CREATOR);
                    }
                }
                AbstractC0156x.E(iH03, parcel);
                return new X0.c(iX6, arrayListY);
            case 7:
                Z1.b bVar = new Z1.b(parcel);
                bVar.f3949a = parcel.readFloat();
                bVar.f3950b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                bVar.f3951c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                bVar.f3952d = parcel.readFloat();
                bVar.f3953e = parcel.createBooleanArray()[0];
                return bVar;
            case 8:
                int iH04 = AbstractC0156x.h0(parcel);
                HashSet hashSet = new HashSet();
                int iX7 = 0;
                ArrayList arrayListY2 = null;
                a1.d dVar = null;
                int iX8 = 0;
                while (parcel.dataPosition() < iH04) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 == 1) {
                        iX8 = AbstractC0156x.X(i7, parcel);
                        hashSet.add(1);
                    } else if (c7 == 2) {
                        arrayListY2 = AbstractC0156x.y(parcel, i7, a1.e.CREATOR);
                        hashSet.add(2);
                    } else if (c7 == 3) {
                        iX7 = AbstractC0156x.X(i7, parcel);
                        hashSet.add(3);
                    } else if (c7 != 4) {
                        AbstractC0156x.g0(i7, parcel);
                    } else {
                        dVar = (a1.d) AbstractC0156x.t(parcel, i7, a1.d.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == iH04) {
                    return new a1.b(hashSet, iX8, arrayListY2, iX7, dVar);
                }
                throw new B0.c(B.a.g(iH04, "Overread allowed size end="), parcel);
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                int iH05 = AbstractC0156x.h0(parcel);
                int iX9 = 0;
                ArrayList arrayListW = null;
                ArrayList arrayListW2 = null;
                ArrayList arrayListW3 = null;
                ArrayList arrayListW4 = null;
                ArrayList arrayListW5 = null;
                while (parcel.dataPosition() < iH05) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iX9 = AbstractC0156x.X(i8, parcel);
                            break;
                        case 2:
                            arrayListW = AbstractC0156x.w(i8, parcel);
                            break;
                        case 3:
                            arrayListW2 = AbstractC0156x.w(i8, parcel);
                            break;
                        case 4:
                            arrayListW3 = AbstractC0156x.w(i8, parcel);
                            break;
                        case 5:
                            arrayListW4 = AbstractC0156x.w(i8, parcel);
                            break;
                        case 6:
                            arrayListW5 = AbstractC0156x.w(i8, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i8, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH05, parcel);
                return new a1.d(iX9, arrayListW, arrayListW2, arrayListW3, arrayListW4, arrayListW5);
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                int iH06 = AbstractC0156x.h0(parcel);
                HashSet hashSet2 = new HashSet();
                a1.f fVar = null;
                String strU4 = null;
                String strU5 = null;
                String strU6 = null;
                int iX10 = 0;
                while (parcel.dataPosition() < iH06) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        iX10 = AbstractC0156x.X(i9, parcel);
                        hashSet2.add(1);
                    } else if (c8 == 2) {
                        fVar = (a1.f) AbstractC0156x.t(parcel, i9, a1.f.CREATOR);
                        hashSet2.add(2);
                    } else if (c8 == 3) {
                        strU4 = AbstractC0156x.u(i9, parcel);
                        hashSet2.add(3);
                    } else if (c8 == 4) {
                        strU5 = AbstractC0156x.u(i9, parcel);
                        hashSet2.add(4);
                    } else if (c8 != 5) {
                        AbstractC0156x.g0(i9, parcel);
                    } else {
                        strU6 = AbstractC0156x.u(i9, parcel);
                        hashSet2.add(5);
                    }
                }
                if (parcel.dataPosition() == iH06) {
                    return new a1.e(hashSet2, iX10, fVar, strU4, strU5, strU6);
                }
                throw new B0.c(B.a.g(iH06, "Overread allowed size end="), parcel);
            case 11:
                int iH07 = AbstractC0156x.h0(parcel);
                HashSet hashSet3 = new HashSet();
                int iX11 = 0;
                String strU7 = null;
                byte[] bArrP = null;
                PendingIntent pendingIntent = null;
                C0185a c0185a = null;
                int iX12 = 0;
                while (parcel.dataPosition() < iH07) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iX12 = AbstractC0156x.X(i10, parcel);
                            hashSet3.add(1);
                            break;
                        case 2:
                            strU7 = AbstractC0156x.u(i10, parcel);
                            hashSet3.add(2);
                            break;
                        case 3:
                            iX11 = AbstractC0156x.X(i10, parcel);
                            hashSet3.add(3);
                            break;
                        case 4:
                            bArrP = AbstractC0156x.p(i10, parcel);
                            hashSet3.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) AbstractC0156x.t(parcel, i10, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case 6:
                            c0185a = (C0185a) AbstractC0156x.t(parcel, i10, C0185a.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            AbstractC0156x.g0(i10, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == iH07) {
                    return new a1.f(hashSet3, iX12, strU7, iX11, bArrP, pendingIntent, c0185a);
                }
                throw new B0.c(B.a.g(iH07, "Overread allowed size end="), parcel);
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int iH08 = AbstractC0156x.h0(parcel);
                int iX13 = 0;
                boolean zV = false;
                boolean zV2 = false;
                long jA02 = 0;
                while (parcel.dataPosition() < iH08) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        iX13 = AbstractC0156x.X(i11, parcel);
                    } else if (c9 == 2) {
                        zV = AbstractC0156x.V(i11, parcel);
                    } else if (c9 == 3) {
                        jA02 = AbstractC0156x.a0(i11, parcel);
                    } else if (c9 != 4) {
                        AbstractC0156x.g0(i11, parcel);
                    } else {
                        zV2 = AbstractC0156x.V(i11, parcel);
                    }
                }
                AbstractC0156x.E(iH08, parcel);
                return new C0185a(iX13, zV, jA02, zV2);
            case 13:
                int iH09 = AbstractC0156x.h0(parcel);
                String strU8 = null;
                String strU9 = null;
                Uri uri = null;
                ArrayList arrayListY3 = null;
                String strU10 = null;
                String strU11 = null;
                String strU12 = null;
                String strU13 = null;
                while (parcel.dataPosition() < iH09) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            strU8 = AbstractC0156x.u(i12, parcel);
                            break;
                        case 2:
                            strU9 = AbstractC0156x.u(i12, parcel);
                            break;
                        case 3:
                            uri = (Uri) AbstractC0156x.t(parcel, i12, Uri.CREATOR);
                            break;
                        case 4:
                            arrayListY3 = AbstractC0156x.y(parcel, i12, IdToken.CREATOR);
                            break;
                        case 5:
                            strU10 = AbstractC0156x.u(i12, parcel);
                            break;
                        case 6:
                            strU11 = AbstractC0156x.u(i12, parcel);
                            break;
                        case 7:
                        case '\b':
                        default:
                            AbstractC0156x.g0(i12, parcel);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            strU12 = AbstractC0156x.u(i12, parcel);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            strU13 = AbstractC0156x.u(i12, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH09, parcel);
                return new Credential(strU8, strU9, uri, arrayListY3, strU10, strU11, strU12, strU13);
            case 14:
                int iH010 = AbstractC0156x.h0(parcel);
                int iX14 = 0;
                boolean zV3 = false;
                boolean zV4 = false;
                boolean zV5 = false;
                int iX15 = 0;
                while (parcel.dataPosition() < iH010) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        zV3 = AbstractC0156x.V(i13, parcel);
                    } else if (c10 == 2) {
                        zV4 = AbstractC0156x.V(i13, parcel);
                    } else if (c10 == 3) {
                        zV5 = AbstractC0156x.V(i13, parcel);
                    } else if (c10 == 4) {
                        iX15 = AbstractC0156x.X(i13, parcel);
                    } else if (c10 != 1000) {
                        AbstractC0156x.g0(i13, parcel);
                    } else {
                        iX14 = AbstractC0156x.X(i13, parcel);
                    }
                }
                AbstractC0156x.E(iH010, parcel);
                return new CredentialPickerConfig(iX14, zV3, zV4, zV5, iX15);
            case 15:
                int iH011 = AbstractC0156x.h0(parcel);
                int iX16 = 0;
                boolean zV6 = false;
                boolean zV7 = false;
                boolean zV8 = false;
                String[] strArrV = null;
                CredentialPickerConfig credentialPickerConfig = null;
                CredentialPickerConfig credentialPickerConfig2 = null;
                String strU14 = null;
                String strU15 = null;
                while (parcel.dataPosition() < iH011) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 != 1000) {
                        switch (c11) {
                            case 1:
                                zV6 = AbstractC0156x.V(i14, parcel);
                                break;
                            case 2:
                                strArrV = AbstractC0156x.v(i14, parcel);
                                break;
                            case 3:
                                credentialPickerConfig = (CredentialPickerConfig) AbstractC0156x.t(parcel, i14, CredentialPickerConfig.CREATOR);
                                break;
                            case 4:
                                credentialPickerConfig2 = (CredentialPickerConfig) AbstractC0156x.t(parcel, i14, CredentialPickerConfig.CREATOR);
                                break;
                            case 5:
                                zV7 = AbstractC0156x.V(i14, parcel);
                                break;
                            case 6:
                                strU14 = AbstractC0156x.u(i14, parcel);
                                break;
                            case 7:
                                strU15 = AbstractC0156x.u(i14, parcel);
                                break;
                            case '\b':
                                zV8 = AbstractC0156x.V(i14, parcel);
                                break;
                            default:
                                AbstractC0156x.g0(i14, parcel);
                                break;
                        }
                    } else {
                        iX16 = AbstractC0156x.X(i14, parcel);
                    }
                }
                AbstractC0156x.E(iH011, parcel);
                return new C0259a(iX16, zV6, strArrV, credentialPickerConfig, credentialPickerConfig2, zV7, strU14, strU15, zV8);
            case 16:
                int iH012 = AbstractC0156x.h0(parcel);
                CredentialPickerConfig credentialPickerConfig3 = null;
                String[] strArrV2 = null;
                String strU16 = null;
                String strU17 = null;
                int iX17 = 0;
                boolean zV9 = false;
                boolean zV10 = false;
                boolean zV11 = false;
                while (parcel.dataPosition() < iH012) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 != 1000) {
                        switch (c12) {
                            case 1:
                                credentialPickerConfig3 = (CredentialPickerConfig) AbstractC0156x.t(parcel, i15, CredentialPickerConfig.CREATOR);
                                break;
                            case 2:
                                zV9 = AbstractC0156x.V(i15, parcel);
                                break;
                            case 3:
                                zV10 = AbstractC0156x.V(i15, parcel);
                                break;
                            case 4:
                                strArrV2 = AbstractC0156x.v(i15, parcel);
                                break;
                            case 5:
                                zV11 = AbstractC0156x.V(i15, parcel);
                                break;
                            case 6:
                                strU16 = AbstractC0156x.u(i15, parcel);
                                break;
                            case 7:
                                strU17 = AbstractC0156x.u(i15, parcel);
                                break;
                            default:
                                AbstractC0156x.g0(i15, parcel);
                                break;
                        }
                    } else {
                        iX17 = AbstractC0156x.X(i15, parcel);
                    }
                }
                AbstractC0156x.E(iH012, parcel);
                return new HintRequest(iX17, credentialPickerConfig3, zV9, zV10, strArrV2, zV11, strU16, strU17);
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                int iH013 = AbstractC0156x.h0(parcel);
                String strU18 = null;
                String strU19 = null;
                while (parcel.dataPosition() < iH013) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        strU18 = AbstractC0156x.u(i16, parcel);
                    } else if (c13 != 2) {
                        AbstractC0156x.g0(i16, parcel);
                    } else {
                        strU19 = AbstractC0156x.u(i16, parcel);
                    }
                }
                AbstractC0156x.E(iH013, parcel);
                return new IdToken(strU18, strU19);
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iH014 = AbstractC0156x.h0(parcel);
                boolean zV12 = false;
                boolean zV13 = false;
                boolean zV14 = false;
                ArrayList arrayListY4 = null;
                String strU20 = null;
                Account account2 = null;
                String strU21 = null;
                String strU22 = null;
                while (parcel.dataPosition() < iH014) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            arrayListY4 = AbstractC0156x.y(parcel, i17, Scope.CREATOR);
                            break;
                        case 2:
                            strU20 = AbstractC0156x.u(i17, parcel);
                            break;
                        case 3:
                            zV12 = AbstractC0156x.V(i17, parcel);
                            break;
                        case 4:
                            zV13 = AbstractC0156x.V(i17, parcel);
                            break;
                        case 5:
                            account2 = (Account) AbstractC0156x.t(parcel, i17, Account.CREATOR);
                            break;
                        case 6:
                            strU21 = AbstractC0156x.u(i17, parcel);
                            break;
                        case 7:
                            strU22 = AbstractC0156x.u(i17, parcel);
                            break;
                        case '\b':
                            zV14 = AbstractC0156x.V(i17, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i17, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH014, parcel);
                return new AuthorizationRequest(arrayListY4, strU20, zV12, zV13, account2, strU21, strU22, zV14);
            case 19:
                int iH015 = AbstractC0156x.h0(parcel);
                String strU23 = null;
                String strU24 = null;
                String strU25 = null;
                ArrayList arrayListW6 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iH015) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            strU23 = AbstractC0156x.u(i18, parcel);
                            break;
                        case 2:
                            strU24 = AbstractC0156x.u(i18, parcel);
                            break;
                        case 3:
                            strU25 = AbstractC0156x.u(i18, parcel);
                            break;
                        case 4:
                            arrayListW6 = AbstractC0156x.w(i18, parcel);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) AbstractC0156x.t(parcel, i18, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) AbstractC0156x.t(parcel, i18, PendingIntent.CREATOR);
                            break;
                        default:
                            AbstractC0156x.g0(i18, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH015, parcel);
                return new C0334a(strU23, strU24, strU25, arrayListW6, googleSignInAccount, pendingIntent2);
            case 20:
                int iH016 = AbstractC0156x.h0(parcel);
                c1.e eVar = null;
                C0335b c0335b = null;
                String strU26 = null;
                c1.d dVar2 = null;
                c1.c cVar = null;
                boolean zV15 = false;
                int iX18 = 0;
                while (parcel.dataPosition() < iH016) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            eVar = (c1.e) AbstractC0156x.t(parcel, i19, c1.e.CREATOR);
                            break;
                        case 2:
                            c0335b = (C0335b) AbstractC0156x.t(parcel, i19, C0335b.CREATOR);
                            break;
                        case 3:
                            strU26 = AbstractC0156x.u(i19, parcel);
                            break;
                        case 4:
                            zV15 = AbstractC0156x.V(i19, parcel);
                            break;
                        case 5:
                            iX18 = AbstractC0156x.X(i19, parcel);
                            break;
                        case 6:
                            dVar2 = (c1.d) AbstractC0156x.t(parcel, i19, c1.d.CREATOR);
                            break;
                        case 7:
                            cVar = (c1.c) AbstractC0156x.t(parcel, i19, c1.c.CREATOR);
                            break;
                        default:
                            AbstractC0156x.g0(i19, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH016, parcel);
                return new c1.f(eVar, c0335b, strU26, zV15, iX18, dVar2, cVar);
            case 21:
                int iH017 = AbstractC0156x.h0(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iH017) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        AbstractC0156x.g0(i20, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) AbstractC0156x.t(parcel, i20, PendingIntent.CREATOR);
                    }
                }
                AbstractC0156x.E(iH017, parcel);
                return new c1.g(pendingIntent3);
            case 22:
                int iH018 = AbstractC0156x.h0(parcel);
                int iX19 = 0;
                while (parcel.dataPosition() < iH018) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        AbstractC0156x.g0(i21, parcel);
                    } else {
                        iX19 = AbstractC0156x.X(i21, parcel);
                    }
                }
                AbstractC0156x.E(iH018, parcel);
                return new c1.i(iX19);
            case 23:
                int iH019 = AbstractC0156x.h0(parcel);
                boolean zV16 = false;
                int iX20 = 0;
                String strU27 = null;
                String strU28 = null;
                String strU29 = null;
                String strU30 = null;
                while (parcel.dataPosition() < iH019) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            strU27 = AbstractC0156x.u(i22, parcel);
                            break;
                        case 2:
                            strU28 = AbstractC0156x.u(i22, parcel);
                            break;
                        case 3:
                            strU29 = AbstractC0156x.u(i22, parcel);
                            break;
                        case 4:
                            strU30 = AbstractC0156x.u(i22, parcel);
                            break;
                        case 5:
                            zV16 = AbstractC0156x.V(i22, parcel);
                            break;
                        case 6:
                            iX20 = AbstractC0156x.X(i22, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i22, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH019, parcel);
                return new c1.j(strU27, strU28, strU29, strU30, zV16, iX20);
            case 24:
                int iH020 = AbstractC0156x.h0(parcel);
                boolean zV17 = false;
                boolean zV18 = false;
                boolean zV19 = false;
                String strU31 = null;
                String strU32 = null;
                String strU33 = null;
                ArrayList arrayListW7 = null;
                while (parcel.dataPosition() < iH020) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            zV17 = AbstractC0156x.V(i23, parcel);
                            break;
                        case 2:
                            strU31 = AbstractC0156x.u(i23, parcel);
                            break;
                        case 3:
                            strU32 = AbstractC0156x.u(i23, parcel);
                            break;
                        case 4:
                            zV18 = AbstractC0156x.V(i23, parcel);
                            break;
                        case 5:
                            strU33 = AbstractC0156x.u(i23, parcel);
                            break;
                        case 6:
                            arrayListW7 = AbstractC0156x.w(i23, parcel);
                            break;
                        case 7:
                            zV19 = AbstractC0156x.V(i23, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i23, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH020, parcel);
                return new C0335b(zV17, strU31, strU32, zV18, strU33, arrayListW7, zV19);
            case 25:
                int iH021 = AbstractC0156x.h0(parcel);
                String strU34 = null;
                boolean zV20 = false;
                while (parcel.dataPosition() < iH021) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 1) {
                        zV20 = AbstractC0156x.V(i24, parcel);
                    } else if (c14 != 2) {
                        AbstractC0156x.g0(i24, parcel);
                    } else {
                        strU34 = AbstractC0156x.u(i24, parcel);
                    }
                }
                AbstractC0156x.E(iH021, parcel);
                return new c1.c(strU34, zV20);
            case 26:
                int iH022 = AbstractC0156x.h0(parcel);
                byte[] bArrP2 = null;
                boolean zV21 = false;
                String strU35 = null;
                while (parcel.dataPosition() < iH022) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 1) {
                        zV21 = AbstractC0156x.V(i25, parcel);
                    } else if (c15 == 2) {
                        bArrP2 = AbstractC0156x.p(i25, parcel);
                    } else if (c15 != 3) {
                        AbstractC0156x.g0(i25, parcel);
                    } else {
                        strU35 = AbstractC0156x.u(i25, parcel);
                    }
                }
                AbstractC0156x.E(iH022, parcel);
                return new c1.d(zV21, bArrP2, strU35);
            case 27:
                int iH023 = AbstractC0156x.h0(parcel);
                boolean zV22 = false;
                while (parcel.dataPosition() < iH023) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        AbstractC0156x.g0(i26, parcel);
                    } else {
                        zV22 = AbstractC0156x.V(i26, parcel);
                    }
                }
                AbstractC0156x.E(iH023, parcel);
                return new c1.e(zV22);
            case 28:
                int iH024 = AbstractC0156x.h0(parcel);
                int iX21 = 0;
                PendingIntent pendingIntent4 = null;
                String strU36 = null;
                String strU37 = null;
                ArrayList arrayListW8 = null;
                String strU38 = null;
                while (parcel.dataPosition() < iH024) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            pendingIntent4 = (PendingIntent) AbstractC0156x.t(parcel, i27, PendingIntent.CREATOR);
                            break;
                        case 2:
                            strU36 = AbstractC0156x.u(i27, parcel);
                            break;
                        case 3:
                            strU37 = AbstractC0156x.u(i27, parcel);
                            break;
                        case 4:
                            arrayListW8 = AbstractC0156x.w(i27, parcel);
                            break;
                        case 5:
                            strU38 = AbstractC0156x.u(i27, parcel);
                            break;
                        case 6:
                            iX21 = AbstractC0156x.X(i27, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i27, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH024, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent4, strU36, strU37, arrayListW8, strU38, iX21);
            default:
                int iH025 = AbstractC0156x.h0(parcel);
                PendingIntent pendingIntent5 = null;
                while (parcel.dataPosition() < iH025) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        AbstractC0156x.g0(i28, parcel);
                    } else {
                        pendingIntent5 = (PendingIntent) AbstractC0156x.t(parcel, i28, PendingIntent.CREATOR);
                    }
                }
                AbstractC0156x.E(iH025, parcel);
                return new c1.k(pendingIntent5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1312a) {
            case 0:
                return new l[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new J1.a[i];
            case 3:
                return new Q.l[i];
            case 4:
                return new X0.a[i];
            case 5:
                return new b[i];
            case 6:
                return new X0.c[i];
            case 7:
                return new Z1.b[i];
            case 8:
                return new a1.b[i];
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return new a1.d[i];
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return new a1.e[i];
            case 11:
                return new a1.f[i];
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new C0185a[i];
            case 13:
                return new Credential[i];
            case 14:
                return new CredentialPickerConfig[i];
            case 15:
                return new C0259a[i];
            case 16:
                return new HintRequest[i];
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return new IdToken[i];
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new AuthorizationRequest[i];
            case 19:
                return new C0334a[i];
            case 20:
                return new c1.f[i];
            case 21:
                return new c1.g[i];
            case 22:
                return new c1.i[i];
            case 23:
                return new c1.j[i];
            case 24:
                return new C0335b[i];
            case 25:
                return new c1.c[i];
            case 26:
                return new c1.d[i];
            case 27:
                return new c1.e[i];
            case 28:
                return new SaveAccountLinkingTokenRequest[i];
            default:
                return new c1.k[i];
        }
    }
}
