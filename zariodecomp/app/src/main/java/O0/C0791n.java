package o0;

/* renamed from: o0.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\n.1.smali */
public final class C0791n extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f9093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f9094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0767B f9095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f9096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L3.h f9097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0791n(kotlin.jvm.internal.o oVar, kotlin.jvm.internal.o oVar2, C0767B c0767b, boolean z4, L3.h hVar) {
        super(1);
        this.f9093a = oVar;
        this.f9094b = oVar2;
        this.f9095c = c0767b;
        this.f9096d = z4;
        this.f9097e = hVar;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        C0787j entry = (C0787j) obj;
        kotlin.jvm.internal.i.e(entry, "entry");
        this.f9093a.f8428a = true;
        this.f9094b.f8428a = true;
        this.f9095c.k(entry, this.f9096d, this.f9097e);
        return K3.k.f2288a;
    }
}
