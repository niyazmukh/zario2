package B3;

import java.io.Closeable;

/* renamed from: B3.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\o.1.smali */
public final class C0066o implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C3.f f924a;

    /* renamed from: b, reason: collision with root package name */
    public final P0 f925b;

    public C0066o(C3.f fVar, P0 p02) {
        this.f924a = fVar;
        this.f925b = p02;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f924a.close();
    }
}
