package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import k.ViewTreeObserverOnGlobalLayoutListenerC0645d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\M.smali */
public final class M extends C0725z0 implements O {

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f8474E;

    /* renamed from: F, reason: collision with root package name */
    public K f8475F;
    public final Rect G;

    /* renamed from: H, reason: collision with root package name */
    public int f8476H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ P f8477I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p5, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903998);
        this.f8477I = p5;
        this.G = new Rect();
        this.f8738s = p5;
        this.f8722C = true;
        this.f8723D.setFocusable(true);
        this.f8739t = new b2.t(this, 1);
    }

    @Override // l.O
    public final void e(int i, int i5) {
        ViewTreeObserver viewTreeObserver;
        C0722y c0722y = this.f8723D;
        boolean zIsShowing = c0722y.isShowing();
        s();
        this.f8723D.setInputMethodMode(2);
        f();
        C0703n0 c0703n0 = this.f8726c;
        c0703n0.setChoiceMode(1);
        H.d(c0703n0, i);
        H.c(c0703n0, i5);
        P p5 = this.f8477I;
        int selectedItemPosition = p5.getSelectedItemPosition();
        C0703n0 c0703n02 = this.f8726c;
        if (c0722y.isShowing() && c0703n02 != null) {
            c0703n02.setListSelectionHidden(false);
            c0703n02.setSelection(selectedItemPosition);
            if (c0703n02.getChoiceMode() != 0) {
                c0703n02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = p5.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0645d viewTreeObserverOnGlobalLayoutListenerC0645d = new ViewTreeObserverOnGlobalLayoutListenerC0645d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0645d);
        this.f8723D.setOnDismissListener(new L(this, viewTreeObserverOnGlobalLayoutListenerC0645d));
    }

    @Override // l.O
    public final CharSequence i() {
        return this.f8474E;
    }

    @Override // l.O
    public final void k(CharSequence charSequence) {
        this.f8474E = charSequence;
    }

    @Override // l.C0725z0, l.O
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f8475F = (K) listAdapter;
    }

    @Override // l.O
    public final void p(int i) {
        this.f8476H = i;
    }

    public final void s() {
        int i;
        C0722y c0722y = this.f8723D;
        Drawable background = c0722y.getBackground();
        P p5 = this.f8477I;
        if (background != null) {
            background.getPadding(p5.f8489l);
            boolean zA = j1.a(p5);
            Rect rect = p5.f8489l;
            i = zA ? rect.right : -rect.left;
        } else {
            Rect rect2 = p5.f8489l;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = p5.getPaddingLeft();
        int paddingRight = p5.getPaddingRight();
        int width = p5.getWidth();
        int i5 = p5.f8488k;
        if (i5 == -2) {
            int iA = p5.a(this.f8475F, c0722y.getBackground());
            int i6 = p5.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = p5.f8489l;
            int i7 = (i6 - rect3.left) - rect3.right;
            if (iA > i7) {
                iA = i7;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i5 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i5);
        }
        this.f8729f = j1.a(p5) ? (((width - paddingRight) - this.f8728e) - this.f8476H) + i : paddingLeft + this.f8476H + i;
    }
}
