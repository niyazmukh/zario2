package s2;

import java.util.Comparator;

/* renamed from: s2.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\j.smali */
public abstract class AbstractC0874j implements InterfaceC0873h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9684a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9685b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0873h f9686c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0873h f9687d;

    public AbstractC0874j(Object obj, Object obj2, InterfaceC0873h interfaceC0873h, InterfaceC0873h interfaceC0873h2) {
        this.f9684a = obj;
        this.f9685b = obj2;
        C0872g c0872g = C0872g.f9683a;
        this.f9686c = interfaceC0873h == null ? c0872g : interfaceC0873h;
        this.f9687d = interfaceC0873h2 == null ? c0872g : interfaceC0873h2;
    }

    @Override // s2.InterfaceC0873h
    public final InterfaceC0873h a() {
        return this.f9687d;
    }

    @Override // s2.InterfaceC0873h
    public final InterfaceC0873h b() {
        return this.f9686c;
    }

    @Override // s2.InterfaceC0873h
    public final InterfaceC0873h c(Object obj, Object obj2, Comparator comparator) {
        int iCompare = comparator.compare(obj, this.f9684a);
        return (iCompare < 0 ? k(null, null, this.f9686c.c(obj, obj2, comparator), null) : iCompare == 0 ? k(obj, obj2, null, null) : k(null, null, null, this.f9687d.c(obj, obj2, comparator))).l();
    }

    @Override // s2.InterfaceC0873h
    public final InterfaceC0873h d(Object obj, Comparator comparator) {
        AbstractC0874j abstractC0874jK;
        if (comparator.compare(obj, this.f9684a) < 0) {
            if (!this.f9686c.isEmpty() && !this.f9686c.f() && !((AbstractC0874j) this.f9686c).f9686c.f()) {
                this = n();
            }
            abstractC0874jK = this.k(null, null, this.f9686c.d(obj, comparator), null);
        } else {
            if (this.f9686c.f()) {
                this = p();
            }
            InterfaceC0873h interfaceC0873h = this.f9687d;
            if (!interfaceC0873h.isEmpty() && !interfaceC0873h.f() && !((AbstractC0874j) interfaceC0873h).f9686c.f()) {
                this = this.i();
                if (this.f9686c.b().f()) {
                    this = this.p().i();
                }
            }
            if (comparator.compare(obj, this.f9684a) == 0) {
                InterfaceC0873h interfaceC0873h2 = this.f9687d;
                if (interfaceC0873h2.isEmpty()) {
                    return C0872g.f9683a;
                }
                InterfaceC0873h interfaceC0873hE = interfaceC0873h2.e();
                this = this.k(interfaceC0873hE.getKey(), interfaceC0873hE.getValue(), null, ((AbstractC0874j) interfaceC0873h2).o());
            }
            abstractC0874jK = this.k(null, null, null, this.f9687d.d(obj, comparator));
        }
        return abstractC0874jK.l();
    }

    @Override // s2.InterfaceC0873h
    public final InterfaceC0873h e() {
        return this.f9686c.isEmpty() ? this : this.f9686c.e();
    }

    @Override // s2.InterfaceC0873h
    public final Object getKey() {
        return this.f9684a;
    }

    @Override // s2.InterfaceC0873h
    public final Object getValue() {
        return this.f9685b;
    }

    @Override // s2.InterfaceC0873h
    public final InterfaceC0873h h() {
        InterfaceC0873h interfaceC0873h = this.f9687d;
        return interfaceC0873h.isEmpty() ? this : interfaceC0873h.h();
    }

    public final AbstractC0874j i() {
        InterfaceC0873h interfaceC0873h = this.f9686c;
        InterfaceC0873h interfaceC0873hG = interfaceC0873h.g(interfaceC0873h.f() ? 2 : 1, null, null);
        InterfaceC0873h interfaceC0873h2 = this.f9687d;
        return g(f() ? 2 : 1, interfaceC0873hG, interfaceC0873h2.g(interfaceC0873h2.f() ? 2 : 1, null, null));
    }

    @Override // s2.InterfaceC0873h
    public final boolean isEmpty() {
        return false;
    }

    @Override // s2.InterfaceC0873h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0874j g(int i, InterfaceC0873h interfaceC0873h, InterfaceC0873h interfaceC0873h2) {
        if (interfaceC0873h == null) {
            interfaceC0873h = this.f9686c;
        }
        if (interfaceC0873h2 == null) {
            interfaceC0873h2 = this.f9687d;
        }
        Object obj = this.f9684a;
        Object obj2 = this.f9685b;
        return i == 1 ? new i(obj, obj2, interfaceC0873h, interfaceC0873h2) : new C0871f(obj, obj2, interfaceC0873h, interfaceC0873h2);
    }

    public abstract AbstractC0874j k(Object obj, Object obj2, InterfaceC0873h interfaceC0873h, InterfaceC0873h interfaceC0873h2);

    public final AbstractC0874j l() {
        InterfaceC0873h interfaceC0873h = this.f9687d;
        if (interfaceC0873h.f() && !this.f9686c.f()) {
            this = (AbstractC0874j) interfaceC0873h.g(m(), g(1, null, ((AbstractC0874j) interfaceC0873h).f9686c), null);
        }
        if (this.f9686c.f() && ((AbstractC0874j) this.f9686c).f9686c.f()) {
            this = this.p();
        }
        return (this.f9686c.f() && this.f9687d.f()) ? this.i() : this;
    }

    public abstract int m();

    public final AbstractC0874j n() {
        AbstractC0874j abstractC0874jI = i();
        InterfaceC0873h interfaceC0873h = abstractC0874jI.f9687d;
        if (!interfaceC0873h.b().f()) {
            return abstractC0874jI;
        }
        AbstractC0874j abstractC0874jK = abstractC0874jI.k(null, null, null, ((AbstractC0874j) interfaceC0873h).p());
        InterfaceC0873h interfaceC0873h2 = abstractC0874jK.f9687d;
        return ((AbstractC0874j) interfaceC0873h2.g(abstractC0874jK.m(), abstractC0874jK.g(1, null, ((AbstractC0874j) interfaceC0873h2).f9686c), null)).i();
    }

    public final InterfaceC0873h o() {
        if (this.f9686c.isEmpty()) {
            return C0872g.f9683a;
        }
        if (!this.f9686c.f() && !this.f9686c.b().f()) {
            this = n();
        }
        return this.k(null, null, ((AbstractC0874j) this.f9686c).o(), null).l();
    }

    public final AbstractC0874j p() {
        return (AbstractC0874j) this.f9686c.g(m(), null, g(1, ((AbstractC0874j) this.f9686c).f9687d, null));
    }

    public void q(AbstractC0874j abstractC0874j) {
        this.f9686c = abstractC0874j;
    }
}
