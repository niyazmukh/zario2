package E2;

import A2.C0009i;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.SparseArray;
import b2.C0276o;
import com.google.protobuf.AbstractC0409l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: E2.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\g.1.smali */
public final class C0104g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1447b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1448c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1449d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1450e;

    public C0104g(AbstractC0409l abstractC0409l, int i, int i5) {
        this.f1446a = 0;
        if (i < 0 || i >= 8) {
            throw new IllegalArgumentException(B.a.g(i, "Invalid padding: "));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(B.a.g(i5, "Invalid hash count: "));
        }
        if (abstractC0409l.size() > 0 && i5 == 0) {
            throw new IllegalArgumentException(B.a.g(i5, "Invalid hash count: "));
        }
        if (abstractC0409l.size() == 0 && i != 0) {
            throw new IllegalArgumentException(B.a.g(i, "Expected padding of 0 when bitmap length is 0, but got "));
        }
        this.f1449d = abstractC0409l;
        this.f1448c = i5;
        this.f1447b = (abstractC0409l.size() * 8) - i;
        try {
            this.f1450e = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e5);
        }
    }

    public static C0104g a(AbstractC0409l abstractC0409l, int i, int i5) {
        if (i < 0 || i >= 8) {
            throw new C0103f(B.a.g(i, "Invalid padding: "));
        }
        if (i5 < 0) {
            throw new C0103f(B.a.g(i5, "Invalid hash count: "));
        }
        if (abstractC0409l.size() > 0 && i5 == 0) {
            throw new C0103f(B.a.g(i5, "Invalid hash count: "));
        }
        if (abstractC0409l.size() != 0 || i == 0) {
            return new C0104g(abstractC0409l, i, i5);
        }
        throw new C0103f(B.a.g(i, "Expected padding of 0 when bitmap length is 0, but got "));
    }

    public static long b(byte[] bArr, int i) {
        long j5 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            j5 |= (bArr[i + i5] & 255) << (i5 * 8);
        }
        return j5;
    }

    public String toString() {
        switch (this.f1446a) {
            case 0:
                return "BloomFilter{hashCount=" + this.f1448c + ", size=" + this.f1447b + ", bitmap=\"" + Base64.encodeToString(((AbstractC0409l) this.f1449d).u(), 2) + "\"}";
            default:
                return super.toString();
        }
    }

    public C0104g(C0276o c0276o, C0009i c0009i) {
        this.f1446a = 1;
        this.f1449d = new SparseArray();
        this.f1450e = c0276o;
        TypedArray typedArray = (TypedArray) c0009i.f205c;
        this.f1447b = typedArray.getResourceId(28, 0);
        this.f1448c = typedArray.getResourceId(52, 0);
    }
}
