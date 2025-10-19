package b;

import android.window.BackEvent;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\a.smali */
public final class C0244a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0244a f4878a = new C0244a();

    public final BackEvent a(float f2, float f3, float f5, int i) {
        return new BackEvent(f2, f3, f5, i);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
