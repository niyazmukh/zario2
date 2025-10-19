package X1;

import N2.AbstractC0156x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\m.smali */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public r1.d f3773a = new k();

    /* renamed from: b, reason: collision with root package name */
    public r1.d f3774b = new k();

    /* renamed from: c, reason: collision with root package name */
    public r1.d f3775c = new k();

    /* renamed from: d, reason: collision with root package name */
    public r1.d f3776d = new k();

    /* renamed from: e, reason: collision with root package name */
    public c f3777e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f3778f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f3779g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e();

    /* renamed from: j, reason: collision with root package name */
    public e f3780j = new e();

    /* renamed from: k, reason: collision with root package name */
    public e f3781k = new e();

    /* renamed from: l, reason: collision with root package name */
    public e f3782l = new e();

    public static l a(Context context, int i, int i5, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i5 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i5);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(A1.a.f33B);
        try {
            int i6 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i7 = typedArrayObtainStyledAttributes.getInt(3, i6);
            int i8 = typedArrayObtainStyledAttributes.getInt(4, i6);
            int i9 = typedArrayObtainStyledAttributes.getInt(2, i6);
            int i10 = typedArrayObtainStyledAttributes.getInt(1, i6);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            l lVar = new l();
            r1.d dVarQ = AbstractC0156x.q(i7);
            lVar.f3763a = dVarQ;
            l.b(dVarQ);
            lVar.f3767e = cVarC2;
            r1.d dVarQ2 = AbstractC0156x.q(i8);
            lVar.f3764b = dVarQ2;
            l.b(dVarQ2);
            lVar.f3768f = cVarC3;
            r1.d dVarQ3 = AbstractC0156x.q(i9);
            lVar.f3765c = dVarQ3;
            l.b(dVarQ3);
            lVar.f3769g = cVarC4;
            r1.d dVarQ4 = AbstractC0156x.q(i10);
            lVar.f3766d = dVarQ4;
            l.b(dVarQ4);
            lVar.h = cVarC5;
            return lVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static l b(Context context, AttributeSet attributeSet, int i, int i5) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f61v, i, i5);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i5 = typedValuePeekValue.type;
        return i5 == 5 ? new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i5 == 6 ? new j(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z4 = this.f3782l.getClass().equals(e.class) && this.f3780j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f3781k.getClass().equals(e.class);
        float fA = this.f3777e.a(rectF);
        return z4 && ((this.f3778f.a(rectF) > fA ? 1 : (this.f3778f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f3779g.a(rectF) > fA ? 1 : (this.f3779g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f3774b instanceof k) && (this.f3773a instanceof k) && (this.f3775c instanceof k) && (this.f3776d instanceof k));
    }

    public final l e() {
        l lVar = new l();
        lVar.f3763a = this.f3773a;
        lVar.f3764b = this.f3774b;
        lVar.f3765c = this.f3775c;
        lVar.f3766d = this.f3776d;
        lVar.f3767e = this.f3777e;
        lVar.f3768f = this.f3778f;
        lVar.f3769g = this.f3779g;
        lVar.h = this.h;
        lVar.i = this.i;
        lVar.f3770j = this.f3780j;
        lVar.f3771k = this.f3781k;
        lVar.f3772l = this.f3782l;
        return lVar;
    }
}
