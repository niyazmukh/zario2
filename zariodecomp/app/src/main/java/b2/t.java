package b2;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import l.C0725z0;
import l.M;
import l.P;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\t.smali */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5090b;

    public /* synthetic */ t(Object obj, int i) {
        this.f5089a = i;
        this.f5090b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j5) {
        Object item;
        switch (this.f5089a) {
            case 0:
                v vVar = (v) this.f5090b;
                if (i < 0) {
                    C0725z0 c0725z0 = vVar.f5094e;
                    item = !c0725z0.f8723D.isShowing() ? null : c0725z0.f8726c.getSelectedItem();
                } else {
                    item = vVar.getAdapter().getItem(i);
                }
                v.a(vVar, item);
                AdapterView.OnItemClickListener onItemClickListener = vVar.getOnItemClickListener();
                C0725z0 c0725z02 = vVar.f5094e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c0725z02.f8723D.isShowing() ? c0725z02.f8726c.getSelectedView() : null;
                        i = !c0725z02.f8723D.isShowing() ? -1 : c0725z02.f8726c.getSelectedItemPosition();
                        j5 = !c0725z02.f8723D.isShowing() ? Long.MIN_VALUE : c0725z02.f8726c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0725z02.f8726c, view, i, j5);
                }
                c0725z02.dismiss();
                break;
            case 1:
                M m5 = (M) this.f5090b;
                m5.f8477I.setSelection(i);
                P p5 = m5.f8477I;
                if (p5.getOnItemClickListener() != null) {
                    p5.performItemClick(view, i, m5.f8475F.getItemId(i));
                }
                m5.dismiss();
                break;
            default:
                ((SearchView) this.f5090b).o(i);
                break;
        }
    }
}
