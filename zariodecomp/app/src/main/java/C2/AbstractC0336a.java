package c2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.C0618d;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c2.1\a.smali */
public abstract class AbstractC0336a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5449a = {R.attr.theme, 2130904134};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5450b = {2130903785};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5450b, i, i5);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z4 = (context instanceof C0618d) && ((C0618d) context).f7972a == resourceId;
        if (resourceId == 0 || z4) {
            return context;
        }
        C0618d c0618d = new C0618d(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5449a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0618d.getTheme().applyStyle(resourceId2, true);
        }
        return c0618d;
    }
}
