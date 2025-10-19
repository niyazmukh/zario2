package w;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\c.smali */
public abstract class AbstractC1006c extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f10697a;

    /* renamed from: b, reason: collision with root package name */
    public int f10698b;

    /* renamed from: c, reason: collision with root package name */
    public Context f10699c;

    /* renamed from: d, reason: collision with root package name */
    public u.i f10700d;

    /* renamed from: e, reason: collision with root package name */
    public String f10701e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f10702f;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto La5
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La5
        La:
            android.content.Context r0 = r5.f10699c
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L59
            if (r1 == 0) goto L59
            if (r6 == 0) goto L4d
            java.util.HashMap r3 = r1.f4331q
            if (r3 == 0) goto L4d
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4d
            java.util.HashMap r3 = r1.f4331q
            java.lang.Object r3 = r3.get(r6)
            goto L4e
        L4d:
            r3 = r2
        L4e:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L59
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5a
        L59:
            r3 = 0
        L5a:
            if (r3 != 0) goto L62
            if (r1 == 0) goto L62
            int r3 = r5.d(r1, r6)
        L62:
            if (r3 != 0) goto L6e
            java.lang.Class<w.p> r1 = w.AbstractC1018p.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L6e
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6e
        L6e:
            if (r3 != 0) goto L7e
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L7e:
            if (r3 == 0) goto L8d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f10702f
            r1.put(r0, r6)
            r5.b(r3)
            goto La5
        L8d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintHelper"
            android.util.Log.w(r6, r5)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.AbstractC1006c.a(java.lang.String):void");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i5 = this.f10698b + 1;
        int[] iArr = this.f10697a;
        if (i5 > iArr.length) {
            this.f10697a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f10697a;
        int i6 = this.f10698b;
        iArr2[i6] = i;
        this.f10698b = i6 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f10698b; i++) {
            View view = (View) constraintLayout.f4319a.get(this.f10697a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f10699c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1019q.f10865b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f10701e = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(u.d dVar, boolean z4);

    public final void g() {
        if (this.f10700d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1008e) {
            ((C1008e) layoutParams).f10747k0 = this.f10700d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f10697a, this.f10698b);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f10701e;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f10701e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f10698b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f10701e = null;
        this.f10698b = 0;
        for (int i : iArr) {
            b(i);
        }
    }
}
