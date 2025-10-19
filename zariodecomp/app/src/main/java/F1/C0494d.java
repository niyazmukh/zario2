package f1;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import g1.C0572a;
import java.util.ArrayList;

/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f1.1\d.smali */
public final class C0494d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6998a;

    public /* synthetic */ C0494d(int i) {
        this.f6998a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6998a) {
            case 0:
                int iH0 = AbstractC0156x.h0(parcel);
                int iX = 0;
                String strU = null;
                String strU2 = null;
                String strU3 = null;
                String strU4 = null;
                Uri uri = null;
                String strU5 = null;
                String strU6 = null;
                ArrayList arrayListY = null;
                String strU7 = null;
                String strU8 = null;
                long jA0 = 0;
                while (parcel.dataPosition() < iH0) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iX = AbstractC0156x.X(i, parcel);
                            break;
                        case 2:
                            strU = AbstractC0156x.u(i, parcel);
                            break;
                        case 3:
                            strU2 = AbstractC0156x.u(i, parcel);
                            break;
                        case 4:
                            strU3 = AbstractC0156x.u(i, parcel);
                            break;
                        case 5:
                            strU4 = AbstractC0156x.u(i, parcel);
                            break;
                        case 6:
                            uri = (Uri) AbstractC0156x.t(parcel, i, Uri.CREATOR);
                            break;
                        case 7:
                            strU5 = AbstractC0156x.u(i, parcel);
                            break;
                        case '\b':
                            jA0 = AbstractC0156x.a0(i, parcel);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            strU6 = AbstractC0156x.u(i, parcel);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            arrayListY = AbstractC0156x.y(parcel, i, Scope.CREATOR);
                            break;
                        case 11:
                            strU7 = AbstractC0156x.u(i, parcel);
                            break;
                        case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            strU8 = AbstractC0156x.u(i, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH0, parcel);
                return new GoogleSignInAccount(iX, strU, strU2, strU3, strU4, uri, strU5, jA0, strU6, arrayListY, strU7, strU8);
            case 1:
                int iH02 = AbstractC0156x.h0(parcel);
                ArrayList arrayListY2 = null;
                int iX2 = 0;
                boolean zV = false;
                boolean zV2 = false;
                boolean zV3 = false;
                ArrayList arrayListY3 = null;
                Account account = null;
                String strU9 = null;
                String strU10 = null;
                String strU11 = null;
                while (parcel.dataPosition() < iH02) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            iX2 = AbstractC0156x.X(i5, parcel);
                            break;
                        case 2:
                            arrayListY3 = AbstractC0156x.y(parcel, i5, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) AbstractC0156x.t(parcel, i5, Account.CREATOR);
                            break;
                        case 4:
                            zV = AbstractC0156x.V(i5, parcel);
                            break;
                        case 5:
                            zV2 = AbstractC0156x.V(i5, parcel);
                            break;
                        case 6:
                            zV3 = AbstractC0156x.V(i5, parcel);
                            break;
                        case 7:
                            strU9 = AbstractC0156x.u(i5, parcel);
                            break;
                        case '\b':
                            strU10 = AbstractC0156x.u(i5, parcel);
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            arrayListY2 = AbstractC0156x.y(parcel, i5, C0572a.CREATOR);
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            strU11 = AbstractC0156x.u(i5, parcel);
                            break;
                        default:
                            AbstractC0156x.g0(i5, parcel);
                            break;
                    }
                }
                AbstractC0156x.E(iH02, parcel);
                return new GoogleSignInOptions(iX2, arrayListY3, account, zV, zV2, zV3, strU9, strU10, GoogleSignInOptions.d(arrayListY2), strU11);
            default:
                int iH03 = AbstractC0156x.h0(parcel);
                String strU12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strU13 = "";
                while (parcel.dataPosition() < iH03) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 4) {
                        strU12 = AbstractC0156x.u(i6, parcel);
                    } else if (c5 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC0156x.t(parcel, i6, GoogleSignInAccount.CREATOR);
                    } else if (c5 != '\b') {
                        AbstractC0156x.g0(i6, parcel);
                    } else {
                        strU13 = AbstractC0156x.u(i6, parcel);
                    }
                }
                AbstractC0156x.E(iH03, parcel);
                return new SignInAccount(strU12, googleSignInAccount, strU13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f6998a) {
            case 0:
                return new GoogleSignInAccount[i];
            case 1:
                return new GoogleSignInOptions[i];
            default:
                return new SignInAccount[i];
        }
    }
}
