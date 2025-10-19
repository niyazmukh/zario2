package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: w.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\k.smali */
public final class C1014k {

    /* renamed from: a, reason: collision with root package name */
    public int f10844a;

    /* renamed from: b, reason: collision with root package name */
    public int f10845b;

    /* renamed from: c, reason: collision with root package name */
    public float f10846c;

    /* renamed from: d, reason: collision with root package name */
    public float f10847d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1019q.f10869f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f10846c = typedArrayObtainStyledAttributes.getFloat(index, this.f10846c);
            } else if (index == 0) {
                int i5 = typedArrayObtainStyledAttributes.getInt(index, this.f10844a);
                this.f10844a = i5;
                this.f10844a = C1016m.f10859d[i5];
            } else if (index == 4) {
                this.f10845b = typedArrayObtainStyledAttributes.getInt(index, this.f10845b);
            } else if (index == 3) {
                this.f10847d = typedArrayObtainStyledAttributes.getFloat(index, this.f10847d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
