package Q1;

import M.C;
import M.S;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q1\k.smali */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2802a = {2130903300};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2803b = {2130903307};

    /* renamed from: c, reason: collision with root package name */
    public static final l f2804c = new l(0);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2805d = 0;

    public static void a(Context context, AttributeSet attributeSet, int i, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f40J, i, i5);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z4) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130903604, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f2803b, "Theme.MaterialComponents");
            }
        }
        c(context, f2802a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i5, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f40J, i, i5);
        boolean z4 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i5);
            for (int i6 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i6, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z4 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z4 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z4) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(B.a.l("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static K2.c e(View view) {
        ViewGroup viewGroupD = d(view);
        if (viewGroupD == null) {
            return null;
        }
        return new K2.c(viewGroupD);
    }

    public static ArrayList f(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean g(View view) {
        WeakHashMap weakHashMap = S.f2363a;
        return C.d(view) == 1;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i5, int... iArr2) {
        a(context, attributeSet, i, i5);
        b(context, attributeSet, iArr, i, i5, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i5);
    }

    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
