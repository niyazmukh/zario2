package w;

import N2.n0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: w.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\l.smali */
public final class C1015l {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f10848m;

    /* renamed from: a, reason: collision with root package name */
    public float f10849a;

    /* renamed from: b, reason: collision with root package name */
    public float f10850b;

    /* renamed from: c, reason: collision with root package name */
    public float f10851c;

    /* renamed from: d, reason: collision with root package name */
    public float f10852d;

    /* renamed from: e, reason: collision with root package name */
    public float f10853e;

    /* renamed from: f, reason: collision with root package name */
    public float f10854f;

    /* renamed from: g, reason: collision with root package name */
    public float f10855g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f10856j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10857k;

    /* renamed from: l, reason: collision with root package name */
    public float f10858l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10848m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1019q.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f10848m.get(index)) {
                case 1:
                    this.f10849a = typedArrayObtainStyledAttributes.getFloat(index, this.f10849a);
                    break;
                case 2:
                    this.f10850b = typedArrayObtainStyledAttributes.getFloat(index, this.f10850b);
                    break;
                case 3:
                    this.f10851c = typedArrayObtainStyledAttributes.getFloat(index, this.f10851c);
                    break;
                case 4:
                    this.f10852d = typedArrayObtainStyledAttributes.getFloat(index, this.f10852d);
                    break;
                case 5:
                    this.f10853e = typedArrayObtainStyledAttributes.getFloat(index, this.f10853e);
                    break;
                case 6:
                    this.f10854f = typedArrayObtainStyledAttributes.getDimension(index, this.f10854f);
                    break;
                case 7:
                    this.f10855g = typedArrayObtainStyledAttributes.getDimension(index, this.f10855g);
                    break;
                case 8:
                    this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    this.f10856j = typedArrayObtainStyledAttributes.getDimension(index, this.f10856j);
                    break;
                case 11:
                    this.f10857k = true;
                    this.f10858l = typedArrayObtainStyledAttributes.getDimension(index, this.f10858l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
