package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\r.smali */
public abstract class r {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static I.k b(Configuration configuration) {
        return I.k.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(I.k kVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(kVar.f1918a.f1919a.toLanguageTags()));
    }

    public static void d(Configuration configuration, I.k kVar) {
        configuration.setLocales(LocaleList.forLanguageTags(kVar.f1918a.f1919a.toLanguageTags()));
    }
}
