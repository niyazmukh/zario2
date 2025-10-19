package I;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\h.smali */
public abstract class h {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, k kVar) {
        configuration.setLocales(kVar.f1918a.f1919a);
    }
}
