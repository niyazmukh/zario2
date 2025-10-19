package androidx.datastore.preferences.protobuf;

import a.AbstractC0183a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\g.1.smali */
public class C0204g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0204g f4493c = new C0204g(AbstractC0220x.f4564b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0202e f4494d;

    /* renamed from: a, reason: collision with root package name */
    public int f4495a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4496b;

    static {
        f4494d = AbstractC0200c.a() ? new C0202e(1) : new C0202e(0);
    }

    public C0204g(byte[] bArr) {
        bArr.getClass();
        this.f4496b = bArr;
    }

    public static int g(int i, int i5, int i6) {
        int i7 = i5 - i;
        if ((i | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(B.a.i("Beginning index: ", i, " < 0"));
        }
        if (i5 < i) {
            throw new IndexOutOfBoundsException(B.a.h("Beginning index larger than ending index: ", i, i5, ", "));
        }
        throw new IndexOutOfBoundsException(B.a.h("End index: ", i5, i6, " >= "));
    }

    public static C0204g h(byte[] bArr, int i, int i5) {
        byte[] bArrCopyOfRange;
        g(i, i + i5, bArr.length);
        switch (f4494d.f4489a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i5 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i5];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i5);
                break;
        }
        return new C0204g(bArrCopyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0204g) || size() != ((C0204g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0204g)) {
            return obj.equals(this);
        }
        C0204g c0204g = (C0204g) obj;
        int i = this.f4495a;
        int i5 = c0204g.f4495a;
        if (i != 0 && i5 != 0 && i != i5) {
            return false;
        }
        int size = size();
        if (size > c0204g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0204g.size()) {
            StringBuilder sbN = B.a.n("Ran off end of other: 0, ", size, ", ");
            sbN.append(c0204g.size());
            throw new IllegalArgumentException(sbN.toString());
        }
        int iJ = j() + size;
        int iJ2 = j();
        int iJ3 = c0204g.j();
        while (iJ2 < iJ) {
            if (this.f4496b[iJ2] != c0204g.f4496b[iJ3]) {
                return false;
            }
            iJ2++;
            iJ3++;
        }
        return true;
    }

    public byte f(int i) {
        return this.f4496b[i];
    }

    public final int hashCode() {
        int i = this.f4495a;
        if (i == 0) {
            int size = size();
            int iJ = j();
            int i5 = size;
            for (int i6 = iJ; i6 < iJ + size; i6++) {
                i5 = (i5 * 31) + this.f4496b[i6];
            }
            i = i5 == 0 ? 1 : i5;
            this.f4495a = i;
        }
        return i;
    }

    public void i(byte[] bArr, int i) {
        System.arraycopy(this.f4496b, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0201d(this);
    }

    public int j() {
        return 0;
    }

    public byte k(int i) {
        return this.f4496b[i];
    }

    public int size() {
        return this.f4496b.length;
    }

    public final String toString() {
        C0204g c0203f;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC0183a.y(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iG = g(0, 47, size());
            if (iG == 0) {
                c0203f = f4493c;
            } else {
                c0203f = new C0203f(this.f4496b, j(), iG);
            }
            sb.append(AbstractC0183a.y(c0203f));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return B.a.m(sb2, string, "\">");
    }
}
