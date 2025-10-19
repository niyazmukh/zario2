package t0;

import android.view.View;

/* renamed from: t0.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\x.1.smali */
public final class C0938x {

    /* renamed from: a, reason: collision with root package name */
    public c0.f f10161a;

    /* renamed from: b, reason: collision with root package name */
    public int f10162b;

    /* renamed from: c, reason: collision with root package name */
    public int f10163c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10164d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10165e;

    public C0938x() {
        d();
    }

    public final void a() {
        this.f10163c = this.f10164d ? this.f10161a.g() : this.f10161a.k();
    }

    public final void b(View view, int i) {
        if (this.f10164d) {
            this.f10163c = this.f10161a.m() + this.f10161a.b(view);
        } else {
            this.f10163c = this.f10161a.e(view);
        }
        this.f10162b = i;
    }

    public final void c(View view, int i) {
        int iM = this.f10161a.m();
        if (iM >= 0) {
            b(view, i);
            return;
        }
        this.f10162b = i;
        if (!this.f10164d) {
            int iE = this.f10161a.e(view);
            int iK = iE - this.f10161a.k();
            this.f10163c = iE;
            if (iK > 0) {
                int iG = (this.f10161a.g() - Math.min(0, (this.f10161a.g() - iM) - this.f10161a.b(view))) - (this.f10161a.c(view) + iE);
                if (iG < 0) {
                    this.f10163c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.f10161a.g() - iM) - this.f10161a.b(view);
        this.f10163c = this.f10161a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f10163c - this.f10161a.c(view);
            int iK2 = this.f10161a.k();
            int iMin = iC - (Math.min(this.f10161a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f10163c = Math.min(iG2, -iMin) + this.f10163c;
            }
        }
    }

    public final void d() {
        this.f10162b = -1;
        this.f10163c = Integer.MIN_VALUE;
        this.f10164d = false;
        this.f10165e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f10162b + ", mCoordinate=" + this.f10163c + ", mLayoutFromEnd=" + this.f10164d + ", mValid=" + this.f10165e + '}';
    }
}
