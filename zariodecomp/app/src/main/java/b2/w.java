package b2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\w.smali */
public final class w extends AbstractC0277p {

    /* renamed from: e, reason: collision with root package name */
    public final int f5102e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f5103f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0262a f5104g;

    public w(C0276o c0276o, int i) {
        super(c0276o);
        this.f5102e = 2131165338;
        this.f5104g = new ViewOnClickListenerC0262a(this, 2);
        if (i != 0) {
            this.f5102e = i;
        }
    }

    @Override // b2.AbstractC0277p
    public final void b() {
        q();
    }

    @Override // b2.AbstractC0277p
    public final int c() {
        return 2131886454;
    }

    @Override // b2.AbstractC0277p
    public final int d() {
        return this.f5102e;
    }

    @Override // b2.AbstractC0277p
    public final View.OnClickListener f() {
        return this.f5104g;
    }

    @Override // b2.AbstractC0277p
    public final boolean k() {
        return true;
    }

    @Override // b2.AbstractC0277p
    public final boolean l() {
        EditText editText = this.f5103f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // b2.AbstractC0277p
    public final void m(EditText editText) {
        this.f5103f = editText;
        q();
    }

    @Override // b2.AbstractC0277p
    public final void r() {
        EditText editText = this.f5103f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f5103f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // b2.AbstractC0277p
    public final void s() {
        EditText editText = this.f5103f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
