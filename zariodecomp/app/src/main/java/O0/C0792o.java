package o0;

/* renamed from: o0.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\o.1.smali */
public final class C0792o extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0767B f9099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0792o(C0767B c0767b, int i) {
        super(1);
        this.f9098a = i;
        this.f9099b = c0767b;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f9098a) {
            case 0:
                x destination = (x) obj;
                kotlin.jvm.internal.i.e(destination, "destination");
                return Boolean.valueOf(!this.f9099b.f8988l.containsKey(Integer.valueOf(destination.f9147l)));
            default:
                x destination2 = (x) obj;
                kotlin.jvm.internal.i.e(destination2, "destination");
                return Boolean.valueOf(!this.f9099b.f8988l.containsKey(Integer.valueOf(destination2.f9147l)));
        }
    }
}
