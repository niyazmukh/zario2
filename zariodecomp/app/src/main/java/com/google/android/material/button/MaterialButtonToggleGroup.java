package com.google.android.material.button;

import A1.a;
import G1.d;
import G1.e;
import G1.f;
import M.AbstractC0126l;
import M.B;
import M.C;
import M.S;
import Q1.k;
import X1.l;
import X1.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import c2.AbstractC0336a;
import h1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\button\MaterialButtonToggleGroup.smali */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f5882o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5883a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5884b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f5885c;

    /* renamed from: d, reason: collision with root package name */
    public final d f5886d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f5887e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5888f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5889k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5890l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5891m;

    /* renamed from: n, reason: collision with root package name */
    public HashSet f5892n;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0336a.a(context, attributeSet, 2130903750, 2131952661), attributeSet, 2130903750);
        this.f5883a = new ArrayList();
        this.f5884b = new i(this, 5);
        this.f5885c = new LinkedHashSet();
        this.f5886d = new d(this, 0);
        this.f5888f = false;
        this.f5892n = new HashSet();
        TypedArray typedArrayH = k.h(getContext(), attributeSet, a.f55p, 2130903750, 2131952661, new int[0]);
        setSingleSelection(typedArrayH.getBoolean(3, false));
        this.f5891m = typedArrayH.getResourceId(1, -1);
        this.f5890l = typedArrayH.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayH.getBoolean(0, true));
        typedArrayH.recycle();
        WeakHashMap weakHashMap = S.f2363a;
        B.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && c(i5)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = S.f2363a;
            materialButton.setId(C.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f5884b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                AbstractC0126l.g(layoutParams2, 0);
                AbstractC0126l.h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                AbstractC0126l.h(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            AbstractC0126l.g(layoutParams3, 0);
            AbstractC0126l.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f5879s);
        m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f5883a.add(new f(shapeAppearanceModel.f3777e, shapeAppearanceModel.h, shapeAppearanceModel.f3778f, shapeAppearanceModel.f3779g));
        materialButton.setEnabled(isEnabled());
        S.h(materialButton, new e(this, 0));
    }

    public final void b(int i, boolean z4) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f5892n);
        if (z4 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f5889k && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z4 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f5890l || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f5892n;
        this.f5892n = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f5888f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f5888f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f5885c.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f5886d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f5887e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        f fVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                l lVarE = materialButton.getShapeAppearanceModel().e();
                f fVar2 = (f) this.f5883a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z4 = getOrientation() == 0;
                    X1.a aVar = f.f1836e;
                    if (i == firstVisibleChildIndex) {
                        fVar = z4 ? k.g(this) ? new f(aVar, aVar, fVar2.f1838b, fVar2.f1839c) : new f(fVar2.f1837a, fVar2.f1840d, aVar, aVar) : new f(fVar2.f1837a, aVar, fVar2.f1838b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        fVar = z4 ? k.g(this) ? new f(fVar2.f1837a, fVar2.f1840d, aVar, aVar) : new f(aVar, aVar, fVar2.f1838b, fVar2.f1839c) : new f(aVar, fVar2.f1840d, aVar, fVar2.f1839c);
                    } else {
                        fVar2 = null;
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    lVarE.c(0.0f);
                } else {
                    lVarE.f3767e = fVar2.f1837a;
                    lVarE.h = fVar2.f1840d;
                    lVarE.f3768f = fVar2.f1838b;
                    lVarE.f3769g = fVar2.f1839c;
                }
                materialButton.setShapeAppearanceModel(lVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f5889k || this.f5892n.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f5892n.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f5892n.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i5) {
        Integer[] numArr = this.f5887e;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i5;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f5891m;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f5889k ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        e();
        a();
        super.onMeasure(i, i5);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f5883a.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z4);
        }
    }

    public void setSelectionRequired(boolean z4) {
        this.f5890l = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.f5889k != z4) {
            this.f5889k = z4;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f5889k ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
