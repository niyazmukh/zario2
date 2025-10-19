package l;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\I.smali */
public abstract class I {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (L.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
