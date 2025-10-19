package Q3;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q3\j.smali */
public abstract class j extends c implements kotlin.jvm.internal.f {
    private final int arity;

    public j(int i, O3.d dVar) {
        super(dVar);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // Q3.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s.f8432a.getClass();
        String strA = t.a(this);
        kotlin.jvm.internal.i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
