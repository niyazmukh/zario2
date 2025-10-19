package m1;

import S0.l;
import android.os.Parcel;
import i1.AbstractC0596a;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m1.1\a.smali */
public final class C0742a extends AbstractC0596a {
    public static final e CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f8829a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8830b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8831c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8832d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8833e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8834f;

    /* renamed from: k, reason: collision with root package name */
    public final int f8835k;

    /* renamed from: l, reason: collision with root package name */
    public final Class f8836l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8837m;

    /* renamed from: n, reason: collision with root package name */
    public h f8838n;

    /* renamed from: o, reason: collision with root package name */
    public final l1.a f8839o;

    public C0742a(int i, int i5, boolean z4, int i6, boolean z5, String str, int i7, String str2, l1.b bVar) {
        this.f8829a = i;
        this.f8830b = i5;
        this.f8831c = z4;
        this.f8832d = i6;
        this.f8833e = z5;
        this.f8834f = str;
        this.f8835k = i7;
        if (str2 == null) {
            this.f8836l = null;
            this.f8837m = null;
        } else {
            this.f8836l = d.class;
            this.f8837m = str2;
        }
        if (bVar == null) {
            this.f8839o = null;
            return;
        }
        l1.a aVar = bVar.f8758b;
        if (aVar == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.f8839o = aVar;
    }

    public static C0742a c(int i, String str) {
        return new C0742a(7, true, 7, true, str, i, null);
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.c(Integer.valueOf(this.f8829a), "versionCode");
        lVar.c(Integer.valueOf(this.f8830b), "typeIn");
        lVar.c(Boolean.valueOf(this.f8831c), "typeInArray");
        lVar.c(Integer.valueOf(this.f8832d), "typeOut");
        lVar.c(Boolean.valueOf(this.f8833e), "typeOutArray");
        lVar.c(this.f8834f, "outputFieldName");
        lVar.c(Integer.valueOf(this.f8835k), "safeParcelFieldId");
        String str = this.f8837m;
        if (str == null) {
            str = null;
        }
        lVar.c(str, "concreteTypeName");
        Class cls = this.f8836l;
        if (cls != null) {
            lVar.c(cls.getCanonicalName(), "concreteType.class");
        }
        l1.a aVar = this.f8839o;
        if (aVar != null) {
            lVar.c(aVar.getClass().getCanonicalName(), "converterName");
        }
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f8829a);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f8830b);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f8831c ? 1 : 0);
        S0.f.u0(parcel, 4, 4);
        parcel.writeInt(this.f8832d);
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(this.f8833e ? 1 : 0);
        S0.f.n0(parcel, 6, this.f8834f, false);
        S0.f.u0(parcel, 7, 4);
        parcel.writeInt(this.f8835k);
        l1.b bVar = null;
        String str = this.f8837m;
        if (str == null) {
            str = null;
        }
        S0.f.n0(parcel, 8, str, false);
        l1.a aVar = this.f8839o;
        if (aVar != null) {
            if (!(aVar instanceof l1.a)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            bVar = new l1.b(aVar);
        }
        S0.f.m0(parcel, 9, bVar, i, false);
        S0.f.w0(iV0, parcel);
    }

    public C0742a(int i, boolean z4, int i5, boolean z5, String str, int i6, Class cls) {
        this.f8829a = 1;
        this.f8830b = i;
        this.f8831c = z4;
        this.f8832d = i5;
        this.f8833e = z5;
        this.f8834f = str;
        this.f8835k = i6;
        this.f8836l = cls;
        if (cls == null) {
            this.f8837m = null;
        } else {
            this.f8837m = cls.getCanonicalName();
        }
        this.f8839o = null;
    }
}
