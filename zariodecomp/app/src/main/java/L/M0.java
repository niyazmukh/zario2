package l;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\M0.smali */
public final class M0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f8478a;

    public M0(SearchView searchView) {
        this.f8478a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        SearchView searchView = this.f8478a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f4237O;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z4);
        }
    }
}
