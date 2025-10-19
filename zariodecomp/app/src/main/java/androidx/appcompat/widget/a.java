package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\a.smali */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f4313a;

    public a(SearchView searchView) {
        this.f4313a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f4313a;
        ImageView imageView = searchView.f4260x;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f4256t;
        if (view == imageView) {
            searchView.x(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f4238P;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f4262z) {
            searchView.n();
            return;
        }
        if (view == searchView.f4261y) {
            searchView.r();
            return;
        }
        if (view != searchView.f4224A) {
            if (view == searchAutoComplete) {
                c.a(searchAutoComplete);
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f4251f0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m(searchView.f4235M, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f4234L);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
