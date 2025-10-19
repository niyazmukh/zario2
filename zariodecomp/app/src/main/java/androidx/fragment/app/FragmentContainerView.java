package androidx.fragment.app;

import B.a;
import M.F;
import M.S;
import M.u0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import f0.AbstractC0490a;
import g0.AbstractActivityC0570w;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0536D;
import g0.C0542J;
import g0.C0548P;
import g0.C0549a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\fragment\app\FragmentContainerView.smali */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4566a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4567b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4568c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4569d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f4566a = new ArrayList();
        this.f4567b = new ArrayList();
        this.f4569d = true;
    }

    public final void a(View view) {
        if (this.f4567b.contains(view)) {
            this.f4566a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        i.e(child, "child");
        Object tag = child.getTag(2131230954);
        if ((tag instanceof AbstractComponentCallbacksC0567t ? (AbstractComponentCallbacksC0567t) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        u0 u0VarF;
        i.e(insets, "insets");
        u0 u0VarF2 = u0.f(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4568c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            i.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            u0VarF = u0.f(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = S.f2363a;
            WindowInsets windowInsetsE = u0VarF2.e();
            if (windowInsetsE != null) {
                WindowInsets windowInsetsB = F.b(this, windowInsetsE);
                if (!windowInsetsB.equals(windowInsetsE)) {
                    u0VarF2 = u0.f(this, windowInsetsB);
                }
            }
            u0VarF = u0VarF2;
        }
        if (!u0VarF.f2427a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = S.f2363a;
                WindowInsets windowInsetsE2 = u0VarF.e();
                if (windowInsetsE2 != null) {
                    WindowInsets windowInsetsA = F.a(childAt, windowInsetsE2);
                    if (!windowInsetsA.equals(windowInsetsE2)) {
                        u0.f(childAt, windowInsetsA);
                    }
                }
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i.e(canvas, "canvas");
        if (this.f4569d) {
            Iterator it = this.f4566a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j5) {
        i.e(canvas, "canvas");
        i.e(child, "child");
        if (this.f4569d) {
            ArrayList arrayList = this.f4566a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j5);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        i.e(view, "view");
        this.f4567b.remove(view);
        if (this.f4566a.remove(view)) {
            this.f4569d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0567t> F getFragment() {
        AbstractActivityC0570w abstractActivityC0570w;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t;
        C0542J c0542jM;
        View view = this;
        while (true) {
            abstractActivityC0570w = null;
            if (view == null) {
                abstractComponentCallbacksC0567t = null;
                break;
            }
            Object tag = view.getTag(2131230954);
            abstractComponentCallbacksC0567t = tag instanceof AbstractComponentCallbacksC0567t ? (AbstractComponentCallbacksC0567t) tag : null;
            if (abstractComponentCallbacksC0567t != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0567t == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0570w) {
                    abstractActivityC0570w = (AbstractActivityC0570w) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0570w == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            c0542jM = abstractActivityC0570w.m();
        } else {
            if (!abstractComponentCallbacksC0567t.w()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0567t + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            c0542jM = abstractComponentCallbacksC0567t.m();
        }
        return (F) c0542jM.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        i.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                i.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        i.d(view, "view");
        a(view);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i5) {
        int i6 = i + i5;
        for (int i7 = i; i7 < i6; i7++) {
            View view = getChildAt(i7);
            i.d(view, "view");
            a(view);
        }
        super.removeViews(i, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i5) {
        int i6 = i + i5;
        for (int i7 = i; i7 < i6; i7++) {
            View view = getChildAt(i7);
            i.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z4) {
        this.f4569d = z4;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        i.e(listener, "listener");
        this.f4568c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        i.e(view, "view");
        if (view.getParent() == this) {
            this.f4567b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        i.e(context, "context");
        this.f4566a = new ArrayList();
        this.f4567b = new ArrayList();
        this.f4569d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0490a.f6987b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, C0542J fm) {
        View view;
        super(context, attrs);
        i.e(context, "context");
        i.e(attrs, "attrs");
        i.e(fm, "fm");
        this.f4566a = new ArrayList();
        this.f4567b = new ArrayList();
        this.f4569d = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC0490a.f6987b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tB = fm.B(id);
        if (classAttribute != null && abstractComponentCallbacksC0567tB == null) {
            if (id == -1) {
                throw new IllegalStateException(a.l("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0536D c0536dE = fm.E();
            context.getClassLoader();
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tA = c0536dE.a(classAttribute);
            i.d(abstractComponentCallbacksC0567tA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0567tA.f7504A = id;
            abstractComponentCallbacksC0567tA.f7505B = id;
            abstractComponentCallbacksC0567tA.f7506C = string;
            abstractComponentCallbacksC0567tA.f7545w = fm;
            abstractComponentCallbacksC0567tA.f7546x = fm.f7347u;
            abstractComponentCallbacksC0567tA.J(context, attrs, null);
            C0549a c0549a = new C0549a(fm);
            c0549a.f7427p = true;
            abstractComponentCallbacksC0567tA.f7511I = this;
            c0549a.e(getId(), abstractComponentCallbacksC0567tA, string, 1);
            if (!c0549a.f7420g) {
                c0549a.h = false;
                c0549a.f7428q.y(c0549a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm.f7331c.f().iterator();
        while (it.hasNext()) {
            C0548P c0548p = (C0548P) it.next();
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p.f7385c;
            if (abstractComponentCallbacksC0567t.f7505B == getId() && (view = abstractComponentCallbacksC0567t.f7512J) != null && view.getParent() == null) {
                abstractComponentCallbacksC0567t.f7511I = this;
                c0548p.b();
            }
        }
    }
}
