package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: l.t0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\t0.1.smali */
public final class C0714t0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8699b;

    public /* synthetic */ C0714t0(Object obj, int i) {
        this.f8698a = i;
        this.f8699b = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j5) {
        C0703n0 c0703n0;
        switch (this.f8698a) {
            case 0:
                if (i != -1 && (c0703n0 = ((C0725z0) this.f8699b).f8726c) != null) {
                    c0703n0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f8699b).p(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f8698a;
    }
}
