package F0;

import M.E;
import M.S;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\g.smali */
public final class g extends n {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f1593A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final c f1594B;

    /* renamed from: C, reason: collision with root package name */
    public static final c f1595C;

    /* renamed from: D, reason: collision with root package name */
    public static final c f1596D;

    /* renamed from: E, reason: collision with root package name */
    public static final c f1597E;

    /* renamed from: F, reason: collision with root package name */
    public static final c f1598F;

    static {
        new b(PointF.class, "boundsOrigin").f1582a = new Rect();
        f1594B = new c(PointF.class, "topLeft", 0);
        f1595C = new c(PointF.class, "bottomRight", 1);
        f1596D = new c(PointF.class, "bottomRight", 2);
        f1597E = new c(PointF.class, "topLeft", 3);
        f1598F = new c(PointF.class, "position", 4);
    }

    public static void G(s sVar) {
        View view = sVar.f1644b;
        WeakHashMap weakHashMap = S.f2363a;
        if (!E.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = sVar.f1643a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", sVar.f1644b.getParent());
    }

    @Override // F0.n
    public final void d(s sVar) {
        G(sVar);
    }

    @Override // F0.n
    public final void g(s sVar) {
        G(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F0.n
    public final Animator k(FrameLayout frameLayout, s sVar, s sVar2) {
        int i;
        g gVar;
        ObjectAnimator objectAnimatorOfObject;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        HashMap map = sVar.f1643a;
        HashMap map2 = sVar2.f1643a;
        ViewGroup viewGroup = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup2 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup == null || viewGroup2 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i5 = rect.left;
        int i6 = rect2.left;
        int i7 = rect.top;
        int i8 = rect2.top;
        int i9 = rect.right;
        int i10 = rect2.right;
        int i11 = rect.bottom;
        int i12 = rect2.bottom;
        int i13 = i9 - i5;
        int i14 = i11 - i7;
        int i15 = i10 - i6;
        int i16 = i12 - i8;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
            i = 0;
        } else {
            i = (i5 == i6 && i7 == i8) ? 0 : 1;
            if (i9 != i10 || i11 != i12) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        c cVar = t.f1646a;
        View view = sVar2.f1644b;
        view.setLeftTopRightBottom(i5, i7, i9, i11);
        if (i != 2) {
            gVar = this;
            if (i5 == i6 && i7 == i8) {
                gVar.f1635w.getClass();
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, f1596D, (TypeConverter) null, X1.e.i(i9, i11, i10, i12));
            } else {
                gVar.f1635w.getClass();
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, f1597E, (TypeConverter) null, X1.e.i(i5, i7, i6, i8));
            }
        } else if (i13 == i15 && i14 == i16) {
            gVar = this;
            gVar.f1635w.getClass();
            objectAnimatorOfObject = ObjectAnimator.ofObject(view, f1598F, (TypeConverter) null, X1.e.i(i5, i7, i6, i8));
        } else {
            gVar = this;
            f fVar = new f();
            fVar.f1590e = view;
            gVar.f1635w.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(fVar, f1594B, (TypeConverter) null, X1.e.i(i5, i7, i6, i8));
            gVar.f1635w.getClass();
            ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(fVar, f1595C, (TypeConverter) null, X1.e.i(i9, i11, i10, i12));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
            animatorSet.addListener(new d(fVar));
            objectAnimatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            viewGroup3.suppressLayout(true);
            gVar.a(new e(viewGroup3));
        }
        return objectAnimatorOfObject;
    }

    @Override // F0.n
    public final String[] p() {
        return f1593A;
    }
}
