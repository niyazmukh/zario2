package b2;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: b2.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\p.smali */
public abstract class AbstractC0277p {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f5053a;

    /* renamed from: b, reason: collision with root package name */
    public final C0276o f5054b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5055c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f5056d;

    public AbstractC0277p(C0276o c0276o) {
        this.f5053a = c0276o.f5031a;
        this.f5054b = c0276o;
        this.f5055c = c0276o.getContext();
        this.f5056d = c0276o.f5037k;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public N.d h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof C0272k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(N.o oVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z4) {
    }

    public final void q() {
        this.f5054b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
