package l;

import android.view.View;
import android.view.ViewConfiguration;
import k.InterfaceC0639C;

/* renamed from: l.q0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\q0.1.smali */
public abstract class AbstractViewOnTouchListenerC0709q0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f8665a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8667c;

    /* renamed from: d, reason: collision with root package name */
    public final View f8668d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0707p0 f8669e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0707p0 f8670f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8671k;

    /* renamed from: l, reason: collision with root package name */
    public int f8672l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f8673m = new int[2];

    public AbstractViewOnTouchListenerC0709q0(View view) {
        this.f8668d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8665a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8666b = tapTimeout;
        this.f8667c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0707p0 runnableC0707p0 = this.f8670f;
        View view = this.f8668d;
        if (runnableC0707p0 != null) {
            view.removeCallbacks(runnableC0707p0);
        }
        RunnableC0707p0 runnableC0707p02 = this.f8669e;
        if (runnableC0707p02 != null) {
            view.removeCallbacks(runnableC0707p02);
        }
    }

    public abstract InterfaceC0639C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0639C interfaceC0639CB = b();
        if (interfaceC0639CB == null || !interfaceC0639CB.b()) {
            return true;
        }
        interfaceC0639CB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC0709q0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8671k = false;
        this.f8672l = -1;
        RunnableC0707p0 runnableC0707p0 = this.f8669e;
        if (runnableC0707p0 != null) {
            this.f8668d.removeCallbacks(runnableC0707p0);
        }
    }
}
