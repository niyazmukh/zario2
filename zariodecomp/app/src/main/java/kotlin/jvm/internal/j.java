package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\j.smali */
public abstract class j implements f, Serializable {
    private final int arity;

    public j(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        s.f8432a.getClass();
        String strA = t.a(this);
        i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
