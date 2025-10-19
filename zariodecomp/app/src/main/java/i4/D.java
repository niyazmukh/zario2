package i4;

import com.google.protobuf.AbstractC0417p;
import f4.C0516n;
import j4.AbstractC0633c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\D.smali */
public final class D extends AbstractC0633c {

    /* renamed from: a, reason: collision with root package name */
    public long f7877a;

    /* renamed from: b, reason: collision with root package name */
    public C0516n f7878b;

    @Override // j4.AbstractC0633c
    public final boolean a(AbstractC0417p abstractC0417p) {
        B b5 = (B) abstractC0417p;
        if (this.f7877a >= 0) {
            return false;
        }
        long j5 = b5.f7870l;
        if (j5 < b5.f7871m) {
            b5.f7871m = j5;
        }
        this.f7877a = j5;
        return true;
    }

    @Override // j4.AbstractC0633c
    public final O3.d[] b(AbstractC0417p abstractC0417p) {
        long j5 = this.f7877a;
        this.f7877a = -1L;
        this.f7878b = null;
        return ((B) abstractC0417p).W(j5);
    }
}
