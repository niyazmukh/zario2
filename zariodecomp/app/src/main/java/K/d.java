package K;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2110a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f2111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2112c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2113d;

    public d(PrecomputedText.Params params) {
        this.f2110a = params.getTextPaint();
        this.f2111b = params.getTextDirection();
        this.f2112c = params.getBreakStrategy();
        this.f2113d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2112c == dVar.f2112c && this.f2113d == dVar.f2113d) {
            TextPaint textPaint = this.f2110a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = dVar.f2110a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f2111b == dVar.f2111b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f2110a;
        return L.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f2111b, Integer.valueOf(this.f2112c), Integer.valueOf(this.f2113d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f2110a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f2111b);
        sb.append(", breakStrategy=" + this.f2112c);
        sb.append(", hyphenationFrequency=" + this.f2113d);
        sb.append("}");
        return sb.toString();
    }
}
