package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\N.smali */
public final class N implements V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0218v f4443a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f4444b;

    /* renamed from: c, reason: collision with root package name */
    public final C0212o f4445c;

    public N(d0 d0Var, C0212o c0212o, AbstractC0218v abstractC0218v) {
        this.f4444b = d0Var;
        c0212o.getClass();
        this.f4445c = c0212o;
        this.f4443a = abstractC0218v;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean a(Object obj) {
        this.f4445c.getClass();
        B.a.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, Object obj2) {
        W.A(this.f4444b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0218v c() {
        AbstractC0218v abstractC0218v = this.f4443a;
        return abstractC0218v != null ? abstractC0218v.k() : ((AbstractC0216t) abstractC0218v.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        this.f4444b.getClass();
        d0.b(obj);
        this.f4445c.getClass();
        B.a.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void e(Object obj, C0208k c0208k, C0211n c0211n) {
        this.f4444b.getClass();
        d0.a(obj);
        this.f4445c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void f(Object obj, E e5) {
        this.f4445c.getClass();
        B.a.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int g(AbstractC0218v abstractC0218v) {
        this.f4444b.getClass();
        return abstractC0218v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0218v abstractC0218v) {
        this.f4444b.getClass();
        c0 c0Var = abstractC0218v.unknownFields;
        int i = c0Var.f4484d;
        if (i != -1) {
            return i;
        }
        int iD0 = 0;
        for (int i5 = 0; i5 < c0Var.f4481a; i5++) {
            int i6 = c0Var.f4482b[i5] >>> 3;
            iD0 += C0209l.D0(3, (C0204g) c0Var.f4483c[i5]) + C0209l.T0(2, i6) + (C0209l.S0(1) * 2);
        }
        c0Var.f4484d = iD0;
        return iD0;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean i(AbstractC0218v abstractC0218v, Object obj) {
        this.f4444b.getClass();
        return abstractC0218v.unknownFields.equals(((AbstractC0218v) obj).unknownFields);
    }
}
