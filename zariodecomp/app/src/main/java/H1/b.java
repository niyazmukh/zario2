package H1;

import android.animation.ValueAnimator;
import android.view.View;
import b2.C0272k;
import g.H;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\H1\b.smali */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1885b;

    public /* synthetic */ b(K2.c cVar, View view) {
        this.f1884a = 1;
        this.f1885b = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1884a) {
            case 0:
                d dVar = (d) this.f1885b;
                dVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar.f1894j.setAlpha((int) (255.0f * fFloatValue));
                dVar.f1908x = fFloatValue;
                break;
            case 1:
                ((View) ((H) ((K2.c) this.f1885b).b).i.getParent()).invalidate();
                break;
            default:
                C0272k c0272k = (C0272k) this.f1885b;
                c0272k.getClass();
                c0272k.f5056d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.f1884a = i;
        this.f1885b = obj;
    }
}
