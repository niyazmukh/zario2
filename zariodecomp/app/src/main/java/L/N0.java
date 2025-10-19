package l;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\N0.smali */
public final class N0 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f8480a;

    public N0(SearchView searchView) {
        this.f8480a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f8480a.r();
        return true;
    }
}
