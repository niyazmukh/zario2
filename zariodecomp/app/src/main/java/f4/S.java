package f4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\S.smali */
public final class S implements InterfaceC0501d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7031a;

    public S(boolean z4) {
        this.f7031a = z4;
    }

    @Override // f4.InterfaceC0501d0
    public final w0 c() {
        return null;
    }

    @Override // f4.InterfaceC0501d0
    public final boolean isActive() {
        return this.f7031a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f7031a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
