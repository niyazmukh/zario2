package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import j.C0618d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\w.smali */
public final class w extends ContentFrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f7232m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, C0618d c0618d) {
        super(c0618d, null);
        this.f7232m = yVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f7232m.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x3 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x3 < -5 || y4 < -5 || x3 > getWidth() + 5 || y4 > getHeight() + 5) {
                y yVar = this.f7232m;
                yVar.r(yVar.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(r1.d.B(getContext(), i));
    }
}
