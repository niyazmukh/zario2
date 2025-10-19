package z3;

import a.AbstractC0183a;
import g2.AbstractC0579b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\V.smali */
public final class V extends X {

    /* renamed from: e, reason: collision with root package name */
    public final W f11267e;

    public V(String str, W w4) {
        super(w4, str, false);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(AbstractC0183a.U("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        S0.f.l(w4, "marshaller");
        this.f11267e = w4;
    }

    @Override // z3.X
    public final Object a(byte[] bArr) {
        return this.f11267e.g(new String(bArr, AbstractC0579b.f7598a));
    }

    @Override // z3.X
    public final byte[] b(Object obj) {
        String strA = this.f11267e.a(obj);
        S0.f.l(strA, "null marshaller.toAsciiString()");
        return strA.getBytes(AbstractC0579b.f7598a);
    }
}
