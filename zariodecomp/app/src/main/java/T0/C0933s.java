package t0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\s.1.smali */
public final class C0933s extends AbstractC0907N {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f10113C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f10114D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f10115A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0931q f10116B;

    /* renamed from: a, reason: collision with root package name */
    public final int f10117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10118b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f10119c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f10120d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10121e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10122f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f10123g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10124j;

    /* renamed from: k, reason: collision with root package name */
    public int f10125k;

    /* renamed from: l, reason: collision with root package name */
    public int f10126l;

    /* renamed from: m, reason: collision with root package name */
    public float f10127m;

    /* renamed from: n, reason: collision with root package name */
    public int f10128n;

    /* renamed from: o, reason: collision with root package name */
    public int f10129o;

    /* renamed from: p, reason: collision with root package name */
    public float f10130p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f10133s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f10140z;

    /* renamed from: q, reason: collision with root package name */
    public int f10131q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f10132r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10134t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10135u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f10136v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f10137w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f10138x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f10139y = new int[2];

    public C0933s(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i5, int i6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10140z = valueAnimatorOfFloat;
        this.f10115A = 0;
        RunnableC0931q runnableC0931q = new RunnableC0931q(this, 0 == true ? 1 : 0);
        this.f10116B = runnableC0931q;
        C0932r c0932r = new C0932r(this);
        this.f10119c = stateListDrawable;
        this.f10120d = drawable;
        this.f10123g = stateListDrawable2;
        this.h = drawable2;
        this.f10121e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f10122f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f10124j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f10117a = i5;
        this.f10118b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new F0.i(this));
        valueAnimatorOfFloat.addUpdateListener(new F1.c(this, 3));
        RecyclerView recyclerView2 = this.f10133s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0910Q abstractC0910Q = recyclerView2.f4759q;
            if (abstractC0910Q != null) {
                abstractC0910Q.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f4761r;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f10133s;
            recyclerView3.f4763s.remove(this);
            if (recyclerView3.f4765t == this) {
                recyclerView3.f4765t = null;
            }
            ArrayList arrayList2 = this.f10133s.f4748k0;
            if (arrayList2 != null) {
                arrayList2.remove(c0932r);
            }
            this.f10133s.removeCallbacks(runnableC0931q);
        }
        this.f10133s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f10133s.f4763s.add(this);
            this.f10133s.h(c0932r);
        }
    }

    public static int f(float f2, float f3, int[] iArr, int i, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i - i6;
        int i9 = (int) (((f3 - f2) / i7) * i8);
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    @Override // t0.AbstractC0907N
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f10131q;
        RecyclerView recyclerView2 = this.f10133s;
        if (i != recyclerView2.getWidth() || this.f10132r != recyclerView2.getHeight()) {
            this.f10131q = recyclerView2.getWidth();
            this.f10132r = recyclerView2.getHeight();
            g(0);
            return;
        }
        if (this.f10115A != 0) {
            if (this.f10134t) {
                int i5 = this.f10131q;
                int i6 = this.f10121e;
                int i7 = i5 - i6;
                int i8 = this.f10126l;
                int i9 = this.f10125k;
                int i10 = i8 - (i9 / 2);
                StateListDrawable stateListDrawable = this.f10119c;
                stateListDrawable.setBounds(0, 0, i6, i9);
                int i11 = this.f10132r;
                int i12 = this.f10122f;
                Drawable drawable = this.f10120d;
                drawable.setBounds(0, 0, i12, i11);
                WeakHashMap weakHashMap = M.S.f2363a;
                if (M.C.d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i6, i10);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i6, -i10);
                } else {
                    canvas.translate(i7, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i10);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i7, -i10);
                }
            }
            if (this.f10135u) {
                int i13 = this.f10132r;
                int i14 = this.i;
                int i15 = i13 - i14;
                int i16 = this.f10129o;
                int i17 = this.f10128n;
                int i18 = i16 - (i17 / 2);
                StateListDrawable stateListDrawable2 = this.f10123g;
                stateListDrawable2.setBounds(0, 0, i17, i14);
                int i19 = this.f10131q;
                int i20 = this.f10124j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i19, i20);
                canvas.translate(0.0f, i15);
                drawable2.draw(canvas);
                canvas.translate(i18, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i18, -i15);
            }
        }
    }

    public final boolean d(float f2, float f3) {
        if (f3 >= this.f10132r - this.i) {
            int i = this.f10129o;
            int i5 = this.f10128n;
            if (f2 >= i - (i5 / 2) && f2 <= (i5 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(float f2, float f3) {
        RecyclerView recyclerView = this.f10133s;
        WeakHashMap weakHashMap = M.S.f2363a;
        boolean z4 = M.C.d(recyclerView) == 1;
        int i = this.f10121e;
        if (z4) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f10131q - i) {
            return false;
        }
        int i5 = this.f10126l;
        int i6 = this.f10125k / 2;
        return f3 >= ((float) (i5 - i6)) && f3 <= ((float) (i6 + i5));
    }

    public final void g(int i) {
        RunnableC0931q runnableC0931q = this.f10116B;
        StateListDrawable stateListDrawable = this.f10119c;
        if (i == 2 && this.f10136v != 2) {
            stateListDrawable.setState(f10113C);
            this.f10133s.removeCallbacks(runnableC0931q);
        }
        if (i == 0) {
            this.f10133s.invalidate();
        } else {
            h();
        }
        if (this.f10136v == 2 && i != 2) {
            stateListDrawable.setState(f10114D);
            this.f10133s.removeCallbacks(runnableC0931q);
            this.f10133s.postDelayed(runnableC0931q, 1200);
        } else if (i == 1) {
            this.f10133s.removeCallbacks(runnableC0931q);
            this.f10133s.postDelayed(runnableC0931q, 1500);
        }
        this.f10136v = i;
    }

    public final void h() {
        int i = this.f10115A;
        ValueAnimator valueAnimator = this.f10140z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f10115A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
