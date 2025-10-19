package androidx.lifecycle;

import java.util.LinkedHashMap;
import k0.AbstractC0653c;
import k0.C0651a;
import k0.C0655e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\l0.smali */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f4653a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f4654b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0653c f4655c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(m0 store, i0 i0Var) {
        this(store, i0Var, 0);
        kotlin.jvm.internal.i.e(store, "store");
    }

    public final f0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0 b(Class cls, String key) {
        f0 viewModel;
        kotlin.jvm.internal.i.e(key, "key");
        m0 m0Var = this.f4653a;
        m0Var.getClass();
        LinkedHashMap linkedHashMap = m0Var.f4657a;
        f0 f0Var = (f0) linkedHashMap.get(key);
        boolean zIsInstance = cls.isInstance(f0Var);
        i0 i0Var = this.f4654b;
        if (zIsInstance) {
            k0 k0Var = i0Var instanceof k0 ? (k0) i0Var : null;
            if (k0Var != null) {
                kotlin.jvm.internal.i.b(f0Var);
                k0Var.a(f0Var);
            }
            kotlin.jvm.internal.i.c(f0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return f0Var;
        }
        C0655e c0655e = new C0655e(this.f4655c);
        c0655e.b(g0.f4649b, key);
        try {
            viewModel = i0Var.create(cls, c0655e);
        } catch (AbstractMethodError unused) {
            viewModel = i0Var.create(cls);
        }
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        f0 f0Var2 = (f0) linkedHashMap.put(key, viewModel);
        if (f0Var2 != null) {
            f0Var2.onCleared();
        }
        return viewModel;
    }

    public l0(m0 store, i0 factory, AbstractC0653c defaultCreationExtras) {
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f4653a = store;
        this.f4654b = factory;
        this.f4655c = defaultCreationExtras;
    }

    public /* synthetic */ l0(m0 m0Var, i0 i0Var, int i) {
        this(m0Var, i0Var, C0651a.f8292b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(n0 owner, i0 i0Var) {
        AbstractC0653c abstractC0653cA;
        kotlin.jvm.internal.i.e(owner, "owner");
        m0 m0VarE = owner.e();
        if (owner instanceof InterfaceC0232j) {
            abstractC0653cA = ((InterfaceC0232j) owner).a();
        } else {
            abstractC0653cA = C0651a.f8292b;
        }
        this(m0VarE, i0Var, abstractC0653cA);
    }
}
