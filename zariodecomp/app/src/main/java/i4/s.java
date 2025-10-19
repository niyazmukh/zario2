package i4;

import j4.C0631a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\s.smali */
public final class s implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f7951b;

    public /* synthetic */ s(kotlin.jvm.internal.r rVar, int i) {
        this.f7950a = i;
        this.f7951b = rVar;
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) {
        switch (this.f7950a) {
            case 0:
                this.f7951b.f8431a = obj;
                throw new C0631a(this);
            default:
                this.f7951b.f8431a = obj;
                throw new C0631a(this);
        }
    }
}
