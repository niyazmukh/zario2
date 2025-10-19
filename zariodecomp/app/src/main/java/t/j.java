package t;

import S0.n;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t.1\j.smali */
public final class j implements InterfaceC0891b {

    /* renamed from: a, reason: collision with root package name */
    public int f9863a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9864b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f9865c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f9866d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public float[] f9867e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f9868f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public int[] f9869g = new int[16];
    public int h = 0;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final C0893d f9870j;

    /* renamed from: k, reason: collision with root package name */
    public final n f9871k;

    public j(C0893d c0893d, n nVar) {
        this.f9870j = c0893d;
        this.f9871k = nVar;
        clear();
    }

    @Override // t.InterfaceC0891b
    public final float a(int i) {
        int i5 = this.h;
        int i6 = this.i;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i) {
                return this.f9867e[i6];
            }
            i6 = this.f9869g[i6];
            if (i6 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // t.InterfaceC0891b
    public final float b(C0892c c0892c, boolean z4) {
        float fG = g(c0892c.f9829a);
        c(c0892c.f9829a, z4);
        j jVar = (j) c0892c.f9832d;
        int i = jVar.h;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            int i7 = jVar.f9866d[i6];
            if (i7 != -1) {
                i(((i[]) this.f9871k.f2875d)[i7], jVar.f9867e[i6] * fG, z4);
                i5++;
            }
            i6++;
        }
        return fG;
    }

    @Override // t.InterfaceC0891b
    public final float c(i iVar, boolean z4) {
        int[] iArr;
        int i;
        int iN = n(iVar);
        if (iN == -1) {
            return 0.0f;
        }
        int i5 = iVar.f9854b;
        int i6 = i5 % 16;
        int[] iArr2 = this.f9864b;
        int i7 = iArr2[i6];
        if (i7 != -1) {
            if (this.f9866d[i7] == i5) {
                int[] iArr3 = this.f9865c;
                iArr2[i6] = iArr3[i7];
                iArr3[i7] = -1;
            } else {
                while (true) {
                    iArr = this.f9865c;
                    i = iArr[i7];
                    if (i == -1 || this.f9866d[i] == i5) {
                        break;
                    }
                    i7 = i;
                }
                if (i != -1 && this.f9866d[i] == i5) {
                    iArr[i7] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f2 = this.f9867e[iN];
        if (this.i == iN) {
            this.i = this.f9869g[iN];
        }
        this.f9866d[iN] = -1;
        int[] iArr4 = this.f9868f;
        int i8 = iArr4[iN];
        if (i8 != -1) {
            int[] iArr5 = this.f9869g;
            iArr5[i8] = iArr5[iN];
        }
        int i9 = this.f9869g[iN];
        if (i9 != -1) {
            iArr4[i9] = iArr4[iN];
        }
        this.h--;
        iVar.f9861k--;
        if (z4) {
            iVar.b(this.f9870j);
        }
        return f2;
    }

    @Override // t.InterfaceC0891b
    public final void clear() {
        int i = this.h;
        for (int i5 = 0; i5 < i; i5++) {
            i iVarE = e(i5);
            if (iVarE != null) {
                iVarE.b(this.f9870j);
            }
        }
        for (int i6 = 0; i6 < this.f9863a; i6++) {
            this.f9866d[i6] = -1;
            this.f9865c[i6] = -1;
        }
        for (int i7 = 0; i7 < 16; i7++) {
            this.f9864b[i7] = -1;
        }
        this.h = 0;
        this.i = -1;
    }

    @Override // t.InterfaceC0891b
    public final boolean d(i iVar) {
        return n(iVar) != -1;
    }

    @Override // t.InterfaceC0891b
    public final i e(int i) {
        int i5 = this.h;
        if (i5 == 0) {
            return null;
        }
        int i6 = this.i;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i && i6 != -1) {
                return ((i[]) this.f9871k.f2875d)[this.f9866d[i6]];
            }
            i6 = this.f9869g[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // t.InterfaceC0891b
    public final void f(i iVar, float f2) {
        if (f2 > -0.001f && f2 < 0.001f) {
            c(iVar, true);
            return;
        }
        int i = 0;
        if (this.h == 0) {
            m(0, iVar, f2);
            l(iVar, 0);
            this.i = 0;
            return;
        }
        int iN = n(iVar);
        if (iN != -1) {
            this.f9867e[iN] = f2;
            return;
        }
        int i5 = this.h + 1;
        int i6 = this.f9863a;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            this.f9866d = Arrays.copyOf(this.f9866d, i7);
            this.f9867e = Arrays.copyOf(this.f9867e, i7);
            this.f9868f = Arrays.copyOf(this.f9868f, i7);
            this.f9869g = Arrays.copyOf(this.f9869g, i7);
            this.f9865c = Arrays.copyOf(this.f9865c, i7);
            for (int i8 = this.f9863a; i8 < i7; i8++) {
                this.f9866d[i8] = -1;
                this.f9865c[i8] = -1;
            }
            this.f9863a = i7;
        }
        int i9 = this.h;
        int i10 = this.i;
        int i11 = -1;
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = this.f9866d[i10];
            int i14 = iVar.f9854b;
            if (i13 == i14) {
                this.f9867e[i10] = f2;
                return;
            }
            if (i13 < i14) {
                i11 = i10;
            }
            i10 = this.f9869g[i10];
            if (i10 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f9863a) {
                i = -1;
                break;
            } else if (this.f9866d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m(i, iVar, f2);
        if (i11 != -1) {
            this.f9868f[i] = i11;
            int[] iArr = this.f9869g;
            iArr[i] = iArr[i11];
            iArr[i11] = i;
        } else {
            this.f9868f[i] = -1;
            if (this.h > 0) {
                this.f9869g[i] = this.i;
                this.i = i;
            } else {
                this.f9869g[i] = -1;
            }
        }
        int i15 = this.f9869g[i];
        if (i15 != -1) {
            this.f9868f[i15] = i;
        }
        l(iVar, i);
    }

    @Override // t.InterfaceC0891b
    public final float g(i iVar) {
        int iN = n(iVar);
        if (iN != -1) {
            return this.f9867e[iN];
        }
        return 0.0f;
    }

    @Override // t.InterfaceC0891b
    public final void h(float f2) {
        int i = this.h;
        int i5 = this.i;
        for (int i6 = 0; i6 < i; i6++) {
            float[] fArr = this.f9867e;
            fArr[i5] = fArr[i5] / f2;
            i5 = this.f9869g[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // t.InterfaceC0891b
    public final void i(i iVar, float f2, boolean z4) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int iN = n(iVar);
            if (iN == -1) {
                f(iVar, f2);
                return;
            }
            float[] fArr = this.f9867e;
            float f3 = fArr[iN] + f2;
            fArr[iN] = f3;
            if (f3 <= -0.001f || f3 >= 0.001f) {
                return;
            }
            fArr[iN] = 0.0f;
            c(iVar, z4);
        }
    }

    @Override // t.InterfaceC0891b
    public final void j() {
        int i = this.h;
        int i5 = this.i;
        for (int i6 = 0; i6 < i; i6++) {
            float[] fArr = this.f9867e;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.f9869g[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // t.InterfaceC0891b
    public final int k() {
        return this.h;
    }

    public final void l(i iVar, int i) {
        int[] iArr;
        int i5 = iVar.f9854b % 16;
        int[] iArr2 = this.f9864b;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            iArr2[i5] = i;
        } else {
            while (true) {
                iArr = this.f9865c;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                } else {
                    i6 = i7;
                }
            }
            iArr[i6] = i;
        }
        this.f9865c[i] = -1;
    }

    public final void m(int i, i iVar, float f2) {
        this.f9866d[i] = iVar.f9854b;
        this.f9867e[i] = f2;
        this.f9868f[i] = -1;
        this.f9869g[i] = -1;
        iVar.a(this.f9870j);
        iVar.f9861k++;
        this.h++;
    }

    public final int n(i iVar) {
        if (this.h == 0) {
            return -1;
        }
        int i = iVar.f9854b;
        int i5 = this.f9864b[i % 16];
        if (i5 == -1) {
            return -1;
        }
        if (this.f9866d[i5] == i) {
            return i5;
        }
        do {
            i5 = this.f9865c[i5];
            if (i5 == -1) {
                break;
            }
        } while (this.f9866d[i5] != i);
        if (i5 != -1 && this.f9866d[i5] == i) {
            return i5;
        }
        return -1;
    }

    public final String toString() {
        String strK;
        String strK2;
        String strK3 = hashCode() + " { ";
        int i = this.h;
        for (int i5 = 0; i5 < i; i5++) {
            i iVarE = e(i5);
            if (iVarE != null) {
                String str = strK3 + iVarE + " = " + a(i5) + " ";
                int iN = n(iVarE);
                String strK4 = B.a.k(str, "[p: ");
                int i6 = this.f9868f[iN];
                n nVar = this.f9871k;
                if (i6 != -1) {
                    StringBuilder sbB = h.b(strK4);
                    sbB.append(((i[]) nVar.f2875d)[this.f9866d[this.f9868f[iN]]]);
                    strK = sbB.toString();
                } else {
                    strK = B.a.k(strK4, "none");
                }
                String strK5 = B.a.k(strK, ", n: ");
                if (this.f9869g[iN] != -1) {
                    StringBuilder sbB2 = h.b(strK5);
                    sbB2.append(((i[]) nVar.f2875d)[this.f9866d[this.f9869g[iN]]]);
                    strK2 = sbB2.toString();
                } else {
                    strK2 = B.a.k(strK5, "none");
                }
                strK3 = B.a.k(strK2, "]");
            }
        }
        return B.a.k(strK3, " }");
    }
}
