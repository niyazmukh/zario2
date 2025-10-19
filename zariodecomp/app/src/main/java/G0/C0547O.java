package g0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0236o;

/* renamed from: g0.O, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\O.smali */
public final class C0547O implements Parcelable {
    public static final Parcelable.Creator<C0547O> CREATOR = new c1.s(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f7369a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7370b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7371c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7372d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7373e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7374f;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7375k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7376l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7377m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7378n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7379o;

    /* renamed from: p, reason: collision with root package name */
    public final String f7380p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7381q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7382r;

    public C0547O(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        this.f7369a = abstractComponentCallbacksC0567t.getClass().getName();
        this.f7370b = abstractComponentCallbacksC0567t.f7531e;
        this.f7371c = abstractComponentCallbacksC0567t.f7540r;
        this.f7372d = abstractComponentCallbacksC0567t.f7504A;
        this.f7373e = abstractComponentCallbacksC0567t.f7505B;
        this.f7374f = abstractComponentCallbacksC0567t.f7506C;
        this.f7375k = abstractComponentCallbacksC0567t.f7509F;
        this.f7376l = abstractComponentCallbacksC0567t.f7538p;
        this.f7377m = abstractComponentCallbacksC0567t.f7508E;
        this.f7378n = abstractComponentCallbacksC0567t.f7507D;
        this.f7379o = abstractComponentCallbacksC0567t.f7519Q.ordinal();
        this.f7380p = abstractComponentCallbacksC0567t.f7534l;
        this.f7381q = abstractComponentCallbacksC0567t.f7535m;
        this.f7382r = abstractComponentCallbacksC0567t.f7514L;
    }

    public final AbstractComponentCallbacksC0567t b(C0536D c0536d) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tA = c0536d.a(this.f7369a);
        abstractComponentCallbacksC0567tA.f7531e = this.f7370b;
        abstractComponentCallbacksC0567tA.f7540r = this.f7371c;
        abstractComponentCallbacksC0567tA.f7542t = true;
        abstractComponentCallbacksC0567tA.f7504A = this.f7372d;
        abstractComponentCallbacksC0567tA.f7505B = this.f7373e;
        abstractComponentCallbacksC0567tA.f7506C = this.f7374f;
        abstractComponentCallbacksC0567tA.f7509F = this.f7375k;
        abstractComponentCallbacksC0567tA.f7538p = this.f7376l;
        abstractComponentCallbacksC0567tA.f7508E = this.f7377m;
        abstractComponentCallbacksC0567tA.f7507D = this.f7378n;
        abstractComponentCallbacksC0567tA.f7519Q = EnumC0236o.values()[this.f7379o];
        abstractComponentCallbacksC0567tA.f7534l = this.f7380p;
        abstractComponentCallbacksC0567tA.f7535m = this.f7381q;
        abstractComponentCallbacksC0567tA.f7514L = this.f7382r;
        return abstractComponentCallbacksC0567tA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f7369a);
        sb.append(" (");
        sb.append(this.f7370b);
        sb.append(")}:");
        if (this.f7371c) {
            sb.append(" fromLayout");
        }
        int i = this.f7373e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f7374f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f7375k) {
            sb.append(" retainInstance");
        }
        if (this.f7376l) {
            sb.append(" removing");
        }
        if (this.f7377m) {
            sb.append(" detached");
        }
        if (this.f7378n) {
            sb.append(" hidden");
        }
        String str2 = this.f7380p;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f7381q);
        }
        if (this.f7382r) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7369a);
        parcel.writeString(this.f7370b);
        parcel.writeInt(this.f7371c ? 1 : 0);
        parcel.writeInt(this.f7372d);
        parcel.writeInt(this.f7373e);
        parcel.writeString(this.f7374f);
        parcel.writeInt(this.f7375k ? 1 : 0);
        parcel.writeInt(this.f7376l ? 1 : 0);
        parcel.writeInt(this.f7377m ? 1 : 0);
        parcel.writeInt(this.f7378n ? 1 : 0);
        parcel.writeInt(this.f7379o);
        parcel.writeString(this.f7380p);
        parcel.writeInt(this.f7381q);
        parcel.writeInt(this.f7382r ? 1 : 0);
    }

    public C0547O(Parcel parcel) {
        this.f7369a = parcel.readString();
        this.f7370b = parcel.readString();
        this.f7371c = parcel.readInt() != 0;
        this.f7372d = parcel.readInt();
        this.f7373e = parcel.readInt();
        this.f7374f = parcel.readString();
        this.f7375k = parcel.readInt() != 0;
        this.f7376l = parcel.readInt() != 0;
        this.f7377m = parcel.readInt() != 0;
        this.f7378n = parcel.readInt() != 0;
        this.f7379o = parcel.readInt();
        this.f7380p = parcel.readString();
        this.f7381q = parcel.readInt();
        this.f7382r = parcel.readInt() != 0;
    }
}
