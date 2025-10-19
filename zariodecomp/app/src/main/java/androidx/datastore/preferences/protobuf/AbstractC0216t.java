package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\t.1.smali */
public abstract class AbstractC0216t implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0218v f4561a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0218v f4562b;

    public AbstractC0216t(AbstractC0218v abstractC0218v) {
        this.f4561a = abstractC0218v;
        if (abstractC0218v.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4562b = abstractC0218v.k();
    }

    public final AbstractC0218v a() {
        AbstractC0218v abstractC0218vB = b();
        abstractC0218vB.getClass();
        if (AbstractC0218v.h(abstractC0218vB, true)) {
            return abstractC0218vB;
        }
        throw new b0();
    }

    public final AbstractC0218v b() {
        if (!this.f4562b.i()) {
            return this.f4562b;
        }
        AbstractC0218v abstractC0218v = this.f4562b;
        abstractC0218v.getClass();
        S s4 = S.f4448c;
        s4.getClass();
        s4.a(abstractC0218v.getClass()).d(abstractC0218v);
        abstractC0218v.j();
        return this.f4562b;
    }

    public final void c() {
        if (this.f4562b.i()) {
            return;
        }
        AbstractC0218v abstractC0218vK = this.f4561a.k();
        AbstractC0218v abstractC0218v = this.f4562b;
        S s4 = S.f4448c;
        s4.getClass();
        s4.a(abstractC0218vK.getClass()).b(abstractC0218vK, abstractC0218v);
        this.f4562b = abstractC0218vK;
    }

    public final Object clone() {
        AbstractC0216t abstractC0216t = (AbstractC0216t) this.f4561a.e(5);
        abstractC0216t.f4562b = b();
        return abstractC0216t;
    }
}
