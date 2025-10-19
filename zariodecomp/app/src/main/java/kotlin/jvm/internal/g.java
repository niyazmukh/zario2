package kotlin.jvm.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\g.smali */
public abstract class g extends b implements f, c4.e {
    private final int arity;
    private final int flags;

    public g(int i, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public c4.b computeReflected() {
        s.f8432a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver()) && i.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof c4.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // c4.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // c4.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // c4.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // c4.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // c4.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        c4.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public c4.e getReflected() {
        c4.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (c4.e) bVarCompute;
        }
        throw new W3.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
