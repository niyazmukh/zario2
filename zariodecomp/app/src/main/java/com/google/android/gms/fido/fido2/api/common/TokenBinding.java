package com.google.android.gms.fido.fido2.api.common;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.fido.zzao;
import i1.AbstractC0596a;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import v1.J;
import v1.K;
import v1.O;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\fido\fido2\api\common\TokenBinding.smali */
public class TokenBinding extends AbstractC0596a {
    private final J zza;
    private final String zzb;
    public static final Parcelable.Creator<TokenBinding> CREATOR = new O(17);
    public static final TokenBinding SUPPORTED = new TokenBinding("supported", null);
    public static final TokenBinding NOT_SUPPORTED = new TokenBinding("not-supported", null);

    public TokenBinding(String str, String str2) {
        C.f(str);
        try {
            this.zza = J.b(str);
            this.zzb = str2;
        } catch (K e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return zzao.zza(this.zza, tokenBinding.zza) && zzao.zza(this.zzb, tokenBinding.zzb);
    }

    public String getTokenBindingId() {
        return this.zzb;
    }

    public String getTokenBindingStatusAsString() {
        return this.zza.f10582a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public JSONObject toJsonObject() {
        try {
            return new JSONObject().put("status", this.zza).put("id", this.zzb);
        } catch (JSONException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.n0(parcel, 2, getTokenBindingStatusAsString(), false);
        f.n0(parcel, 3, getTokenBindingId(), false);
        f.w0(iV0, parcel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBinding(String str) {
        this("present", str);
        C.f(str);
    }
}
