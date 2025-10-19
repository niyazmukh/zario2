package o0;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: o0.K, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\K.smali */
public class C0776K extends AbstractC0777L {

    /* renamed from: m, reason: collision with root package name */
    public final Class f9023m;

    public C0776K(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f9023m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // o0.AbstractC0777L
    public final Object a(Bundle bundle, String key) {
        kotlin.jvm.internal.i.e(bundle, "bundle");
        kotlin.jvm.internal.i.e(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // o0.AbstractC0777L
    public String b() {
        return this.f9023m.getName();
    }

    @Override // o0.AbstractC0777L
    public final void e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        this.f9023m.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0776K)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f9023m, ((C0776K) obj).f9023m);
    }

    @Override // o0.AbstractC0777L
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Serializable c(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f9023m.hashCode();
    }

    public C0776K(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f9023m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
