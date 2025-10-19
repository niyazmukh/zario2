package M;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\f0.smali */
public final class f0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0120e f2385a;

    /* renamed from: b, reason: collision with root package name */
    public List f2386b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2387c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2388d;

    public f0(C0120e c0120e) {
        super(0);
        this.f2388d = new HashMap();
        this.f2385a = c0120e;
    }

    public final i0 a(WindowInsetsAnimation windowInsetsAnimation) {
        i0 i0Var = (i0) this.f2388d.get(windowInsetsAnimation);
        if (i0Var == null) {
            i0Var = new i0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                i0Var.f2396a = new g0(windowInsetsAnimation);
            }
            this.f2388d.put(windowInsetsAnimation, i0Var);
        }
        return i0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0120e c0120e = this.f2385a;
        a(windowInsetsAnimation);
        ((View) c0120e.f2383e).setTranslationY(0.0f);
        this.f2388d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0120e c0120e = this.f2385a;
        a(windowInsetsAnimation);
        View view = (View) c0120e.f2383e;
        int[] iArr = (int[]) c0120e.f2384f;
        view.getLocationOnScreen(iArr);
        c0120e.f2381c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2387c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2387c = arrayList2;
            this.f2386b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = e0.j(list.get(size));
            i0 i0VarA = a(windowInsetsAnimationJ);
            i0VarA.f2396a.d(windowInsetsAnimationJ.getFraction());
            this.f2387c.add(i0VarA);
        }
        C0120e c0120e = this.f2385a;
        u0 u0VarF = u0.f(null, windowInsets);
        c0120e.a(u0VarF, this.f2386b);
        return u0VarF.e();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0120e c0120e = this.f2385a;
        a(windowInsetsAnimation);
        D.c cVarC = D.c.c(bounds.getLowerBound());
        D.c cVarC2 = D.c.c(bounds.getUpperBound());
        View view = (View) c0120e.f2383e;
        int[] iArr = (int[]) c0120e.f2384f;
        view.getLocationOnScreen(iArr);
        int i = c0120e.f2381c - iArr[1];
        c0120e.f2382d = i;
        view.setTranslationY(i);
        e0.m();
        return e0.h(cVarC.d(), cVarC2.d());
    }
}
