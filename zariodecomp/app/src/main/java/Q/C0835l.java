package q;

/* renamed from: q.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\l.smali */
public final class C0835l implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f9429e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f9430a = false;

    /* renamed from: b, reason: collision with root package name */
    public int[] f9431b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9432c;

    /* renamed from: d, reason: collision with root package name */
    public int f9433d;

    public C0835l() {
        int i;
        int i5 = 4;
        while (true) {
            i = 40;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (40 <= i6) {
                i = i6;
                break;
            }
            i5++;
        }
        int i7 = i / 4;
        this.f9431b = new int[i7];
        this.f9432c = new Object[i7];
    }

    public final void a(int i, Object obj) {
        int i5 = this.f9433d;
        if (i5 != 0 && i <= this.f9431b[i5 - 1]) {
            e(i, obj);
            return;
        }
        if (this.f9430a && i5 >= this.f9431b.length) {
            b();
        }
        int i6 = this.f9433d;
        if (i6 >= this.f9431b.length) {
            int i7 = (i6 + 1) * 4;
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
            int i10 = i7 / 4;
            int[] iArr = new int[i10];
            Object[] objArr = new Object[i10];
            int[] iArr2 = this.f9431b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f9432c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f9431b = iArr;
            this.f9432c = objArr;
        }
        this.f9431b[i6] = i;
        this.f9432c[i6] = obj;
        this.f9433d = i6 + 1;
    }

    public final void b() {
        int i = this.f9433d;
        int[] iArr = this.f9431b;
        Object[] objArr = this.f9432c;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != f9429e) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f9430a = false;
        this.f9433d = i5;
    }

    public final Object c(int i, Integer num) {
        Object obj;
        int iA = AbstractC0827d.a(this.f9433d, i, this.f9431b);
        return (iA < 0 || (obj = this.f9432c[iA]) == f9429e) ? num : obj;
    }

    public final Object clone() {
        try {
            C0835l c0835l = (C0835l) super.clone();
            c0835l.f9431b = (int[]) this.f9431b.clone();
            c0835l.f9432c = (Object[]) this.f9432c.clone();
            return c0835l;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final int d(int i) {
        if (this.f9430a) {
            b();
        }
        return this.f9431b[i];
    }

    public final void e(int i, Object obj) {
        int iA = AbstractC0827d.a(this.f9433d, i, this.f9431b);
        if (iA >= 0) {
            this.f9432c[iA] = obj;
            return;
        }
        int i5 = ~iA;
        int i6 = this.f9433d;
        if (i5 < i6) {
            Object[] objArr = this.f9432c;
            if (objArr[i5] == f9429e) {
                this.f9431b[i5] = i;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f9430a && i6 >= this.f9431b.length) {
            b();
            i5 = ~AbstractC0827d.a(this.f9433d, i, this.f9431b);
        }
        int i7 = this.f9433d;
        if (i7 >= this.f9431b.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArr = new int[i11];
            Object[] objArr2 = new Object[i11];
            int[] iArr2 = this.f9431b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f9432c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9431b = iArr;
            this.f9432c = objArr2;
        }
        int i12 = this.f9433d - i5;
        if (i12 != 0) {
            int[] iArr3 = this.f9431b;
            int i13 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i13, i12);
            Object[] objArr4 = this.f9432c;
            System.arraycopy(objArr4, i5, objArr4, i13, this.f9433d - i5);
        }
        this.f9431b[i5] = i;
        this.f9432c[i5] = obj;
        this.f9433d++;
    }

    public final int f() {
        if (this.f9430a) {
            b();
        }
        return this.f9433d;
    }

    public final Object g(int i) {
        if (this.f9430a) {
            b();
        }
        return this.f9432c[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9433d * 28);
        sb.append('{');
        for (int i = 0; i < this.f9433d; i++) {
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
}
