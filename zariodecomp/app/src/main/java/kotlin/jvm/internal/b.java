package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\b.smali */
public abstract class b implements c4.b, Serializable {
    public static final Object NO_RECEIVER = a.f8421a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient c4.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z4) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z4;
    }

    @Override // c4.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // c4.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public c4.b compute() {
        c4.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        c4.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract c4.b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // c4.b
    public String getName() {
        return this.name;
    }

    public c4.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return s.a(cls);
        }
        s.f8432a.getClass();
        return new k(cls);
    }

    @Override // c4.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract c4.b getReflected();

    @Override // c4.b
    public c4.i getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // c4.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // c4.b
    public c4.j getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // c4.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // c4.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // c4.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
