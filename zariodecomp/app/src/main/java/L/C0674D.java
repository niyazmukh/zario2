package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\D.smali */
public final class C0674D extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0675E f8438a;

    public C0674D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903954);
        V0.a(getContext(), this);
        C0675E c0675e = new C0675E(this);
        this.f8438a = c0675e;
        c0675e.d(attributeSet, 2130903954);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0675E c0675e = this.f8438a;
        Drawable drawable = c0675e.f8440f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0674D c0674d = c0675e.f8439e;
        if (drawable.setState(c0674d.getDrawableState())) {
            c0674d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8438a.f8440f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f8438a.i(canvas);
    }
}
