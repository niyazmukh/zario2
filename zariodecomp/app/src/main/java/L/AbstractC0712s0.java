package l;

import A2.C0009i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import f.AbstractC0489a;
import java.util.WeakHashMap;

/* renamed from: l.s0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\s0.1.smali */
public abstract class AbstractC0712s0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8678a;

    /* renamed from: b, reason: collision with root package name */
    public int f8679b;

    /* renamed from: c, reason: collision with root package name */
    public int f8680c;

    /* renamed from: d, reason: collision with root package name */
    public int f8681d;

    /* renamed from: e, reason: collision with root package name */
    public int f8682e;

    /* renamed from: f, reason: collision with root package name */
    public int f8683f;

    /* renamed from: k, reason: collision with root package name */
    public float f8684k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8685l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f8686m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f8687n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f8688o;

    /* renamed from: p, reason: collision with root package name */
    public int f8689p;

    /* renamed from: q, reason: collision with root package name */
    public int f8690q;

    /* renamed from: r, reason: collision with root package name */
    public int f8691r;

    /* renamed from: s, reason: collision with root package name */
    public int f8692s;

    public AbstractC0712s0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8678a = true;
        this.f8679b = -1;
        this.f8680c = 0;
        this.f8682e = 8388659;
        int[] iArr = AbstractC0489a.f6973n;
        C0009i c0009iY = C0009i.Y(context, attributeSet, iArr, i);
        WeakHashMap weakHashMap = M.S.f2363a;
        M.M.d(this, context, iArr, attributeSet, (TypedArray) c0009iY.f205c, i, 0);
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f8684k = typedArray.getFloat(4, -1.0f);
        this.f8679b = typedArray.getInt(3, -1);
        this.f8685l = typedArray.getBoolean(7, false);
        setDividerDrawable(c0009iY.I(5));
        this.f8691r = typedArray.getInt(8, 0);
        this.f8692s = typedArray.getDimensionPixelSize(6, 0);
        c0009iY.e0();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0710r0;
    }

    public final void f(Canvas canvas, int i) {
        this.f8688o.setBounds(getPaddingLeft() + this.f8692s, i, (getWidth() - getPaddingRight()) - this.f8692s, this.f8690q + i);
        this.f8688o.draw(canvas);
    }

    public final void g(Canvas canvas, int i) {
        this.f8688o.setBounds(i, getPaddingTop() + this.f8692s, this.f8689p + i, (getHeight() - getPaddingBottom()) - this.f8692s);
        this.f8688o.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f8679b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f8679b;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8679b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f8680c;
        if (this.f8681d == 1 && (i = this.f8682e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8683f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8683f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0710r0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8679b;
    }

    public Drawable getDividerDrawable() {
        return this.f8688o;
    }

    public int getDividerPadding() {
        return this.f8692s;
    }

    public int getDividerWidth() {
        return this.f8689p;
    }

    public int getGravity() {
        return this.f8682e;
    }

    public int getOrientation() {
        return this.f8681d;
    }

    public int getShowDividers() {
        return this.f8691r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8684k;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0710r0 generateDefaultLayoutParams() {
        int i = this.f8681d;
        if (i == 0) {
            return new C0710r0(-2, -2);
        }
        if (i == 1) {
            return new C0710r0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0710r0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0710r0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0710r0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0710r0(layoutParams);
    }

    public final boolean k(int i) {
        if (i == 0) {
            return (this.f8691r & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f8691r & 4) != 0;
        }
        if ((this.f8691r & 2) == 0) {
            return false;
        }
        for (int i5 = i - 1; i5 >= 0; i5--) {
            if (getChildAt(i5).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f8688o == null) {
            return;
        }
        int i5 = 0;
        if (this.f8681d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && k(i5)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0710r0) childAt.getLayoutParams())).topMargin) - this.f8690q);
                }
                i5++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f8690q : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0710r0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = j1.a(this);
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i5)) {
                C0710r0 c0710r0 = (C0710r0) childAt3.getLayoutParams();
                g(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0710r0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0710r0).leftMargin) - this.f8689p);
            }
            i5++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0710r0 c0710r02 = (C0710r0) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0710r02).leftMargin;
                    i = this.f8689p;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0710r02).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f8689p;
                right = left - i;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC0712s0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC0712s0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z4) {
        this.f8678a = z4;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f8679b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8688o) {
            return;
        }
        this.f8688o = drawable;
        if (drawable != null) {
            this.f8689p = drawable.getIntrinsicWidth();
            this.f8690q = drawable.getIntrinsicHeight();
        } else {
            this.f8689p = 0;
            this.f8690q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f8692s = i;
    }

    public void setGravity(int i) {
        if (this.f8682e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f8682e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i5 = i & 8388615;
        int i6 = this.f8682e;
        if ((8388615 & i6) != i5) {
            this.f8682e = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f8685l = z4;
    }

    public void setOrientation(int i) {
        if (this.f8681d != i) {
            this.f8681d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f8691r) {
            requestLayout();
        }
        this.f8691r = i;
    }

    public void setVerticalGravity(int i) {
        int i5 = i & 112;
        int i6 = this.f8682e;
        if ((i6 & 112) != i5) {
            this.f8682e = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f8684k = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
