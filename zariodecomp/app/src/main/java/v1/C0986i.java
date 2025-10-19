package v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* renamed from: v1.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\i.1.smali */
public final class C0986i extends AbstractC0989l {
    public static final Parcelable.Creator<C0986i> CREATOR = new O(28);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10624a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10625b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10626c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10627d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10628e;

    public C0986i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.internal.C.f(bArr);
        this.f10624a = bArr;
        com.google.android.gms.common.internal.C.f(bArr2);
        this.f10625b = bArr2;
        com.google.android.gms.common.internal.C.f(bArr3);
        this.f10626c = bArr3;
        com.google.android.gms.common.internal.C.f(bArr4);
        this.f10627d = bArr4;
        this.f10628e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0986i)) {
            return false;
        }
        C0986i c0986i = (C0986i) obj;
        return Arrays.equals(this.f10624a, c0986i.f10624a) && Arrays.equals(this.f10625b, c0986i.f10625b) && Arrays.equals(this.f10626c, c0986i.f10626c) && Arrays.equals(this.f10627d, c0986i.f10627d) && Arrays.equals(this.f10628e, c0986i.f10628e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f10624a)), Integer.valueOf(Arrays.hashCode(this.f10625b)), Integer.valueOf(Arrays.hashCode(this.f10626c)), Integer.valueOf(Arrays.hashCode(this.f10627d)), Integer.valueOf(Arrays.hashCode(this.f10628e))});
    }

    public final String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.f10624a;
        zzamVarZza.zzb("keyHandle", zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.f10625b;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.f10626c;
        zzamVarZza.zzb("authenticatorData", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzchVarZzf4 = zzch.zzf();
        byte[] bArr4 = this.f10627d;
        zzamVarZza.zzb("signature", zzchVarZzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f10628e;
        if (bArr5 != null) {
            zzamVarZza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.g0(parcel, 2, this.f10624a, false);
        S0.f.g0(parcel, 3, this.f10625b, false);
        S0.f.g0(parcel, 4, this.f10626c, false);
        S0.f.g0(parcel, 5, this.f10627d, false);
        S0.f.g0(parcel, 6, this.f10628e, false);
        S0.f.w0(iV0, parcel);
    }
}
