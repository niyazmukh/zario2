package com.google.android.gms.auth.api.identity;

import D0.k;
import S0.f;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\identity\SaveAccountLinkingTokenRequest.smali */
public class SaveAccountLinkingTokenRequest extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new k(28);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f5482a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5483b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5484c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5485d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5486e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5487f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i) {
        this.f5482a = pendingIntent;
        this.f5483b = str;
        this.f5484c = str2;
        this.f5485d = arrayList;
        this.f5486e = str3;
        this.f5487f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        ArrayList arrayList = this.f5485d;
        return arrayList.size() == saveAccountLinkingTokenRequest.f5485d.size() && arrayList.containsAll(saveAccountLinkingTokenRequest.f5485d) && C.i(this.f5482a, saveAccountLinkingTokenRequest.f5482a) && C.i(this.f5483b, saveAccountLinkingTokenRequest.f5483b) && C.i(this.f5484c, saveAccountLinkingTokenRequest.f5484c) && C.i(this.f5486e, saveAccountLinkingTokenRequest.f5486e) && this.f5487f == saveAccountLinkingTokenRequest.f5487f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5482a, this.f5483b, this.f5484c, this.f5485d, this.f5486e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.m0(parcel, 1, this.f5482a, i, false);
        f.n0(parcel, 2, this.f5483b, false);
        f.n0(parcel, 3, this.f5484c, false);
        f.p0(parcel, 4, this.f5485d);
        f.n0(parcel, 5, this.f5486e, false);
        f.u0(parcel, 6, 4);
        parcel.writeInt(this.f5487f);
        f.w0(iV0, parcel);
    }
}
