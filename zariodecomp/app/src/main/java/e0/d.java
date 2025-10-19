package e0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\d.smali */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6828a;

    /* renamed from: b, reason: collision with root package name */
    public c f6829b;

    public d(TextView textView) {
        this.f6828a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i5, Spanned spanned, int i6, int i7) {
        TextView textView = this.f6828a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = c0.i.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i5);
                }
                return c0.i.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        c0.i iVarA = c0.i.a();
        if (this.f6829b == null) {
            this.f6829b = new c(textView, this);
        }
        iVarA.f(this.f6829b);
        return charSequence;
    }
}
