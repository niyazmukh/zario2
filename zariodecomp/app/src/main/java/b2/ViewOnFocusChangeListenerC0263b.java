package b2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\b.smali */
public final /* synthetic */ class ViewOnFocusChangeListenerC0263b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4997b;

    public /* synthetic */ ViewOnFocusChangeListenerC0263b(Object obj, int i) {
        this.f4996a = i;
        this.f4997b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f4996a) {
            case 0:
                C0266e c0266e = (C0266e) this.f4997b;
                c0266e.t(c0266e.u());
                break;
            case 1:
                C0272k c0272k = (C0272k) this.f4997b;
                c0272k.f5020l = z4;
                c0272k.q();
                if (!z4) {
                    c0272k.t(false);
                    c0272k.f5021m = false;
                    break;
                }
                break;
            default:
                for (EditText editText : (EditText[]) this.f4997b) {
                    if (editText.hasFocus()) {
                        break;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) B.l.getSystemService(view.getContext(), InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
        }
    }
}
