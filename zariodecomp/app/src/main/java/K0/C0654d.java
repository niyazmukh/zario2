package k0;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import kotlin.jvm.internal.i;
import q0.C0844h;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k0.1\d.smali */
public final class C0654d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0656f[] f8294a;

    public C0654d(C0656f... initializers) {
        i.e(initializers, "initializers");
        this.f8294a = initializers;
    }

    @Override // androidx.lifecycle.i0
    public final f0 create(Class modelClass, AbstractC0653c extras) {
        i.e(modelClass, "modelClass");
        i.e(extras, "extras");
        f0 f0Var = null;
        for (C0656f c0656f : this.f8294a) {
            if (c0656f.f8295a.equals(modelClass)) {
                f0Var = (f0) C0844h.f9448b.invoke(extras);
            }
        }
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(modelClass.getName()));
    }
}
