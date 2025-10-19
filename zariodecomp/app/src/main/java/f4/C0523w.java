package f4;

import java.util.concurrent.CancellationException;

/* renamed from: f4.w, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\w.1.smali */
public final class C0523w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7101a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0513k f7102b;

    /* renamed from: c, reason: collision with root package name */
    public final X3.q f7103c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7104d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f7105e;

    public C0523w(Object obj, InterfaceC0513k interfaceC0513k, X3.q qVar, Object obj2, Throwable th) {
        this.f7101a = obj;
        this.f7102b = interfaceC0513k;
        this.f7103c = qVar;
        this.f7104d = obj2;
        this.f7105e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0523w a(C0523w c0523w, InterfaceC0513k interfaceC0513k, CancellationException cancellationException, int i) {
        Object obj = c0523w.f7101a;
        if ((i & 2) != 0) {
            interfaceC0513k = c0523w.f7102b;
        }
        InterfaceC0513k interfaceC0513k2 = interfaceC0513k;
        X3.q qVar = c0523w.f7103c;
        Object obj2 = c0523w.f7104d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0523w.f7105e;
        }
        c0523w.getClass();
        return new C0523w(obj, interfaceC0513k2, qVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0523w)) {
            return false;
        }
        C0523w c0523w = (C0523w) obj;
        return kotlin.jvm.internal.i.a(this.f7101a, c0523w.f7101a) && kotlin.jvm.internal.i.a(this.f7102b, c0523w.f7102b) && kotlin.jvm.internal.i.a(this.f7103c, c0523w.f7103c) && kotlin.jvm.internal.i.a(this.f7104d, c0523w.f7104d) && kotlin.jvm.internal.i.a(this.f7105e, c0523w.f7105e);
    }

    public final int hashCode() {
        Object obj = this.f7101a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0513k interfaceC0513k = this.f7102b;
        int iHashCode2 = (iHashCode + (interfaceC0513k == null ? 0 : interfaceC0513k.hashCode())) * 31;
        X3.q qVar = this.f7103c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f7104d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f7105e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f7101a + ", cancelHandler=" + this.f7102b + ", onCancellation=" + this.f7103c + ", idempotentResume=" + this.f7104d + ", cancelCause=" + this.f7105e + ')';
    }

    public /* synthetic */ C0523w(Object obj, InterfaceC0513k interfaceC0513k, X3.q qVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC0513k, (i & 4) != 0 ? null : qVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
