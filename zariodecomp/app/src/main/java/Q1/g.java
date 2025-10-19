package Q1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q1\g.smali */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2787a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f2788b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2789c;

    /* renamed from: d, reason: collision with root package name */
    public int f2790d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2794j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f2791e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f2792f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: g, reason: collision with root package name */
    public float f2793g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f2795k = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f2787a = charSequence;
        this.f2788b = textPaint;
        this.f2789c = i;
        this.f2790d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f2787a == null) {
            this.f2787a = "";
        }
        int iMax = Math.max(0, this.f2789c);
        CharSequence charSequenceEllipsize = this.f2787a;
        int i = this.f2792f;
        TextPaint textPaint = this.f2788b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f2795k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f2790d);
        this.f2790d = iMin;
        if (this.f2794j && this.f2792f == 1) {
            this.f2791e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f2791e);
        builderObtain.setIncludePad(this.i);
        builderObtain.setTextDirection(this.f2794j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f2795k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f2792f);
        float f2 = this.f2793g;
        if (f2 != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f2);
        }
        if (this.f2792f > 1) {
            builderObtain.setHyphenationFrequency(this.h);
        }
        return builderObtain.build();
    }
}
