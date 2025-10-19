package f4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\s0.smali */
public final /* synthetic */ class s0 extends kotlin.jvm.internal.h implements X3.q {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f7097a = new s0(3, t0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z4;
        t0 t0Var = (t0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t0.f7098a;
        t0Var.getClass();
        while (true) {
            Object obj4 = t0.f7098a.get(t0Var);
            if (!(obj4 instanceof InterfaceC0501d0)) {
                z4 = false;
                break;
            }
            if (t0Var.M(obj4) >= 0) {
                z4 = true;
                break;
            }
        }
        if (!z4) {
            throw null;
        }
        E.p(t0Var, true, new o0());
        throw null;
    }
}
