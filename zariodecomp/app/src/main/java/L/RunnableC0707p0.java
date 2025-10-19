package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.p0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\p0.1.smali */
public final class RunnableC0707p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0709q0 f8658b;

    public /* synthetic */ RunnableC0707p0(AbstractViewOnTouchListenerC0709q0 abstractViewOnTouchListenerC0709q0, int i) {
        this.f8657a = i;
        this.f8658b = abstractViewOnTouchListenerC0709q0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8657a) {
            case 0:
                ViewParent parent = this.f8658b.f8668d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0709q0 abstractViewOnTouchListenerC0709q0 = this.f8658b;
                abstractViewOnTouchListenerC0709q0.a();
                View view = abstractViewOnTouchListenerC0709q0.f8668d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0709q0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0709q0.f8671k = true;
                    break;
                }
                break;
        }
    }
}
