package v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* renamed from: v1.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\j.1.smali */
public final class C0987j extends AbstractC0989l {
    public static final Parcelable.Creator<C0987j> CREATOR = new O(29);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10629a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10630b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10631c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f10632d;

    public C0987j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.google.android.gms.common.internal.C.f(bArr);
        this.f10629a = bArr;
        com.google.android.gms.common.internal.C.f(bArr2);
        this.f10630b = bArr2;
        com.google.android.gms.common.internal.C.f(bArr3);
        this.f10631c = bArr3;
        com.google.android.gms.common.internal.C.f(strArr);
        this.f10632d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0987j)) {
            return false;
        }
        C0987j c0987j = (C0987j) obj;
        return Arrays.equals(this.f10629a, c0987j.f10629a) && Arrays.equals(this.f10630b, c0987j.f10630b) && Arrays.equals(this.f10631c, c0987j.f10631c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f10629a)), Integer.valueOf(Arrays.hashCode(this.f10630b)), Integer.valueOf(Arrays.hashCode(this.f10631c))});
    }

    public final String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.f10629a;
        zzamVarZza.zzb("keyHandle", zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.f10630b;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.f10631c;
        zzamVarZza.zzb("attestationObject", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzamVarZza.zzb("transports", Arrays.toString(this.f10632d));
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.g0(parcel, 2, this.f10629a, false);
        S0.f.g0(parcel, 3, this.f10630b, false);
        S0.f.g0(parcel, 4, this.f10631c, false);
        S0.f.o0(parcel, 5, this.f10632d, false);
        S0.f.w0(iV0, parcel);
    }
}
