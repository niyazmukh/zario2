package w;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: w.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\o.smali */
public final class C1017o extends View {
    public C1017o(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C1008e c1008e = (C1008e) getLayoutParams();
        c1008e.f10728a = i;
        setLayoutParams(c1008e);
    }

    public void setGuidelineEnd(int i) {
        C1008e c1008e = (C1008e) getLayoutParams();
        c1008e.f10730b = i;
        setLayoutParams(c1008e);
    }

    public void setGuidelinePercent(float f2) {
        C1008e c1008e = (C1008e) getLayoutParams();
        c1008e.f10732c = f2;
        setLayoutParams(c1008e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
