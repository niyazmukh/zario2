package C3;

import z3.Q;
import z3.S;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\h.smali */
public final class h extends S {
    @Override // z3.S
    public Q a(String str) {
        return new g(str);
    }

    @Override // z3.S
    public boolean b() {
        return true;
    }

    @Override // z3.S
    public int c() throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, h.class.getClassLoader());
            return 8;
        } catch (Exception unused) {
            return 3;
        }
    }
}
