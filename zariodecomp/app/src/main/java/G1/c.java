package G1;

import M.C;
import M.S;
import N2.AbstractC0156x;
import X1.h;
import X1.m;
import X1.x;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G1\c.smali */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f1814a;

    /* renamed from: b, reason: collision with root package name */
    public m f1815b;

    /* renamed from: c, reason: collision with root package name */
    public int f1816c;

    /* renamed from: d, reason: collision with root package name */
    public int f1817d;

    /* renamed from: e, reason: collision with root package name */
    public int f1818e;

    /* renamed from: f, reason: collision with root package name */
    public int f1819f;

    /* renamed from: g, reason: collision with root package name */
    public int f1820g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1821j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1822k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1823l;

    /* renamed from: m, reason: collision with root package name */
    public h f1824m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1828q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f1830s;

    /* renamed from: t, reason: collision with root package name */
    public int f1831t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1825n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1826o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1827p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1829r = true;

    public c(MaterialButton materialButton, m mVar) {
        this.f1814a = materialButton;
        this.f1815b = mVar;
    }

    public final x a() {
        RippleDrawable rippleDrawable = this.f1830s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f1830s.getNumberOfLayers() > 2 ? (x) this.f1830s.getDrawable(2) : (x) this.f1830s.getDrawable(1);
    }

    public final h b(boolean z4) {
        RippleDrawable rippleDrawable = this.f1830s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.f1830s.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0);
    }

    public final void c(m mVar) {
        this.f1815b = mVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(mVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(mVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(mVar);
        }
    }

    public final void d(int i, int i5) {
        WeakHashMap weakHashMap = S.f2363a;
        MaterialButton materialButton = this.f1814a;
        int iF = C.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iE = C.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i6 = this.f1818e;
        int i7 = this.f1819f;
        this.f1819f = i5;
        this.f1818e = i;
        if (!this.f1826o) {
            e();
        }
        C.k(materialButton, iF, (paddingTop + i) - i6, iE, (paddingBottom + i5) - i7);
    }

    public final void e() {
        h hVar = new h(this.f1815b);
        MaterialButton materialButton = this.f1814a;
        hVar.j(materialButton.getContext());
        E.b.h(hVar, this.f1821j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            E.b.i(hVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f1822k;
        hVar.f3738a.f3729j = f2;
        hVar.invalidateSelf();
        hVar.q(colorStateList);
        h hVar2 = new h(this.f1815b);
        hVar2.setTint(0);
        float f3 = this.h;
        int I4 = this.f1825n ? AbstractC0156x.I(materialButton, 2130903314) : 0;
        hVar2.f3738a.f3729j = f3;
        hVar2.invalidateSelf();
        hVar2.q(ColorStateList.valueOf(I4));
        h hVar3 = new h(this.f1815b);
        this.f1824m = hVar3;
        E.b.g(hVar3, -1);
        ColorStateList colorStateListValueOf = this.f1823l;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{hVar2, hVar}), this.f1816c, this.f1818e, this.f1817d, this.f1819f), this.f1824m);
        this.f1830s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        h hVarB = b(false);
        if (hVarB != null) {
            hVarB.l(this.f1831t);
            hVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        h hVarB = b(false);
        h hVarB2 = b(true);
        if (hVarB != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f1822k;
            hVarB.f3738a.f3729j = f2;
            hVarB.invalidateSelf();
            hVarB.q(colorStateList);
            if (hVarB2 != null) {
                float f3 = this.h;
                int I4 = this.f1825n ? AbstractC0156x.I(this.f1814a, 2130903314) : 0;
                hVarB2.f3738a.f3729j = f3;
                hVarB2.invalidateSelf();
                hVarB2.q(ColorStateList.valueOf(I4));
            }
        }
    }
}
