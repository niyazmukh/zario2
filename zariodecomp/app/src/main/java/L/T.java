package l;

import android.os.LocaleList;
import android.widget.TextView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\T.smali */
public abstract class T {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
