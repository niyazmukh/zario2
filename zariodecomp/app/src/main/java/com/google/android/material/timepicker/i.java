package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\timepicker\i.smali */
public final class i implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f6231a;

    public i(GestureDetector gestureDetector) {
        this.f6231a = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f6231a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
