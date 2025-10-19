package f4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\q0.smali */
public final /* synthetic */ class q0 extends kotlin.jvm.internal.h implements X3.q {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f7095a = new q0(3, t0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object c(Object obj, Object obj2, Object obj3) {
        Object obj4;
        t0 t0Var = (t0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t0.f7098a;
        t0Var.getClass();
        do {
            obj4 = t0.f7098a.get(t0Var);
            if (!(obj4 instanceof InterfaceC0501d0)) {
                if (obj4 instanceof C0524x) {
                    throw null;
                }
                E.z(obj4);
                throw null;
            }
        } while (t0Var.M(obj4) < 0);
        E.p(t0Var, true, new Q(t0Var));
        throw null;
    }
}
