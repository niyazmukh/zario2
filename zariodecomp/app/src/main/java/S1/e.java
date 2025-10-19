package S1;

import N2.AbstractC0156x;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\e.smali */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public int f2953a;

    /* renamed from: b, reason: collision with root package name */
    public int f2954b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2955c;

    /* renamed from: d, reason: collision with root package name */
    public int f2956d;

    /* renamed from: e, reason: collision with root package name */
    public int f2957e;

    /* renamed from: f, reason: collision with root package name */
    public int f2958f;

    public e(Context context, AttributeSet attributeSet, int i, int i5) throws Resources.NotFoundException {
        this.f2955c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131100397);
        int[] iArr = A1.a.f42a;
        Q1.k.a(context, attributeSet, i, i5);
        Q1.k.b(context, attributeSet, iArr, i, i5, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i5);
        this.f2953a = r1.d.z(context, typedArrayObtainStyledAttributes, 8, dimensionPixelSize);
        this.f2954b = Math.min(r1.d.z(context, typedArrayObtainStyledAttributes, 7, 0), this.f2953a / 2);
        this.f2957e = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f2958f = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f2955c = new int[]{AbstractC0156x.G(context, 2130903300, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.f2955c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.f2955c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f2956d = typedArrayObtainStyledAttributes.getColor(6, -1);
        } else {
            this.f2956d = this.f2955c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f2 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f2956d = AbstractC0156x.k(this.f2956d, (int) (f2 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public abstract void a();
}
