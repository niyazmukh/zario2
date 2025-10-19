package b2;

import A2.RunnableC0005e;
import N2.AbstractC0156x;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: b2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\e.smali */
public final class C0266e extends AbstractC0277p {

    /* renamed from: e, reason: collision with root package name */
    public final int f5002e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5003f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f5004g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0262a f5005j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0263b f5006k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f5007l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f5008m;

    public C0266e(C0276o c0276o) {
        super(c0276o);
        this.f5005j = new ViewOnClickListenerC0262a(this, 0);
        this.f5006k = new ViewOnFocusChangeListenerC0263b(this, 0);
        this.f5002e = AbstractC0156x.d0(c0276o.getContext(), 2130903830, 100);
        this.f5003f = AbstractC0156x.d0(c0276o.getContext(), 2130903830, 150);
        this.f5004g = AbstractC0156x.e0(c0276o.getContext(), 2130903839, B1.a.f283a);
        this.h = AbstractC0156x.e0(c0276o.getContext(), 2130903837, B1.a.f286d);
    }

    @Override // b2.AbstractC0277p
    public final void a() {
        if (this.f5054b.f5046t != null) {
            return;
        }
        t(u());
    }

    @Override // b2.AbstractC0277p
    public final int c() {
        return 2131886166;
    }

    @Override // b2.AbstractC0277p
    public final int d() {
        return 2131165406;
    }

    @Override // b2.AbstractC0277p
    public final View.OnFocusChangeListener e() {
        return this.f5006k;
    }

    @Override // b2.AbstractC0277p
    public final View.OnClickListener f() {
        return this.f5005j;
    }

    @Override // b2.AbstractC0277p
    public final View.OnFocusChangeListener g() {
        return this.f5006k;
    }

    @Override // b2.AbstractC0277p
    public final void m(EditText editText) {
        this.i = editText;
        this.f5053a.setEndIconVisible(u());
    }

    @Override // b2.AbstractC0277p
    public final void p(boolean z4) {
        if (this.f5054b.f5046t == null) {
            return;
        }
        t(z4);
    }

    @Override // b2.AbstractC0277p
    public final void r() {
        final int i = 1;
        final int i5 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f5003f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: b2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0266e f4999b;

            {
                this.f4999b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i;
                C0266e c0266e = this.f4999b;
                c0266e.getClass();
                switch (i6) {
                    case 0:
                        c0266e.f5056d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0266e.f5056d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f5004g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i6 = this.f5002e;
        valueAnimatorOfFloat2.setDuration(i6);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: b2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0266e f4999b;

            {
                this.f4999b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i62 = i5;
                C0266e c0266e = this.f4999b;
                c0266e.getClass();
                switch (i62) {
                    case 0:
                        c0266e.f5056d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0266e.f5056d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5007l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f5007l.addListener(new C0265d(this, i5));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i6);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: b2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0266e f4999b;

            {
                this.f4999b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i62 = i5;
                C0266e c0266e = this.f4999b;
                c0266e.getClass();
                switch (i62) {
                    case 0:
                        c0266e.f5056d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0266e.f5056d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f5008m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0265d(this, i));
    }

    @Override // b2.AbstractC0277p
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new RunnableC0005e(this, 20));
        }
    }

    public final void t(boolean z4) {
        boolean z5 = this.f5054b.d() == z4;
        if (z4 && !this.f5007l.isRunning()) {
            this.f5008m.cancel();
            this.f5007l.start();
            if (z5) {
                this.f5007l.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f5007l.cancel();
        this.f5008m.start();
        if (z5) {
            this.f5008m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.f5056d.hasFocus()) && this.i.getText().length() > 0;
    }
}
