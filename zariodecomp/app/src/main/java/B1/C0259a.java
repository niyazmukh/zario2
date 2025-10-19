package b1;

import D0.k;
import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b1.1\a.smali */
public final class C0259a extends AbstractC0596a {
    public static final Parcelable.Creator<C0259a> CREATOR = new k(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f4983a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4984b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f4985c;

    /* renamed from: d, reason: collision with root package name */
    public final CredentialPickerConfig f4986d;

    /* renamed from: e, reason: collision with root package name */
    public final CredentialPickerConfig f4987e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4988f;

    /* renamed from: k, reason: collision with root package name */
    public final String f4989k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4990l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4991m;

    public C0259a(int i, boolean z4, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z5, String str, String str2, boolean z6) {
        this.f4983a = i;
        this.f4984b = z4;
        C.f(strArr);
        this.f4985c = strArr;
        this.f4986d = credentialPickerConfig == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig;
        this.f4987e = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig2;
        if (i < 3) {
            this.f4988f = true;
            this.f4989k = null;
            this.f4990l = null;
        } else {
            this.f4988f = z5;
            this.f4989k = str;
            this.f4990l = str2;
        }
        this.f4991m = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f4984b ? 1 : 0);
        f.o0(parcel, 2, this.f4985c, false);
        f.m0(parcel, 3, this.f4986d, i, false);
        f.m0(parcel, 4, this.f4987e, i, false);
        f.u0(parcel, 5, 4);
        parcel.writeInt(this.f4988f ? 1 : 0);
        f.n0(parcel, 6, this.f4989k, false);
        f.n0(parcel, 7, this.f4990l, false);
        f.u0(parcel, 8, 4);
        parcel.writeInt(this.f4991m ? 1 : 0);
        f.u0(parcel, 1000, 4);
        parcel.writeInt(this.f4983a);
        f.w0(iV0, parcel);
    }
}
