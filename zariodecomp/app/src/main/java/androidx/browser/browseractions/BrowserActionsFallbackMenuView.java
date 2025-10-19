package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\browser\browseractions\BrowserActionsFallbackMenuView.smali */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f4316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4317b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4316a = getResources().getDimensionPixelOffset(2131099731);
        this.f4317b = getResources().getDimensionPixelOffset(2131099730);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4316a * 2), this.f4317b), 1073741824), i5);
    }
}
