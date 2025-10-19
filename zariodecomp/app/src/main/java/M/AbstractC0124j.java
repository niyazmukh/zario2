package M;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: M.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\j.1.smali */
public abstract class AbstractC0124j {
    public static void a(int i, int i5, int i6, Rect rect, int i7, int i8, Rect rect2, int i9) {
        Gravity.apply(i, i5, i6, rect, i7, i8, rect2, i9);
    }

    public static void b(int i, int i5, int i6, Rect rect, Rect rect2, int i7) {
        Gravity.apply(i, i5, i6, rect, rect2, i7);
    }

    public static void c(int i, Rect rect, Rect rect2, int i5) {
        Gravity.applyDisplay(i, rect, rect2, i5);
    }
}
