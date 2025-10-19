package B;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\j.smali */
public abstract class j {
    public static String a(Context context) {
        return context.getAttributionTag();
    }

    public static Display b(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }
}
