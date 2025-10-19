package l;

import A2.C0009i;
import B.l;
import a.AbstractC0183a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import f.AbstractC0489a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\W.smali */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f8529a;

    /* renamed from: b, reason: collision with root package name */
    public D3.b f8530b;

    /* renamed from: c, reason: collision with root package name */
    public D3.b f8531c;

    /* renamed from: d, reason: collision with root package name */
    public D3.b f8532d;

    /* renamed from: e, reason: collision with root package name */
    public D3.b f8533e;

    /* renamed from: f, reason: collision with root package name */
    public D3.b f8534f;

    /* renamed from: g, reason: collision with root package name */
    public D3.b f8535g;
    public D3.b h;
    public final C0682c0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f8536j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8537k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f8538l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8539m;

    public W(TextView textView) {
        this.f8529a = textView;
        this.i = new C0682c0(textView);
    }

    public static D3.b c(Context context, r rVar, int i) {
        ColorStateList colorStateListF;
        synchronized (rVar) {
            colorStateListF = rVar.f8676a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        D3.b bVar = new D3.b();
        bVar.f1341b = true;
        bVar.f1342c = colorStateListF;
        return bVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            P.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            P.a.a(editorInfo, text);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 : i5;
        if (i5 <= i6) {
            i5 = i6;
        }
        int length = text.length();
        if (i7 < 0 || i5 > length) {
            AbstractC0183a.i0(editorInfo, null, 0, 0);
            return;
        }
        int i8 = editorInfo.inputType & 4095;
        if (i8 == 129 || i8 == 225 || i8 == 18) {
            AbstractC0183a.i0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0183a.i0(editorInfo, text, i7, i5);
            return;
        }
        int i9 = i5 - i7;
        int i10 = i9 > 1024 ? 0 : i9;
        int i11 = 2048 - i10;
        int iMin = Math.min(text.length() - i5, i11 - Math.min(i7, (int) (i11 * 0.8d)));
        int iMin2 = Math.min(i7, i11 - iMin);
        int i12 = i7 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i12))) {
            i12++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i5 + iMin) - 1))) {
            iMin--;
        }
        int i13 = iMin2 + i10;
        AbstractC0183a.i0(editorInfo, i10 != i9 ? TextUtils.concat(text.subSequence(i12, i12 + iMin2), text.subSequence(i5, iMin + i5)) : text.subSequence(i12, i13 + iMin + i12), iMin2, i13);
    }

    public final void a(Drawable drawable, D3.b bVar) {
        if (drawable == null || bVar == null) {
            return;
        }
        r.e(drawable, bVar, this.f8529a.getDrawableState());
    }

    public final void b() {
        D3.b bVar = this.f8530b;
        TextView textView = this.f8529a;
        if (bVar != null || this.f8531c != null || this.f8532d != null || this.f8533e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f8530b);
            a(compoundDrawables[1], this.f8531c);
            a(compoundDrawables[2], this.f8532d);
            a(compoundDrawables[3], this.f8533e);
        }
        if (this.f8534f == null && this.f8535g == null) {
            return;
        }
        Drawable[] drawableArrA = S.a(textView);
        a(drawableArrA[0], this.f8534f);
        a(drawableArrA[2], this.f8535g);
    }

    public final ColorStateList d() {
        D3.b bVar = this.h;
        if (bVar != null) {
            return (ColorStateList) bVar.f1342c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        D3.b bVar = this.h;
        if (bVar != null) {
            return (PorterDuff.Mode) bVar.f1343d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i) {
        boolean z4;
        boolean z5;
        String string;
        String string2;
        boolean z6;
        int i5;
        int i6;
        ColorStateList colorStateList;
        int resourceId;
        int i7;
        int resourceId2;
        int i8;
        int i9 = 16;
        TextView textView = this.f8529a;
        Context context = textView.getContext();
        r rVarA = r.a();
        int[] iArr = AbstractC0489a.h;
        C0009i c0009iY = C0009i.Y(context, attributeSet, iArr, i);
        Context context2 = textView.getContext();
        WeakHashMap weakHashMap = M.S.f2363a;
        M.M.d(textView, context2, iArr, attributeSet, (TypedArray) c0009iY.f205c, i, 0);
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f8530b = c(context, rVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f8531c = c(context, rVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f8532d = c(context, rVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f8533e = c(context, rVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f8534f = c(context, rVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f8535g = c(context, rVarA, typedArray.getResourceId(6, 0));
        }
        c0009iY.e0();
        boolean z7 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0489a.f6982w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0009i c0009i = new C0009i(i9, context, typedArrayObtainStyledAttributes);
            if (z7 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z5 = false;
            } else {
                z5 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            k(context, c0009i);
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i8 = 13;
            } else {
                i8 = 13;
                string2 = null;
            }
            string = typedArrayObtainStyledAttributes.hasValue(i8) ? typedArrayObtainStyledAttributes.getString(i8) : null;
            c0009i.e0();
        } else {
            z4 = false;
            z5 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0009i c0009i2 = new C0009i(i9, context, typedArrayObtainStyledAttributes2);
        if (z7 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z6 = z5;
        } else {
            z6 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, c0009i2);
        c0009i2.e0();
        if (!z7 && z4) {
            textView.setAllCaps(z6);
        }
        Typeface typeface = this.f8538l;
        if (typeface != null) {
            if (this.f8537k == -1) {
                textView.setTypeface(typeface, this.f8536j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            U.d(textView, string);
        }
        if (string2 != null) {
            T.b(textView, T.a(string2));
        }
        int[] iArr3 = AbstractC0489a.i;
        C0682c0 c0682c0 = this.i;
        Context context3 = c0682c0.h;
        TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0682c0.f8563g;
        int i10 = -1;
        M.M.d(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0682c0.f8557a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                int i11 = 0;
                while (i11 < length) {
                    iArr4[i11] = typedArrayObtainTypedArray.getDimensionPixelSize(i11, i10);
                    i11++;
                    i10 = -1;
                }
                int[] iArrA = C0682c0.a(iArr4);
                c0682c0.f8561e = iArrA;
                boolean z8 = iArrA.length > 0;
                c0682c0.f8562f = z8;
                if (z8) {
                    c0682c0.f8557a = 1;
                    c0682c0.f8559c = iArrA[0];
                    c0682c0.f8560d = iArrA[r3 - 1];
                    c0682c0.f8558b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0682c0.b()) {
            c0682c0.f8557a = 0;
        } else if (c0682c0.f8557a == 1) {
            if (!c0682c0.f8562f) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i7 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i7 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i7, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c0682c0.f8557a = 1;
                c0682c0.f8559c = dimension2;
                c0682c0.f8560d = dimension3;
                c0682c0.f8558b = dimension;
                c0682c0.f8562f = false;
            }
            if (c0682c0.b() && c0682c0.f8557a == 1 && (!c0682c0.f8562f || c0682c0.f8561e.length == 0)) {
                int iFloor = ((int) Math.floor((c0682c0.f8560d - c0682c0.f8559c) / c0682c0.f8558b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i12 = 0; i12 < iFloor; i12++) {
                    iArr5[i12] = Math.round((i12 * c0682c0.f8558b) + c0682c0.f8559c);
                }
                c0682c0.f8561e = C0682c0.a(iArr5);
            }
        }
        Method method = j1.f8620a;
        if (c0682c0.f8557a != 0) {
            int[] iArr6 = c0682c0.f8561e;
            if (iArr6.length > 0) {
                if (U.a(textView) != -1.0f) {
                    U.b(textView, Math.round(c0682c0.f8559c), Math.round(c0682c0.f8560d), Math.round(c0682c0.f8558b), 0);
                } else {
                    U.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? rVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? rVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? rVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? rVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? rVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? rVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = S.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            S.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = S.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                S.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = l.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            Q.q.f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i5 = -1;
            Q.q.g(textView, AbstractC0692h0.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i5 = -1;
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i5);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i5);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, i5);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i5) {
            r1.d.l(dimensionPixelSize);
            Q.r.d(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i5) {
            r1.d.l(dimensionPixelSize2);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i13 = Q.o.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize2 > Math.abs(i13)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i13);
            }
            i6 = -1;
        } else {
            i6 = i5;
        }
        if (dimensionPixelSize3 != i6) {
            r1.d.l(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0489a.f6982w);
        C0009i c0009i = new C0009i(16, context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f8529a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, c0009i);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            U.d(textView, string);
        }
        c0009i.e0();
        Typeface typeface = this.f8538l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f8536j);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new D3.b();
        }
        D3.b bVar = this.h;
        bVar.f1342c = colorStateList;
        bVar.f1341b = colorStateList != null;
        this.f8530b = bVar;
        this.f8531c = bVar;
        this.f8532d = bVar;
        this.f8533e = bVar;
        this.f8534f = bVar;
        this.f8535g = bVar;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new D3.b();
        }
        D3.b bVar = this.h;
        bVar.f1343d = mode;
        bVar.f1340a = mode != null;
        this.f8530b = bVar;
        this.f8531c = bVar;
        this.f8532d = bVar;
        this.f8533e = bVar;
        this.f8534f = bVar;
        this.f8535g = bVar;
    }

    public final void k(Context context, C0009i c0009i) {
        String string;
        int i = this.f8536j;
        TypedArray typedArray = (TypedArray) c0009i.f205c;
        this.f8536j = typedArray.getInt(2, i);
        int i5 = typedArray.getInt(11, -1);
        this.f8537k = i5;
        if (i5 != -1) {
            this.f8536j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f8539m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f8538l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f8538l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f8538l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f8538l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f8537k;
        int i9 = this.f8536j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceK = c0009i.K(i7, this.f8536j, new Q(this, i8, i9, new WeakReference(this.f8529a)));
                if (typefaceK != null) {
                    if (this.f8537k != -1) {
                        this.f8538l = V.a(Typeface.create(typefaceK, 0), this.f8537k, (this.f8536j & 2) != 0);
                    } else {
                        this.f8538l = typefaceK;
                    }
                }
                this.f8539m = this.f8538l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f8538l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (this.f8537k != -1) {
            this.f8538l = V.a(Typeface.create(string, 0), this.f8537k, (this.f8536j & 2) != 0);
        } else {
            this.f8538l = Typeface.create(string, this.f8536j);
        }
    }
}
