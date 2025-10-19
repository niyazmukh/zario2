package Q3;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q3\i.smali */
public abstract class i extends h implements kotlin.jvm.internal.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2816a;

    public i(O3.d dVar) {
        super(dVar);
        this.f2816a = 2;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f2816a;
    }

    @Override // Q3.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s.f8432a.getClass();
        String strA = t.a(this);
        kotlin.jvm.internal.i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
