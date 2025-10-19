package z2;

import B2.h;
import F2.s;
import java.util.Arrays;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z2.1\a.smali */
public final class C1070a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f11214a;

    /* renamed from: b, reason: collision with root package name */
    public final h f11215b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11216c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11217d;

    public C1070a(int i, h hVar, byte[] bArr, byte[] bArr2) {
        this.f11214a = i;
        if (hVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f11215b = hVar;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f11216c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f11217d = bArr2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1070a c1070a = (C1070a) obj;
        int iCompare = Integer.compare(this.f11214a, c1070a.f11214a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f11215b.compareTo(c1070a.f11215b);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iB = s.b(this.f11216c, c1070a.f11216c);
        return iB != 0 ? iB : s.b(this.f11217d, c1070a.f11217d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1070a)) {
            return false;
        }
        C1070a c1070a = (C1070a) obj;
        return this.f11214a == c1070a.f11214a && this.f11215b.equals(c1070a.f11215b) && Arrays.equals(this.f11216c, c1070a.f11216c) && Arrays.equals(this.f11217d, c1070a.f11217d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11217d) ^ ((((((this.f11214a ^ 1000003) * 1000003) ^ this.f11215b.f315a.hashCode()) * 1000003) ^ Arrays.hashCode(this.f11216c)) * 1000003);
    }

    public final String toString() {
        return "IndexEntry{indexId=" + this.f11214a + ", documentKey=" + this.f11215b + ", arrayValue=" + Arrays.toString(this.f11216c) + ", directionalValue=" + Arrays.toString(this.f11217d) + "}";
    }
}
