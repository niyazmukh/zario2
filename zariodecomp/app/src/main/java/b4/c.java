package b4;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b4\c.smali */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c5 = this.f5338a;
            char c6 = this.f5339b;
            if (i.f(c5, c6) > 0) {
                c cVar = (c) obj;
                if (i.f(cVar.f5338a, cVar.f5339b) <= 0) {
                }
                return true;
            }
            c cVar2 = (c) obj;
            if (c5 == cVar2.f5338a && c6 == cVar2.f5339b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        char c5 = this.f5338a;
        char c6 = this.f5339b;
        if (i.f(c5, c6) > 0) {
            return -1;
        }
        return c6 + (c5 * 31);
    }

    public final String toString() {
        return this.f5338a + ".." + this.f5339b;
    }
}
