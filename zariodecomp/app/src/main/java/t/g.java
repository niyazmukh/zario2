package t;

import Q1.l;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t.1\g.smali */
public final class g extends C0892c {

    /* renamed from: f, reason: collision with root package name */
    public i[] f9850f;

    /* renamed from: g, reason: collision with root package name */
    public i[] f9851g;
    public int h;
    public f i;

    @Override // t.C0892c
    public final i d(boolean[] zArr) {
        int i = -1;
        for (int i5 = 0; i5 < this.h; i5++) {
            i[] iVarArr = this.f9850f;
            i iVar = iVarArr[i5];
            if (!zArr[iVar.f9854b]) {
                f fVar = this.i;
                fVar.f9848a = iVar;
                int i6 = 8;
                if (i == -1) {
                    while (i6 >= 0) {
                        float f2 = fVar.f9848a.h[i6];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i5;
                                break;
                            }
                            i6--;
                        }
                    }
                } else {
                    i iVar2 = iVarArr[i];
                    while (true) {
                        if (i6 >= 0) {
                            float f3 = iVar2.h[i6];
                            float f5 = fVar.f9848a.h[i6];
                            if (f5 == f3) {
                                i6--;
                            } else if (f5 < f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f9850f[i];
    }

    @Override // t.C0892c
    public final void h(C0892c c0892c, boolean z4) {
        i iVar = c0892c.f9829a;
        if (iVar == null) {
            return;
        }
        InterfaceC0891b interfaceC0891b = c0892c.f9832d;
        int iK = interfaceC0891b.k();
        for (int i = 0; i < iK; i++) {
            i iVarE = interfaceC0891b.e(i);
            float fA = interfaceC0891b.a(i);
            f fVar = this.i;
            fVar.f9848a = iVarE;
            boolean z5 = iVarE.f9853a;
            float[] fArr = iVar.h;
            if (z5) {
                boolean z6 = true;
                for (int i5 = 0; i5 < 9; i5++) {
                    float[] fArr2 = fVar.f9848a.h;
                    float f2 = (fArr[i5] * fA) + fArr2[i5];
                    fArr2[i5] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        fVar.f9848a.h[i5] = 0.0f;
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    fVar.f9849b.j(fVar.f9848a);
                }
            } else {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f3 = fArr[i6];
                    if (f3 != 0.0f) {
                        float f5 = f3 * fA;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        fVar.f9848a.h[i6] = f5;
                    } else {
                        fVar.f9848a.h[i6] = 0.0f;
                    }
                }
                i(iVarE);
            }
            this.f9830b = (c0892c.f9830b * fA) + this.f9830b;
        }
        j(iVar);
    }

    public final void i(i iVar) {
        int i;
        int i5 = this.h + 1;
        i[] iVarArr = this.f9850f;
        if (i5 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f9850f = iVarArr2;
            this.f9851g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f9850f;
        int i6 = this.h;
        iVarArr3[i6] = iVar;
        int i7 = i6 + 1;
        this.h = i7;
        if (i7 > 1 && iVarArr3[i6].f9854b > iVar.f9854b) {
            int i8 = 0;
            while (true) {
                i = this.h;
                if (i8 >= i) {
                    break;
                }
                this.f9851g[i8] = this.f9850f[i8];
                i8++;
            }
            Arrays.sort(this.f9851g, 0, i, new l(4));
            for (int i9 = 0; i9 < this.h; i9++) {
                this.f9850f[i9] = this.f9851g[i9];
            }
        }
        iVar.f9853a = true;
        iVar.a(this);
    }

    public final void j(i iVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f9850f[i] == iVar) {
                while (true) {
                    int i5 = this.h;
                    if (i >= i5 - 1) {
                        this.h = i5 - 1;
                        iVar.f9853a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f9850f;
                        int i6 = i + 1;
                        iVarArr[i] = iVarArr[i6];
                        i = i6;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // t.C0892c
    public final String toString() {
        String str = " goal -> (" + this.f9830b + ") : ";
        for (int i = 0; i < this.h; i++) {
            i iVar = this.f9850f[i];
            f fVar = this.i;
            fVar.f9848a = iVar;
            str = str + fVar + " ";
        }
        return str;
    }
}
