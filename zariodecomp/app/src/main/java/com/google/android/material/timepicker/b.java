package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\timepicker\b.smali */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6223a;

    public b(ClockFaceView clockFaceView) {
        this.f6223a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f6223a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f6203w.f6210d) - clockFaceView.f6197E;
        if (height != clockFaceView.f6226u) {
            clockFaceView.f6226u = height;
            clockFaceView.f();
            int i = clockFaceView.f6226u;
            ClockHandView clockHandView = clockFaceView.f6203w;
            clockHandView.f6218p = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
