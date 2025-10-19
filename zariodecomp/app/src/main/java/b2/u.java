package b2;

import M.S;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\u.smali */
public final class u extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f5091a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f5092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f5093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f5093c = vVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        v vVar = this.f5093c;
        ColorStateList colorStateList2 = vVar.f5101p;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f5092b = colorStateList;
        if (vVar.f5100o != 0 && vVar.f5101p != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{D.a.b(vVar.f5101p.getColorForState(iArr3, 0), vVar.f5100o), D.a.b(vVar.f5101p.getColorForState(iArr2, 0), vVar.f5100o), vVar.f5100o});
        }
        this.f5091a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            v vVar = this.f5093c;
            Drawable rippleDrawable = null;
            if (vVar.getText().toString().contentEquals(textView.getText()) && vVar.f5100o != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(vVar.f5100o);
                if (this.f5092b != null) {
                    E.b.h(colorDrawable, this.f5091a);
                    rippleDrawable = new RippleDrawable(this.f5092b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = S.f2363a;
            M.B.q(textView, rippleDrawable);
        }
        return view2;
    }
}
