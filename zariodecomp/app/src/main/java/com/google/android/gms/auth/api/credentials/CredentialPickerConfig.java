package com.google.android.gms.auth.api.credentials;

import D0.k;
import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i1.AbstractC0596a;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\credentials\CredentialPickerConfig.smali */
public final class CredentialPickerConfig extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new k(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f5460a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5461b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5463d;

    public CredentialPickerConfig(int i, boolean z4, boolean z5, boolean z6, int i5) {
        this.f5460a = i;
        this.f5461b = z4;
        this.f5462c = z5;
        if (i < 2) {
            this.f5463d = true == z6 ? 3 : 1;
        } else {
            this.f5463d = i5;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5461b ? 1 : 0);
        f.u0(parcel, 2, 4);
        parcel.writeInt(this.f5462c ? 1 : 0);
        int i5 = this.f5463d;
        int i6 = i5 != 3 ? 0 : 1;
        f.u0(parcel, 3, 4);
        parcel.writeInt(i6);
        f.u0(parcel, 4, 4);
        parcel.writeInt(i5);
        f.u0(parcel, 1000, 4);
        parcel.writeInt(this.f5460a);
        f.w0(iV0, parcel);
    }
}
