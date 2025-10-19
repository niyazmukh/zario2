package i4;

import j4.AbstractC0632b;

/* renamed from: i4.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\f.1.smali */
public final class C0611f implements InterfaceC0612g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0612g f7910a;

    public C0611f(InterfaceC0612g interfaceC0612g) {
        this.f7910a = interfaceC0612g;
    }

    @Override // i4.InterfaceC0612g
    public final Object c(InterfaceC0613h interfaceC0613h, O3.d dVar) {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r();
        rVar.f8431a = AbstractC0632b.f8071b;
        Object objC = this.f7910a.c(new C0610e(this, rVar, interfaceC0613h), dVar);
        return objC == P3.a.f2678a ? objC : K3.k.f2288a;
    }
}
