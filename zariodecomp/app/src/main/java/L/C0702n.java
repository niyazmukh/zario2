package l;

import a.AbstractC0183a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.Method;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\n.1.smali */
public class C0702n extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final A2.T f8634a;

    /* renamed from: b, reason: collision with root package name */
    public final W f8635b;

    /* renamed from: c, reason: collision with root package name */
    public u f8636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W0.a(context);
        V0.a(getContext(), this);
        A2.T t4 = new A2.T(this);
        this.f8634a = t4;
        t4.z(attributeSet, i);
        W w4 = new W(this);
        this.f8635b = w4;
        w4.f(attributeSet, i);
        w4.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private u getEmojiTextViewHelper() {
        if (this.f8636c == null) {
            this.f8636c = new u(this);
        }
        return this.f8636c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A2.T t4 = this.f8634a;
        if (t4 != null) {
            t4.l();
        }
        W w4 = this.f8635b;
        if (w4 != null) {
            w4.b();
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

    public ColorStateList getSupportBackgroundTintList() {
        A2.T t4 = this.f8634a;
        if (t4 != null) {
            return t4.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        A2.T t4 = this.f8634a;
        if (t4 != null) {
            return t4.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8635b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8635b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        W w4 = this.f8635b;
        if (w4 != null) {
            w4.getClass();
            Method method = j1.f8620a;
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        super.onTextChanged(charSequence, i, i5, i6);
        if (this.f8635b != null) {
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
        A2.T t4 = this.f8634a;
        if (t4 != null) {
            t4.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A2.T t4 = this.f8634a;
        if (t4 != null) {
            t4.C(i);
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

    public void setSupportAllCaps(boolean z4) {
        W w4 = this.f8635b;
        if (w4 != null) {
            w4.f8529a.setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A2.T t4 = this.f8634a;
        if (t4 != null) {
            t4.I(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A2.T t4 = this.f8634a;
        if (t4 != null) {
            t4.J(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w4 = this.f8635b;
        w4.i(colorStateList);
        w4.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w4 = this.f8635b;
        w4.j(mode);
        w4.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w4 = this.f8635b;
        if (w4 != null) {
            w4.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        Method method = j1.f8620a;
        super.setTextSize(i, f2);
    }
}
