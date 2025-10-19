package f4;

import a.AbstractC0183a;
import java.util.concurrent.CancellationException;
import k4.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\L.smali */
public abstract class L extends m4.i {

    /* renamed from: c, reason: collision with root package name */
    public int f7025c;

    public L(int i) {
        super(0L, false);
        this.f7025c = i;
    }

    public void c(CancellationException cancellationException) {
    }

    public abstract O3.d d();

    public Throwable e(Object obj) {
        C0524x c0524x = obj instanceof C0524x ? (C0524x) obj : null;
        if (c0524x != null) {
            return c0524x.f7107a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void i(Throwable th) {
        E.o(d().getContext(), new W3.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            O3.d dVarD = d();
            kotlin.jvm.internal.i.c(dVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            f fVar = (f) dVarD;
            Q3.c cVar = fVar.f8379e;
            Object obj = fVar.f8381k;
            O3.i context = cVar.getContext();
            Object objN = k4.a.n(context, obj);
            InterfaceC0506g0 interfaceC0506g0 = null;
            G0 g0A = objN != k4.a.f8368d ? E.A(cVar, context, objN) : null;
            try {
                O3.i context2 = cVar.getContext();
                Object objJ = j();
                Throwable thE = e(objJ);
                if (thE == null && E.q(this.f7025c)) {
                    interfaceC0506g0 = (InterfaceC0506g0) context2.get(B.f7000b);
                }
                if (interfaceC0506g0 != null && !interfaceC0506g0.isActive()) {
                    CancellationException cancellationException = interfaceC0506g0.getCancellationException();
                    c(cancellationException);
                    cVar.resumeWith(AbstractC0183a.v(cancellationException));
                } else if (thE != null) {
                    cVar.resumeWith(AbstractC0183a.v(thE));
                } else {
                    cVar.resumeWith(g(objJ));
                }
                if (g0A == null || g0A.U()) {
                    k4.a.i(context, objN);
                }
            } catch (Throwable th) {
                if (g0A == null || g0A.U()) {
                    k4.a.i(context, objN);
                }
                throw th;
            }
        } catch (Throwable th2) {
            i(th2);
        }
    }
}
