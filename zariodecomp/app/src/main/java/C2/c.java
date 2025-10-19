package C2;

import N2.n0;
import com.google.protobuf.K;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\c.smali */
public abstract class c implements q {

    /* renamed from: a, reason: collision with root package name */
    public final List f1077a;

    public c(K k5) {
        this.f1077a = Collections.unmodifiableList(k5);
    }

    @Override // C2.q
    public final n0 a(n0 n0Var, n0 n0Var2) {
        return d(n0Var);
    }

    @Override // C2.q
    public final n0 b(n0 n0Var, l2.o oVar) {
        return d(n0Var);
    }

    @Override // C2.q
    public final n0 c(n0 n0Var) {
        return null;
    }

    public abstract n0 d(n0 n0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f1077a.equals(((c) obj).f1077a);
    }

    public final int hashCode() {
        return this.f1077a.hashCode() + (getClass().hashCode() * 31);
    }
}
