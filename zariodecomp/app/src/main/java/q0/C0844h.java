package q0;

import k0.AbstractC0653c;

/* renamed from: q0.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q0.1\h.smali */
public final class C0844h extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: b, reason: collision with root package name */
    public static final C0844h f9448b = new C0844h(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0844h f9449c = new C0844h(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9450a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0844h(int i, int i5) {
        super(i);
        this.f9450a = i5;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f9450a) {
            case 0:
                AbstractC0653c initializer = (AbstractC0653c) obj;
                kotlin.jvm.internal.i.e(initializer, "$this$initializer");
                return new C0842f();
            default:
                K3.e it = (K3.e) obj;
                kotlin.jvm.internal.i.e(it, "it");
                return (String) it.f2277a;
        }
    }
}
