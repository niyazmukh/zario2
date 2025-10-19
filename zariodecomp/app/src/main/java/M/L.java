package M;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Objects;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\L.smali */
public abstract class L {
    public static void a(View view, Q q5) {
        C0834k c0834k = (C0834k) view.getTag(2131231218);
        if (c0834k == null) {
            c0834k = new C0834k();
            view.setTag(2131231218, c0834k);
        }
        Objects.requireNonNull(q5);
        View.OnUnhandledKeyEventListener k5 = new K();
        c0834k.put(q5, k5);
        view.addOnUnhandledKeyEventListener(k5);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, Q q5) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0834k c0834k = (C0834k) view.getTag(2131231218);
        if (c0834k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0834k.getOrDefault(q5, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z4) {
        view.setAccessibilityHeading(z4);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z4) {
        view.setScreenReaderFocusable(z4);
    }
}
