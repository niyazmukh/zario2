package z3;

import A2.C0020u;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\N.smali */
public abstract class N {
    public abstract String a();

    public abstract int b();

    public abstract boolean c();

    public abstract M d(AbstractC1080d abstractC1080d);

    public abstract d0 e(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(a(), "policy");
        c0020uX.d("priority", String.valueOf(b()));
        c0020uX.c("available", c());
        return c0020uX.toString();
    }
}
