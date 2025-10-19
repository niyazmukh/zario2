package I;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\j.smali */
public abstract class j {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
