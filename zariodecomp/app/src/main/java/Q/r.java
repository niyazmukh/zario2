package Q;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q\r.smali */
public abstract class r {
    public static CharSequence a(PrecomputedText precomputedText) {
        return precomputedText;
    }

    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void d(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
