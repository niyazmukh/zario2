package B3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\M1.smali */
public final class M1 implements O1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.E f461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N0 f462b;

    public M1(N0 n02, com.google.protobuf.E e5) {
        this.f462b = n02;
        this.f461a = e5;
    }

    @Override // B3.O1
    public final void a(V1 v12) {
        v12.f577a.j(this.f462b.f472a.d(this.f461a));
        v12.f577a.flush();
    }
}
