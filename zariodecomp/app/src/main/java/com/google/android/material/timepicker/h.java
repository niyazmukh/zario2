package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\timepicker\h.smali */
public final class h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f6230a;

    public h(TimePickerView timePickerView) {
        this.f6230a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.f6220u;
        this.f6230a.getClass();
        return false;
    }
}
