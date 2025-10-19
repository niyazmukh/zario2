package E3;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final q4.d f1548a;

    /* renamed from: c, reason: collision with root package name */
    public int f1550c;

    /* renamed from: e, reason: collision with root package name */
    public int f1552e;

    /* renamed from: b, reason: collision with root package name */
    public b[] f1549b = new b[8];

    /* renamed from: d, reason: collision with root package name */
    public int f1551d = 7;

    public d(q4.d dVar) {
        this.f1548a = dVar;
    }

    public final void a(b bVar) {
        int i;
        int i5 = bVar.f1540c;
        if (i5 > 4096) {
            Arrays.fill(this.f1549b, (Object) null);
            this.f1551d = this.f1549b.length - 1;
            this.f1550c = 0;
            this.f1552e = 0;
            return;
        }
        int i6 = (this.f1552e + i5) - 4096;
        if (i6 > 0) {
            int length = this.f1549b.length - 1;
            int i7 = 0;
            while (true) {
                i = this.f1551d;
                if (length < i || i6 <= 0) {
                    break;
                }
                int i8 = this.f1549b[length].f1540c;
                i6 -= i8;
                this.f1552e -= i8;
                this.f1550c--;
                i7++;
                length--;
            }
            b[] bVarArr = this.f1549b;
            int i9 = i + 1;
            System.arraycopy(bVarArr, i9, bVarArr, i9 + i7, this.f1550c);
            this.f1551d += i7;
        }
        int i10 = this.f1550c + 1;
        b[] bVarArr2 = this.f1549b;
        if (i10 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f1551d = this.f1549b.length - 1;
            this.f1549b = bVarArr3;
        }
        int i11 = this.f1551d;
        this.f1551d = i11 - 1;
        this.f1549b[i11] = bVar;
        this.f1550c++;
        this.f1552e += i5;
    }

    public final void b(q4.f fVar) {
        c(fVar.b(), 127, 0);
        fVar.l(this.f1548a, fVar.b());
    }

    public final void c(int i, int i5, int i6) {
        q4.d dVar = this.f1548a;
        if (i < i5) {
            dVar.u(i | i6);
            return;
        }
        dVar.u(i6 | i5);
        int i7 = i - i5;
        while (i7 >= 128) {
            dVar.u(128 | (i7 & 127));
            i7 >>>= 7;
        }
        dVar.u(i7);
    }
}
