package b2;

import android.text.Editable;

/* renamed from: b2.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\l.smali */
public final class C0273l extends Q1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0276o f5027a;

    public C0273l(C0276o c0276o) {
        this.f5027a = c0276o;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f5027a.b().a();
    }

    @Override // Q1.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        this.f5027a.b().b();
    }
}
