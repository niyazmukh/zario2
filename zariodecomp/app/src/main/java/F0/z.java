package F0;

import android.view.ViewGroup;
import android.view.WindowId;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\z.smali */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f1663a;

    public z(ViewGroup viewGroup) {
        this.f1663a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && ((z) obj).f1663a.equals(this.f1663a);
    }

    public final int hashCode() {
        return this.f1663a.hashCode();
    }
}
