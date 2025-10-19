package c1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\a.smali */
public final class C0334a extends AbstractC0596a {
    public static final Parcelable.Creator<C0334a> CREATOR = new D0.k(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f5398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5399b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5400c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5401d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f5402e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f5403f;

    public C0334a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f5398a = str;
        this.f5399b = str2;
        this.f5400c = str3;
        C.f(arrayList);
        this.f5401d = arrayList;
        this.f5403f = pendingIntent;
        this.f5402e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0334a)) {
            return false;
        }
        C0334a c0334a = (C0334a) obj;
        return C.i(this.f5398a, c0334a.f5398a) && C.i(this.f5399b, c0334a.f5399b) && C.i(this.f5400c, c0334a.f5400c) && C.i(this.f5401d, c0334a.f5401d) && C.i(this.f5403f, c0334a.f5403f) && C.i(this.f5402e, c0334a.f5402e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5398a, this.f5399b, this.f5400c, this.f5401d, this.f5403f, this.f5402e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f5398a, false);
        S0.f.n0(parcel, 2, this.f5399b, false);
        S0.f.n0(parcel, 3, this.f5400c, false);
        S0.f.p0(parcel, 4, this.f5401d);
        S0.f.m0(parcel, 5, this.f5402e, i, false);
        S0.f.m0(parcel, 6, this.f5403f, i, false);
        S0.f.w0(iV0, parcel);
    }
}
