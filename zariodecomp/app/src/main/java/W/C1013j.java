package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import s.AbstractC0863a;

/* renamed from: w.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\j.smali */
public final class C1013j {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f10839e;

    /* renamed from: a, reason: collision with root package name */
    public int f10840a;

    /* renamed from: b, reason: collision with root package name */
    public int f10841b;

    /* renamed from: c, reason: collision with root package name */
    public float f10842c;

    /* renamed from: d, reason: collision with root package name */
    public float f10843d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10839e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1019q.f10868e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f10839e.get(index)) {
                case 1:
                    this.f10843d = typedArrayObtainStyledAttributes.getFloat(index, this.f10843d);
                    break;
                case 2:
                    this.f10841b = typedArrayObtainStyledAttributes.getInt(index, this.f10841b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0863a.f9666a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f10840a = C1016m.f(typedArrayObtainStyledAttributes, index, this.f10840a);
                    break;
                case 6:
                    this.f10842c = typedArrayObtainStyledAttributes.getFloat(index, this.f10842c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
