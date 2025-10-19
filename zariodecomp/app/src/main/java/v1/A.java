package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\A.smali */
public final class A extends AbstractC0596a {
    public static final Parcelable.Creator<A> CREATOR = new O(10);

    /* renamed from: a, reason: collision with root package name */
    public final E f10556a;

    /* renamed from: b, reason: collision with root package name */
    public final r f10557b;

    public A(String str, int i) {
        com.google.android.gms.common.internal.C.f(str);
        try {
            this.f10556a = E.b(str);
            try {
                this.f10557b = r.b(i);
            } catch (C0993q e5) {
                throw new IllegalArgumentException(e5);
            }
        } catch (D e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a5 = (A) obj;
        return this.f10556a.equals(a5.f10556a) && this.f10557b.equals(a5.f10557b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10556a, this.f10557b});
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, v1.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        this.f10556a.getClass();
        S0.f.n0(parcel, 2, "public-key", false);
        S0.f.j0(parcel, 3, Integer.valueOf(this.f10557b.f10643a.a()));
        S0.f.w0(iV0, parcel);
    }
}
