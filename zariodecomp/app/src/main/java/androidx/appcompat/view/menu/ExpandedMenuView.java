package androidx.appcompat.view.menu;

import A2.C0009i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.InterfaceC0637A;
import k.k;
import k.l;
import k.n;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\view\menu\ExpandedMenuView.smali */
public final class ExpandedMenuView extends ListView implements k, InterfaceC0637A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4124b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public l f4125a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0009i c0009iY = C0009i.Y(context, attributeSet, f4124b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0009iY.I(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0009iY.I(1));
        }
        c0009iY.e0();
    }

    public final boolean a(n nVar) {
        return this.f4125a.q(nVar, null, 0);
    }

    @Override // k.InterfaceC0637A
    public final void d(l lVar) {
        this.f4125a = lVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j5) {
        a((n) getAdapter().getItem(i));
    }
}
