package b2;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\y.smali */
public final class y implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5116b;

    public /* synthetic */ y(ViewGroup viewGroup, int i) {
        this.f5115a = i;
        this.f5116b = viewGroup;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i5, int i6, CharSequence charSequence) {
    }

    private final void c(int i, int i5, int i6, CharSequence charSequence) {
    }

    private final void d(int i, int i5, int i6, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f5115a) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.f5116b;
                textInputLayout.u(!textInputLayout.f6124D0, false);
                if (textInputLayout.f6167o) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.f6183w) {
                    textInputLayout.v(editable);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        int i7 = this.f5115a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        switch (this.f5115a) {
            case 0:
                break;
            default:
                SearchView searchView = (SearchView) this.f5116b;
                Editable text = searchView.f4256t.getText();
                searchView.f4248c0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.w(!zIsEmpty);
                int i7 = 8;
                if (searchView.f4247b0 && !searchView.f4240R && zIsEmpty) {
                    searchView.f4261y.setVisibility(8);
                    i7 = 0;
                }
                searchView.f4224A.setVisibility(i7);
                searchView.s();
                searchView.v();
                charSequence.toString();
                break;
        }
    }
}
