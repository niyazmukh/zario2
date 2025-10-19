package F1;

import M.B;
import M.S;
import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import d2.C0444a;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.C0933s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F1\c.smali */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1669b;

    public /* synthetic */ c(Object obj, int i) {
        this.f1668a = i;
        this.f1669b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f1669b;
        switch (this.f1668a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                X1.h hVar = ((BottomSheetBehavior) obj).i;
                if (hVar != null) {
                    hVar.n(fFloatValue);
                    break;
                }
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Z1.c cVar = (Z1.c) obj;
                Iterator it = cVar.f3998o.iterator();
                while (it.hasNext()) {
                    C0444a c0444a = (C0444a) it.next();
                    c0444a.f6796P = 1.2f;
                    c0444a.f6794N = fFloatValue2;
                    c0444a.f6795O = fFloatValue2;
                    c0444a.f6797Q = B1.a.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue2);
                    c0444a.invalidateSelf();
                }
                WeakHashMap weakHashMap = S.f2363a;
                B.k(cVar);
                break;
            case 2:
                ((TextInputLayout) obj).f6188y0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0933s c0933s = (C0933s) obj;
                c0933s.f10119c.setAlpha(iFloatValue);
                c0933s.f10120d.setAlpha(iFloatValue);
                c0933s.f10133s.invalidate();
                break;
        }
    }
}
