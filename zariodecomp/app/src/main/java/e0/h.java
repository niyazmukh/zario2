package e0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\h.smali */
public final class h extends c0.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6836a;

    public h(EditText editText) {
        this.f6836a = new WeakReference(editText);
    }

    @Override // c0.g
    public final void a() {
        i.a((EditText) this.f6836a.get(), 1);
    }
}
