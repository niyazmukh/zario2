package M;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\H.smali */
public abstract class H {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131231219);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static u0 b(View view, u0 u0Var, Rect rect) {
        WindowInsets windowInsetsE = u0Var.e();
        if (windowInsetsE != null) {
            return u0.f(view, view.computeSystemWindowInsets(windowInsetsE, rect));
        }
        rect.setEmpty();
        return u0Var;
    }

    public static boolean c(View view, float f2, float f3, boolean z4) {
        return view.dispatchNestedFling(f2, f3, z4);
    }

    public static boolean d(View view, float f2, float f3) {
        return view.dispatchNestedPreFling(f2, f3);
    }

    public static boolean e(View view, int i, int i5, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i5, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i5, int i6, int i7, int[] iArr) {
        return view.dispatchNestedScroll(i, i5, i6, i7, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static u0 j(View view) throws IllegalAccessException, IllegalArgumentException {
        if (!j0.f2400d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = j0.f2397a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) j0.f2398b.get(obj);
            Rect rect2 = (Rect) j0.f2399c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            k0 l0Var = Build.VERSION.SDK_INT >= 30 ? new l0() : new k0();
            l0Var.h(D.c.b(rect.left, rect.top, rect.right, rect.bottom));
            l0Var.f(D.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            u0 u0VarB = l0Var.b();
            u0VarB.f2427a.p(u0VarB);
            u0VarB.f2427a.d(view.getRootView());
            return u0VarB;
        } catch (IllegalAccessException e5) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e5.getMessage(), e5);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f2) {
        view.setElevation(f2);
    }

    public static void t(View view, boolean z4) {
        view.setNestedScrollingEnabled(z4);
    }

    public static void u(View view, r rVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131231211, rVar);
        }
        if (rVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131231219));
        } else {
            view.setOnApplyWindowInsetsListener(new G(view, rVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void x(View view, float f2) {
        view.setZ(f2);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
