package s2;

/* renamed from: s2.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\f.smali */
public final class C0871f extends AbstractC0874j {

    /* renamed from: e, reason: collision with root package name */
    public int f9682e;

    public C0871f(Object obj, Object obj2, InterfaceC0873h interfaceC0873h, InterfaceC0873h interfaceC0873h2) {
        super(obj, obj2, interfaceC0873h, interfaceC0873h2);
        this.f9682e = -1;
    }

    @Override // s2.InterfaceC0873h
    public final boolean f() {
        return false;
    }

    @Override // s2.AbstractC0874j
    public final AbstractC0874j k(Object obj, Object obj2, InterfaceC0873h interfaceC0873h, InterfaceC0873h interfaceC0873h2) {
        if (obj == null) {
            obj = this.f9684a;
        }
        if (obj2 == null) {
            obj2 = this.f9685b;
        }
        if (interfaceC0873h == null) {
            interfaceC0873h = this.f9686c;
        }
        if (interfaceC0873h2 == null) {
            interfaceC0873h2 = this.f9687d;
        }
        return new C0871f(obj, obj2, interfaceC0873h, interfaceC0873h2);
    }

    @Override // s2.AbstractC0874j
    public final int m() {
        return 2;
    }

    @Override // s2.AbstractC0874j
    public final void q(AbstractC0874j abstractC0874j) {
        if (this.f9682e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f9686c = abstractC0874j;
    }

    @Override // s2.InterfaceC0873h
    public final int size() {
        if (this.f9682e == -1) {
            this.f9682e = this.f9687d.size() + this.f9686c.size() + 1;
        }
        return this.f9682e;
    }
}
