package M1;

import E2.j;
import M.H;
import M.S;
import N2.AbstractC0156x;
import Q1.k;
import X1.h;
import X1.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import c2.AbstractC0336a;
import g.C0527b;
import g.DialogInterfaceC0531f;
import j.C0618d;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M1\b.smali */
public final class b extends j {

    /* renamed from: d, reason: collision with root package name */
    public final h f2483d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2484e;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context) {
        TypedValue typedValueO = p1.b.O(context, 2130903744);
        int i = typedValueO == null ? 0 : typedValueO.data;
        Context contextA = AbstractC0336a.a(context, null, 2130903084, 2131951916);
        contextA = i != 0 ? new C0618d(contextA, i) : contextA;
        TypedValue typedValueO2 = p1.b.O(context, 2130903744);
        super(contextA, typedValueO2 == null ? 0 : typedValueO2.data);
        ContextThemeWrapper contextThemeWrapper = ((C0527b) this.f1460c).f7157a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        int[] iArr = A1.a.f52m;
        k.a(contextThemeWrapper, null, 2130903084, 2131951916);
        k.b(contextThemeWrapper, null, iArr, 2130903084, 2131951916, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, 2130903084, 2131951916);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(2131100244));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(2131100245));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(2131100243));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(2131100242));
        typedArrayObtainStyledAttributes.recycle();
        if (contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f2484e = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iH = AbstractC0156x.H(contextThemeWrapper, 2130903314, b.class.getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, 2130903084, 2131951916);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iH);
        typedArrayObtainStyledAttributes2.recycle();
        h hVar = new h(contextThemeWrapper, null, 2130903084, 2131951916);
        hVar.j(contextThemeWrapper);
        hVar.m(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(((C0527b) this.f1460c).f7157a.getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            l lVarE = hVar.f3738a.f3722a.e();
            lVarE.c(dimension);
            hVar.setShapeAppearanceModel(lVarE.a());
        }
        this.f2483d = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, g.f] */
    @Override // E2.j
    public final DialogInterfaceC0531f a() {
        ?? A4 = super.a();
        Window window = A4.getWindow();
        View decorView = window.getDecorView();
        h hVar = this.f2483d;
        if (hVar != null) {
            WeakHashMap weakHashMap = S.f2363a;
            hVar.l(H.i(decorView));
        }
        Rect rect = this.f2484e;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) hVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(A4, rect));
        return A4;
    }
}
