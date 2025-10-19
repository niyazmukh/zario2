package g0;

import A2.RunnableC0005e;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.InterfaceC0232j;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import k0.C0655e;
import l.C0708q;
import x0.InterfaceC1033d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\S.smali */
public final class S implements InterfaceC0232j, InterfaceC1033d, n0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0567t f7395a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f7396b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC0005e f7397c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f7398d;

    /* renamed from: e, reason: collision with root package name */
    public C0242x f7399e = null;

    /* renamed from: f, reason: collision with root package name */
    public A2.G f7400f = null;

    public S(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, m0 m0Var, RunnableC0005e runnableC0005e) {
        this.f7395a = abstractComponentCallbacksC0567t;
        this.f7396b = m0Var;
        this.f7397c = runnableC0005e;
    }

    @Override // androidx.lifecycle.InterfaceC0232j
    public final C0655e a() {
        Application application;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7395a;
        Context applicationContext = abstractComponentCallbacksC0567t.S().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0655e c0655e = new C0655e(0);
        if (application != null) {
            c0655e.b(g0.f4648a, application);
        }
        c0655e.b(a0.f4626a, abstractComponentCallbacksC0567t);
        c0655e.b(a0.f4627b, this);
        Bundle bundle = abstractComponentCallbacksC0567t.f7532f;
        if (bundle != null) {
            c0655e.b(a0.f4628c, bundle);
        }
        return c0655e;
    }

    @Override // x0.InterfaceC1033d
    public final C0708q b() {
        d();
        return (C0708q) this.f7400f.f88c;
    }

    public final void c(androidx.lifecycle.n nVar) {
        this.f7399e.d(nVar);
    }

    public final void d() {
        if (this.f7399e == null) {
            this.f7399e = new C0242x(this);
            A2.G g3 = new A2.G((InterfaceC1033d) this);
            this.f7400f = g3;
            g3.f();
            this.f7397c.run();
        }
    }

    @Override // androidx.lifecycle.n0
    public final m0 e() {
        d();
        return this.f7396b;
    }

    @Override // androidx.lifecycle.InterfaceC0241v
    public final C0242x g() {
        d();
        return this.f7399e;
    }

    @Override // androidx.lifecycle.InterfaceC0232j
    public final i0 h() {
        Application application;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7395a;
        i0 i0VarH = abstractComponentCallbacksC0567t.h();
        if (!i0VarH.equals(abstractComponentCallbacksC0567t.f7523U)) {
            this.f7398d = i0VarH;
            return i0VarH;
        }
        if (this.f7398d == null) {
            Context applicationContext = abstractComponentCallbacksC0567t.S().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f7398d = new d0(application, abstractComponentCallbacksC0567t, abstractComponentCallbacksC0567t.f7532f);
        }
        return this.f7398d;
    }
}
