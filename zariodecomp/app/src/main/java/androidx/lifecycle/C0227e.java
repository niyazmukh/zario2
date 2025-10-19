package androidx.lifecycle;

import f4.InterfaceC0506g0;
import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\e.1.smali */
public final class C0227e implements Closeable, f4.C {

    /* renamed from: a, reason: collision with root package name */
    public final O3.i f4641a;

    public C0227e(O3.i iVar) {
        this.f4641a = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) this.f4641a.get(f4.B.f7000b);
        if (interfaceC0506g0 != null) {
            interfaceC0506g0.cancel((CancellationException) null);
        }
    }

    @Override // f4.C
    public final O3.i e() {
        return this.f4641a;
    }
}
