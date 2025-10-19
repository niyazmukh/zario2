package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\S0.smali */
public final class S0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f8494a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f8495b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f8496c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f8497d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8498e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8499f;

    public S0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f8498e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f8495b = rect3;
        Rect rect4 = new Rect();
        this.f8497d = rect4;
        Rect rect5 = new Rect();
        this.f8496c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f8494a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int x3 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z5 = this.f8499f;
                if (z5 && !this.f8497d.contains(x3, y4)) {
                    z6 = z5;
                    z4 = false;
                }
            } else {
                if (action == 3) {
                    z5 = this.f8499f;
                    this.f8499f = false;
                }
                z4 = true;
                z6 = false;
            }
            z6 = z5;
            z4 = true;
        } else if (this.f8495b.contains(x3, y4)) {
            this.f8499f = true;
            z4 = true;
        } else {
            z4 = true;
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        Rect rect = this.f8496c;
        View view = this.f8494a;
        if (!z4 || rect.contains(x3, y4)) {
            motionEvent.setLocation(x3 - rect.left, y4 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
