package t0;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\e.1.smali */
public final class C0920e {

    /* renamed from: a, reason: collision with root package name */
    public final h1.i f9984a;

    /* renamed from: b, reason: collision with root package name */
    public int f9985b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9986c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f9987d = -1;

    public C0920e(h1.i iVar) {
        this.f9984a = iVar;
    }

    public final void a() {
        int i = this.f9985b;
        if (i == 0) {
            return;
        }
        h1.i iVar = this.f9984a;
        if (i == 1) {
            iVar.z(this.f9986c, this.f9987d);
        } else if (i == 2) {
            iVar.A(this.f9986c, this.f9987d);
        } else if (i == 3) {
            ((AbstractC0898E) iVar.f7641b).f9901a.d(this.f9986c, this.f9987d);
        }
        this.f9985b = 0;
    }

    public final void b(int i, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.f9985b == 3 && i <= (i7 = this.f9987d + (i6 = this.f9986c)) && (i8 = i + i5) >= i6) {
            this.f9986c = Math.min(i, i6);
            this.f9987d = Math.max(i7, i8) - this.f9986c;
        } else {
            a();
            this.f9986c = i;
            this.f9987d = i5;
            this.f9985b = 3;
        }
    }

    public final void c(int i, int i5) {
        int i6;
        if (this.f9985b == 1 && i >= (i6 = this.f9986c)) {
            int i7 = this.f9987d;
            if (i <= i6 + i7) {
                this.f9987d = i7 + i5;
                this.f9986c = Math.min(i, i6);
                return;
            }
        }
        a();
        this.f9986c = i;
        this.f9987d = i5;
        this.f9985b = 1;
    }

    public final void d(int i, int i5) {
        a();
        ((AbstractC0898E) this.f9984a.f7641b).f9901a.c(i, i5);
    }

    public final void e(int i, int i5) {
        int i6;
        if (this.f9985b == 2 && (i6 = this.f9986c) >= i && i6 <= i + i5) {
            this.f9987d += i5;
            this.f9986c = i;
        } else {
            a();
            this.f9986c = i;
            this.f9987d = i5;
            this.f9985b = 2;
        }
    }
}
