package w;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: w.r, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\r.smali */
public abstract class AbstractC1020r extends AbstractC1006c {

    /* renamed from: k, reason: collision with root package name */
    public boolean f10871k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10872l;

    @Override // w.AbstractC1006c
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1019q.f10865b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f10871k = true;
                } else if (index == 13) {
                    this.f10872l = true;
                }
            }
        }
    }

    public abstract void h(u.g gVar, int i, int i5);

    @Override // w.AbstractC1006c, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f10871k || this.f10872l) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f10698b; i++) {
                View view = (View) constraintLayout.f4319a.get(this.f10697a[i]);
                if (view != null) {
                    if (this.f10871k) {
                        view.setVisibility(visibility);
                    }
                    if (this.f10872l && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        c();
    }
}
