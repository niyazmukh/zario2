package g;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\m.smali */
public abstract class m {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
