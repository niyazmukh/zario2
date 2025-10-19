package androidx.appcompat.widget;

import M.B;
import M.M;
import M.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import f.AbstractC0489a;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\ButtonBarLayout.smali */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4212a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4213b;

    /* renamed from: c, reason: collision with root package name */
    public int f4214c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4214c = -1;
        int[] iArr = AbstractC0489a.f6970k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        WeakHashMap weakHashMap = S.f2363a;
        M.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f4212a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f4212a);
        }
    }

    private void setStacked(boolean z4) {
        if (this.f4213b != z4) {
            if (!z4 || this.f4212a) {
                this.f4213b = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? 8388613 : 80);
                View viewFindViewById = findViewById(2131231182);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        int iMakeMeasureSpec;
        boolean z4;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f4212a) {
            if (size > this.f4214c && this.f4213b) {
                setStacked(false);
            }
            this.f4214c = size;
        }
        if (this.f4213b || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z4 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i5);
        if (this.f4212a && !this.f4213b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i, i5);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i6 = -1;
            if (i7 >= childCount) {
                i7 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f4213b) {
                int i8 = i7 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i8 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i8).getVisibility() == 0) {
                        i6 = i8;
                        break;
                    }
                    i8++;
                }
                paddingBottom = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = S.f2363a;
        if (B.d(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i5 == 0) {
                super.onMeasure(i, i5);
            }
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f4212a != z4) {
            this.f4212a = z4;
            if (!z4 && this.f4213b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
