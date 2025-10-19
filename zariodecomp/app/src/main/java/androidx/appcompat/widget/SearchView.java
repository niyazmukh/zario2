package androidx.appcompat.widget;

import A2.C0009i;
import M.B;
import M.M;
import M.S;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import b2.t;
import b2.y;
import f.AbstractC0489a;
import j.InterfaceC0617b;
import java.util.WeakHashMap;
import l.AbstractC0712s0;
import l.C0700m;
import l.C0714t0;
import l.L0;
import l.M0;
import l.N0;
import l.O0;
import l.P0;
import l.Q0;
import l.R0;
import l.S0;
import l.U0;
import l.g1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\SearchView.smali */
public class SearchView extends AbstractC0712s0 implements InterfaceC0617b {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f4223k0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f4224A;

    /* renamed from: B, reason: collision with root package name */
    public final View f4225B;

    /* renamed from: C, reason: collision with root package name */
    public S0 f4226C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f4227D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f4228E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f4229F;
    public final int[] G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f4230H;

    /* renamed from: I, reason: collision with root package name */
    public final Drawable f4231I;

    /* renamed from: J, reason: collision with root package name */
    public final int f4232J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4233K;

    /* renamed from: L, reason: collision with root package name */
    public final Intent f4234L;

    /* renamed from: M, reason: collision with root package name */
    public final Intent f4235M;

    /* renamed from: N, reason: collision with root package name */
    public final CharSequence f4236N;

    /* renamed from: O, reason: collision with root package name */
    public View.OnFocusChangeListener f4237O;

    /* renamed from: P, reason: collision with root package name */
    public View.OnClickListener f4238P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4239Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4240R;

    /* renamed from: S, reason: collision with root package name */
    public T.c f4241S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4242T;

    /* renamed from: U, reason: collision with root package name */
    public CharSequence f4243U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4244V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4245W;

    /* renamed from: a0, reason: collision with root package name */
    public int f4246a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4247b0;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f4248c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4249d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f4250e0;

    /* renamed from: f0, reason: collision with root package name */
    public SearchableInfo f4251f0;

    /* renamed from: g0, reason: collision with root package name */
    public Bundle f4252g0;

    /* renamed from: h0, reason: collision with root package name */
    public final L0 f4253h0;

    /* renamed from: i0, reason: collision with root package name */
    public final L0 f4254i0;

    /* renamed from: j0, reason: collision with root package name */
    public final WeakHashMap f4255j0;

    /* renamed from: t, reason: collision with root package name */
    public final SearchAutoComplete f4256t;

    /* renamed from: u, reason: collision with root package name */
    public final View f4257u;

    /* renamed from: v, reason: collision with root package name */
    public final View f4258v;

    /* renamed from: w, reason: collision with root package name */
    public final View f4259w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f4260x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f4261y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f4262z;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\SearchView$SearchAutoComplete.smali */
    public static class SearchAutoComplete extends C0700m {

        /* renamed from: e, reason: collision with root package name */
        public int f4263e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f4264f;

        /* renamed from: k, reason: collision with root package name */
        public boolean f4265k;

        /* renamed from: l, reason: collision with root package name */
        public final d f4266l;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4266l = new d(this);
            this.f4263e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f4263e <= 0 || super.enoughToFilter();
        }

        @Override // l.C0700m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4265k) {
                d dVar = this.f4266l;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i, Rect rect) {
            super.onFocusChanged(z4, i, rect);
            SearchView searchView = this.f4264f;
            searchView.x(searchView.f4240R);
            searchView.post(searchView.f4253h0);
            SearchAutoComplete searchAutoComplete = searchView.f4256t;
            if (searchAutoComplete.hasFocus()) {
                c.a(searchAutoComplete);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f4264f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f4264f.hasFocus() && getVisibility() == 0) {
                this.f4265k = true;
                Context context = getContext();
                int i = SearchView.f4223k0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    c.b(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f4266l;
            if (!z4) {
                this.f4265k = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f4265k = true;
                    return;
                }
                this.f4265k = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4264f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f4263e = i;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(2131099702);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(2131099703);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f4256t;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // j.InterfaceC0617b
    public final void b() {
        if (this.f4249d0) {
            return;
        }
        this.f4249d0 = true;
        SearchAutoComplete searchAutoComplete = this.f4256t;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f4250e0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f4245W = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f4256t;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f4245W = false;
    }

    @Override // j.InterfaceC0617b
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f4256t;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f4248c0 = "";
        clearFocus();
        x(true);
        searchAutoComplete.setImeOptions(this.f4250e0);
        this.f4249d0 = false;
    }

    public int getImeOptions() {
        return this.f4256t.getImeOptions();
    }

    public int getInputType() {
        return this.f4256t.getInputType();
    }

    public int getMaxWidth() {
        return this.f4246a0;
    }

    public CharSequence getQuery() {
        return this.f4256t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f4243U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f4251f0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f4236N : getContext().getText(this.f4251f0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f4233K;
    }

    public int getSuggestionRowLayout() {
        return this.f4232J;
    }

    public T.c getSuggestionsAdapter() {
        return this.f4241S;
    }

    public final Intent l(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4248c0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f4252g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f4251f0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4252g0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        SearchAutoComplete searchAutoComplete = this.f4256t;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f4239Q) {
            clearFocus();
            x(true);
        }
    }

    public final void o(int i) {
        int position;
        String strH;
        Cursor cursor = this.f4241S.f3127c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentL = null;
            try {
                int i5 = U0.f8505B;
                String strH2 = U0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f4251f0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = U0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f4251f0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = U0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentL = l(strH3 == null ? null : Uri.parse(strH3), strH2, U0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), U0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e5) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e5);
            }
            if (intentL != null) {
                try {
                    getContext().startActivity(intentL);
                } catch (RuntimeException e6) {
                    Log.e("SearchView", "Failed launch activity: " + intentL, e6);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f4256t;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4253h0);
        post(this.f4254i0);
        super.onDetachedFromWindow();
    }

    @Override // l.AbstractC0712s0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        if (z4) {
            int[] iArr = this.f4229F;
            SearchAutoComplete searchAutoComplete = this.f4256t;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.G;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.f4227D;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i5;
            Rect rect2 = this.f4228E;
            rect2.set(i10, 0, i11, i12);
            S0 s02 = this.f4226C;
            if (s02 == null) {
                S0 s03 = new S0(rect2, rect, searchAutoComplete);
                this.f4226C = s03;
                setTouchDelegate(s03);
            } else {
                s02.f8495b.set(rect2);
                Rect rect3 = s02.f8497d;
                rect3.set(rect2);
                int i13 = -s02.f8498e;
                rect3.inset(i13, i13);
                s02.f8496c.set(rect);
            }
        }
    }

    @Override // l.AbstractC0712s0, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        if (this.f4240R) {
            super.onMeasure(i, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f4246a0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f4246a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f4246a0) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof R0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        R0 r02 = (R0) parcelable;
        super.onRestoreInstanceState(r02.f3264a);
        x(r02.f8493c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        R0 r02 = new R0(super.onSaveInstanceState());
        r02.f8493c = this.f4240R;
        return r02;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f4253h0);
    }

    public final void p(int i) {
        Editable text = this.f4256t.getText();
        Cursor cursor = this.f4241S.f3127c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.f4241S.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void r() {
        SearchAutoComplete searchAutoComplete = this.f4256t;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f4251f0 != null) {
            getContext().startActivity(l(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f4245W || !isFocusable()) {
            return false;
        }
        if (this.f4240R) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f4256t.requestFocus(i, rect);
        if (zRequestFocus) {
            x(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f4256t.getText());
        int i = (!zIsEmpty || (this.f4239Q && !this.f4249d0)) ? 0 : 8;
        ImageView imageView = this.f4262z;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4252g0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            n();
            return;
        }
        x(false);
        SearchAutoComplete searchAutoComplete = this.f4256t;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f4238P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f4239Q == z4) {
            return;
        }
        this.f4239Q = z4;
        x(z4);
        u();
    }

    public void setImeOptions(int i) {
        this.f4256t.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f4256t.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f4246a0 = i;
        requestLayout();
    }

    public void setOnCloseListener(O0 o02) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4237O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(P0 p02) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f4238P = onClickListener;
    }

    public void setOnSuggestionListener(Q0 q02) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4243U = charSequence;
        u();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f4244V = z4;
        T.c cVar = this.f4241S;
        if (cVar instanceof U0) {
            ((U0) cVar).f8515t = z4 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f4251f0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f4256t;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f4251f0.getImeOptions());
            int inputType = this.f4251f0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f4251f0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            T.c cVar = this.f4241S;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f4251f0.getSuggestAuthority() != null) {
                U0 u02 = new U0(getContext(), this, this.f4251f0, this.f4255j0);
                this.f4241S = u02;
                searchAutoComplete.setAdapter(u02);
                ((U0) this.f4241S).f8515t = this.f4244V ? 2 : 1;
            }
            u();
        }
        SearchableInfo searchableInfo2 = this.f4251f0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f4251f0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f4234L;
            } else if (this.f4251f0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f4235M;
            }
            if (intent != null) {
                z4 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f4247b0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        x(this.f4240R);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f4242T = z4;
        x(this.f4240R);
    }

    public void setSuggestionsAdapter(T.c cVar) {
        this.f4241S = cVar;
        this.f4256t.setAdapter(cVar);
    }

    public final void t() {
        int[] iArr = this.f4256t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f4258v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4259w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void u() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z4 = this.f4239Q;
        SearchAutoComplete searchAutoComplete = this.f4256t;
        if (z4 && (drawable = this.f4231I) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void v() {
        this.f4259w.setVisibility(((this.f4242T || this.f4247b0) && !this.f4240R && (this.f4261y.getVisibility() == 0 || this.f4224A.getVisibility() == 0)) ? 0 : 8);
    }

    public final void w(boolean z4) {
        boolean z5 = this.f4242T;
        this.f4261y.setVisibility((!z5 || !(z5 || this.f4247b0) || this.f4240R || !hasFocus() || (!z4 && this.f4247b0)) ? 8 : 0);
    }

    public final void x(boolean z4) {
        this.f4240R = z4;
        int i = 8;
        int i5 = z4 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f4256t.getText());
        this.f4260x.setVisibility(i5);
        w(!zIsEmpty);
        this.f4257u.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.f4230H;
        imageView.setVisibility((imageView.getDrawable() == null || this.f4239Q) ? 8 : 0);
        s();
        if (this.f4247b0 && !this.f4240R && zIsEmpty) {
            this.f4261y.setVisibility(8);
            i = 0;
        }
        this.f4224A.setVisibility(i);
        v();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903951);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4227D = new Rect();
        this.f4228E = new Rect();
        this.f4229F = new int[2];
        this.G = new int[2];
        this.f4253h0 = new L0(this, 0);
        this.f4254i0 = new L0(this, 1);
        this.f4255j0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        N0 n02 = new N0(this);
        t tVar = new t(this, 2);
        C0714t0 c0714t0 = new C0714t0(this, 1);
        y yVar = new y(this, 1);
        int[] iArr = AbstractC0489a.f6980u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0009i c0009i = new C0009i(16, context, typedArrayObtainStyledAttributes);
        WeakHashMap weakHashMap = S.f2363a;
        M.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, 2131427353), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(2131231161);
        this.f4256t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f4257u = findViewById(2131231157);
        View viewFindViewById = findViewById(2131231160);
        this.f4258v = viewFindViewById;
        View viewFindViewById2 = findViewById(2131231204);
        this.f4259w = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(2131231155);
        this.f4260x = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131231158);
        this.f4261y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(2131231156);
        this.f4262z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(2131231162);
        this.f4224A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(2131231159);
        this.f4230H = imageView5;
        B.q(viewFindViewById, c0009i.I(20));
        B.q(viewFindViewById2, c0009i.I(25));
        imageView.setImageDrawable(c0009i.I(23));
        imageView2.setImageDrawable(c0009i.I(15));
        imageView3.setImageDrawable(c0009i.I(12));
        imageView4.setImageDrawable(c0009i.I(28));
        imageView5.setImageDrawable(c0009i.I(23));
        this.f4231I = c0009i.I(22);
        g1.a(imageView, getResources().getString(2131886101));
        this.f4232J = typedArrayObtainStyledAttributes.getResourceId(26, 2131427352);
        this.f4233K = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(yVar);
        searchAutoComplete.setOnEditorActionListener(n02);
        searchAutoComplete.setOnItemClickListener(tVar);
        searchAutoComplete.setOnItemSelectedListener(c0714t0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new M0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f4236N = typedArrayObtainStyledAttributes.getText(14);
        this.f4243U = typedArrayObtainStyledAttributes.getText(21);
        int i5 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i6 != -1) {
            setInputType(i6);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        c0009i.e0();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4234L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4235M = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4225B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new E1.a(this, 2));
        }
        x(this.f4239Q);
        u();
    }
}
