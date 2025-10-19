package F0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\s.smali */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public final View f1644b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1643a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1645c = new ArrayList();

    public s(View view) {
        this.f1644b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f1644b == sVar.f1644b && this.f1643a.equals(sVar.f1643a);
    }

    public final int hashCode() {
        return this.f1643a.hashCode() + (this.f1644b.hashCode() * 31);
    }

    public final String toString() {
        String strK = B.a.k(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1644b + "\n", "    values:");
        HashMap map = this.f1643a;
        for (String str : map.keySet()) {
            strK = strK + "    " + str + ": " + map.get(str) + "\n";
        }
        return strK;
    }
}
