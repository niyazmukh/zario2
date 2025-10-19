package I;

import android.os.Build;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\b.smali */
public abstract class b {
    static {
        int i = Build.VERSION.SDK_INT;
        a aVar = a.f1912a;
        if (i >= 30) {
            aVar.a(30);
        }
        if (i >= 30) {
            aVar.a(31);
        }
        if (i >= 30) {
            aVar.a(33);
        }
        if (i >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.i.d(CODENAME, "CODENAME");
                if (!"REL".equals(CODENAME)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = CODENAME.toUpperCase(locale);
                    kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    kotlin.jvm.internal.i.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
