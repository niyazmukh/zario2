package e0;

import android.text.Editable;
import c0.t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\a.smali */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6821a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f6822b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f6823c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f6823c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
