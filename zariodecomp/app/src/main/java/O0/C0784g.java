package o0;

import androidx.lifecycle.C0242x;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import java.io.IOException;
import k0.AbstractC0653c;
import l.C0708q;

/* renamed from: o0.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\g.1.smali */
public final class C0784g extends k0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public C0708q f9063a;

    /* renamed from: b, reason: collision with root package name */
    public C0242x f9064b;

    @Override // androidx.lifecycle.k0
    public final void a(f0 f0Var) {
        C0708q c0708q = this.f9063a;
        if (c0708q != null) {
            C0242x c0242x = this.f9064b;
            kotlin.jvm.internal.i.b(c0242x);
            a0.a(f0Var, c0708q, c0242x);
        }
    }

    @Override // androidx.lifecycle.i0
    public final f0 create(Class modelClass, AbstractC0653c extras) throws IOException {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        kotlin.jvm.internal.i.e(extras, "extras");
        String str = (String) extras.a(g0.f4649b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        C0708q c0708q = this.f9063a;
        if (c0708q == null) {
            return new C0785h(a0.d(extras));
        }
        kotlin.jvm.internal.i.b(c0708q);
        C0242x c0242x = this.f9064b;
        kotlin.jvm.internal.i.b(c0242x);
        Y yB = a0.b(c0708q, c0242x, str, null);
        C0785h c0785h = new C0785h(yB.b);
        c0785h.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", yB);
        return c0785h;
    }

    @Override // androidx.lifecycle.i0
    public final f0 create(Class modelClass) throws IOException {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.f9064b != null) {
                C0708q c0708q = this.f9063a;
                kotlin.jvm.internal.i.b(c0708q);
                C0242x c0242x = this.f9064b;
                kotlin.jvm.internal.i.b(c0242x);
                Y yB = a0.b(c0708q, c0242x, canonicalName, null);
                C0785h c0785h = new C0785h(yB.b);
                c0785h.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", yB);
                return c0785h;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
