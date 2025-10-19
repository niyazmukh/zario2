package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\b.smali */
public final class b implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f4314a;

    public b(SearchView searchView) {
        this.f4314a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f4314a;
        if (searchView.f4251f0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f4256t;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.l(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f4251f0 == null || searchView.f4241S == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            searchView.o(searchAutoComplete.getListSelection());
        } else {
            if (i != 21 && i != 22) {
                if (i != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            c.b(searchAutoComplete, 1);
            if (searchAutoComplete.enoughToFilter()) {
                searchAutoComplete.showDropDown();
            }
        }
        return true;
    }
}
