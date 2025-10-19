package t;

import S0.n;
import java.util.Arrays;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t.1\a.smali */
public final class C0890a implements InterfaceC0891b {

    /* renamed from: b, reason: collision with root package name */
    public final C0892c f9822b;

    /* renamed from: c, reason: collision with root package name */
    public final n f9823c;

    /* renamed from: a, reason: collision with root package name */
    public int f9821a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9824d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f9825e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f9826f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f9827g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9828j = false;

    public C0890a(C0892c c0892c, n nVar) {
        this.f9822b = c0892c;
        this.f9823c = nVar;
    }

    @Override // t.InterfaceC0891b
    public final float a(int i) {
        int i5 = this.h;
        for (int i6 = 0; i5 != -1 && i6 < this.f9821a; i6++) {
            if (i6 == i) {
                return this.f9827g[i5];
            }
            i5 = this.f9826f[i5];
        }
        return 0.0f;
    }

    @Override // t.InterfaceC0891b
    public final float b(C0892c c0892c, boolean z4) {
        float fG = g(c0892c.f9829a);
        c(c0892c.f9829a, z4);
        InterfaceC0891b interfaceC0891b = c0892c.f9832d;
        int iK = interfaceC0891b.k();
        for (int i = 0; i < iK; i++) {
            i iVarE = interfaceC0891b.e(i);
            i(iVarE, interfaceC0891b.g(iVarE) * fG, z4);
        }
        return fG;
    }

    @Override // t.InterfaceC0891b
    public final float c(i iVar, boolean z4) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i != -1 && i5 < this.f9821a) {
            if (this.f9825e[i] == iVar.f9854b) {
                if (i == this.h) {
                    this.h = this.f9826f[i];
                } else {
                    int[] iArr = this.f9826f;
                    iArr[i6] = iArr[i];
                }
                if (z4) {
                    iVar.b(this.f9822b);
                }
                iVar.f9861k--;
                this.f9821a--;
                this.f9825e[i] = -1;
                if (this.f9828j) {
                    this.i = i;
                }
                return this.f9827g[i];
            }
            i5++;
            i6 = i;
            i = this.f9826f[i];
        }
        return 0.0f;
    }

    @Override // t.InterfaceC0891b
    public final void clear() {
        int i = this.h;
        for (int i5 = 0; i != -1 && i5 < this.f9821a; i5++) {
            i iVar = ((i[]) this.f9823c.f2875d)[this.f9825e[i]];
            if (iVar != null) {
                iVar.b(this.f9822b);
            }
            i = this.f9826f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f9828j = false;
        this.f9821a = 0;
    }

    @Override // t.InterfaceC0891b
    public final boolean d(i iVar) {
        int i = this.h;
        if (i == -1) {
            return false;
        }
        for (int i5 = 0; i != -1 && i5 < this.f9821a; i5++) {
            if (this.f9825e[i] == iVar.f9854b) {
                return true;
            }
            i = this.f9826f[i];
        }
        return false;
    }

    @Override // t.InterfaceC0891b
    public final i e(int i) {
        int i5 = this.h;
        for (int i6 = 0; i5 != -1 && i6 < this.f9821a; i6++) {
            if (i6 == i) {
                return ((i[]) this.f9823c.f2875d)[this.f9825e[i5]];
            }
            i5 = this.f9826f[i5];
        }
        return null;
    }

    @Override // t.InterfaceC0891b
    public final void f(i iVar, float f2) {
        if (f2 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i = this.h;
        C0892c c0892c = this.f9822b;
        if (i == -1) {
            this.h = 0;
            this.f9827g[0] = f2;
            this.f9825e[0] = iVar.f9854b;
            this.f9826f[0] = -1;
            iVar.f9861k++;
            iVar.a(c0892c);
            this.f9821a++;
            if (this.f9828j) {
                return;
            }
            int i5 = this.i + 1;
            this.i = i5;
            int[] iArr = this.f9825e;
            if (i5 >= iArr.length) {
                this.f9828j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i != -1 && i7 < this.f9821a; i7++) {
            int i8 = this.f9825e[i];
            int i9 = iVar.f9854b;
            if (i8 == i9) {
                this.f9827g[i] = f2;
                return;
            }
            if (i8 < i9) {
                i6 = i;
            }
            i = this.f9826f[i];
        }
        int length = this.i;
        int i10 = length + 1;
        if (this.f9828j) {
            int[] iArr2 = this.f9825e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i10;
        }
        int[] iArr3 = this.f9825e;
        if (length >= iArr3.length && this.f9821a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f9825e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    length = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f9825e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i12 = this.f9824d * 2;
            this.f9824d = i12;
            this.f9828j = false;
            this.i = length - 1;
            this.f9827g = Arrays.copyOf(this.f9827g, i12);
            this.f9825e = Arrays.copyOf(this.f9825e, this.f9824d);
            this.f9826f = Arrays.copyOf(this.f9826f, this.f9824d);
        }
        this.f9825e[length] = iVar.f9854b;
        this.f9827g[length] = f2;
        if (i6 != -1) {
            int[] iArr6 = this.f9826f;
            iArr6[length] = iArr6[i6];
            iArr6[i6] = length;
        } else {
            this.f9826f[length] = this.h;
            this.h = length;
        }
        iVar.f9861k++;
        iVar.a(c0892c);
        int i13 = this.f9821a + 1;
        this.f9821a = i13;
        if (!this.f9828j) {
            this.i++;
        }
        int[] iArr7 = this.f9825e;
        if (i13 >= iArr7.length) {
            this.f9828j = true;
        }
        if (this.i >= iArr7.length) {
            this.f9828j = true;
            this.i = iArr7.length - 1;
        }
    }

    @Override // t.InterfaceC0891b
    public final float g(i iVar) {
        int i = this.h;
        for (int i5 = 0; i != -1 && i5 < this.f9821a; i5++) {
            if (this.f9825e[i] == iVar.f9854b) {
                return this.f9827g[i];
            }
            i = this.f9826f[i];
        }
        return 0.0f;
    }

    @Override // t.InterfaceC0891b
    public final void h(float f2) {
        int i = this.h;
        for (int i5 = 0; i != -1 && i5 < this.f9821a; i5++) {
            float[] fArr = this.f9827g;
            fArr[i] = fArr[i] / f2;
            i = this.f9826f[i];
        }
    }

    @Override // t.InterfaceC0891b
    public final void i(i iVar, float f2, boolean z4) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0892c c0892c = this.f9822b;
            if (i == -1) {
                this.h = 0;
                this.f9827g[0] = f2;
                this.f9825e[0] = iVar.f9854b;
                this.f9826f[0] = -1;
                iVar.f9861k++;
                iVar.a(c0892c);
                this.f9821a++;
                if (this.f9828j) {
                    return;
                }
                int i5 = this.i + 1;
                this.i = i5;
                int[] iArr = this.f9825e;
                if (i5 >= iArr.length) {
                    this.f9828j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i != -1 && i7 < this.f9821a; i7++) {
                int i8 = this.f9825e[i];
                int i9 = iVar.f9854b;
                if (i8 == i9) {
                    float[] fArr = this.f9827g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f9826f[i];
                        } else {
                            int[] iArr2 = this.f9826f;
                            iArr2[i6] = iArr2[i];
                        }
                        if (z4) {
                            iVar.b(c0892c);
                        }
                        if (this.f9828j) {
                            this.i = i;
                        }
                        iVar.f9861k--;
                        this.f9821a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i6 = i;
                }
                i = this.f9826f[i];
            }
            int length = this.i;
            int i10 = length + 1;
            if (this.f9828j) {
                int[] iArr3 = this.f9825e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i10;
            }
            int[] iArr4 = this.f9825e;
            if (length >= iArr4.length && this.f9821a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f9825e;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        length = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f9825e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i12 = this.f9824d * 2;
                this.f9824d = i12;
                this.f9828j = false;
                this.i = length - 1;
                this.f9827g = Arrays.copyOf(this.f9827g, i12);
                this.f9825e = Arrays.copyOf(this.f9825e, this.f9824d);
                this.f9826f = Arrays.copyOf(this.f9826f, this.f9824d);
            }
            this.f9825e[length] = iVar.f9854b;
            this.f9827g[length] = f2;
            if (i6 != -1) {
                int[] iArr7 = this.f9826f;
                iArr7[length] = iArr7[i6];
                iArr7[i6] = length;
            } else {
                this.f9826f[length] = this.h;
                this.h = length;
            }
            iVar.f9861k++;
            iVar.a(c0892c);
            this.f9821a++;
            if (!this.f9828j) {
                this.i++;
            }
            int i13 = this.i;
            int[] iArr8 = this.f9825e;
            if (i13 >= iArr8.length) {
                this.f9828j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    @Override // t.InterfaceC0891b
    public final void j() {
        int i = this.h;
        for (int i5 = 0; i != -1 && i5 < this.f9821a; i5++) {
            float[] fArr = this.f9827g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f9826f[i];
        }
    }

    @Override // t.InterfaceC0891b
    public final int k() {
        return this.f9821a;
    }

    public final String toString() {
        int i = this.h;
        String string = "";
        for (int i5 = 0; i != -1 && i5 < this.f9821a; i5++) {
            StringBuilder sbB = h.b(B.a.k(string, " -> "));
            sbB.append(this.f9827g[i]);
            sbB.append(" : ");
            StringBuilder sbB2 = h.b(sbB.toString());
            sbB2.append(((i[]) this.f9823c.f2875d)[this.f9825e[i]]);
            string = sbB2.toString();
            i = this.f9826f[i];
        }
        return string;
    }
}
