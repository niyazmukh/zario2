package kotlin.jvm.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\n.smali */
public abstract class n extends b implements c4.h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8427a;

    public n(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f8427a = false;
    }

    @Override // kotlin.jvm.internal.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c4.h getReflected() {
        if (this.f8427a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        c4.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (c4.h) bVarCompute;
        }
        throw new W3.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.b
    public final c4.b compute() {
        return this.f8427a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return getOwner().equals(nVar.getOwner()) && getName().equals(nVar.getName()) && getSignature().equals(nVar.getSignature()) && i.a(getBoundReceiver(), nVar.getBoundReceiver());
        }
        if (obj instanceof c4.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        c4.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
