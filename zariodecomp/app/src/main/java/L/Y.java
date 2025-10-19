package l;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\Y.smali */
public class Y extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final A2.T f8541a;

    /* renamed from: b, reason: collision with root package name */
    public final W f8542b;

    /* renamed from: c, reason: collision with root package name */
    public u f8543c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8544d;

    /* renamed from: e, reason: collision with root package name */
    public C0724z f8545e;

    /* renamed from: f, reason: collision with root package name */
    public Future f8546f;

    public Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.f8543c == null) {
            this.f8543c = new u(this);
        }
        return this.f8543c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A2.T t4 = this.f8541a;
        if (t4 != null) {
            t4.l();
        }
        W w4 = this.f8542b;
        if (w4 != null) {
            w4.b();
        }
    }

    public final void f() {
        Future future = this.f8546f;
        if (future == null) {
            return;
        }
        try {
            this.f8546f = null;
            B.a.p(future.get());
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        Method method = j1.f8620a;
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        Method method = j1.f8620a;
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        Method method = j1.f8620a;
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        Method method = j1.f8620a;
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        Method method = j1.f8620a;
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public X getSuperCaller() {
        if (this.f8545e == null) {
            this.f8545e = new C0724z(this);
        }
        return this.f8545e;
    }

    public ColorStateList getSupportBackgroundTintList() {
        A2.T t4 = this.f8541a;
        if (t4 != null) {
            return t4.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        A2.T t4 = this.f8541a;
        if (t4 != null) {
            return t4.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8542b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8542b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public K.d getTextMetricsParamsCompat() {
        return new K.d(Q.r.c(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8542b.getClass();
        W.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0156x.R(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        W w4 = this.f8542b;
        if (w4 != null) {
            w4.getClass();
            Method method = j1.f8620a;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i5) {
        f();
        super.onMeasure(i, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        super.onTextChanged(charSequence, i, i5, i6);
        if (this.f8542b != null) {
            Method method = j1.f8620a;
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i5, int i6, int i7) {
        Method method = j1.f8620a;
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i5, i6, i7);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        Method method = j1.f8620a;
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        Method method = j1.f8620a;
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A2.T t4 = this.f8541a;
        if (t4 != null) {
            t4.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A2.T t4 = this.f8541a;
        if (t4 != null) {
            t4.C(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8542b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8542b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8542b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8542b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0183a) getEmojiTextViewHelper().f8701b.b).E(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().b(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().a(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        r1.d.l(i);
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(K.e eVar) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A2.T t4 = this.f8541a;
        if (t4 != null) {
            t4.I(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A2.T t4 = this.f8541a;
        if (t4 != null) {
            t4.J(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w4 = this.f8542b;
        w4.i(colorStateList);
        w4.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w4 = this.f8542b;
        w4.j(mode);
        w4.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w4 = this.f8542b;
        if (w4 != null) {
            w4.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<K.e> future) {
        this.f8546f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(K.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f2111b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        Q.p.h(this, i);
        getPaint().set(dVar.f2110a);
        Q.q.e(this, dVar.f2112c);
        Q.q.h(this, dVar.f2113d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        Method method = j1.f8620a;
        super.setTextSize(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f8544d) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            J3.c cVar = D.g.f1271a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f8544d = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f8544d = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W0.a(context);
        this.f8544d = false;
        this.f8545e = null;
        V0.a(getContext(), this);
        A2.T t4 = new A2.T(this);
        this.f8541a = t4;
        t4.z(attributeSet, i);
        W w4 = new W(this);
        this.f8542b = w4;
        w4.f(attributeSet, i);
        w4.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? r1.d.B(context, i) : null, i5 != 0 ? r1.d.B(context, i5) : null, i6 != 0 ? r1.d.B(context, i6) : null, i7 != 0 ? r1.d.B(context, i7) : null);
        W w4 = this.f8542b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? r1.d.B(context, i) : null, i5 != 0 ? r1.d.B(context, i5) : null, i6 != 0 ? r1.d.B(context, i6) : null, i7 != 0 ? r1.d.B(context, i7) : null);
        W w4 = this.f8542b;
        if (w4 != null) {
            w4.b();
        }
    }
}
