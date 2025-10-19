package b2;

import A2.C0009i;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import l.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\x.smali */
public final class x extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f5105a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f5106b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f5107c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f5108d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f5109e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f5110f;

    /* renamed from: k, reason: collision with root package name */
    public int f5111k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView.ScaleType f5112l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnLongClickListener f5113m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5114n;

    public x(TextInputLayout textInputLayout, C0009i c0009i) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f5105a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131427374, (ViewGroup) this, false);
        this.f5108d = checkableImageButton;
        Y y4 = new Y(getContext(), null);
        this.f5106b = y4;
        if (r1.d.L(getContext())) {
            AbstractC0126l.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f5113m;
        checkableImageButton.setOnClickListener(null);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
        this.f5113m = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0183a.h0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0009i.f205c;
        if (typedArray.hasValue(69)) {
            this.f5109e = r1.d.w(getContext(), c0009i, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f5110f = Q1.k.i(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(c0009i.I(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(2131100366));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f5111k) {
            this.f5111k = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeS = AbstractC0183a.s(typedArray.getInt(68, -1));
            this.f5112l = scaleTypeS;
            checkableImageButton.setScaleType(scaleTypeS);
        }
        y4.setVisibility(8);
        y4.setId(2131231237);
        y4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = S.f2363a;
        E.f(y4, 1);
        y4.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            y4.setTextColor(c0009i.F(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f5107c = TextUtils.isEmpty(text2) ? null : text2;
        y4.setText(text2);
        e();
        addView(checkableImageButton);
        addView(y4);
    }

    public final int a() {
        int iB;
        CheckableImageButton checkableImageButton = this.f5108d;
        if (checkableImageButton.getVisibility() == 0) {
            iB = AbstractC0126l.b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iB = 0;
        }
        WeakHashMap weakHashMap = S.f2363a;
        return C.f(this.f5106b) + C.f(this) + iB;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f5108d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f5109e;
            PorterDuff.Mode mode = this.f5110f;
            TextInputLayout textInputLayout = this.f5105a;
            AbstractC0183a.f(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            AbstractC0183a.c0(textInputLayout, checkableImageButton, this.f5109e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f5113m;
        checkableImageButton.setOnClickListener(null);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
        this.f5113m = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0183a.h0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z4) {
        CheckableImageButton checkableImageButton = this.f5108d;
        if ((checkableImageButton.getVisibility() == 0) != z4) {
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() throws Resources.NotFoundException {
        int iF;
        EditText editText = this.f5105a.f6149d;
        if (editText == null) {
            return;
        }
        if (this.f5108d.getVisibility() == 0) {
            iF = 0;
        } else {
            WeakHashMap weakHashMap = S.f2363a;
            iF = C.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131100235);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = S.f2363a;
        C.k(this.f5106b, iF, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f5107c == null || this.f5114n) ? 8 : 0;
        setVisibility((this.f5108d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f5106b.setVisibility(i);
        this.f5105a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) throws Resources.NotFoundException {
        super.onMeasure(i, i5);
        d();
    }
}
