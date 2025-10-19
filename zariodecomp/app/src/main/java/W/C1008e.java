package w;

import android.view.ViewGroup;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\e.smali */
public final class C1008e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public float f10704A;

    /* renamed from: B, reason: collision with root package name */
    public String f10705B;

    /* renamed from: C, reason: collision with root package name */
    public int f10706C;

    /* renamed from: D, reason: collision with root package name */
    public float f10707D;

    /* renamed from: E, reason: collision with root package name */
    public float f10708E;

    /* renamed from: F, reason: collision with root package name */
    public int f10709F;
    public int G;

    /* renamed from: H, reason: collision with root package name */
    public int f10710H;

    /* renamed from: I, reason: collision with root package name */
    public int f10711I;

    /* renamed from: J, reason: collision with root package name */
    public int f10712J;

    /* renamed from: K, reason: collision with root package name */
    public int f10713K;

    /* renamed from: L, reason: collision with root package name */
    public int f10714L;

    /* renamed from: M, reason: collision with root package name */
    public int f10715M;

    /* renamed from: N, reason: collision with root package name */
    public float f10716N;

    /* renamed from: O, reason: collision with root package name */
    public float f10717O;

    /* renamed from: P, reason: collision with root package name */
    public int f10718P;

    /* renamed from: Q, reason: collision with root package name */
    public int f10719Q;

    /* renamed from: R, reason: collision with root package name */
    public int f10720R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f10721S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f10722T;

    /* renamed from: U, reason: collision with root package name */
    public String f10723U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f10724V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f10725W;
    public boolean X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f10726Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f10727Z;

    /* renamed from: a, reason: collision with root package name */
    public int f10728a;

    /* renamed from: a0, reason: collision with root package name */
    public int f10729a0;

    /* renamed from: b, reason: collision with root package name */
    public int f10730b;

    /* renamed from: b0, reason: collision with root package name */
    public int f10731b0;

    /* renamed from: c, reason: collision with root package name */
    public float f10732c;

    /* renamed from: c0, reason: collision with root package name */
    public int f10733c0;

    /* renamed from: d, reason: collision with root package name */
    public int f10734d;

    /* renamed from: d0, reason: collision with root package name */
    public int f10735d0;

    /* renamed from: e, reason: collision with root package name */
    public int f10736e;

    /* renamed from: e0, reason: collision with root package name */
    public int f10737e0;

    /* renamed from: f, reason: collision with root package name */
    public int f10738f;

    /* renamed from: f0, reason: collision with root package name */
    public int f10739f0;

    /* renamed from: g, reason: collision with root package name */
    public int f10740g;

    /* renamed from: g0, reason: collision with root package name */
    public float f10741g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f10742h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f10743i0;

    /* renamed from: j, reason: collision with root package name */
    public int f10744j;

    /* renamed from: j0, reason: collision with root package name */
    public float f10745j0;

    /* renamed from: k, reason: collision with root package name */
    public int f10746k;

    /* renamed from: k0, reason: collision with root package name */
    public u.d f10747k0;

    /* renamed from: l, reason: collision with root package name */
    public int f10748l;

    /* renamed from: m, reason: collision with root package name */
    public int f10749m;

    /* renamed from: n, reason: collision with root package name */
    public int f10750n;

    /* renamed from: o, reason: collision with root package name */
    public float f10751o;

    /* renamed from: p, reason: collision with root package name */
    public int f10752p;

    /* renamed from: q, reason: collision with root package name */
    public int f10753q;

    /* renamed from: r, reason: collision with root package name */
    public int f10754r;

    /* renamed from: s, reason: collision with root package name */
    public int f10755s;

    /* renamed from: t, reason: collision with root package name */
    public int f10756t;

    /* renamed from: u, reason: collision with root package name */
    public int f10757u;

    /* renamed from: v, reason: collision with root package name */
    public int f10758v;

    /* renamed from: w, reason: collision with root package name */
    public int f10759w;

    /* renamed from: x, reason: collision with root package name */
    public int f10760x;

    /* renamed from: y, reason: collision with root package name */
    public int f10761y;

    /* renamed from: z, reason: collision with root package name */
    public float f10762z;

    public final void a() {
        this.f10726Y = false;
        this.f10724V = true;
        this.f10725W = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f10721S) {
            this.f10724V = false;
            if (this.f10710H == 0) {
                this.f10710H = 1;
            }
        }
        int i5 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i5 == -2 && this.f10722T) {
            this.f10725W = false;
            if (this.f10711I == 0) {
                this.f10711I = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f10724V = false;
            if (i == 0 && this.f10710H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f10721S = true;
            }
        }
        if (i5 == 0 || i5 == -1) {
            this.f10725W = false;
            if (i5 == 0 && this.f10711I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f10722T = true;
            }
        }
        if (this.f10732c == -1.0f && this.f10728a == -1 && this.f10730b == -1) {
            return;
        }
        this.f10726Y = true;
        this.f10724V = true;
        this.f10725W = true;
        if (!(this.f10747k0 instanceof u.h)) {
            this.f10747k0 = new u.h();
        }
        ((u.h) this.f10747k0).B(this.f10720R);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1008e.resolveLayoutDirection(int):void");
    }
}
