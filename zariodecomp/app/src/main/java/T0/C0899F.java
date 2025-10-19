package t0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: t0.F, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\F.smali */
public final class C0899F extends c0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0899F(AbstractC0910Q abstractC0910Q, int i) {
        super(abstractC0910Q);
        this.f9897d = i;
    }

    @Override // c0.f
    public final int b(View view) {
        switch (this.f9897d) {
            case 0:
                C0911S c0911s = (C0911S) view.getLayoutParams();
                ((AbstractC0910Q) this.f5354b).getClass();
                return view.getRight() + ((C0911S) view.getLayoutParams()).f9928b.right + ((ViewGroup.MarginLayoutParams) c0911s).rightMargin;
            default:
                C0911S c0911s2 = (C0911S) view.getLayoutParams();
                ((AbstractC0910Q) this.f5354b).getClass();
                return view.getBottom() + ((C0911S) view.getLayoutParams()).f9928b.bottom + ((ViewGroup.MarginLayoutParams) c0911s2).bottomMargin;
        }
    }

    @Override // c0.f
    public final int c(View view) {
        switch (this.f9897d) {
            case 0:
                C0911S c0911s = (C0911S) view.getLayoutParams();
                ((AbstractC0910Q) this.f5354b).getClass();
                Rect rect = ((C0911S) view.getLayoutParams()).f9928b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0911s).leftMargin + ((ViewGroup.MarginLayoutParams) c0911s).rightMargin;
            default:
                C0911S c0911s2 = (C0911S) view.getLayoutParams();
                ((AbstractC0910Q) this.f5354b).getClass();
                Rect rect2 = ((C0911S) view.getLayoutParams()).f9928b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0911s2).topMargin + ((ViewGroup.MarginLayoutParams) c0911s2).bottomMargin;
        }
    }

    @Override // c0.f
    public final int d(View view) {
        switch (this.f9897d) {
            case 0:
                C0911S c0911s = (C0911S) view.getLayoutParams();
                ((AbstractC0910Q) this.f5354b).getClass();
                Rect rect = ((C0911S) view.getLayoutParams()).f9928b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0911s).topMargin + ((ViewGroup.MarginLayoutParams) c0911s).bottomMargin;
            default:
                C0911S c0911s2 = (C0911S) view.getLayoutParams();
                ((AbstractC0910Q) this.f5354b).getClass();
                Rect rect2 = ((C0911S) view.getLayoutParams()).f9928b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0911s2).leftMargin + ((ViewGroup.MarginLayoutParams) c0911s2).rightMargin;
        }
    }

    @Override // c0.f
    public final int e(View view) {
        switch (this.f9897d) {
            case 0:
                C0911S c0911s = (C0911S) view.getLayoutParams();
                ((AbstractC0910Q) this.f5354b).getClass();
                return (view.getLeft() - ((C0911S) view.getLayoutParams()).f9928b.left) - ((ViewGroup.MarginLayoutParams) c0911s).leftMargin;
            default:
                C0911S c0911s2 = (C0911S) view.getLayoutParams();
                ((AbstractC0910Q) this.f5354b).getClass();
                return (view.getTop() - ((C0911S) view.getLayoutParams()).f9928b.top) - ((ViewGroup.MarginLayoutParams) c0911s2).topMargin;
        }
    }

    @Override // c0.f
    public final int f() {
        switch (this.f9897d) {
            case 0:
                return ((AbstractC0910Q) this.f5354b).f9925n;
            default:
                return ((AbstractC0910Q) this.f5354b).f9926o;
        }
    }

    @Override // c0.f
    public final int g() {
        switch (this.f9897d) {
            case 0:
                AbstractC0910Q abstractC0910Q = (AbstractC0910Q) this.f5354b;
                return abstractC0910Q.f9925n - abstractC0910Q.D();
            default:
                AbstractC0910Q abstractC0910Q2 = (AbstractC0910Q) this.f5354b;
                return abstractC0910Q2.f9926o - abstractC0910Q2.B();
        }
    }

    @Override // c0.f
    public final int h() {
        switch (this.f9897d) {
            case 0:
                return ((AbstractC0910Q) this.f5354b).D();
            default:
                return ((AbstractC0910Q) this.f5354b).B();
        }
    }

    @Override // c0.f
    public final int i() {
        switch (this.f9897d) {
            case 0:
                return ((AbstractC0910Q) this.f5354b).f9923l;
            default:
                return ((AbstractC0910Q) this.f5354b).f9924m;
        }
    }

    @Override // c0.f
    public final int j() {
        switch (this.f9897d) {
            case 0:
                return ((AbstractC0910Q) this.f5354b).f9924m;
            default:
                return ((AbstractC0910Q) this.f5354b).f9923l;
        }
    }

    @Override // c0.f
    public final int k() {
        switch (this.f9897d) {
            case 0:
                return ((AbstractC0910Q) this.f5354b).C();
            default:
                return ((AbstractC0910Q) this.f5354b).E();
        }
    }

    @Override // c0.f
    public final int l() {
        switch (this.f9897d) {
            case 0:
                AbstractC0910Q abstractC0910Q = (AbstractC0910Q) this.f5354b;
                return (abstractC0910Q.f9925n - abstractC0910Q.C()) - abstractC0910Q.D();
            default:
                AbstractC0910Q abstractC0910Q2 = (AbstractC0910Q) this.f5354b;
                return (abstractC0910Q2.f9926o - abstractC0910Q2.E()) - abstractC0910Q2.B();
        }
    }

    @Override // c0.f
    public final int n(View view) {
        switch (this.f9897d) {
            case 0:
                AbstractC0910Q abstractC0910Q = (AbstractC0910Q) this.f5354b;
                Rect rect = (Rect) this.f5355c;
                abstractC0910Q.I(view, rect);
                return rect.right;
            default:
                AbstractC0910Q abstractC0910Q2 = (AbstractC0910Q) this.f5354b;
                Rect rect2 = (Rect) this.f5355c;
                abstractC0910Q2.I(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // c0.f
    public final int o(View view) {
        switch (this.f9897d) {
            case 0:
                AbstractC0910Q abstractC0910Q = (AbstractC0910Q) this.f5354b;
                Rect rect = (Rect) this.f5355c;
                abstractC0910Q.I(view, rect);
                return rect.left;
            default:
                AbstractC0910Q abstractC0910Q2 = (AbstractC0910Q) this.f5354b;
                Rect rect2 = (Rect) this.f5355c;
                abstractC0910Q2.I(view, rect2);
                return rect2.top;
        }
    }

    @Override // c0.f
    public final void p(int i) {
        switch (this.f9897d) {
            case 0:
                ((AbstractC0910Q) this.f5354b).M(i);
                break;
            default:
                ((AbstractC0910Q) this.f5354b).N(i);
                break;
        }
    }
}
