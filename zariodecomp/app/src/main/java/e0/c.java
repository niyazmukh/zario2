package e0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\c.smali */
public final class c extends c0.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6826a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f6827b;

    public c(TextView textView, d dVar) {
        this.f6826a = new WeakReference(textView);
        this.f6827b = new WeakReference(dVar);
    }

    @Override // c0.g
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f6826a.get();
        InputFilter inputFilter = (InputFilter) this.f6827b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    c0.i iVarA = c0.i.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        iVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceE = iVarA.e(text, 0, length);
                    if (text == charSequenceE) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceE);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceE);
                    textView.setText(charSequenceE);
                    if (charSequenceE instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceE;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
