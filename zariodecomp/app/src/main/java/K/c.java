package K;

import android.icu.util.ULocale;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K\c.smali */
public abstract class c {
    public static ULocale a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static ULocale b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    public static String c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
