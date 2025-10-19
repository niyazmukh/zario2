package b2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: b2.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\m.smali */
public final class C0274m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0276o f5028a;

    public C0274m(C0276o c0276o) {
        this.f5028a = c0276o;
    }

    public final void a(TextInputLayout textInputLayout) {
        C0276o c0276o = this.f5028a;
        if (c0276o.f5049w == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0276o.f5049w;
        C0273l c0273l = c0276o.f5052z;
        if (editText != null) {
            editText.removeTextChangedListener(c0273l);
            if (c0276o.f5049w.getOnFocusChangeListener() == c0276o.b().e()) {
                c0276o.f5049w.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0276o.f5049w = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0273l);
        }
        c0276o.b().m(c0276o.f5049w);
        c0276o.j(c0276o.b());
    }
}
