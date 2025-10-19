package a1;

import D0.k;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import m1.C0742a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a1.1\f.smali */
public final class f extends zzbz {
    public static final Parcelable.Creator<f> CREATOR = new k(11);

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f4052l;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4053a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4054b;

    /* renamed from: c, reason: collision with root package name */
    public String f4055c;

    /* renamed from: d, reason: collision with root package name */
    public int f4056d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f4057e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f4058f;

    /* renamed from: k, reason: collision with root package name */
    public final C0185a f4059k;

    static {
        HashMap map = new HashMap();
        f4052l = map;
        map.put("accountType", new C0742a(7, false, 7, false, "accountType", 2, null));
        map.put("status", new C0742a(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new C0742a(8, false, 8, false, "transferBytes", 4, null));
    }

    public f(HashSet hashSet, int i, String str, int i5, byte[] bArr, PendingIntent pendingIntent, C0185a c0185a) {
        this.f4053a = hashSet;
        this.f4054b = i;
        this.f4055c = str;
        this.f4056d = i5;
        this.f4057e = bArr;
        this.f4058f = pendingIntent;
        this.f4059k = c0185a;
    }

    @Override // m1.AbstractC0743b
    public final /* synthetic */ Map getFieldMappings() {
        return f4052l;
    }

    @Override // m1.AbstractC0743b
    public final Object getFieldValue(C0742a c0742a) {
        int i = c0742a.f8835k;
        if (i == 1) {
            return Integer.valueOf(this.f4054b);
        }
        if (i == 2) {
            return this.f4055c;
        }
        if (i == 3) {
            return Integer.valueOf(this.f4056d);
        }
        if (i == 4) {
            return this.f4057e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0742a.f8835k);
    }

    @Override // m1.AbstractC0743b
    public final boolean isFieldSet(C0742a c0742a) {
        return this.f4053a.contains(Integer.valueOf(c0742a.f8835k));
    }

    @Override // m1.AbstractC0743b
    public final void setDecodedBytesInternal(C0742a c0742a, String str, byte[] bArr) {
        int i = c0742a.f8835k;
        if (i != 4) {
            throw new IllegalArgumentException(B.a.i("Field with id=", i, " is not known to be an byte array."));
        }
        this.f4057e = bArr;
        this.f4053a.add(Integer.valueOf(i));
    }

    @Override // m1.AbstractC0743b
    public final void setIntegerInternal(C0742a c0742a, String str, int i) {
        int i5 = c0742a.f8835k;
        if (i5 != 3) {
            throw new IllegalArgumentException(B.a.i("Field with id=", i5, " is not known to be an int."));
        }
        this.f4056d = i;
        this.f4053a.add(Integer.valueOf(i5));
    }

    @Override // m1.AbstractC0743b
    public final void setStringInternal(C0742a c0742a, String str, String str2) {
        int i = c0742a.f8835k;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f4055c = str2;
        this.f4053a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        HashSet hashSet = this.f4053a;
        if (hashSet.contains(1)) {
            S0.f.u0(parcel, 1, 4);
            parcel.writeInt(this.f4054b);
        }
        if (hashSet.contains(2)) {
            S0.f.n0(parcel, 2, this.f4055c, true);
        }
        if (hashSet.contains(3)) {
            int i5 = this.f4056d;
            S0.f.u0(parcel, 3, 4);
            parcel.writeInt(i5);
        }
        if (hashSet.contains(4)) {
            S0.f.g0(parcel, 4, this.f4057e, true);
        }
        if (hashSet.contains(5)) {
            S0.f.m0(parcel, 5, this.f4058f, i, true);
        }
        if (hashSet.contains(6)) {
            S0.f.m0(parcel, 6, this.f4059k, i, true);
        }
        S0.f.w0(iV0, parcel);
    }
}
