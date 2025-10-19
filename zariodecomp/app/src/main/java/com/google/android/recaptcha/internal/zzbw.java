package com.google.android.recaptcha.internal;

import O3.d;
import O3.g;
import O3.h;
import P3.a;
import S0.f;
import X3.l;
import X3.p;
import d4.e;
import f4.B;
import f4.C0521u;
import f4.C0524x;
import f4.H;
import f4.InterfaceC0506g0;
import f4.InterfaceC0519q;
import f4.InterfaceC0520t;
import f4.P;
import f4.n0;
import f4.q0;
import f4.r0;
import f4.s;
import f4.t0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import n4.b;
import n4.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbw.smali */
public final class zzbw implements H {
    private final /* synthetic */ InterfaceC0520t zza;

    public zzbw(InterfaceC0520t interfaceC0520t) {
        this.zza = interfaceC0520t;
    }

    @Override // f4.InterfaceC0506g0
    public final InterfaceC0519q attachChild(s sVar) {
        return this.zza.attachChild(sVar);
    }

    @Override // f4.H
    public final Object await(d dVar) throws Throwable {
        Object objK = ((C0521u) this.zza).k(dVar);
        a aVar = a.f2678a;
        return objK;
    }

    @Override // f4.InterfaceC0506g0
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // O3.i
    public final Object fold(Object obj, p operation) {
        t0 t0Var = (t0) this.zza;
        t0Var.getClass();
        i.e(operation, "operation");
        return operation.invoke(obj, t0Var);
    }

    @Override // O3.i
    public final g get(h hVar) {
        t0 t0Var = (t0) this.zza;
        t0Var.getClass();
        return f.C(t0Var, hVar);
    }

    @Override // f4.InterfaceC0506g0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // f4.InterfaceC0506g0
    public final e getChildren() {
        return this.zza.getChildren();
    }

    @Override // f4.H
    public final Object getCompleted() {
        return ((C0521u) this.zza).t();
    }

    @Override // f4.H
    public final Throwable getCompletionExceptionOrNull() {
        return ((t0) this.zza).getCompletionExceptionOrNull();
    }

    @Override // O3.g
    public final h getKey() {
        this.zza.getClass();
        return B.f7000b;
    }

    public final b getOnAwait() {
        C0521u c0521u = (C0521u) this.zza;
        c0521u.getClass();
        u.c(3, q0.f7095a);
        u.c(3, r0.f7096a);
        return new c(c0521u, 0);
    }

    @Override // f4.InterfaceC0506g0
    public final n4.a getOnJoin() {
        return this.zza.getOnJoin();
    }

    public final InterfaceC0506g0 getParent() {
        t0 t0Var = (t0) this.zza;
        t0Var.getClass();
        InterfaceC0519q interfaceC0519q = (InterfaceC0519q) t0.f7099b.get(t0Var);
        if (interfaceC0519q != null) {
            return interfaceC0519q.getParent();
        }
        return null;
    }

    @Override // f4.InterfaceC0506g0
    public final P invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    @Override // f4.InterfaceC0506g0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    public final boolean isCancelled() {
        t0 t0Var = (t0) this.zza;
        t0Var.getClass();
        Object obj = t0.f7098a.get(t0Var);
        return (obj instanceof C0524x) || ((obj instanceof n0) && ((n0) obj).d());
    }

    @Override // f4.InterfaceC0506g0
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // f4.InterfaceC0506g0
    public final Object join(d dVar) {
        return this.zza.join(dVar);
    }

    @Override // O3.i
    public final O3.i minusKey(h hVar) {
        return this.zza.minusKey(hVar);
    }

    @Override // O3.i
    public final O3.i plus(O3.i iVar) {
        return this.zza.plus(iVar);
    }

    @Override // f4.InterfaceC0506g0
    public final boolean start() {
        return this.zza.start();
    }

    @Override // f4.InterfaceC0506g0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // f4.InterfaceC0506g0
    public final P invokeOnCompletion(boolean z4, boolean z5, l lVar) {
        return this.zza.invokeOnCompletion(z4, z5, lVar);
    }

    @Override // f4.InterfaceC0506g0
    public final InterfaceC0506g0 plus(InterfaceC0506g0 interfaceC0506g0) {
        this.zza.plus(interfaceC0506g0);
        return interfaceC0506g0;
    }

    @Override // f4.InterfaceC0506g0
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
