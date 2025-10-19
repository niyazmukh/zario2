package com.google.android.material.timepicker;

import M.C0118c;
import N.n;
import N.o;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\timepicker\c.smali */
public final class c extends C0118c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6224d;

    public c(ClockFaceView clockFaceView) {
        this.f6224d = clockFaceView;
    }

    @Override // M.C0118c
    public final void d(View view, o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2375a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(2131231028)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f6224d.f6193A.get(iIntValue - 1));
        }
        oVar.h(n.a(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        oVar.b(N.i.f2531e);
    }

    @Override // M.C0118c
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f6224d;
        view.getHitRect(clockFaceView.f6204x);
        float fCenterX = clockFaceView.f6204x.centerX();
        float fCenterY = clockFaceView.f6204x.centerY();
        clockFaceView.f6203w.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f6203w.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
