package com.google.android.material.datepicker;

import A2.T;
import M.S;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\MaterialCalendarGridView.smali */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f5933a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5934b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5933a = D.e(null);
        if (r.g0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(2131230854);
            setNextFocusRightId(2131230880);
        }
        this.f5934b = r.g0(getContext(), 2130903863);
        S.h(this, new Q.i(3));
    }

    public final u a() {
        return (u) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (u) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((u) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int width;
        int iA2;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        u uVar = (u) super.getAdapter();
        A a5 = uVar.f6029b;
        K0.t tVar = uVar.f6031d;
        int iMax = Math.max(uVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(uVar.c(), getLastVisiblePosition());
        Long item = uVar.getItem(iMax);
        Long item2 = uVar.getItem(iMin);
        Iterator it = a5.d().iterator();
        while (it.hasNext()) {
            L.c cVar = (L.c) it.next();
            Object obj = cVar.a;
            if (obj != null) {
                Object obj2 = cVar.b;
                if (obj2 != null) {
                    Long l4 = (Long) obj;
                    long jLongValue = l4.longValue();
                    Long l5 = (Long) obj2;
                    long jLongValue2 = l5.longValue();
                    if (item == null || item2 == null || l4.longValue() > item2.longValue() || l5.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        iMax = iMax;
                        uVar = uVar;
                        it = it;
                    } else {
                        boolean zG = Q1.k.g(this);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f5933a;
                        t tVar2 = uVar.f6028a;
                        if (jLongValue < jLongValue3) {
                            width = iMax % tVar2.f6022d == 0 ? 0 : !zG ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                            iA = iMax;
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iA = uVar.a() + (calendar.get(5) - 1);
                            View viewB = materialCalendarGridView.b(iA);
                            width = (viewB.getWidth() / 2) + viewB.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            width2 = (iMin + 1) % tVar2.f6022d == 0 ? getWidth() : !zG ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                            iA2 = iMin;
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iA2 = uVar.a() + (calendar.get(5) - 1);
                            View viewB2 = materialCalendarGridView.b(iA2);
                            width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                        }
                        int itemId = (int) uVar.getItemId(iA);
                        int itemId2 = (int) uVar.getItemId(iA2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            u uVar2 = uVar;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View viewB3 = materialCalendarGridView.b(numColumns);
                            int top = viewB3.getTop() + ((Rect) ((T) tVar.f2181a).f133a).top;
                            Iterator it2 = it;
                            int bottom = viewB3.getBottom() - ((Rect) ((T) tVar.f2181a).f133a).bottom;
                            if (zG) {
                                int i5 = iA2 > numColumns2 ? 0 : width2;
                                int width4 = numColumns > iA ? getWidth() : width;
                                i = i5;
                                width3 = width4;
                            } else {
                                i = numColumns > iA ? 0 : width;
                                width3 = iA2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, width3, bottom, (Paint) tVar.h);
                            itemId++;
                            materialCalendarGridView = this;
                            iMax = iMax;
                            uVar = uVar2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z4, int i, Rect rect) {
        if (!z4) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((u) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((u) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((u) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((u) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i5) {
        if (!this.f5934b) {
            super.onMeasure(i, i5);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((u) super.getAdapter()).a()) {
            super.setSelection(((u) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (u) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof u)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), u.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
