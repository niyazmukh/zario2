package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.AbstractC0489a;
import java.lang.ref.WeakReference;
import l.i1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\ViewStubCompat.smali */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f4309a;

    /* renamed from: b, reason: collision with root package name */
    public int f4310b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f4311c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f4312d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4309a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6961A, 0, 0);
        this.f4310b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f4309a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f4309a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f4312d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f4309a, viewGroup, false);
        int i = this.f4310b;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f4311c = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4310b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4312d;
    }

    public int getLayoutResource() {
        return this.f4309a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f4310b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4312d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f4309a = i;
    }

    public void setOnInflateListener(i1 i1Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f4311c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}
