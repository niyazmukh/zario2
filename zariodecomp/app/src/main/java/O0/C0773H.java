package o0;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: o0.H, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\H.smali */
public final class C0773H extends AbstractC0777L {

    /* renamed from: m, reason: collision with root package name */
    public final Class f9020m;

    public C0773H(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f9020m = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // o0.AbstractC0777L
    public final Object a(Bundle bundle, String key) {
        kotlin.jvm.internal.i.e(bundle, "bundle");
        kotlin.jvm.internal.i.e(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // o0.AbstractC0777L
    public final String b() {
        return this.f9020m.getName();
    }

    @Override // o0.AbstractC0777L
    public final Object c(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // o0.AbstractC0777L
    public final void e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        kotlin.jvm.internal.i.e(key, "key");
        this.f9020m.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0773H.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f9020m, ((C0773H) obj).f9020m);
    }

    public final int hashCode() {
        return this.f9020m.hashCode();
    }
}
