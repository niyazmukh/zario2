package B1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import j0.C0623a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B1\a.smali */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f283a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0623a f284b = new C0623a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0623a f285c = new C0623a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0623a f286d = new C0623a(C0623a.f8035e);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f287e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f5) {
        return ((f3 - f2) * f5) + f2;
    }

    public static float b(float f2, float f3, float f5, float f6, float f7) {
        return f7 <= f5 ? f2 : f7 >= f6 ? f3 : a(f2, f3, (f7 - f5) / (f6 - f5));
    }

    public static int c(int i, int i5, float f2) {
        return Math.round(f2 * (i5 - i)) + i;
    }
}
