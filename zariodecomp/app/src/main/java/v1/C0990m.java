package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* renamed from: v1.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\m.1.smali */
public final class C0990m extends AbstractC0596a {
    public static final Parcelable.Creator<C0990m> CREATOR = new Y(1);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0980c f10636a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f10637b;

    /* renamed from: c, reason: collision with root package name */
    public final V f10638c;

    /* renamed from: d, reason: collision with root package name */
    public final I f10639d;

    public C0990m(String str, Boolean bool, String str2, String str3) {
        EnumC0980c enumC0980cB;
        I iB = null;
        if (str == null) {
            enumC0980cB = null;
        } else {
            try {
                enumC0980cB = EnumC0980c.b(str);
            } catch (H | U | C0979b e5) {
                throw new IllegalArgumentException(e5);
            }
        }
        this.f10636a = enumC0980cB;
        this.f10637b = bool;
        this.f10638c = str2 == null ? null : V.b(str2);
        if (str3 != null) {
            iB = I.b(str3);
        }
        this.f10639d = iB;
    }

    public final I c() {
        I i = this.f10639d;
        if (i == null) {
            i = null;
            Boolean bool = this.f10637b;
            if (bool != null && bool.booleanValue()) {
                return I.RESIDENT_KEY_REQUIRED;
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0990m)) {
            return false;
        }
        C0990m c0990m = (C0990m) obj;
        return com.google.android.gms.common.internal.C.i(this.f10636a, c0990m.f10636a) && com.google.android.gms.common.internal.C.i(this.f10637b, c0990m.f10637b) && com.google.android.gms.common.internal.C.i(this.f10638c, c0990m.f10638c) && com.google.android.gms.common.internal.C.i(c(), c0990m.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10636a, this.f10637b, this.f10638c, c()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        EnumC0980c enumC0980c = this.f10636a;
        S0.f.n0(parcel, 2, enumC0980c == null ? null : enumC0980c.f10605a, false);
        Boolean bool = this.f10637b;
        if (bool != null) {
            S0.f.u0(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        V v4 = this.f10638c;
        S0.f.n0(parcel, 4, v4 == null ? null : v4.f10594a, false);
        S0.f.n0(parcel, 5, c() != null ? c().f10580a : null, false);
        S0.f.w0(iV0, parcel);
    }
}
