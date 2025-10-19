package com.google.android.material.timepicker;

import M.B;
import M.S;
import N2.AbstractC0156x;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\timepicker\ClockHandView.smali */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f6207a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6208b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6210d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6211e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f6212f;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f6213k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6214l;

    /* renamed from: m, reason: collision with root package name */
    public float f6215m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6216n;

    /* renamed from: o, reason: collision with root package name */
    public double f6217o;

    /* renamed from: p, reason: collision with root package name */
    public int f6218p;

    /* renamed from: q, reason: collision with root package name */
    public int f6219q;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903771);
        this.f6207a = new ValueAnimator();
        this.f6209c = new ArrayList();
        Paint paint = new Paint();
        this.f6212f = paint;
        this.f6213k = new RectF();
        this.f6219q = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.h, 2130903771, 2131952721);
        AbstractC0156x.d0(context, 2130903821, 200);
        AbstractC0156x.e0(context, 2130903837, B1.a.f284b);
        this.f6218p = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f6210d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f6214l = getResources().getDimensionPixelSize(2131100212);
        this.f6211e = r4.getDimensionPixelSize(2131100210);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = S.f2363a;
        B.s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        int i5 = this.f6218p;
        return i == 2 ? Math.round(i5 * 0.66f) : i5;
    }

    public final void b(float f2) {
        ValueAnimator valueAnimator = this.f6207a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f3 = f2 % 360.0f;
        this.f6215m = f3;
        this.f6217o = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f6219q);
        float fCos = (((float) Math.cos(this.f6217o)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f6217o))) + height;
        float f5 = this.f6210d;
        this.f6213k.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        Iterator it = this.f6209c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f6201J - f3) > 0.001f) {
                clockFaceView.f6201J = f3;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float fA = a(this.f6219q);
        float fCos = (((float) Math.cos(this.f6217o)) * fA) + f2;
        float f3 = height;
        float fSin = (fA * ((float) Math.sin(this.f6217o))) + f3;
        Paint paint = this.f6212f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f6210d, paint);
        double dSin = Math.sin(this.f6217o);
        paint.setStrokeWidth(this.f6214l);
        canvas.drawLine(f2, f3, width + ((int) (Math.cos(this.f6217o) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f2, f3, this.f6211e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        if (this.f6207a.isRunning()) {
            return;
        }
        b(this.f6215m);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z6 = false;
        if (actionMasked == 0) {
            this.f6216n = false;
            z4 = true;
            z5 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z5 = this.f6216n;
            if (this.f6208b) {
                this.f6219q = ((float) Math.hypot((double) (x3 - ((float) (getWidth() / 2))), (double) (y4 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z4 = false;
        } else {
            z5 = false;
            z4 = false;
        }
        boolean z7 = this.f6216n;
        int degrees = (int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f2 = i;
        boolean z8 = this.f6215m != f2;
        if (z4 && z8) {
            z6 = true;
        } else if (z8 || z5) {
            b(f2);
            z6 = true;
        }
        this.f6216n = z7 | z6;
        return true;
    }
}
