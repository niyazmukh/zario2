package b2;

import A2.C0009i;
import E2.C0104g;
import M.AbstractC0126l;
import M.C;
import M.E;
import M.S;
import a.AbstractC0183a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.Y;

/* renamed from: b2.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\o.smali */
public final class C0276o extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f5031a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f5032b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f5033c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f5034d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f5035e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f5036f;

    /* renamed from: k, reason: collision with root package name */
    public final CheckableImageButton f5037k;

    /* renamed from: l, reason: collision with root package name */
    public final C0104g f5038l;

    /* renamed from: m, reason: collision with root package name */
    public int f5039m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f5040n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f5041o;

    /* renamed from: p, reason: collision with root package name */
    public PorterDuff.Mode f5042p;

    /* renamed from: q, reason: collision with root package name */
    public int f5043q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView.ScaleType f5044r;

    /* renamed from: s, reason: collision with root package name */
    public View.OnLongClickListener f5045s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f5046t;

    /* renamed from: u, reason: collision with root package name */
    public final Y f5047u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5048v;

    /* renamed from: w, reason: collision with root package name */
    public EditText f5049w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f5050x;

    /* renamed from: y, reason: collision with root package name */
    public N.d f5051y;

    /* renamed from: z, reason: collision with root package name */
    public final C0273l f5052z;

    public C0276o(TextInputLayout textInputLayout, C0009i c0009i) throws Resources.NotFoundException {
        CharSequence text;
        super(textInputLayout.getContext());
        int i = 0;
        this.f5039m = 0;
        this.f5040n = new LinkedHashSet();
        this.f5052z = new C0273l(this);
        C0274m c0274m = new C0274m(this);
        this.f5050x = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f5031a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f5032b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, 2131231231);
        this.f5033c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, 2131231230);
        this.f5037k = checkableImageButtonA2;
        this.f5038l = new C0104g(this, c0009i);
        Y y4 = new Y(getContext(), null);
        this.f5047u = y4;
        TypedArray typedArray = (TypedArray) c0009i.f205c;
        if (typedArray.hasValue(38)) {
            this.f5034d = r1.d.w(getContext(), c0009i, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f5035e = Q1.k.i(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0009i.I(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(2131886211));
        WeakHashMap weakHashMap = S.f2363a;
        M.B.s(checkableImageButtonA, 2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f5041o = r1.d.w(getContext(), c0009i, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f5042p = Q1.k.i(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f5041o = r1.d.w(getContext(), c0009i, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f5042p = Q1.k.i(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(2131100366));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f5043q) {
            this.f5043q = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeS = AbstractC0183a.s(typedArray.getInt(31, -1));
            this.f5044r = scaleTypeS;
            checkableImageButtonA2.setScaleType(scaleTypeS);
            checkableImageButtonA.setScaleType(scaleTypeS);
        }
        y4.setVisibility(8);
        y4.setId(2131231238);
        y4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        E.f(y4, 1);
        y4.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            y4.setTextColor(c0009i.F(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f5046t = TextUtils.isEmpty(text3) ? null : text3;
        y4.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(y4);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f6157i0.add(c0274m);
        if (textInputLayout.f6149d != null) {
            c0274m.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0275n(this, i));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(2131427373, viewGroup, false);
        checkableImageButton.setId(i);
        if (r1.d.L(getContext())) {
            AbstractC0126l.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final AbstractC0277p b() {
        AbstractC0277p c0267f;
        int i = this.f5039m;
        C0104g c0104g = this.f5038l;
        SparseArray sparseArray = (SparseArray) c0104g.f1449d;
        AbstractC0277p wVar = (AbstractC0277p) sparseArray.get(i);
        if (wVar == null) {
            C0276o c0276o = (C0276o) c0104g.f1450e;
            if (i == -1) {
                c0267f = new C0267f(c0276o, 0);
            } else if (i == 0) {
                c0267f = new C0267f(c0276o, 1);
            } else if (i == 1) {
                wVar = new w(c0276o, c0104g.f1448c);
                sparseArray.append(i, wVar);
            } else if (i == 2) {
                c0267f = new C0266e(c0276o);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(B.a.g(i, "Invalid end icon mode: "));
                }
                c0267f = new C0272k(c0276o);
            }
            wVar = c0267f;
            sparseArray.append(i, wVar);
        }
        return wVar;
    }

    public final int c() {
        int iC;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f5037k;
            iC = AbstractC0126l.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iC = 0;
        }
        WeakHashMap weakHashMap = S.f2363a;
        return C.e(this.f5047u) + C.e(this) + iC;
    }

    public final boolean d() {
        return this.f5032b.getVisibility() == 0 && this.f5037k.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f5033c.getVisibility() == 0;
    }

    public final void f(boolean z4) {
        boolean z5;
        boolean zIsActivated;
        boolean z6;
        AbstractC0277p abstractC0277pB = b();
        boolean zK = abstractC0277pB.k();
        CheckableImageButton checkableImageButton = this.f5037k;
        boolean z7 = true;
        if (!zK || (z6 = checkableImageButton.f6075d) == abstractC0277pB.l()) {
            z5 = false;
        } else {
            checkableImageButton.setChecked(!z6);
            z5 = true;
        }
        if (!(abstractC0277pB instanceof C0272k) || (zIsActivated = checkableImageButton.isActivated()) == abstractC0277pB.j()) {
            z7 = z5;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z4 || z7) {
            AbstractC0183a.c0(this.f5031a, checkableImageButton, this.f5041o);
        }
    }

    public final void g(int i) throws Resources.NotFoundException {
        if (this.f5039m == i) {
            return;
        }
        AbstractC0277p abstractC0277pB = b();
        N.d dVar = this.f5051y;
        AccessibilityManager accessibilityManager = this.f5050x;
        if (dVar != null && accessibilityManager != null) {
            N.c.b(accessibilityManager, dVar);
        }
        this.f5051y = null;
        abstractC0277pB.s();
        this.f5039m = i;
        Iterator it = this.f5040n.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        AbstractC0277p abstractC0277pB2 = b();
        int iD = this.f5038l.f1447b;
        if (iD == 0) {
            iD = abstractC0277pB2.d();
        }
        Drawable drawableB = iD != 0 ? r1.d.B(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f5037k;
        checkableImageButton.setImageDrawable(drawableB);
        TextInputLayout textInputLayout = this.f5031a;
        if (drawableB != null) {
            AbstractC0183a.f(textInputLayout, checkableImageButton, this.f5041o, this.f5042p);
            AbstractC0183a.c0(textInputLayout, checkableImageButton, this.f5041o);
        }
        int iC = abstractC0277pB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0277pB2.k());
        if (!abstractC0277pB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0277pB2.r();
        N.d dVarH = abstractC0277pB2.h();
        this.f5051y = dVarH;
        if (dVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = S.f2363a;
            if (E.b(this)) {
                N.c.a(accessibilityManager, this.f5051y);
            }
        }
        View.OnClickListener onClickListenerF = abstractC0277pB2.f();
        View.OnLongClickListener onLongClickListener = this.f5045s;
        checkableImageButton.setOnClickListener(onClickListenerF);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
        EditText editText = this.f5049w;
        if (editText != null) {
            abstractC0277pB2.m(editText);
            j(abstractC0277pB2);
        }
        AbstractC0183a.f(textInputLayout, checkableImageButton, this.f5041o, this.f5042p);
        f(true);
    }

    public final void h(boolean z4) throws Resources.NotFoundException {
        if (d() != z4) {
            this.f5037k.setVisibility(z4 ? 0 : 8);
            k();
            m();
            this.f5031a.q();
        }
    }

    public final void i(Drawable drawable) throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f5033c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        AbstractC0183a.f(this.f5031a, checkableImageButton, this.f5034d, this.f5035e);
    }

    public final void j(AbstractC0277p abstractC0277p) {
        if (this.f5049w == null) {
            return;
        }
        if (abstractC0277p.e() != null) {
            this.f5049w.setOnFocusChangeListener(abstractC0277p.e());
        }
        if (abstractC0277p.g() != null) {
            this.f5037k.setOnFocusChangeListener(abstractC0277p.g());
        }
    }

    public final void k() {
        this.f5032b.setVisibility((this.f5037k.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f5046t == null || this.f5048v) ? 8 : false)) ? 0 : 8);
    }

    public final void l() throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f5033c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f5031a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f6165n.f5079q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f5039m != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() throws Resources.NotFoundException {
        int iE;
        TextInputLayout textInputLayout = this.f5031a;
        if (textInputLayout.f6149d == null) {
            return;
        }
        if (d() || e()) {
            iE = 0;
        } else {
            EditText editText = textInputLayout.f6149d;
            WeakHashMap weakHashMap = S.f2363a;
            iE = C.e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131100235);
        int paddingTop = textInputLayout.f6149d.getPaddingTop();
        int paddingBottom = textInputLayout.f6149d.getPaddingBottom();
        WeakHashMap weakHashMap2 = S.f2363a;
        C.k(this.f5047u, dimensionPixelSize, paddingTop, iE, paddingBottom);
    }

    public final void n() {
        Y y4 = this.f5047u;
        int visibility = y4.getVisibility();
        int i = (this.f5046t == null || this.f5048v) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        y4.setVisibility(i);
        this.f5031a.q();
    }
}
