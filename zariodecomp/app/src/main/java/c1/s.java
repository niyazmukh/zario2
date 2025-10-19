package c1;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0371i;
import com.google.android.gms.common.internal.C0372j;
import com.google.android.gms.common.internal.C0379q;
import com.google.android.gms.common.internal.C0380s;
import com.google.android.gms.common.internal.K;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.internal.z;
import com.google.android.material.datepicker.A;
import com.google.android.material.datepicker.C0383c;
import com.google.android.material.datepicker.C0385e;
import com.google.android.material.datepicker.C0387g;
import com.google.android.material.datepicker.InterfaceC0382b;
import com.google.android.material.datepicker.InterfaceC0384d;
import d.C0435a;
import d.C0441h;
import e1.C0448a;
import g0.C0538F;
import g0.C0543K;
import g0.C0547O;
import g0.C0550b;
import g0.C0551c;
import g1.C0572a;
import h1.C0588a;
import h1.C0590c;
import java.util.ArrayList;
import v1.C0998x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\s.smali */
public final class s implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5448a;

    public /* synthetic */ s(int i) {
        this.f5448a = i;
    }

    public static void a(C0372j c0372j, Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        int i5 = c0372j.f5715a;
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(i5);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(c0372j.f5716b);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(c0372j.f5717c);
        S0.f.n0(parcel, 4, c0372j.f5718d, false);
        IBinder iBinder = c0372j.f5719e;
        if (iBinder != null) {
            int iV02 = S0.f.v0(5, parcel);
            parcel.writeStrongBinder(iBinder);
            S0.f.w0(iV02, parcel);
        }
        S0.f.q0(parcel, 6, c0372j.f5720f, i);
        S0.f.f0(parcel, 7, c0372j.f5721k, false);
        S0.f.m0(parcel, 8, c0372j.f5722l, i, false);
        S0.f.q0(parcel, 10, c0372j.f5723m, i);
        S0.f.q0(parcel, 11, c0372j.f5724n, i);
        S0.f.u0(parcel, 12, 4);
        parcel.writeInt(c0372j.f5725o ? 1 : 0);
        S0.f.u0(parcel, 13, 4);
        parcel.writeInt(c0372j.f5726p);
        boolean z4 = c0372j.f5727q;
        S0.f.u0(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        S0.f.n0(parcel, 15, c0372j.f5728r, false);
        S0.f.w0(iV0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) {
        switch (this.f5448a) {
            case 0:
                int iH0 = AbstractC0156x.h0(inParcel);
                int iX = 0;
                p pVar = null;
                String strU = null;
                while (inParcel.dataPosition() < iH0) {
                    int i = inParcel.readInt();
                    char c5 = (char) i;
                    if (c5 == 1) {
                        pVar = (p) AbstractC0156x.t(inParcel, i, p.CREATOR);
                    } else if (c5 == 2) {
                        strU = AbstractC0156x.u(i, inParcel);
                    } else if (c5 != 3) {
                        AbstractC0156x.g0(i, inParcel);
                    } else {
                        iX = AbstractC0156x.X(i, inParcel);
                    }
                }
                AbstractC0156x.E(iH0, inParcel);
                return new l(pVar, strU, iX);
            case 1:
                int iH02 = AbstractC0156x.h0(inParcel);
                PendingIntent pendingIntent = null;
                while (inParcel.dataPosition() < iH02) {
                    int i5 = inParcel.readInt();
                    if (((char) i5) != 1) {
                        AbstractC0156x.g0(i5, inParcel);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC0156x.t(inParcel, i5, PendingIntent.CREATOR);
                    }
                }
                AbstractC0156x.E(iH02, inParcel);
                return new m(pendingIntent);
            case 2:
                int iH03 = AbstractC0156x.h0(inParcel);
                String strU2 = null;
                String strU3 = null;
                String strU4 = null;
                String strU5 = null;
                Uri uri = null;
                String strU6 = null;
                String strU7 = null;
                String strU8 = null;
                C0998x c0998x = null;
                while (inParcel.dataPosition() < iH03) {
                    int i6 = inParcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            strU2 = AbstractC0156x.u(i6, inParcel);
                            break;
                        case 2:
                            strU3 = AbstractC0156x.u(i6, inParcel);
                            break;
                        case 3:
                            strU4 = AbstractC0156x.u(i6, inParcel);
                            break;
                        case 4:
                            strU5 = AbstractC0156x.u(i6, inParcel);
                            break;
                        case 5:
                            uri = (Uri) AbstractC0156x.t(inParcel, i6, Uri.CREATOR);
                            break;
                        case 6:
                            strU6 = AbstractC0156x.u(i6, inParcel);
                            break;
                        case 7:
                            strU7 = AbstractC0156x.u(i6, inParcel);
                            break;
                        case '\b':
                            strU8 = AbstractC0156x.u(i6, inParcel);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            c0998x = (C0998x) AbstractC0156x.t(inParcel, i6, C0998x.CREATOR);
                            break;
                        default:
                            AbstractC0156x.g0(i6, inParcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH03, inParcel);
                return new o(strU2, strU3, strU4, strU5, uri, strU6, strU7, strU8, c0998x);
            case 3:
                int iH04 = AbstractC0156x.h0(inParcel);
                String strU9 = null;
                String strU10 = null;
                while (inParcel.dataPosition() < iH04) {
                    int i7 = inParcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        strU9 = AbstractC0156x.u(i7, inParcel);
                    } else if (c6 != 2) {
                        AbstractC0156x.g0(i7, inParcel);
                    } else {
                        strU10 = AbstractC0156x.u(i7, inParcel);
                    }
                }
                AbstractC0156x.E(iH04, inParcel);
                return new p(strU9, strU10);
            case 4:
                int iH05 = AbstractC0156x.h0(inParcel);
                String strU11 = null;
                int iX2 = 0;
                while (inParcel.dataPosition() < iH05) {
                    int i8 = inParcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        iX2 = AbstractC0156x.X(i8, inParcel);
                    } else if (c7 != 2) {
                        AbstractC0156x.g0(i8, inParcel);
                    } else {
                        strU11 = AbstractC0156x.u(i8, inParcel);
                    }
                }
                AbstractC0156x.E(iH05, inParcel);
                return new Scope(iX2, strU11);
            case 5:
                int iH06 = AbstractC0156x.h0(inParcel);
                String strU12 = null;
                C0588a c0588a = null;
                int iX3 = 0;
                PendingIntent pendingIntent2 = null;
                while (inParcel.dataPosition() < iH06) {
                    int i9 = inParcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        iX3 = AbstractC0156x.X(i9, inParcel);
                    } else if (c8 == 2) {
                        strU12 = AbstractC0156x.u(i9, inParcel);
                    } else if (c8 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC0156x.t(inParcel, i9, PendingIntent.CREATOR);
                    } else if (c8 != 4) {
                        AbstractC0156x.g0(i9, inParcel);
                    } else {
                        c0588a = (C0588a) AbstractC0156x.t(inParcel, i9, C0588a.CREATOR);
                    }
                }
                AbstractC0156x.E(iH06, inParcel);
                return new Status(iX3, strU12, pendingIntent2, c0588a);
            case 6:
                int iH07 = AbstractC0156x.h0(inParcel);
                int iX4 = 0;
                ArrayList arrayListY = null;
                while (inParcel.dataPosition() < iH07) {
                    int i10 = inParcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        iX4 = AbstractC0156x.X(i10, inParcel);
                    } else if (c9 != 2) {
                        AbstractC0156x.g0(i10, inParcel);
                    } else {
                        arrayListY = AbstractC0156x.y(inParcel, i10, C0379q.CREATOR);
                    }
                }
                AbstractC0156x.E(iH07, inParcel);
                return new com.google.android.gms.common.internal.t(iX4, arrayListY);
            case 7:
                int iH08 = AbstractC0156x.h0(inParcel);
                int iX5 = 0;
                int iX6 = 0;
                int iX7 = 0;
                int iX8 = 0;
                long jA0 = 0;
                long jA02 = 0;
                String strU13 = null;
                String strU14 = null;
                int iX9 = -1;
                while (inParcel.dataPosition() < iH08) {
                    int i11 = inParcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iX5 = AbstractC0156x.X(i11, inParcel);
                            break;
                        case 2:
                            iX6 = AbstractC0156x.X(i11, inParcel);
                            break;
                        case 3:
                            iX7 = AbstractC0156x.X(i11, inParcel);
                            break;
                        case 4:
                            jA0 = AbstractC0156x.a0(i11, inParcel);
                            break;
                        case 5:
                            jA02 = AbstractC0156x.a0(i11, inParcel);
                            break;
                        case 6:
                            strU13 = AbstractC0156x.u(i11, inParcel);
                            break;
                        case 7:
                            strU14 = AbstractC0156x.u(i11, inParcel);
                            break;
                        case '\b':
                            iX8 = AbstractC0156x.X(i11, inParcel);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            iX9 = AbstractC0156x.X(i11, inParcel);
                            break;
                        default:
                            AbstractC0156x.g0(i11, inParcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH08, inParcel);
                return new C0379q(iX5, iX6, iX7, jA0, jA02, strU13, strU14, iX8, iX9);
            case 8:
                int iH09 = AbstractC0156x.h0(inParcel);
                int iX10 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int iX11 = 0;
                while (inParcel.dataPosition() < iH09) {
                    int i12 = inParcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iX10 = AbstractC0156x.X(i12, inParcel);
                    } else if (c10 == 2) {
                        account = (Account) AbstractC0156x.t(inParcel, i12, Account.CREATOR);
                    } else if (c10 == 3) {
                        iX11 = AbstractC0156x.X(i12, inParcel);
                    } else if (c10 != 4) {
                        AbstractC0156x.g0(i12, inParcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC0156x.t(inParcel, i12, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC0156x.E(iH09, inParcel);
                return new y(iX10, account, iX11, googleSignInAccount);
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                int iH010 = AbstractC0156x.h0(inParcel);
                int iX12 = 0;
                boolean zV = false;
                boolean zV2 = false;
                IBinder strongBinder = null;
                C0588a c0588a2 = null;
                while (inParcel.dataPosition() < iH010) {
                    int i13 = inParcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iX12 = AbstractC0156x.X(i13, inParcel);
                    } else if (c11 == 2) {
                        int iC0 = AbstractC0156x.c0(i13, inParcel);
                        int iDataPosition = inParcel.dataPosition();
                        if (iC0 == 0) {
                            strongBinder = null;
                        } else {
                            strongBinder = inParcel.readStrongBinder();
                            inParcel.setDataPosition(iDataPosition + iC0);
                        }
                    } else if (c11 == 3) {
                        c0588a2 = (C0588a) AbstractC0156x.t(inParcel, i13, C0588a.CREATOR);
                    } else if (c11 == 4) {
                        zV = AbstractC0156x.V(i13, inParcel);
                    } else if (c11 != 5) {
                        AbstractC0156x.g0(i13, inParcel);
                    } else {
                        zV2 = AbstractC0156x.V(i13, inParcel);
                    }
                }
                AbstractC0156x.E(iH010, inParcel);
                return new z(iX12, strongBinder, c0588a2, zV, zV2);
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                int iH011 = AbstractC0156x.h0(inParcel);
                int iX13 = 0;
                boolean zV3 = false;
                boolean zV4 = false;
                int iX14 = 0;
                int iX15 = 0;
                while (inParcel.dataPosition() < iH011) {
                    int i14 = inParcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iX13 = AbstractC0156x.X(i14, inParcel);
                    } else if (c12 == 2) {
                        zV3 = AbstractC0156x.V(i14, inParcel);
                    } else if (c12 == 3) {
                        zV4 = AbstractC0156x.V(i14, inParcel);
                    } else if (c12 == 4) {
                        iX14 = AbstractC0156x.X(i14, inParcel);
                    } else if (c12 != 5) {
                        AbstractC0156x.g0(i14, inParcel);
                    } else {
                        iX15 = AbstractC0156x.X(i14, inParcel);
                    }
                }
                AbstractC0156x.E(iH011, inParcel);
                return new C0380s(iX13, zV3, zV4, iX14, iX15);
            case 11:
                int iH012 = AbstractC0156x.h0(inParcel);
                Bundle bundleO = null;
                C0371i c0371i = null;
                int iX16 = 0;
                C0590c[] c0590cArr = null;
                while (inParcel.dataPosition() < iH012) {
                    int i15 = inParcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        bundleO = AbstractC0156x.o(i15, inParcel);
                    } else if (c13 == 2) {
                        c0590cArr = (C0590c[]) AbstractC0156x.x(inParcel, i15, C0590c.CREATOR);
                    } else if (c13 == 3) {
                        iX16 = AbstractC0156x.X(i15, inParcel);
                    } else if (c13 != 4) {
                        AbstractC0156x.g0(i15, inParcel);
                    } else {
                        c0371i = (C0371i) AbstractC0156x.t(inParcel, i15, C0371i.CREATOR);
                    }
                }
                AbstractC0156x.E(iH012, inParcel);
                K k5 = new K();
                k5.f5674a = bundleO;
                k5.f5675b = c0590cArr;
                k5.f5676c = iX16;
                k5.f5677d = c0371i;
                return k5;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int iH013 = AbstractC0156x.h0(inParcel);
                C0380s c0380s = null;
                int[] iArrR = null;
                int[] iArrR2 = null;
                boolean zV5 = false;
                boolean zV6 = false;
                int iX17 = 0;
                while (inParcel.dataPosition() < iH013) {
                    int i16 = inParcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            c0380s = (C0380s) AbstractC0156x.t(inParcel, i16, C0380s.CREATOR);
                            break;
                        case 2:
                            zV5 = AbstractC0156x.V(i16, inParcel);
                            break;
                        case 3:
                            zV6 = AbstractC0156x.V(i16, inParcel);
                            break;
                        case 4:
                            iArrR = AbstractC0156x.r(i16, inParcel);
                            break;
                        case 5:
                            iX17 = AbstractC0156x.X(i16, inParcel);
                            break;
                        case 6:
                            iArrR2 = AbstractC0156x.r(i16, inParcel);
                            break;
                        default:
                            AbstractC0156x.g0(i16, inParcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH013, inParcel);
                return new C0371i(c0380s, zV5, zV6, iArrR, iX17, iArrR2);
            case 13:
                int iH014 = AbstractC0156x.h0(inParcel);
                Scope[] scopeArr = C0372j.f5713s;
                Bundle bundle = new Bundle();
                C0590c[] c0590cArr2 = C0372j.f5714t;
                C0590c[] c0590cArr3 = c0590cArr2;
                String strU15 = null;
                IBinder iBinder = null;
                Account account2 = null;
                String strU16 = null;
                int iX18 = 0;
                int iX19 = 0;
                int iX20 = 0;
                boolean zV7 = false;
                int iX21 = 0;
                boolean zV8 = false;
                while (inParcel.dataPosition() < iH014) {
                    int i17 = inParcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iX18 = AbstractC0156x.X(i17, inParcel);
                            break;
                        case 2:
                            iX19 = AbstractC0156x.X(i17, inParcel);
                            break;
                        case 3:
                            iX20 = AbstractC0156x.X(i17, inParcel);
                            break;
                        case 4:
                            strU15 = AbstractC0156x.u(i17, inParcel);
                            break;
                        case 5:
                            int iC02 = AbstractC0156x.c0(i17, inParcel);
                            int iDataPosition2 = inParcel.dataPosition();
                            if (iC02 != 0) {
                                IBinder strongBinder2 = inParcel.readStrongBinder();
                                inParcel.setDataPosition(iDataPosition2 + iC02);
                                iBinder = strongBinder2;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) AbstractC0156x.x(inParcel, i17, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = AbstractC0156x.o(i17, inParcel);
                            break;
                        case '\b':
                            account2 = (Account) AbstractC0156x.t(inParcel, i17, Account.CREATOR);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        default:
                            AbstractC0156x.g0(i17, inParcel);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            c0590cArr2 = (C0590c[]) AbstractC0156x.x(inParcel, i17, C0590c.CREATOR);
                            break;
                        case 11:
                            c0590cArr3 = (C0590c[]) AbstractC0156x.x(inParcel, i17, C0590c.CREATOR);
                            break;
                        case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            zV7 = AbstractC0156x.V(i17, inParcel);
                            break;
                        case '\r':
                            iX21 = AbstractC0156x.X(i17, inParcel);
                            break;
                        case 14:
                            zV8 = AbstractC0156x.V(i17, inParcel);
                            break;
                        case 15:
                            strU16 = AbstractC0156x.u(i17, inParcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH014, inParcel);
                return new C0372j(iX18, iX19, iX20, strU15, iBinder, scopeArr, bundle, account2, c0590cArr2, c0590cArr3, zV7, iX21, zV8, strU16);
            case 14:
                return new C0383c((com.google.android.material.datepicker.t) inParcel.readParcelable(com.google.android.material.datepicker.t.class.getClassLoader()), (com.google.android.material.datepicker.t) inParcel.readParcelable(com.google.android.material.datepicker.t.class.getClassLoader()), (InterfaceC0382b) inParcel.readParcelable(InterfaceC0382b.class.getClassLoader()), (com.google.android.material.datepicker.t) inParcel.readParcelable(com.google.android.material.datepicker.t.class.getClassLoader()), inParcel.readInt());
            case 15:
                ArrayList arrayList = inParcel.readArrayList(InterfaceC0382b.class.getClassLoader());
                int i18 = inParcel.readInt();
                InterfaceC0384d interfaceC0384d = C0385e.f5950d;
                if (i18 != 2 && i18 == 1) {
                    interfaceC0384d = C0385e.f5949c;
                }
                arrayList.getClass();
                return new C0385e(arrayList, interfaceC0384d);
            case 16:
                return new C0387g(inParcel.readLong());
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return new com.google.android.material.datepicker.h(inParcel.readLong());
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return com.google.android.material.datepicker.t.c(inParcel.readInt(), inParcel.readInt());
            case 19:
                A a5 = new A();
                a5.f5924b = (Long) inParcel.readValue(Long.class.getClassLoader());
                a5.f5925c = (Long) inParcel.readValue(Long.class.getClassLoader());
                return a5;
            case 20:
                return new C0435a(inParcel);
            case 21:
                kotlin.jvm.internal.i.e(inParcel, "inParcel");
                Parcelable parcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.i.b(parcelable);
                return new C0441h((IntentSender) parcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 22:
                int iH015 = AbstractC0156x.h0(inParcel);
                int iX22 = 0;
                int iX23 = 0;
                String strU17 = null;
                byte[] bArrP = null;
                Bundle bundleO2 = null;
                long jA03 = 0;
                while (inParcel.dataPosition() < iH015) {
                    int i19 = inParcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        strU17 = AbstractC0156x.u(i19, inParcel);
                    } else if (c14 == 2) {
                        iX23 = AbstractC0156x.X(i19, inParcel);
                    } else if (c14 == 3) {
                        jA03 = AbstractC0156x.a0(i19, inParcel);
                    } else if (c14 == 4) {
                        bArrP = AbstractC0156x.p(i19, inParcel);
                    } else if (c14 == 5) {
                        bundleO2 = AbstractC0156x.o(i19, inParcel);
                    } else if (c14 != 1000) {
                        AbstractC0156x.g0(i19, inParcel);
                    } else {
                        iX22 = AbstractC0156x.X(i19, inParcel);
                    }
                }
                AbstractC0156x.E(iH015, inParcel);
                return new C0448a(iX22, strU17, iX23, jA03, bArrP, bundleO2);
            case 23:
                int iH016 = AbstractC0156x.h0(inParcel);
                int iX24 = 0;
                int iX25 = 0;
                int iX26 = 0;
                PendingIntent pendingIntent3 = null;
                Bundle bundleO3 = null;
                byte[] bArrP2 = null;
                while (inParcel.dataPosition() < iH016) {
                    int i20 = inParcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        iX25 = AbstractC0156x.X(i20, inParcel);
                    } else if (c15 == 2) {
                        pendingIntent3 = (PendingIntent) AbstractC0156x.t(inParcel, i20, PendingIntent.CREATOR);
                    } else if (c15 == 3) {
                        iX26 = AbstractC0156x.X(i20, inParcel);
                    } else if (c15 == 4) {
                        bundleO3 = AbstractC0156x.o(i20, inParcel);
                    } else if (c15 == 5) {
                        bArrP2 = AbstractC0156x.p(i20, inParcel);
                    } else if (c15 != 1000) {
                        AbstractC0156x.g0(i20, inParcel);
                    } else {
                        iX24 = AbstractC0156x.X(i20, inParcel);
                    }
                }
                AbstractC0156x.E(iH016, inParcel);
                return new e1.b(iX24, iX25, pendingIntent3, iX26, bundleO3, bArrP2);
            case 24:
                return new C0550b(inParcel);
            case 25:
                return new C0551c(inParcel);
            case 26:
                C0538F c0538f = new C0538F();
                c0538f.f7308a = inParcel.readString();
                c0538f.f7309b = inParcel.readInt();
                return c0538f;
            case 27:
                C0543K c0543k = new C0543K();
                c0543k.f7357e = null;
                c0543k.f7358f = new ArrayList();
                c0543k.f7359k = new ArrayList();
                c0543k.f7353a = inParcel.createStringArrayList();
                c0543k.f7354b = inParcel.createStringArrayList();
                c0543k.f7355c = (C0550b[]) inParcel.createTypedArray(C0550b.CREATOR);
                c0543k.f7356d = inParcel.readInt();
                c0543k.f7357e = inParcel.readString();
                c0543k.f7358f = inParcel.createStringArrayList();
                c0543k.f7359k = inParcel.createTypedArrayList(C0551c.CREATOR);
                c0543k.f7360l = inParcel.createTypedArrayList(C0538F.CREATOR);
                return c0543k;
            case 28:
                return new C0547O(inParcel);
            default:
                int iH017 = AbstractC0156x.h0(inParcel);
                int iX27 = 0;
                Bundle bundleO4 = null;
                int iX28 = 0;
                while (inParcel.dataPosition() < iH017) {
                    int i21 = inParcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 1) {
                        iX27 = AbstractC0156x.X(i21, inParcel);
                    } else if (c16 == 2) {
                        iX28 = AbstractC0156x.X(i21, inParcel);
                    } else if (c16 != 3) {
                        AbstractC0156x.g0(i21, inParcel);
                    } else {
                        bundleO4 = AbstractC0156x.o(i21, inParcel);
                    }
                }
                AbstractC0156x.E(iH017, inParcel);
                return new C0572a(iX27, iX28, bundleO4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f5448a) {
            case 0:
                return new l[i];
            case 1:
                return new m[i];
            case 2:
                return new o[i];
            case 3:
                return new p[i];
            case 4:
                return new Scope[i];
            case 5:
                return new Status[i];
            case 6:
                return new com.google.android.gms.common.internal.t[i];
            case 7:
                return new C0379q[i];
            case 8:
                return new y[i];
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return new z[i];
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return new C0380s[i];
            case 11:
                return new K[i];
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new C0371i[i];
            case 13:
                return new C0372j[i];
            case 14:
                return new C0383c[i];
            case 15:
                return new C0385e[i];
            case 16:
                return new C0387g[i];
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return new com.google.android.material.datepicker.h[i];
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new com.google.android.material.datepicker.t[i];
            case 19:
                return new A[i];
            case 20:
                return new C0435a[i];
            case 21:
                return new C0441h[i];
            case 22:
                return new C0448a[i];
            case 23:
                return new e1.b[i];
            case 24:
                return new C0550b[i];
            case 25:
                return new C0551c[i];
            case 26:
                return new C0538F[i];
            case 27:
                return new C0543K[i];
            case 28:
                return new C0547O[i];
            default:
                return new C0572a[i];
        }
    }
}
