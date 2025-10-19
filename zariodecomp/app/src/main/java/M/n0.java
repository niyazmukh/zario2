package M;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\n0.smali */
public abstract class n0 extends s0 {
    public static boolean h;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f2409j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f2410k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f2411l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2412c;

    /* renamed from: d, reason: collision with root package name */
    public D.c[] f2413d;

    /* renamed from: e, reason: collision with root package name */
    public D.c f2414e;

    /* renamed from: f, reason: collision with root package name */
    public u0 f2415f;

    /* renamed from: g, reason: collision with root package name */
    public D.c f2416g;

    public n0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var);
        this.f2414e = null;
        this.f2412c = windowInsets;
    }

    private D.c q(int i5, boolean z4) {
        D.c cVarA = D.c.f1264e;
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i5 & i6) != 0) {
                cVarA = D.c.a(cVarA, r(i6, z4));
            }
        }
        return cVarA;
    }

    private D.c s() {
        u0 u0Var = this.f2415f;
        return u0Var != null ? u0Var.f2427a.h() : D.c.f1264e;
    }

    private D.c t(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            u();
        }
        Method method = i;
        if (method != null && f2409j != null && f2410k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2410k.get(f2411l.get(objInvoke));
                if (rect != null) {
                    return D.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
        }
        return null;
    }

    private static void u() throws ClassNotFoundException, SecurityException {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2409j = cls;
            f2410k = cls.getDeclaredField("mVisibleInsets");
            f2411l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2410k.setAccessible(true);
            f2411l.setAccessible(true);
        } catch (ReflectiveOperationException e5) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
        }
        h = true;
    }

    @Override // M.s0
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D.c cVarT = t(view);
        if (cVarT == null) {
            cVarT = D.c.f1264e;
        }
        v(cVarT);
    }

    @Override // M.s0
    public D.c f(int i5) {
        return q(i5, false);
    }

    @Override // M.s0
    public final D.c j() {
        if (this.f2414e == null) {
            WindowInsets windowInsets = this.f2412c;
            this.f2414e = D.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2414e;
    }

    @Override // M.s0
    public boolean n() {
        return this.f2412c.isRound();
    }

    @Override // M.s0
    public void o(D.c[] cVarArr) {
        this.f2413d = cVarArr;
    }

    @Override // M.s0
    public void p(u0 u0Var) {
        this.f2415f = u0Var;
    }

    public D.c r(int i5, boolean z4) {
        D.c cVarH;
        int i6;
        if (i5 == 1) {
            return z4 ? D.c.b(0, Math.max(s().f1266b, j().f1266b), 0, 0) : D.c.b(0, j().f1266b, 0, 0);
        }
        if (i5 == 2) {
            if (z4) {
                D.c cVarS = s();
                D.c cVarH2 = h();
                return D.c.b(Math.max(cVarS.f1265a, cVarH2.f1265a), 0, Math.max(cVarS.f1267c, cVarH2.f1267c), Math.max(cVarS.f1268d, cVarH2.f1268d));
            }
            D.c cVarJ = j();
            u0 u0Var = this.f2415f;
            cVarH = u0Var != null ? u0Var.f2427a.h() : null;
            int iMin = cVarJ.f1268d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.f1268d);
            }
            return D.c.b(cVarJ.f1265a, 0, cVarJ.f1267c, iMin);
        }
        D.c cVar = D.c.f1264e;
        if (i5 == 8) {
            D.c[] cVarArr = this.f2413d;
            cVarH = cVarArr != null ? cVarArr[3] : null;
            if (cVarH != null) {
                return cVarH;
            }
            D.c cVarJ2 = j();
            D.c cVarS2 = s();
            int i7 = cVarJ2.f1268d;
            if (i7 > cVarS2.f1268d) {
                return D.c.b(0, 0, 0, i7);
            }
            D.c cVar2 = this.f2416g;
            return (cVar2 == null || cVar2.equals(cVar) || (i6 = this.f2416g.f1268d) <= cVarS2.f1268d) ? cVar : D.c.b(0, 0, 0, i6);
        }
        if (i5 == 16) {
            return i();
        }
        if (i5 == 32) {
            return g();
        }
        if (i5 == 64) {
            return k();
        }
        if (i5 != 128) {
            return cVar;
        }
        u0 u0Var2 = this.f2415f;
        i iVarE = u0Var2 != null ? u0Var2.f2427a.e() : e();
        if (iVarE == null) {
            return cVar;
        }
        DisplayCutout displayCutout = iVarE.f2395a;
        return D.c.b(AbstractC0123h.d(displayCutout), AbstractC0123h.f(displayCutout), AbstractC0123h.e(displayCutout), AbstractC0123h.c(displayCutout));
    }

    public void v(D.c cVar) {
        this.f2416g = cVar;
    }
}
