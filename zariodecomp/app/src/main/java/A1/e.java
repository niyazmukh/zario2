package a1;

import D0.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import m1.AbstractC0743b;
import m1.C0742a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a1.1\e.smali */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new k(10);

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f4045k;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4047b;

    /* renamed from: c, reason: collision with root package name */
    public f f4048c;

    /* renamed from: d, reason: collision with root package name */
    public String f4049d;

    /* renamed from: e, reason: collision with root package name */
    public String f4050e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4051f;

    static {
        HashMap map = new HashMap();
        f4045k = map;
        map.put("authenticatorInfo", new C0742a(11, false, 11, false, "authenticatorInfo", 2, f.class));
        map.put("signature", new C0742a(7, false, 7, false, "signature", 3, null));
        map.put("package", new C0742a(7, false, 7, false, "package", 4, null));
    }

    public e(HashSet hashSet, int i, f fVar, String str, String str2, String str3) {
        this.f4046a = hashSet;
        this.f4047b = i;
        this.f4048c = fVar;
        this.f4049d = str;
        this.f4050e = str2;
        this.f4051f = str3;
    }

    @Override // m1.AbstractC0743b
    public final void addConcreteTypeInternal(C0742a c0742a, String str, AbstractC0743b abstractC0743b) {
        int i = c0742a.f8835k;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), abstractC0743b.getClass().getCanonicalName()));
        }
        this.f4048c = (f) abstractC0743b;
        this.f4046a.add(Integer.valueOf(i));
    }

    @Override // m1.AbstractC0743b
    public final /* synthetic */ Map getFieldMappings() {
        return f4045k;
    }

    @Override // m1.AbstractC0743b
    public final Object getFieldValue(C0742a c0742a) {
        int i = c0742a.f8835k;
        if (i == 1) {
            return Integer.valueOf(this.f4047b);
        }
        if (i == 2) {
            return this.f4048c;
        }
        if (i == 3) {
            return this.f4049d;
        }
        if (i == 4) {
            return this.f4050e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0742a.f8835k);
    }

    @Override // m1.AbstractC0743b
    public final boolean isFieldSet(C0742a c0742a) {
        return this.f4046a.contains(Integer.valueOf(c0742a.f8835k));
    }

    @Override // m1.AbstractC0743b
    public final void setStringInternal(C0742a c0742a, String str, String str2) {
        int i = c0742a.f8835k;
        if (i == 3) {
            this.f4049d = str2;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.f4050e = str2;
        }
        this.f4046a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        HashSet hashSet = this.f4046a;
        if (hashSet.contains(1)) {
            S0.f.u0(parcel, 1, 4);
            parcel.writeInt(this.f4047b);
        }
        if (hashSet.contains(2)) {
            S0.f.m0(parcel, 2, this.f4048c, i, true);
        }
        if (hashSet.contains(3)) {
            S0.f.n0(parcel, 3, this.f4049d, true);
        }
        if (hashSet.contains(4)) {
            S0.f.n0(parcel, 4, this.f4050e, true);
        }
        if (hashSet.contains(5)) {
            S0.f.n0(parcel, 5, this.f4051f, true);
        }
        S0.f.w0(iV0, parcel);
    }
}
