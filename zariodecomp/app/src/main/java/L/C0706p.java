package l;

import A2.C0009i;
import N2.AbstractC0156x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import f.AbstractC0489a;
import java.util.WeakHashMap;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\p.1.smali */
public final class C0706p extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0708q f8653a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.T f8654b;

    /* renamed from: c, reason: collision with root package name */
    public final W f8655c;

    /* renamed from: d, reason: collision with root package name */
    public u f8656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0706p(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, 2130903218);
        W0.a(context);
        V0.a(getContext(), this);
        W w4 = new W(this);
        this.f8655c = w4;
        w4.f(attributeSet, 2130903218);
        w4.b();
        A2.T t4 = new A2.T(this);
        this.f8654b = t4;
        t4.z(attributeSet, 2130903218);
        this.f8653a = new C0708q(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0489a.f6971l;
        C0009i c0009iY = C0009i.Y(context2, attributeSet, iArr, 2130903218);
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        Context context3 = getContext();
        WeakHashMap weakHashMap = M.S.f2363a;
        M.M.d(this, context3, iArr, attributeSet, (TypedArray) c0009iY.f205c, 2130903218, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(r1.d.B(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(r1.d.B(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0009iY.F(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0692h0.b(typedArray.getInt(3, -1), null));
            }
            c0009iY.e0();
            getEmojiTextViewHelper().a(attributeSet, 2130903218);
        } catch (Throwable th) {
            c0009iY.e0();
            throw th;
        }
    }

    private u getEmojiTextViewHelper() {
        if (this.f8656d == null) {
            this.f8656d = new u(this);
        }
        return this.f8656d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W w4 = this.f8655c;
        if (w4 != null) {
            w4.b();
        }
        A2.T t4 = this.f8654b;
        if (t4 != null) {
            t4.l();
        }
        C0708q c0708q = this.f8653a;
        if (c0708q != null) {
            c0708q.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        A2.T t4 = this.f8654b;
        if (t4 != null) {
            return t4.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        A2.T t4 = this.f8654b;
        if (t4 != null) {
            return t4.w();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0708q c0708q = this.f8653a;
        if (c0708q != null) {
            return (ColorStateList) c0708q.f8659a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0708q c0708q = this.f8653a;
        if (c0708q != null) {
            return (PorterDuff.Mode) c0708q.f8660b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8655c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8655c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0156x.R(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A2.T t4 = this.f8654b;
        if (t4 != null) {
            t4.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A2.T t4 = this.f8654b;
        if (t4 != null) {
            t4.C(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0708q c0708q = this.f8653a;
        if (c0708q != null) {
            if (c0708q.f8663e) {
                c0708q.f8663e = false;
            } else {
                c0708q.f8663e = true;
                c0708q.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8655c;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8655c;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A2.T t4 = this.f8654b;
        if (t4 != null) {
            t4.I(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A2.T t4 = this.f8654b;
        if (t4 != null) {
            t4.J(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0708q c0708q = this.f8653a;
        if (c0708q != null) {
            c0708q.f8659a = colorStateList;
            c0708q.f8661c = true;
            c0708q.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0708q c0708q = this.f8653a;
        if (c0708q != null) {
            c0708q.f8660b = mode;
            c0708q.f8662d = true;
            c0708q.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w4 = this.f8655c;
        w4.i(colorStateList);
        w4.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w4 = this.f8655c;
        w4.j(mode);
        w4.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w4 = this.f8655c;
        if (w4 != null) {
            w4.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(r1.d.B(getContext(), i));
    }
}
