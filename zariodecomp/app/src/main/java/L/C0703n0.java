package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* renamed from: l.n0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\n0.1.smali */
public class C0703n0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8637a;

    /* renamed from: b, reason: collision with root package name */
    public int f8638b;

    /* renamed from: c, reason: collision with root package name */
    public int f8639c;

    /* renamed from: d, reason: collision with root package name */
    public int f8640d;

    /* renamed from: e, reason: collision with root package name */
    public int f8641e;

    /* renamed from: f, reason: collision with root package name */
    public int f8642f;

    /* renamed from: k, reason: collision with root package name */
    public C0699l0 f8643k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8644l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8645m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8646n;

    /* renamed from: o, reason: collision with root package name */
    public Q.g f8647o;

    /* renamed from: p, reason: collision with root package name */
    public B3.N f8648p;

    public C0703n0(Context context, boolean z4) {
        super(context, null, 2130903432);
        this.f8637a = new Rect();
        this.f8638b = 0;
        this.f8639c = 0;
        this.f8640d = 0;
        this.f8641e = 0;
        this.f8645m = z4;
        setCacheColorHint(0);
    }

    public final int a(int i, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return i5;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0703n0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f8637a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f8648p != null) {
            return;
        }
        super.drawableStateChanged();
        C0699l0 c0699l0 = this.f8643k;
        if (c0699l0 != null) {
            c0699l0.f8628b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f8646n && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f8645m || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f8645m || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f8645m || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f8645m && this.f8644l) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f8648p = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f8648p == null) {
            B3.N n5 = new B3.N(this, 28);
            this.f8648p = n5;
            post(n5);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !AbstractC0696j0.f8619d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0696j0.f8616a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0696j0.f8617b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC0696j0.f8618c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                        } catch (InvocationTargetException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f8646n && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8642f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B3.N n5 = this.f8648p;
        if (n5 != null) {
            C0703n0 c0703n0 = (C0703n0) n5.f464b;
            c0703n0.f8648p = null;
            c0703n0.removeCallbacks(n5);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f8644l = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0699l0 c0699l0;
        if (drawable != null) {
            c0699l0 = new C0699l0(drawable);
            c0699l0.f8628b = true;
        } else {
            c0699l0 = null;
        }
        this.f8643k = c0699l0;
        super.setSelector(c0699l0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f8638b = rect.left;
        this.f8639c = rect.top;
        this.f8640d = rect.right;
        this.f8641e = rect.bottom;
    }
}
