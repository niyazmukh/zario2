package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\B.smali */
public final class C0673B extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0724z f8437a;

    public C0673B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903928);
        V0.a(getContext(), this);
        C0724z c0724z = new C0724z(this);
        this.f8437a = c0724z;
        c0724z.d(attributeSet, 2130903928);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        Bitmap bitmap = (Bitmap) this.f8437a.f8719c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
