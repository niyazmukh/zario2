package i4;

import f4.C0516n;
import f4.P;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\z.smali */
public final class z implements P {

    /* renamed from: a, reason: collision with root package name */
    public final B f7965a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7966b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7967c;

    /* renamed from: d, reason: collision with root package name */
    public final C0516n f7968d;

    public z(B b5, long j5, Object obj, C0516n c0516n) {
        this.f7965a = b5;
        this.f7966b = j5;
        this.f7967c = obj;
        this.f7968d = c0516n;
    }

    @Override // f4.P
    public final void a() {
        B b5 = this.f7965a;
        synchronized (b5) {
            if (this.f7966b < b5.P()) {
                return;
            }
            Object[] objArr = b5.f7869k;
            kotlin.jvm.internal.i.b(objArr);
            long j5 = this.f7966b;
            if (objArr[((int) j5) & (objArr.length - 1)] != this) {
                return;
            }
            C.d(objArr, j5, C.f7874a);
            b5.K();
        }
    }
}
