package A;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\f.smali */
public abstract class f {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
