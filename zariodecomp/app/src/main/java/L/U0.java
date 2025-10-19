package l;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\U0.smali */
public final class U0 extends T.c implements View.OnClickListener {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f8505B = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f8506A;

    /* renamed from: l, reason: collision with root package name */
    public final int f8507l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8508m;

    /* renamed from: n, reason: collision with root package name */
    public final LayoutInflater f8509n;

    /* renamed from: o, reason: collision with root package name */
    public final SearchView f8510o;

    /* renamed from: p, reason: collision with root package name */
    public final SearchableInfo f8511p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f8512q;

    /* renamed from: r, reason: collision with root package name */
    public final WeakHashMap f8513r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8514s;

    /* renamed from: t, reason: collision with root package name */
    public int f8515t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f8516u;

    /* renamed from: v, reason: collision with root package name */
    public int f8517v;

    /* renamed from: w, reason: collision with root package name */
    public int f8518w;

    /* renamed from: x, reason: collision with root package name */
    public int f8519x;

    /* renamed from: y, reason: collision with root package name */
    public int f8520y;

    /* renamed from: z, reason: collision with root package name */
    public int f8521z;

    public U0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f3126b = true;
        this.f3127c = null;
        this.f3125a = false;
        this.f3128d = -1;
        this.f3129e = new T.a(this);
        this.f3130f = new T.b(this, 0);
        this.f8508m = suggestionRowLayout;
        this.f8507l = suggestionRowLayout;
        this.f8509n = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8515t = 1;
        this.f8517v = -1;
        this.f8518w = -1;
        this.f8519x = -1;
        this.f8520y = -1;
        this.f8521z = -1;
        this.f8506A = -1;
        this.f8510o = searchView;
        this.f8511p = searchableInfo;
        this.f8514s = searchView.getSuggestionCommitIconResId();
        this.f8512q = context;
        this.f8513r = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e5);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    @Override // T.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r22, android.database.Cursor r23) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.U0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // T.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f8517v = cursor.getColumnIndex("suggest_text_1");
                this.f8518w = cursor.getColumnIndex("suggest_text_2");
                this.f8519x = cursor.getColumnIndex("suggest_text_2_url");
                this.f8520y = cursor.getColumnIndex("suggest_icon_1");
                this.f8521z = cursor.getColumnIndex("suggest_icon_2");
                this.f8506A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e5);
        }
    }

    @Override // T.c
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f8511p;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // T.c
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f8509n.inflate(this.f8507l, viewGroup, false);
        viewInflate.setTag(new T0(viewInflate));
        ((ImageView) viewInflate.findViewById(2131230922)).setImageResource(this.f8514s);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f8512q.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.U0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f8512q.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // T.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewInflate = this.f8509n.inflate(this.f8508m, viewGroup, false);
            if (viewInflate != null) {
                ((T0) viewInflate.getTag()).f8500a.setText(e5.toString());
            }
            return viewInflate;
        }
    }

    @Override // T.c, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewD = this.d(viewGroup);
            ((T0) viewD.getTag()).f8500a.setText(e5.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f3127c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f3127c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f8510o.q((CharSequence) tag);
        }
    }
}
