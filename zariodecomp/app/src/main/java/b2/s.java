package b2;

import M.C;
import M.E;
import M.S;
import N2.AbstractC0156x;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\s.smali */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f5063A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f5064B;

    /* renamed from: a, reason: collision with root package name */
    public final int f5065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5066b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5067c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f5068d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f5069e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f5070f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f5071g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f5072j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f5073k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f5074l;

    /* renamed from: m, reason: collision with root package name */
    public final float f5075m;

    /* renamed from: n, reason: collision with root package name */
    public int f5076n;

    /* renamed from: o, reason: collision with root package name */
    public int f5077o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f5078p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5079q;

    /* renamed from: r, reason: collision with root package name */
    public Y f5080r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f5081s;

    /* renamed from: t, reason: collision with root package name */
    public int f5082t;

    /* renamed from: u, reason: collision with root package name */
    public int f5083u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f5084v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f5085w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5086x;

    /* renamed from: y, reason: collision with root package name */
    public Y f5087y;

    /* renamed from: z, reason: collision with root package name */
    public int f5088z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5071g = context;
        this.h = textInputLayout;
        this.f5075m = context.getResources().getDimensionPixelSize(2131099801);
        this.f5065a = AbstractC0156x.d0(context, 2130903831, 217);
        this.f5066b = AbstractC0156x.d0(context, 2130903827, 167);
        this.f5067c = AbstractC0156x.d0(context, 2130903831, 167);
        this.f5068d = AbstractC0156x.e0(context, 2130903836, B1.a.f286d);
        LinearInterpolator linearInterpolator = B1.a.f283a;
        this.f5069e = AbstractC0156x.e0(context, 2130903836, linearInterpolator);
        this.f5070f = AbstractC0156x.e0(context, 2130903839, linearInterpolator);
    }

    public final void a(Y y4, int i) {
        if (this.i == null && this.f5073k == null) {
            Context context = this.f5071g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f5073k = new FrameLayout(context);
            this.i.addView(this.f5073k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f5073k.setVisibility(0);
            this.f5073k.addView(y4);
        } else {
            this.i.addView(y4, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f5072j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f5071g;
                boolean zL = r1.d.L(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = S.f2363a;
                int iF = C.f(editText);
                if (zL) {
                    iF = context.getResources().getDimensionPixelSize(2131100233);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131100232);
                if (zL) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131100234);
                }
                int iE = C.e(editText);
                if (zL) {
                    iE = context.getResources().getDimensionPixelSize(2131100233);
                }
                C.k(linearLayout, iF, dimensionPixelSize, iE, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f5074l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z4, Y y4, int i, int i5, int i6) {
        if (y4 == null || !z4) {
            return;
        }
        if (i == i6 || i == i5) {
            boolean z5 = i6 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(y4, (Property<Y, Float>) View.ALPHA, z5 ? 1.0f : 0.0f);
            int i7 = this.f5067c;
            objectAnimatorOfFloat.setDuration(z5 ? this.f5066b : i7);
            objectAnimatorOfFloat.setInterpolator(z5 ? this.f5069e : this.f5070f);
            if (i == i6 && i5 != 0) {
                objectAnimatorOfFloat.setStartDelay(i7);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i6 != i || i5 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(y4, (Property<Y, Float>) View.TRANSLATION_Y, -this.f5075m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f5065a);
            objectAnimatorOfFloat2.setInterpolator(this.f5068d);
            objectAnimatorOfFloat2.setStartDelay(i7);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f5080r;
        }
        if (i != 2) {
            return null;
        }
        return this.f5087y;
    }

    public final void f() {
        this.f5078p = null;
        c();
        if (this.f5076n == 1) {
            if (!this.f5086x || TextUtils.isEmpty(this.f5085w)) {
                this.f5077o = 0;
            } else {
                this.f5077o = 2;
            }
        }
        i(this.f5076n, this.f5077o, h(this.f5080r, ""));
    }

    public final void g(Y y4, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f5073k) != null) {
            frameLayout.removeView(y4);
        } else {
            linearLayout.removeView(y4);
        }
        int i5 = this.f5072j - 1;
        this.f5072j = i5;
        LinearLayout linearLayout2 = this.i;
        if (i5 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(Y y4, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f2363a;
        TextInputLayout textInputLayout = this.h;
        return E.c(textInputLayout) && textInputLayout.isEnabled() && !(this.f5077o == this.f5076n && y4 != null && TextUtils.equals(y4.getText(), charSequence));
    }

    public final void i(int i, int i5, boolean z4) {
        TextView textViewE;
        TextView textViewE2;
        if (i == i5) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5074l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f5086x, this.f5087y, 2, i, i5);
            d(arrayList, this.f5079q, this.f5080r, 1, i, i5);
            int size = arrayList.size();
            long jMax = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Animator animator = (Animator) arrayList.get(i6);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new q(this, i5, e(i), i, e(i5)));
            animatorSet.start();
        } else if (i != i5) {
            if (i5 != 0 && (textViewE2 = e(i5)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewE = e(i)) != null) {
                textViewE.setVisibility(4);
                if (i == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f5076n = i5;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z4, false);
        textInputLayout.x();
    }
}
