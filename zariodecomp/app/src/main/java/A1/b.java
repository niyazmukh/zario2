package a1;

import D0.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import m1.AbstractC0743b;
import m1.C0742a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a1.1\b.smali */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new k(8);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f4032f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4033a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4034b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4035c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4036d;

    /* renamed from: e, reason: collision with root package name */
    public d f4037e;

    static {
        HashMap map = new HashMap();
        f4032f = map;
        map.put("authenticatorData", new C0742a(11, true, 11, true, "authenticatorData", 2, e.class));
        map.put("progress", new C0742a(11, false, 11, false, "progress", 4, d.class));
    }

    public b(HashSet hashSet, int i, ArrayList arrayList, int i5, d dVar) {
        this.f4033a = hashSet;
        this.f4034b = i;
        this.f4035c = arrayList;
        this.f4036d = i5;
        this.f4037e = dVar;
    }

    @Override // m1.AbstractC0743b
    public final void addConcreteTypeArrayInternal(C0742a c0742a, String str, ArrayList arrayList) {
        int i = c0742a.f8835k;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.f4035c = arrayList;
        this.f4033a.add(Integer.valueOf(i));
    }

    @Override // m1.AbstractC0743b
    public final void addConcreteTypeInternal(C0742a c0742a, String str, AbstractC0743b abstractC0743b) {
        int i = c0742a.f8835k;
        if (i != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), abstractC0743b.getClass().getCanonicalName()));
        }
        this.f4037e = (d) abstractC0743b;
        this.f4033a.add(Integer.valueOf(i));
    }

    @Override // m1.AbstractC0743b
    public final /* synthetic */ Map getFieldMappings() {
        return f4032f;
    }

    @Override // m1.AbstractC0743b
    public final Object getFieldValue(C0742a c0742a) {
        int i = c0742a.f8835k;
        if (i == 1) {
            return Integer.valueOf(this.f4034b);
        }
        if (i == 2) {
            return this.f4035c;
        }
        if (i == 4) {
            return this.f4037e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0742a.f8835k);
    }

    @Override // m1.AbstractC0743b
    public final boolean isFieldSet(C0742a c0742a) {
        return this.f4033a.contains(Integer.valueOf(c0742a.f8835k));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        HashSet hashSet = this.f4033a;
        if (hashSet.contains(1)) {
            S0.f.u0(parcel, 1, 4);
            parcel.writeInt(this.f4034b);
        }
        if (hashSet.contains(2)) {
            S0.f.r0(parcel, 2, this.f4035c, true);
        }
        if (hashSet.contains(3)) {
            S0.f.u0(parcel, 3, 4);
            parcel.writeInt(this.f4036d);
        }
        if (hashSet.contains(4)) {
            S0.f.m0(parcel, 4, this.f4037e, i, true);
        }
        S0.f.w0(iV0, parcel);
    }
}
