package j4;

import f4.C0525y;
import f4.InterfaceC0506g0;
import f4.InterfaceC0519q;
import f4.t0;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\y.smali */
public final class y extends Q3.c implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0613h f8129a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.i f8130b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8131c;

    /* renamed from: d, reason: collision with root package name */
    public O3.i f8132d;

    /* renamed from: e, reason: collision with root package name */
    public O3.d f8133e;

    public y(InterfaceC0613h interfaceC0613h, O3.i iVar) {
        super(w.f8127a, O3.j.f2661a);
        this.f8129a = interfaceC0613h;
        this.f8130b = iVar;
        this.f8131c = ((Number) iVar.fold(0, new C0525y(3))).intValue();
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) {
        try {
            Object objD = d(dVar, obj);
            return objD == P3.a.f2678a ? objD : K3.k.f2288a;
        } catch (Throwable th) {
            this.f8132d = new t(dVar.getContext(), th);
            throw th;
        }
    }

    public final Object d(O3.d dVar, Object obj) {
        O3.i context = dVar.getContext();
        f4.E.i(context);
        O3.i iVar = this.f8132d;
        if (iVar != context) {
            if (iVar instanceof t) {
                throw new IllegalStateException(e4.e.k0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((t) iVar).f8126b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new X3.p() { // from class: j4.B
                @Override // X3.p
                public final Object invoke(Object obj2, Object obj3) {
                    int i;
                    int iIntValue = ((Integer) obj2).intValue();
                    O3.g gVar = (O3.g) obj3;
                    O3.h key = gVar.getKey();
                    O3.g gVar2 = this.f8062a.f8130b.get(key);
                    if (key != f4.B.f7000b) {
                        i = gVar != gVar2 ? Integer.MIN_VALUE : iIntValue + 1;
                    } else {
                        InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) gVar2;
                        InterfaceC0506g0 parent = (InterfaceC0506g0) gVar;
                        while (true) {
                            if (parent != null) {
                                if (parent == interfaceC0506g0 || !(parent instanceof k4.r)) {
                                    break;
                                }
                                InterfaceC0519q interfaceC0519q = (InterfaceC0519q) t0.f7099b.get((k4.r) parent);
                                parent = interfaceC0519q != null ? interfaceC0519q.getParent() : null;
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != interfaceC0506g0) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC0506g0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (interfaceC0506g0 != null) {
                            iIntValue++;
                        }
                        i = iIntValue;
                    }
                    return Integer.valueOf(i);
                }
            })).intValue() != this.f8131c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f8130b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f8132d = context;
        }
        this.f8133e = dVar;
        z zVar = A.f8061a;
        InterfaceC0613h interfaceC0613h = this.f8129a;
        kotlin.jvm.internal.i.c(interfaceC0613h, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        zVar.getClass();
        Object objB = interfaceC0613h.b(obj, this);
        if (!kotlin.jvm.internal.i.a(objB, P3.a.f2678a)) {
            this.f8133e = null;
        }
        return objB;
    }

    @Override // Q3.a, Q3.d
    public final Q3.d getCallerFrame() {
        O3.d dVar = this.f8133e;
        if (dVar instanceof Q3.d) {
            return (Q3.d) dVar;
        }
        return null;
    }

    @Override // Q3.c, O3.d
    public final O3.i getContext() {
        O3.i iVar = this.f8132d;
        return iVar == null ? O3.j.f2661a : iVar;
    }

    @Override // Q3.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = K3.g.a(obj);
        if (thA != null) {
            this.f8132d = new t(getContext(), thA);
        }
        O3.d dVar = this.f8133e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return P3.a.f2678a;
    }
}
