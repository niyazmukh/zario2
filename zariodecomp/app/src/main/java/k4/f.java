package k4;

import f4.A;
import f4.C0;
import f4.C0524x;
import f4.E;
import f4.L;
import f4.Y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\f.smali */
public final class f extends L implements Q3.d, O3.d {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8377l = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final A f8378d;

    /* renamed from: e, reason: collision with root package name */
    public final Q3.c f8379e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8380f;

    /* renamed from: k, reason: collision with root package name */
    public final Object f8381k;

    public f(A a5, Q3.c cVar) {
        super(-1);
        this.f8378d = a5;
        this.f8379e = cVar;
        this.f8380f = a.f8366b;
        this.f8381k = a.m(cVar.getContext());
    }

    @Override // f4.L
    public final O3.d d() {
        return this;
    }

    @Override // Q3.d
    public final Q3.d getCallerFrame() {
        return this.f8379e;
    }

    @Override // O3.d
    public final O3.i getContext() {
        return this.f8379e.getContext();
    }

    @Override // f4.L
    public final Object j() {
        Object obj = this.f8380f;
        this.f8380f = a.f8366b;
        return obj;
    }

    @Override // O3.d
    public final void resumeWith(Object obj) {
        Throwable thA = K3.g.a(obj);
        Object c0524x = thA == null ? obj : new C0524x(thA, false);
        Q3.c cVar = this.f8379e;
        O3.i context = cVar.getContext();
        A a5 = this.f8378d;
        if (a5.m(context)) {
            this.f8380f = c0524x;
            this.f7025c = 0;
            a5.k(cVar.getContext(), this);
            return;
        }
        Y yA = C0.a();
        if (yA.s()) {
            this.f8380f = c0524x;
            this.f7025c = 0;
            yA.p(this);
            return;
        }
        yA.r(true);
        try {
            O3.i context2 = cVar.getContext();
            Object objN = a.n(context2, this.f8381k);
            try {
                cVar.resumeWith(obj);
                while (yA.u()) {
                }
            } finally {
                a.i(context2, objN);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f8378d + ", " + E.y(this.f8379e) + ']';
    }
}
