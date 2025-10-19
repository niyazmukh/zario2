package l;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: l.y0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\y0.1.smali */
public final class ViewOnTouchListenerC0723y0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0725z0 f8715a;

    public ViewOnTouchListenerC0723y0(C0725z0 c0725z0) {
        this.f8715a = c0725z0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0722y c0722y;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        C0725z0 c0725z0 = this.f8715a;
        if (action == 0 && (c0722y = c0725z0.f8723D) != null && c0722y.isShowing() && x3 >= 0 && x3 < c0725z0.f8723D.getWidth() && y4 >= 0 && y4 < c0725z0.f8723D.getHeight()) {
            c0725z0.f8745z.postDelayed(c0725z0.f8741v, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0725z0.f8745z.removeCallbacks(c0725z0.f8741v);
        return false;
    }
}
