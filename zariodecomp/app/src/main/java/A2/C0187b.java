package a2;

import android.animation.ValueAnimator;
import j0.C0623a;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a2.1\b.smali */
public final class C0187b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0193h f4063b;

    public /* synthetic */ C0187b(AbstractC0193h abstractC0193h, int i, byte b5) {
        this.f4062a = i;
        this.f4063b = abstractC0193h;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC0193h abstractC0193h = this.f4063b;
        switch (this.f4062a) {
            case 0:
                abstractC0193h.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abstractC0193h.i.setScaleX(fFloatValue);
                abstractC0193h.i.setScaleY(fFloatValue);
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C0623a c0623a = AbstractC0193h.f4079u;
                abstractC0193h.i.setTranslationY(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C0623a c0623a2 = AbstractC0193h.f4079u;
                abstractC0193h.i.setTranslationY(iIntValue2);
                break;
        }
    }

    public C0187b(AbstractC0193h abstractC0193h, int i) {
        this.f4062a = 2;
        this.f4063b = abstractC0193h;
    }
}
