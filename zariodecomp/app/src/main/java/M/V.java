package M;

import android.view.View;
import android.view.ViewParent;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\V.smali */
public abstract class V {
    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z4) {
        return viewParent.onNestedFling(view, f2, f3, z4);
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f3) {
        return viewParent.onNestedPreFling(view, f2, f3);
    }

    public static void c(ViewParent viewParent, View view, int i, int i5, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i5, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i, int i5, int i6, int i7) {
        viewParent.onNestedScroll(view, i, i5, i6, i7);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
