package f4;

import java.util.concurrent.CancellationException;

/* renamed from: f4.h0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\h0.1.smali */
public final class C0508h0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0506g0 f7065a;

    public C0508h0(String str, Throwable th, InterfaceC0506g0 interfaceC0506g0) {
        super(str);
        this.f7065a = interfaceC0506g0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0508h0) {
                C0508h0 c0508h0 = (C0508h0) obj;
                if (!kotlin.jvm.internal.i.a(c0508h0.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(c0508h0.f7065a, this.f7065a) || !kotlin.jvm.internal.i.a(c0508h0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int iHashCode = (this.f7065a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f7065a;
    }
}
