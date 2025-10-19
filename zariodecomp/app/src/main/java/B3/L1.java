package B3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\L1.smali */
public final class L1 implements O1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f456b;

    public /* synthetic */ L1(int i, int i5) {
        this.f455a = i5;
        this.f456b = i;
    }

    @Override // B3.O1
    public final void a(V1 v12) {
        switch (this.f455a) {
            case 0:
                v12.f577a.k(this.f456b);
                break;
            case 1:
                v12.f577a.b(this.f456b);
                break;
            default:
                v12.f577a.i(this.f456b);
                break;
        }
    }
}
