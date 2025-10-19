package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\r.smali */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f8674b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static r f8675c;

    /* renamed from: a, reason: collision with root package name */
    public H0 f8676a;

    public static synchronized r a() {
        try {
            if (f8675c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8675c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return H0.e(i, mode);
    }

    public static synchronized void d() {
        if (f8675c == null) {
            r rVar = new r();
            f8675c = rVar;
            rVar.f8676a = H0.b();
            H0 h02 = f8675c.f8676a;
            E2.G g3 = new E2.G();
            synchronized (h02) {
                h02.f8456e = g3;
            }
        }
    }

    public static void e(Drawable drawable, D3.b bVar, int[] iArr) {
        PorterDuff.Mode mode = H0.f8450f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0692h0.f8590a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = bVar.f1341b;
        if (!z4 && !bVar.f1340a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z4 ? (ColorStateList) bVar.f1342c : null;
        PorterDuff.Mode mode2 = bVar.f1340a ? (PorterDuff.Mode) bVar.f1343d : H0.f8450f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = H0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f8676a.c(context, i);
    }
}
