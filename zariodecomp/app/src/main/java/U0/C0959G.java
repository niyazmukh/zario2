package u0;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: u0.G, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\G.smali */
public final class C0959G implements O3.g {

    /* renamed from: c, reason: collision with root package name */
    public static final G2.e f10383c = new G2.e();

    /* renamed from: a, reason: collision with root package name */
    public final O3.f f10384a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f10385b = new AtomicInteger(0);

    public C0959G(O3.f fVar) {
        this.f10384a = fVar;
    }

    @Override // O3.i
    public final Object fold(Object obj, X3.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // O3.i
    public final O3.g get(O3.h hVar) {
        return S0.f.C(this, hVar);
    }

    @Override // O3.g
    public final O3.h getKey() {
        return f10383c;
    }

    @Override // O3.i
    public final O3.i minusKey(O3.h hVar) {
        return S0.f.R(this, hVar);
    }

    @Override // O3.i
    public final O3.i plus(O3.i iVar) {
        return S0.f.U(this, iVar);
    }
}
