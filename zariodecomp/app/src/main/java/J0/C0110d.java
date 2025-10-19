package J0;

import android.net.Uri;

/* renamed from: J0.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\d.1.smali */
public final class C0110d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2034a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2035b;

    public C0110d(Uri uri, boolean z4) {
        this.f2034a = uri;
        this.f2035b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0110d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C0110d c0110d = (C0110d) obj;
        return kotlin.jvm.internal.i.a(this.f2034a, c0110d.f2034a) && this.f2035b == c0110d.f2035b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2035b) + (this.f2034a.hashCode() * 31);
    }
}
