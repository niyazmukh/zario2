package C;

import android.content.res.Resources;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C\m.smali */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f1058a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1059b;

    public m(Resources resources, Resources.Theme theme) {
        this.f1058a = resources;
        this.f1059b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1058a.equals(mVar.f1058a) && L.b.a(this.f1059b, mVar.f1059b);
    }

    public final int hashCode() {
        return L.b.b(this.f1058a, this.f1059b);
    }
}
