package T;

import android.database.DataSetObserver;
import l.C0725z0;
import l.U0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T\b.smali */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3124b;

    public /* synthetic */ b(Object obj, int i) {
        this.f3123a = i;
        this.f3124b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f3123a) {
            case 0:
                U0 u02 = (U0) this.f3124b;
                u02.f3125a = true;
                u02.notifyDataSetChanged();
                break;
            default:
                C0725z0 c0725z0 = (C0725z0) this.f3124b;
                if (c0725z0.f8723D.isShowing()) {
                    c0725z0.f();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f3123a) {
            case 0:
                U0 u02 = (U0) this.f3124b;
                u02.f3125a = false;
                u02.notifyDataSetInvalidated();
                break;
            default:
                ((C0725z0) this.f3124b).dismiss();
                break;
        }
    }
}
