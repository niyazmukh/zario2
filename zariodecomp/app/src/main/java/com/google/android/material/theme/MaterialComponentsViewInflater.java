package com.google.android.material.theme;

import J1.b;
import Q1.k;
import T1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b2.v;
import c2.AbstractC0336a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import g.B;
import l.C0672A;
import l.C0700m;
import l.C0702n;
import l.C0704o;
import l.Y;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\theme\MaterialComponentsViewInflater.smali */
public class MaterialComponentsViewInflater extends B {
    @Override // g.B
    public final C0700m a(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // g.B
    public final C0702n b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.B
    public final C0704o c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // g.B
    public final C0672A d(Context context, AttributeSet attributeSet) {
        a aVar = new a(AbstractC0336a.a(context, attributeSet, 2130903926, 2131952654), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray typedArrayH = k.h(context2, attributeSet, A1.a.f60u, 2130903926, 2131952654, new int[0]);
        if (typedArrayH.hasValue(0)) {
            Q.b.c(aVar, d.x(context2, typedArrayH, 0));
        }
        aVar.f3192f = typedArrayH.getBoolean(1, false);
        typedArrayH.recycle();
        return aVar;
    }

    @Override // g.B
    public final Y e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
