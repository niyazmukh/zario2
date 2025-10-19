package c0;

import d0.C0442a;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\n.smali */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f5369d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f5370a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.i f5371b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5372c = 0;

    public n(S0.i iVar, int i) {
        this.f5371b = iVar;
        this.f5370a = i;
    }

    public final int a(int i) {
        C0442a c0442aC = c();
        int iA = c0442aC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0442aC.f2436d;
        int i5 = iA + c0442aC.f2433a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i5) + i5 + 4);
    }

    public final int b() {
        C0442a c0442aC = c();
        int iA = c0442aC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i = iA + c0442aC.f2433a;
        return ((ByteBuffer) c0442aC.f2436d).getInt(((ByteBuffer) c0442aC.f2436d).getInt(i) + i);
    }

    public final C0442a c() {
        ThreadLocal threadLocal = f5369d;
        C0442a c0442a = (C0442a) threadLocal.get();
        if (c0442a == null) {
            c0442a = new C0442a();
            threadLocal.set(c0442a);
        }
        d0.b bVar = (d0.b) this.f5371b.f2858a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i = iA + bVar.f2433a;
            int i5 = (this.f5370a * 4) + ((ByteBuffer) bVar.f2436d).getInt(i) + i + 4;
            int i6 = ((ByteBuffer) bVar.f2436d).getInt(i5) + i5;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f2436d;
            c0442a.f2436d = byteBuffer;
            if (byteBuffer != null) {
                c0442a.f2433a = i6;
                int i7 = i6 - byteBuffer.getInt(i6);
                c0442a.f2434b = i7;
                c0442a.f2435c = ((ByteBuffer) c0442a.f2436d).getShort(i7);
            } else {
                c0442a.f2433a = 0;
                c0442a.f2434b = 0;
                c0442a.f2435c = 0;
            }
        }
        return c0442a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0442a c0442aC = c();
        int iA = c0442aC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) c0442aC.f2436d).getInt(iA + c0442aC.f2433a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
