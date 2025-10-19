package o0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: o0.I, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\I.smali */
public final class C0774I extends AbstractC0777L {

    /* renamed from: m, reason: collision with root package name */
    public final Class f9021m;

    public C0774I(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f9021m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // o0.AbstractC0777L
    public final Object a(Bundle bundle, String key) {
        kotlin.jvm.internal.i.e(bundle, "bundle");
        kotlin.jvm.internal.i.e(key, "key");
        return bundle.get(key);
    }

    @Override // o0.AbstractC0777L
    public final String b() {
        return this.f9021m.getName();
    }

    @Override // o0.AbstractC0777L
    public final Object c(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // o0.AbstractC0777L
    public final void e(Bundle bundle, String key, Object obj) {
        kotlin.jvm.internal.i.e(key, "key");
        this.f9021m.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0774I.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f9021m, ((C0774I) obj).f9021m);
    }

    public final int hashCode() {
        return this.f9021m.hashCode();
    }
}
