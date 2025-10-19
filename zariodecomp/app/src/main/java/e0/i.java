package e0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\i.smali */
public final class i implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f6837a;

    /* renamed from: b, reason: collision with root package name */
    public h f6838b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6839c = true;

    public i(EditText editText) {
        this.f6837a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            c0.i iVarA = c0.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                iVarA.getClass();
                length = editableText.length();
            }
            iVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        EditText editText = this.f6837a;
        if (editText.isInEditMode() || !this.f6839c || c0.i.f5356j == null || i5 > i6 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = c0.i.a().b();
        if (iB != 0) {
            if (iB == 1) {
                c0.i.a().e((Spannable) charSequence, i, i6 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        c0.i iVarA = c0.i.a();
        if (this.f6838b == null) {
            this.f6838b = new h(editText);
        }
        iVarA.f(this.f6838b);
    }
}
