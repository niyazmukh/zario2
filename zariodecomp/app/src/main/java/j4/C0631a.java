package j4;

import i4.InterfaceC0613h;
import java.util.concurrent.CancellationException;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\a.1.smali */
public final class C0631a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0613h f8069a;

    public C0631a(InterfaceC0613h interfaceC0613h) {
        super("Flow was aborted, no more elements needed");
        this.f8069a = interfaceC0613h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
