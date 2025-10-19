package H1;

import M.C;
import M.S;
import N2.AbstractC0156x;
import X1.h;
import X1.k;
import X1.l;
import X1.m;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import java.util.WeakHashMap;
import p.AbstractC0817a;
import p.C0818b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\H1\d.smali */
public final class d {

    /* renamed from: y, reason: collision with root package name */
    public static final double f1886y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f1887a;

    /* renamed from: c, reason: collision with root package name */
    public final h f1889c;

    /* renamed from: d, reason: collision with root package name */
    public final h f1890d;

    /* renamed from: e, reason: collision with root package name */
    public int f1891e;

    /* renamed from: f, reason: collision with root package name */
    public int f1892f;

    /* renamed from: g, reason: collision with root package name */
    public int f1893g;
    public int h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1894j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1895k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1896l;

    /* renamed from: m, reason: collision with root package name */
    public m f1897m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f1898n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f1899o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f1900p;

    /* renamed from: q, reason: collision with root package name */
    public h f1901q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1903s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f1904t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f1905u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1906v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1907w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1888b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f1902r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f1908x = 0.0f;

    public d(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f1887a = materialCardView;
        h hVar = new h(materialCardView.getContext(), attributeSet, 2130903769, 2131952641);
        this.f1889c = hVar;
        hVar.j(materialCardView.getContext());
        hVar.o();
        l lVarE = hVar.f3738a.f3722a.e();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, A1.a.f44c, 2130903769, 2131951903);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            lVarE.c(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f1890d = new h();
        h(lVarE.a());
        this.f1905u = AbstractC0156x.e0(materialCardView.getContext(), 2130903839, B1.a.f283a);
        this.f1906v = AbstractC0156x.d0(materialCardView.getContext(), 2130903829, 300);
        this.f1907w = AbstractC0156x.d0(materialCardView.getContext(), 2130903828, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(r1.d dVar, float f2) {
        if (dVar instanceof k) {
            return (float) ((1.0d - f1886y) * f2);
        }
        if (dVar instanceof X1.d) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        r1.d dVar = this.f1897m.f3773a;
        h hVar = this.f1889c;
        return Math.max(Math.max(b(dVar, hVar.h()), b(this.f1897m.f3774b, hVar.f3738a.f3722a.f3778f.a(hVar.g()))), Math.max(b(this.f1897m.f3775c, hVar.f3738a.f3722a.f3779g.a(hVar.g())), b(this.f1897m.f3776d, hVar.f3738a.f3722a.h.a(hVar.g()))));
    }

    public final LayerDrawable c() {
        if (this.f1899o == null) {
            this.f1901q = new h(this.f1897m);
            this.f1899o = new RippleDrawable(this.f1895k, null, this.f1901q);
        }
        if (this.f1900p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f1899o, this.f1890d, this.f1894j});
            this.f1900p = layerDrawable;
            layerDrawable.setId(2, 2131231053);
        }
        return this.f1900p;
    }

    public final c d(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f1887a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new c(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i5) {
        int iCeil;
        int iCeil2;
        int i6;
        int i7;
        if (this.f1900p != null) {
            MaterialCardView materialCardView = this.f1887a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i8 = this.f1893g;
            int i9 = (i8 & 8388613) == 8388613 ? ((i - this.f1891e) - this.f1892f) - iCeil2 : this.f1891e;
            int i10 = (i8 & 80) == 80 ? this.f1891e : ((i5 - this.f1891e) - this.f1892f) - iCeil;
            int i11 = (i8 & 8388613) == 8388613 ? this.f1891e : ((i - this.f1891e) - this.f1892f) - iCeil2;
            int i12 = (i8 & 80) == 80 ? ((i5 - this.f1891e) - this.f1892f) - iCeil : this.f1891e;
            WeakHashMap weakHashMap = S.f2363a;
            if (C.d(materialCardView) == 1) {
                i7 = i11;
                i6 = i9;
            } else {
                i6 = i11;
                i7 = i9;
            }
            this.f1900p.setLayerInset(2, i7, i12, i6, i10);
        }
    }

    public final void f(boolean z4, boolean z5) {
        Drawable drawable = this.f1894j;
        if (drawable != null) {
            if (!z5) {
                drawable.setAlpha(z4 ? 255 : 0);
                this.f1908x = z4 ? 1.0f : 0.0f;
                return;
            }
            float f2 = z4 ? 1.0f : 0.0f;
            float f3 = z4 ? 1.0f - this.f1908x : this.f1908x;
            ValueAnimator valueAnimator = this.f1904t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f1904t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f1908x, f2);
            this.f1904t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new b(this, 0));
            this.f1904t.setInterpolator(this.f1905u);
            this.f1904t.setDuration((long) ((z4 ? this.f1906v : this.f1907w) * f3));
            this.f1904t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f1894j = drawableMutate;
            E.b.h(drawableMutate, this.f1896l);
            f(this.f1887a.f5898n, false);
        } else {
            this.f1894j = null;
        }
        LayerDrawable layerDrawable = this.f1900p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(2131231053, this.f1894j);
        }
    }

    public final void h(m mVar) {
        this.f1897m = mVar;
        h hVar = this.f1889c;
        hVar.setShapeAppearanceModel(mVar);
        hVar.f3759z = !hVar.k();
        h hVar2 = this.f1890d;
        if (hVar2 != null) {
            hVar2.setShapeAppearanceModel(mVar);
        }
        h hVar3 = this.f1901q;
        if (hVar3 != null) {
            hVar3.setShapeAppearanceModel(mVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f1887a;
        return materialCardView.getPreventCornerOverlap() && this.f1889c.k() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f1887a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable drawableC = j() ? c() : this.f1890d;
        this.i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f1887a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f1887a;
        float cardViewRadius = 0.0f;
        float fA = ((materialCardView.getPreventCornerOverlap() && !this.f1889c.k()) || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f1886y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.f1888b;
        materialCardView.f9294c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        S0.c cVar = materialCardView.f9296e;
        if (!((AbstractC0817a) cVar.f2848c).getUseCompatPadding()) {
            cVar.t(0, 0, 0, 0);
            return;
        }
        C0818b c0818b = (C0818b) ((Drawable) cVar.f2847b);
        float f2 = c0818b.f9301e;
        float f3 = c0818b.f9297a;
        AbstractC0817a abstractC0817a = (AbstractC0817a) cVar.f2848c;
        int iCeil = (int) Math.ceil(p.c.a(f2, f3, abstractC0817a.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(p.c.b(f2, f3, abstractC0817a.getPreventCornerOverlap()));
        cVar.t(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z4 = this.f1902r;
        MaterialCardView materialCardView = this.f1887a;
        if (!z4) {
            materialCardView.setBackgroundInternal(d(this.f1889c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
