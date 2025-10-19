package com.google.android.material.textview;

import A1.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c2.AbstractC0336a;
import l.Y;
import p1.b;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\textview\MaterialTextView.smali */
public class MaterialTextView extends Y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC0336a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (b.P(context2, 2130904107, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a.f63x;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iZ = -1;
            for (int i = 0; i < 2 && iZ < 0; i++) {
                iZ = d.z(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iZ != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, a.f62w);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iZ2 = -1;
                for (int i5 = 0; i5 < 2 && iZ2 < 0; i5++) {
                    iZ2 = d.z(context3, typedArrayObtainStyledAttributes3, iArr3[i5], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iZ2 >= 0) {
                    setLineHeight(iZ2);
                }
            }
        }
    }

    @Override // l.Y, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (b.P(context, 2130904107, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, a.f62w);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iZ = -1;
            for (int i5 = 0; i5 < 2 && iZ < 0; i5++) {
                iZ = d.z(context2, typedArrayObtainStyledAttributes, iArr[i5], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iZ >= 0) {
                setLineHeight(iZ);
            }
        }
    }
}
