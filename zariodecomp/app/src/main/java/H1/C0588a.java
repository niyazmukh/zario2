package h1;

import N2.n0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\a.smali */
public final class C0588a extends AbstractC0596a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7621b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f7622c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7623d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0588a f7619e = new C0588a(0);
    public static final Parcelable.Creator<C0588a> CREATOR = new g1.m(1);

    public C0588a(int i, int i5, PendingIntent pendingIntent, String str) {
        this.f7620a = i;
        this.f7621b = i5;
        this.f7622c = pendingIntent;
        this.f7623d = str;
    }

    public static String c(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "SERVICE_INVALID";
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0588a)) {
            return false;
        }
        C0588a c0588a = (C0588a) obj;
        return this.f7621b == c0588a.f7621b && C.i(this.f7622c, c0588a.f7622c) && C.i(this.f7623d, c0588a.f7623d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7621b), this.f7622c, this.f7623d});
    }

    public final String toString() {
        S0.l lVar = new S0.l(this);
        lVar.c(c(this.f7621b), "statusCode");
        lVar.c(this.f7622c, "resolution");
        lVar.c(this.f7623d, "message");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f7620a);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f7621b);
        S0.f.m0(parcel, 3, this.f7622c, i, false);
        S0.f.n0(parcel, 4, this.f7623d, false);
        S0.f.w0(iV0, parcel);
    }

    public C0588a(int i) {
        this(1, i, null, null);
    }

    public C0588a(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
