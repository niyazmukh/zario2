package b2;

import A2.C0004d;
import A2.RunnableC0005e;
import M.S;
import N2.AbstractC0156x;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: b2.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\k.smali */
public final class C0272k extends AbstractC0277p {

    /* renamed from: e, reason: collision with root package name */
    public final int f5015e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5016f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f5017g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0262a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0263b f5018j;

    /* renamed from: k, reason: collision with root package name */
    public final C0004d f5019k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5020l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5021m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5022n;

    /* renamed from: o, reason: collision with root package name */
    public long f5023o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f5024p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f5025q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f5026r;

    public C0272k(C0276o c0276o) {
        super(c0276o);
        int i = 1;
        this.i = new ViewOnClickListenerC0262a(this, i);
        this.f5018j = new ViewOnFocusChangeListenerC0263b(this, i);
        this.f5019k = new C0004d(this, 12);
        this.f5023o = Long.MAX_VALUE;
        this.f5016f = AbstractC0156x.d0(c0276o.getContext(), 2130903830, 67);
        this.f5015e = AbstractC0156x.d0(c0276o.getContext(), 2130903830, 50);
        this.f5017g = AbstractC0156x.e0(c0276o.getContext(), 2130903839, B1.a.f283a);
    }

    @Override // b2.AbstractC0277p
    public final void a() {
        if (this.f5024p.isTouchExplorationEnabled() && S0.f.M(this.h) && !this.f5056d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new RunnableC0005e(this, 21));
    }

    @Override // b2.AbstractC0277p
    public final int c() {
        return 2131886234;
    }

    @Override // b2.AbstractC0277p
    public final int d() {
        return 2131165403;
    }

    @Override // b2.AbstractC0277p
    public final View.OnFocusChangeListener e() {
        return this.f5018j;
    }

    @Override // b2.AbstractC0277p
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // b2.AbstractC0277p
    public final N.d h() {
        return this.f5019k;
    }

    @Override // b2.AbstractC0277p
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // b2.AbstractC0277p
    public final boolean j() {
        return this.f5020l;
    }

    @Override // b2.AbstractC0277p
    public final boolean l() {
        return this.f5022n;
    }

    @Override // b2.AbstractC0277p
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: b2.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0272k c0272k = this.f5013a;
                c0272k.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0272k.f5023o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0272k.f5021m = false;
                    }
                    c0272k.u();
                    c0272k.f5021m = true;
                    c0272k.f5023o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: b2.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0272k c0272k = this.f5014a;
                c0272k.f5021m = true;
                c0272k.f5023o = System.currentTimeMillis();
                c0272k.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f5053a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!S0.f.M(editText) && this.f5024p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f2363a;
            M.B.s(this.f5056d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // b2.AbstractC0277p
    public final void n(N.o oVar) {
        boolean zM = S0.f.M(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
        if (!zM) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // b2.AbstractC0277p
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f5024p.isEnabled() || S0.f.M(this.h)) {
            return;
        }
        boolean z4 = accessibilityEvent.getEventType() == 32768 && this.f5022n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z4) {
            u();
            this.f5021m = true;
            this.f5023o = System.currentTimeMillis();
        }
    }

    @Override // b2.AbstractC0277p
    public final void r() {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f5017g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f5016f);
        valueAnimatorOfFloat.addUpdateListener(new H1.b(this, i));
        this.f5026r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f5015e);
        valueAnimatorOfFloat2.addUpdateListener(new H1.b(this, i));
        this.f5025q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new D1.a(this, 5));
        this.f5024p = (AccessibilityManager) this.f5055c.getSystemService("accessibility");
    }

    @Override // b2.AbstractC0277p
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z4) {
        if (this.f5022n != z4) {
            this.f5022n = z4;
            this.f5026r.cancel();
            this.f5025q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f5023o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f5021m = false;
        }
        if (this.f5021m) {
            this.f5021m = false;
            return;
        }
        t(!this.f5022n);
        if (!this.f5022n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
