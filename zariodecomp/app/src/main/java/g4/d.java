package g4;

import G2.k;
import O3.i;
import S0.f;
import android.os.Handler;
import android.os.Looper;
import f4.B;
import f4.C0516n;
import f4.E0;
import f4.InterfaceC0506g0;
import f4.J;
import f4.N;
import f4.P;
import f4.v0;
import f4.x0;
import java.util.concurrent.CancellationException;
import k4.n;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g4\d.smali */
public final class d extends v0 implements J {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f7607c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7608d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7609e;

    /* renamed from: f, reason: collision with root package name */
    public final d f7610f;

    public d(Handler handler, String str, boolean z4) {
        this.f7607c = handler;
        this.f7608d = str;
        this.f7609e = z4;
        this.f7610f = z4 ? this : new d(handler, str, true);
    }

    @Override // f4.J
    public final P a(long j5, final E0 e02, i iVar) {
        if (this.f7607c.postDelayed(e02, f.v(j5, 4611686018427387903L))) {
            return new P() { // from class: g4.c
                @Override // f4.P
                public final void a() {
                    this.f7605a.f7607c.removeCallbacks(e02);
                }
            };
        }
        o(iVar, e02);
        return x0.f7108a;
    }

    @Override // f4.J
    public final void e(long j5, C0516n c0516n) {
        A3.a aVar = new A3.a(14, c0516n, this, false);
        if (this.f7607c.postDelayed(aVar, f.v(j5, 4611686018427387903L))) {
            c0516n.u(new k(1, this, aVar));
        } else {
            o(c0516n.f7082e, aVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f7607c == this.f7607c && dVar.f7609e == this.f7609e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7609e ? 1231 : 1237) ^ System.identityHashCode(this.f7607c);
    }

    public final void k(i iVar, Runnable runnable) {
        if (this.f7607c.post(runnable)) {
            return;
        }
        o(iVar, runnable);
    }

    public final boolean m(i iVar) {
        return (this.f7609e && kotlin.jvm.internal.i.a(Looper.myLooper(), this.f7607c.getLooper())) ? false : true;
    }

    public final void o(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) iVar.get(B.f7000b);
        if (interfaceC0506g0 != null) {
            interfaceC0506g0.cancel(cancellationException);
        }
        m4.e eVar = N.f7027a;
        m4.d.f8928c.k(iVar, runnable);
    }

    public final String toString() {
        d dVar;
        String str;
        m4.e eVar = N.f7027a;
        v0 v0Var = n.f8401a;
        if (this == v0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = ((d) v0Var).f7610f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f7608d;
        if (string == null) {
            string = this.f7607c.toString();
        }
        return this.f7609e ? B.a.k(string, ".immediate") : string;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
