package t;

import S0.n;
import java.util.ArrayList;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t.1\c.smali */
public class C0892c {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0891b f9832d;

    /* renamed from: a, reason: collision with root package name */
    public i f9829a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f9830b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f9831c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f9833e = false;

    public C0892c(n nVar) {
        this.f9832d = new C0890a(this, nVar);
    }

    public final void a(e eVar, int i) {
        this.f9832d.f(eVar.i(i), 1.0f);
        this.f9832d.f(eVar.i(i), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i) {
        boolean z4 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            this.f9830b = i;
        }
        if (z4) {
            this.f9832d.f(iVar, 1.0f);
            this.f9832d.f(iVar2, -1.0f);
            this.f9832d.f(iVar3, -1.0f);
        } else {
            this.f9832d.f(iVar, -1.0f);
            this.f9832d.f(iVar2, 1.0f);
            this.f9832d.f(iVar3, 1.0f);
        }
    }

    public final void c(i iVar, i iVar2, i iVar3, int i) {
        boolean z4 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            this.f9830b = i;
        }
        if (z4) {
            this.f9832d.f(iVar, 1.0f);
            this.f9832d.f(iVar2, -1.0f);
            this.f9832d.f(iVar3, 1.0f);
        } else {
            this.f9832d.f(iVar, -1.0f);
            this.f9832d.f(iVar2, 1.0f);
            this.f9832d.f(iVar3, -1.0f);
        }
    }

    public i d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final i e(boolean[] zArr, i iVar) {
        int i;
        int iK = this.f9832d.k();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < iK; i5++) {
            float fA = this.f9832d.a(i5);
            if (fA < 0.0f) {
                i iVarE = this.f9832d.e(i5);
                if ((zArr == null || !zArr[iVarE.f9854b]) && iVarE != iVar && (((i = iVarE.f9862l) == 3 || i == 4) && fA < f2)) {
                    f2 = fA;
                    iVar2 = iVarE;
                }
            }
        }
        return iVar2;
    }

    public final void f(i iVar) {
        i iVar2 = this.f9829a;
        if (iVar2 != null) {
            this.f9832d.f(iVar2, -1.0f);
            this.f9829a = null;
        }
        float fC = this.f9832d.c(iVar, true) * (-1.0f);
        this.f9829a = iVar;
        if (fC == 1.0f) {
            return;
        }
        this.f9830b /= fC;
        this.f9832d.h(fC);
    }

    public final void g(i iVar, boolean z4) {
        if (iVar.f9858f) {
            float fG = this.f9832d.g(iVar);
            this.f9830b = (iVar.f9857e * fG) + this.f9830b;
            this.f9832d.c(iVar, z4);
            if (z4) {
                iVar.b(this);
            }
        }
    }

    public void h(C0892c c0892c, boolean z4) {
        float fB = this.f9832d.b(c0892c, z4);
        this.f9830b = (c0892c.f9830b * fB) + this.f9830b;
        if (z4) {
            c0892c.f9829a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            t.i r0 = r10.f9829a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            t.i r1 = r10.f9829a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = B.a.k(r0, r1)
            float r1 = r10.f9830b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = t.h.b(r0)
            float r1 = r10.f9830b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            t.b r5 = r10.f9832d
            int r5 = r5.k()
        L3c:
            if (r4 >= r5) goto L9c
            t.b r6 = r10.f9832d
            t.i r6 = r6.e(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            t.b r7 = r10.f9832d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = B.a.k(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = B.a.k(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = B.a.k(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = B.a.k(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r10 = "0.0"
            java.lang.String r0 = B.a.k(r0, r10)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0892c.toString():java.lang.String");
    }
}
