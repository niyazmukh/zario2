package l;

import B.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import f.AbstractC0489a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\V0.smali */
public abstract class V0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8522a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8523b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f8524c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8525d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f8526e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f8527f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f8528g = new int[1];

    public static void a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0489a.f6969j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList colorStateListD = d(context, i);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f8523b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f8522a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return D.a.d(c(context, i), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(Context context, int i) {
        int[] iArr = f8528g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f8528g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = l.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
