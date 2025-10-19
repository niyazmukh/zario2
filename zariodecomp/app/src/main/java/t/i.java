package t;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t.1\i.smali */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9853a;

    /* renamed from: e, reason: collision with root package name */
    public float f9857e;

    /* renamed from: l, reason: collision with root package name */
    public int f9862l;

    /* renamed from: b, reason: collision with root package name */
    public int f9854b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f9855c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f9856d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9858f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f9859g = new float[9];
    public final float[] h = new float[9];
    public C0892c[] i = new C0892c[16];

    /* renamed from: j, reason: collision with root package name */
    public int f9860j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f9861k = 0;

    public i(int i) {
        this.f9862l = i;
    }

    public final void a(C0892c c0892c) {
        int i = 0;
        while (true) {
            int i5 = this.f9860j;
            if (i >= i5) {
                C0892c[] c0892cArr = this.i;
                if (i5 >= c0892cArr.length) {
                    this.i = (C0892c[]) Arrays.copyOf(c0892cArr, c0892cArr.length * 2);
                }
                C0892c[] c0892cArr2 = this.i;
                int i6 = this.f9860j;
                c0892cArr2[i6] = c0892c;
                this.f9860j = i6 + 1;
                return;
            }
            if (this.i[i] == c0892c) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0892c c0892c) {
        int i = this.f9860j;
        int i5 = 0;
        while (i5 < i) {
            if (this.i[i5] == c0892c) {
                while (i5 < i - 1) {
                    C0892c[] c0892cArr = this.i;
                    int i6 = i5 + 1;
                    c0892cArr[i5] = c0892cArr[i6];
                    i5 = i6;
                }
                this.f9860j--;
                return;
            }
            i5++;
        }
    }

    public final void c() {
        this.f9862l = 5;
        this.f9856d = 0;
        this.f9854b = -1;
        this.f9855c = -1;
        this.f9857e = 0.0f;
        this.f9858f = false;
        int i = this.f9860j;
        for (int i5 = 0; i5 < i; i5++) {
            this.i[i5] = null;
        }
        this.f9860j = 0;
        this.f9861k = 0;
        this.f9853a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public final void d(C0892c c0892c) {
        int i = this.f9860j;
        for (int i5 = 0; i5 < i; i5++) {
            this.i[i5].h(c0892c, false);
        }
        this.f9860j = 0;
    }

    public final String toString() {
        return "" + this.f9854b;
    }
}
