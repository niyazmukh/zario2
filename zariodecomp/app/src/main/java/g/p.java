package g;

import M.I;
import M.S;
import M.k0;
import M.l0;
import M.m0;
import M.u0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.j1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\p.smali */
public final class p implements M.r, k.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f7219a;

    public /* synthetic */ p(y yVar) {
        this.f7219a = yVar;
    }

    @Override // k.x
    public void a(k.l lVar, boolean z4) {
        x xVar;
        k.l lVarK = lVar.k();
        int i = 0;
        boolean z5 = lVarK != lVar;
        if (z5) {
            lVar = lVarK;
        }
        y yVar = this.f7219a;
        x[] xVarArr = yVar.f7265P;
        int length = xVarArr != null ? xVarArr.length : 0;
        while (true) {
            if (i < length) {
                xVar = xVarArr[i];
                if (xVar != null && xVar.h == lVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                xVar = null;
                break;
            }
        }
        if (xVar != null) {
            if (!z5) {
                yVar.r(xVar, z4);
            } else {
                yVar.p(xVar.f7233a, xVar, lVarK);
                yVar.r(xVar, true);
            }
        }
    }

    @Override // k.x
    public boolean d(k.l lVar) {
        Window.Callback callback;
        if (lVar != lVar.k()) {
            return true;
        }
        y yVar = this.f7219a;
        if (!yVar.f7259J || (callback = yVar.f7288p.getCallback()) == null || yVar.f7270U) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // M.r
    public u0 k(View view, u0 u0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z4;
        u0 u0VarB;
        boolean z5;
        int iD = u0Var.d();
        y yVar = this.f7219a;
        yVar.getClass();
        int iD2 = u0Var.d();
        ActionBarContextView actionBarContextView = yVar.f7298z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yVar.f7298z.getLayoutParams();
            if (yVar.f7298z.isShown()) {
                if (yVar.f7281g0 == null) {
                    yVar.f7281g0 = new Rect();
                    yVar.f7282h0 = new Rect();
                }
                Rect rect = yVar.f7281g0;
                Rect rect2 = yVar.f7282h0;
                rect.set(u0Var.b(), u0Var.d(), u0Var.c(), u0Var.a());
                ViewGroup viewGroup = yVar.f7255E;
                Method method = j1.f8620a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e5) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e5);
                    }
                }
                int i = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = yVar.f7255E;
                WeakHashMap weakHashMap = S.f2363a;
                u0 u0VarA = I.a(viewGroup2);
                int iB = u0VarA == null ? 0 : u0VarA.b();
                int iC = u0VarA == null ? 0 : u0VarA.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z5 = true;
                }
                Context context = yVar.f7287o;
                if (i <= 0 || yVar.G != null) {
                    View view2 = yVar.G;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            yVar.G.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    yVar.G = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    yVar.f7255E.addView(yVar.G, -1, layoutParams);
                }
                View view4 = yVar.G;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = yVar.G;
                    view5.setBackgroundColor((M.B.g(view5) & 8192) != 0 ? B.l.getColor(context, 2131034118) : B.l.getColor(context, 2131034117));
                }
                if (!yVar.f7261L && z) {
                    iD2 = 0;
                }
                z4 = z;
                z = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                z = false;
            }
            if (z) {
                yVar.f7298z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = yVar.G;
        if (view6 != null) {
            view6.setVisibility(z4 ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = u0Var.b();
            int iC2 = u0Var.c();
            int iA = u0Var.a();
            m0 l0Var = Build.VERSION.SDK_INT >= 30 ? new l0(u0Var) : new k0(u0Var);
            l0Var.f(D.c.b(iB2, iD2, iC2, iA));
            u0VarB = l0Var.b();
        } else {
            u0VarB = u0Var;
        }
        WeakHashMap weakHashMap2 = S.f2363a;
        WindowInsets windowInsetsE = u0VarB.e();
        if (windowInsetsE == null) {
            return u0VarB;
        }
        WindowInsets windowInsetsB = M.F.b(view, windowInsetsE);
        return !windowInsetsB.equals(windowInsetsE) ? u0.f(view, windowInsetsB) : u0VarB;
    }
}
