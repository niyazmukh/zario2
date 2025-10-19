package M;

import android.view.DisplayCutout;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\i.1.smali */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2395a;

    public i(DisplayCutout displayCutout) {
        this.f2395a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return L.b.a(this.f2395a, ((i) obj).f2395a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f2395a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2395a + "}";
    }
}
