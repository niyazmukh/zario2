package b;

import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\b.smali */
public final class C0245b {

    /* renamed from: a, reason: collision with root package name */
    public final float f4879a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4880b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4881c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4882d;

    public C0245b(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        C0244a c0244a = C0244a.f4878a;
        float fD = c0244a.d(backEvent);
        float fE = c0244a.e(backEvent);
        float fB = c0244a.b(backEvent);
        int iC = c0244a.c(backEvent);
        this.f4879a = fD;
        this.f4880b = fE;
        this.f4881c = fB;
        this.f4882d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f4879a + ", touchY=" + this.f4880b + ", progress=" + this.f4881c + ", swipeEdge=" + this.f4882d + '}';
    }
}
