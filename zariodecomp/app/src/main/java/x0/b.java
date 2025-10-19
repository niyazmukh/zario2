package X0;

import D0.k;
import S0.f;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X0\b.smali */
public final class b extends AbstractC0596a {
    public static final Parcelable.Creator<b> CREATOR = new k(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f3708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3709b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3710c;

    /* renamed from: d, reason: collision with root package name */
    public final Account f3711d;

    public b(int i, int i5, String str, Account account) {
        this.f3708a = i;
        this.f3709b = i5;
        this.f3710c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f3711d = account;
        } else {
            this.f3711d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f3708a);
        f.u0(parcel, 2, 4);
        parcel.writeInt(this.f3709b);
        f.n0(parcel, 3, this.f3710c, false);
        f.m0(parcel, 4, this.f3711d, i, false);
        f.w0(iV0, parcel);
    }
}
