package l;

import a.AbstractC0183a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\A.smali */
public class C0672A extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0708q f8433a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.T f8434b;

    /* renamed from: c, reason: collision with root package name */
    public final W f8435c;

    /* renamed from: d, reason: collision with root package name */
    public u f8436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0672A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903926);
        W0.a(context);
        V0.a(getContext(), this);
        C0708q c0708q = new C0708q(this);
        this.f8433a = c0708q;
        c0708q.e(attributeSet, 2130903926);
        A2.T t4 = new A2.T(this);
        this.f8434b = t4;
        t4.z(attributeSet, 2130903926);
        W w4 = new W(this);
        this.f8435c = w4;
        w4.f(attributeSet, 2130903926);
        getEmojiTextViewHelper().a(attributeSet, 2130903926);
    }

    private u getEmojiTextViewHelper() {
        if (this.f8436d == null) {
            this.f8436d = new u(this);
        }
        return this.f8436d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A2.T t4 = this.f8434b;
        if (t4 != null) {
            t4.l();
        }
        W w4 = this.f8435c;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0708q c0708q = this.f8433a;
        if (c0708q != null) {
            c0708q.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        A2.T t4 = this.f8434b;
        if (t4 != null) {
            return t4.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        A2.T t4 = this.f8434b;
        if (t4 != null) {
            return t4.w();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        C0708q c0708q = this.f8433a;
        if (c0708q != null) {
            return (ColorStateList) c0708q.f8659a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0708q c0708q = this.f8433a;
        if (c0708q != null) {
            return (PorterDuff.Mode) c0708q.f8660b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8435c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8435c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A2.T t4 = this.f8434b;
        if (t4 != null) {
            t4.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A2.T t4 = this.f8434b;
        if (t4 != null) {
            t4.C(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0708q c0708q = this.f8433a;
        if (c0708q != null) {
            if (c0708q.f8663e) {
                c0708q.f8663e = false;
            } else {
                c0708q.f8663e = true;
                c0708q.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8435c;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8435c;
        if (w4 != null) {
            w4.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0183a) getEmojiTextViewHelper().f8701b.b).E(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A2.T t4 = this.f8434b;
        if (t4 != null) {
            t4.I(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A2.T t4 = this.f8434b;
        if (t4 != null) {
            t4.J(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0708q c0708q = this.f8433a;
        if (c0708q != null) {
            c0708q.f8659a = colorStateList;
            c0708q.f8661c = true;
            c0708q.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0708q c0708q = this.f8433a;
        if (c0708q != null) {
            c0708q.f8660b = mode;
            c0708q.f8662d = true;
            c0708q.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w4 = this.f8435c;
        w4.i(colorStateList);
        w4.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w4 = this.f8435c;
        w4.j(mode);
        w4.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(r1.d.B(getContext(), i));
    }
}
