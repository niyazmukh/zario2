package w;

import u.C0951a;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\a.smali */
public final class C1004a extends AbstractC1006c {

    /* renamed from: k, reason: collision with root package name */
    public int f10688k;

    /* renamed from: l, reason: collision with root package name */
    public int f10689l;

    /* renamed from: m, reason: collision with root package name */
    public C0951a f10690m;

    @Override // w.AbstractC1006c
    public final void f(u.d dVar, boolean z4) {
        int i = this.f10688k;
        this.f10689l = i;
        if (z4) {
            if (i == 5) {
                this.f10689l = 1;
            } else if (i == 6) {
                this.f10689l = 0;
            }
        } else if (i == 5) {
            this.f10689l = 0;
        } else if (i == 6) {
            this.f10689l = 1;
        }
        if (dVar instanceof C0951a) {
            ((C0951a) dVar).f10208f0 = this.f10689l;
        }
    }

    public int getMargin() {
        return this.f10690m.f10210h0;
    }

    public int getType() {
        return this.f10688k;
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f10690m.f10209g0 = z4;
    }

    public void setDpMargin(int i) {
        this.f10690m.f10210h0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f10690m.f10210h0 = i;
    }

    public void setType(int i) {
        this.f10688k = i;
    }
}
