package l;

import A2.C0009i;
import N2.AbstractC0156x;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\x.1.smali */
public final class C0720x extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8710d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final A2.T f8711a;

    /* renamed from: b, reason: collision with root package name */
    public final W f8712b;

    /* renamed from: c, reason: collision with root package name */
    public final C0724z f8713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0720x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903103);
        W0.a(context);
        V0.a(getContext(), this);
        C0009i c0009iY = C0009i.Y(getContext(), attributeSet, f8710d, 2130903103);
        if (((TypedArray) c0009iY.f205c).hasValue(0)) {
            setDropDownBackgroundDrawable(c0009iY.I(0));
        }
        c0009iY.e0();
        A2.T t4 = new A2.T(this);
        this.f8711a = t4;
        t4.z(attributeSet, 2130903103);
        W w4 = new W(this);
        this.f8712b = w4;
        w4.f(attributeSet, 2130903103);
        w4.b();
        C0724z c0724z = new C0724z(this);
        this.f8713c = c0724z;
        c0724z.d(attributeSet, 2130903103);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerC = c0724z.c(keyListener);
        if (keyListenerC == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerC);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A2.T t4 = this.f8711a;
        if (t4 != null) {
            t4.l();
        }
        W w4 = this.f8712b;
        if (w4 != null) {
            w4.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        A2.T t4 = this.f8711a;
        if (t4 != null) {
            return t4.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        A2.T t4 = this.f8711a;
        if (t4 != null) {
            return t4.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8712b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8712b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0156x.R(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f8713c.e(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A2.T t4 = this.f8711a;
        if (t4 != null) {
            t4.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A2.T t4 = this.f8711a;
        if (t4 != null) {
            t4.C(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8712b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8712b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(r1.d.B(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f8713c.f(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8713c.c(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A2.T t4 = this.f8711a;
        if (t4 != null) {
            t4.I(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A2.T t4 = this.f8711a;
        if (t4 != null) {
            t4.J(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w4 = this.f8712b;
        w4.i(colorStateList);
        w4.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w4 = this.f8712b;
        w4.j(mode);
        w4.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w4 = this.f8712b;
        if (w4 != null) {
            w4.g(context, i);
        }
    }
}
