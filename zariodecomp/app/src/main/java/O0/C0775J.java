package o0;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: o0.J, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\J.smali */
public final class C0775J extends AbstractC0777L {

    /* renamed from: m, reason: collision with root package name */
    public final Class f9022m;

    public C0775J(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f9022m = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // o0.AbstractC0777L
    public final Object a(Bundle bundle, String key) {
        kotlin.jvm.internal.i.e(bundle, "bundle");
        kotlin.jvm.internal.i.e(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // o0.AbstractC0777L
    public final String b() {
        return this.f9022m.getName();
    }

    @Override // o0.AbstractC0777L
    public final Object c(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // o0.AbstractC0777L
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r42 = (Serializable[]) obj;
        kotlin.jvm.internal.i.e(key, "key");
        this.f9022m.cast(r42);
        bundle.putSerializable(key, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0775J.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f9022m, ((C0775J) obj).f9022m);
    }

    public final int hashCode() {
        return this.f9022m.hashCode();
    }
}
