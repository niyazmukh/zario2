package q;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\e.smali */
public final class C0828e implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f9405e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f9406a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f9407b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9408c;

    /* renamed from: d, reason: collision with root package name */
    public int f9409d;

    public C0828e() {
        this(10);
    }

    public final void a() {
        int i = this.f9409d;
        Object[] objArr = this.f9408c;
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = null;
        }
        this.f9409d = 0;
        this.f9406a = false;
    }

    public final void b() {
        int i = this.f9409d;
        long[] jArr = this.f9407b;
        Object[] objArr = this.f9408c;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != f9405e) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f9406a = false;
        this.f9409d = i5;
    }

    public final Object c(long j5, Long l4) {
        Object obj;
        int iB = AbstractC0827d.b(this.f9407b, this.f9409d, j5);
        return (iB < 0 || (obj = this.f9408c[iB]) == f9405e) ? l4 : obj;
    }

    public final Object clone() {
        try {
            C0828e c0828e = (C0828e) super.clone();
            c0828e.f9407b = (long[]) this.f9407b.clone();
            c0828e.f9408c = (Object[]) this.f9408c.clone();
            return c0828e;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final long d(int i) {
        if (this.f9406a) {
            b();
        }
        return this.f9407b[i];
    }

    public final void e(Object obj, long j5) {
        int iB = AbstractC0827d.b(this.f9407b, this.f9409d, j5);
        if (iB >= 0) {
            this.f9408c[iB] = obj;
            return;
        }
        int i = ~iB;
        int i5 = this.f9409d;
        if (i < i5) {
            Object[] objArr = this.f9408c;
            if (objArr[i] == f9405e) {
                this.f9407b[i] = j5;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f9406a && i5 >= this.f9407b.length) {
            b();
            i = ~AbstractC0827d.b(this.f9407b, this.f9409d, j5);
        }
        int i6 = this.f9409d;
        if (i6 >= this.f9407b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] jArr = new long[i10];
            Object[] objArr2 = new Object[i10];
            long[] jArr2 = this.f9407b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f9408c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9407b = jArr;
            this.f9408c = objArr2;
        }
        int i11 = this.f9409d - i;
        if (i11 != 0) {
            long[] jArr3 = this.f9407b;
            int i12 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i12, i11);
            Object[] objArr4 = this.f9408c;
            System.arraycopy(objArr4, i, objArr4, i12, this.f9409d - i);
        }
        this.f9407b[i] = j5;
        this.f9408c[i] = obj;
        this.f9409d++;
    }

    public final int f() {
        if (this.f9406a) {
            b();
        }
        return this.f9409d;
    }

    public final Object g(int i) {
        if (this.f9406a) {
            b();
        }
        return this.f9408c[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9409d * 28);
        sb.append('{');
        for (int i = 0; i < this.f9409d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(d(i));
            sb.append('=');
            Object objG = g(i);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0828e(int i) {
        this.f9406a = false;
        if (i == 0) {
            this.f9407b = AbstractC0827d.f9403b;
            this.f9408c = AbstractC0827d.f9404c;
            return;
        }
        int i5 = i * 8;
        int i6 = 4;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (i5 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 8;
        this.f9407b = new long[i8];
        this.f9408c = new Object[i8];
    }
}
