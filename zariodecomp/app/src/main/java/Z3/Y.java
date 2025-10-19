package z3;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\Y.smali */
public final class Y extends X {

    /* renamed from: e, reason: collision with root package name */
    public final Z f11272e;

    public Y(String str, boolean z4, Z z5) {
        super(z5, str, z4);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(AbstractC0183a.U("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        this.f11272e = z5;
    }

    @Override // z3.X
    public final Object a(byte[] bArr) {
        return this.f11272e.h(bArr);
    }

    @Override // z3.X
    public final byte[] b(Object obj) {
        byte[] bArrMo0a = this.f11272e.mo0a(obj);
        S0.f.l(bArrMo0a, "null marshaller.toAsciiString()");
        return bArrMo0a;
    }
}
