package M;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\m0.smali */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f2402a;

    /* renamed from: b, reason: collision with root package name */
    public D.c[] f2403b;

    public m0() {
        this(new u0());
    }

    public final void a() {
        D.c[] cVarArr = this.f2403b;
        if (cVarArr != null) {
            D.c cVarF = cVarArr[0];
            D.c cVarF2 = cVarArr[1];
            u0 u0Var = this.f2402a;
            if (cVarF2 == null) {
                cVarF2 = u0Var.f2427a.f(2);
            }
            if (cVarF == null) {
                cVarF = u0Var.f2427a.f(1);
            }
            f(D.c.a(cVarF, cVarF2));
            D.c cVar = this.f2403b[4];
            if (cVar != null) {
                e(cVar);
            }
            D.c cVar2 = this.f2403b[5];
            if (cVar2 != null) {
                d(cVar2);
            }
            D.c cVar3 = this.f2403b[6];
            if (cVar3 != null) {
                g(cVar3);
            }
        }
    }

    public abstract u0 b();

    public void c(int i, D.c cVar) {
        char c5;
        if (this.f2403b == null) {
            this.f2403b = new D.c[9];
        }
        for (int i5 = 1; i5 <= 256; i5 <<= 1) {
            if ((i & i5) != 0) {
                D.c[] cVarArr = this.f2403b;
                if (i5 != 1) {
                    c5 = 2;
                    if (i5 == 2) {
                        c5 = 1;
                    } else if (i5 != 4) {
                        c5 = '\b';
                        if (i5 == 8) {
                            c5 = 3;
                        } else if (i5 == 16) {
                            c5 = 4;
                        } else if (i5 == 32) {
                            c5 = 5;
                        } else if (i5 == 64) {
                            c5 = 6;
                        } else if (i5 == 128) {
                            c5 = 7;
                        } else if (i5 != 256) {
                            throw new IllegalArgumentException(B.a.g(i5, "type needs to be >= FIRST and <= LAST, type="));
                        }
                    }
                } else {
                    c5 = 0;
                }
                cVarArr[c5] = cVar;
            }
        }
    }

    public abstract void d(D.c cVar);

    public abstract void e(D.c cVar);

    public abstract void f(D.c cVar);

    public abstract void g(D.c cVar);

    public m0(u0 u0Var) {
        this.f2402a = u0Var;
    }
}
