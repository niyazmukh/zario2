package l;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\S.smali */
public abstract class S {
    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}
