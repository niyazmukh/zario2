package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.AbstractC0417p;
import com.google.protobuf.AbstractC0424t;
import com.google.protobuf.C0414n0;
import com.google.protobuf.InterfaceC0425t0;
import com.google.protobuf.U0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import t0.AbstractC0910Q;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\k.1.smali */
public final class C0208k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4518a;

    /* renamed from: b, reason: collision with root package name */
    public int f4519b;

    /* renamed from: c, reason: collision with root package name */
    public int f4520c;

    /* renamed from: d, reason: collision with root package name */
    public int f4521d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4522e;

    public static void U(int i) throws com.google.protobuf.N {
        if ((i & 3) != 0) {
            throw com.google.protobuf.N.g();
        }
    }

    public static void V(int i) throws com.google.protobuf.N {
        if ((i & 7) != 0) {
            throw com.google.protobuf.N.g();
        }
    }

    public void A(List list) throws C0222z, com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.H;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0417p.w()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iK = abstractC0417p.k() + abstractC0417p.F();
            do {
                list.add(Integer.valueOf(abstractC0417p.w()));
            } while (abstractC0417p.k() < iK);
            R(iK);
            return;
        }
        com.google.protobuf.H h = (com.google.protobuf.H) list;
        int i5 = this.f4519b & 7;
        if (i5 == 0) {
            do {
                h.h(abstractC0417p.w());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iK2 = abstractC0417p.k() + abstractC0417p.F();
        do {
            h.h(abstractC0417p.w());
        } while (abstractC0417p.k() < iK2);
        R(iK2);
    }

    public void B(InterfaceC0219w interfaceC0219w) throws C0222z, com.google.protobuf.N {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 0) {
            do {
                ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.n()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iB = abstractC0207j.b() + abstractC0207j.v();
        do {
            ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.n()));
        } while (abstractC0207j.b() < iB);
        R(iB);
    }

    public void C(List list) throws C0222z, com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.W;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0417p.x()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iK = abstractC0417p.k() + abstractC0417p.F();
            do {
                list.add(Long.valueOf(abstractC0417p.x()));
            } while (abstractC0417p.k() < iK);
            R(iK);
            return;
        }
        com.google.protobuf.W w4 = (com.google.protobuf.W) list;
        int i5 = this.f4519b & 7;
        if (i5 == 0) {
            do {
                w4.h(abstractC0417p.x());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iK2 = abstractC0417p.k() + abstractC0417p.F();
        do {
            w4.h(abstractC0417p.x());
        } while (abstractC0417p.k() < iK2);
        R(iK2);
    }

    public void D(InterfaceC0219w interfaceC0219w) throws C0222z {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 2) {
            int iV = abstractC0207j.v();
            if ((iV & 3) != 0) {
                throw new C0222z("Failed to parse the message.");
            }
            int iB = abstractC0207j.b() + iV;
            do {
                ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.o()));
            } while (abstractC0207j.b() < iB);
            return;
        }
        if (i != 5) {
            throw C0222z.b();
        }
        do {
            ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.o()));
            if (abstractC0207j.c()) {
                return;
            } else {
                iU = abstractC0207j.u();
            }
        } while (iU == this.f4519b);
        this.f4521d = iU;
    }

    public void E(List list) throws com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.H;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 2) {
                int iF = abstractC0417p.F();
                U(iF);
                int iK = abstractC0417p.k() + iF;
                do {
                    list.add(Integer.valueOf(abstractC0417p.y()));
                } while (abstractC0417p.k() < iK);
                return;
            }
            if (i != 5) {
                throw com.google.protobuf.N.d();
            }
            do {
                list.add(Integer.valueOf(abstractC0417p.y()));
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE = abstractC0417p.E();
                }
            } while (iE == this.f4519b);
            this.f4521d = iE;
            return;
        }
        com.google.protobuf.H h = (com.google.protobuf.H) list;
        int i5 = this.f4519b & 7;
        if (i5 == 2) {
            int iF2 = abstractC0417p.F();
            U(iF2);
            int iK2 = abstractC0417p.k() + iF2;
            do {
                h.h(abstractC0417p.y());
            } while (abstractC0417p.k() < iK2);
            return;
        }
        if (i5 != 5) {
            throw com.google.protobuf.N.d();
        }
        do {
            h.h(abstractC0417p.y());
            if (abstractC0417p.l()) {
                return;
            } else {
                iE2 = abstractC0417p.E();
            }
        } while (iE2 == this.f4519b);
        this.f4521d = iE2;
    }

    public void F(InterfaceC0219w interfaceC0219w) throws C0222z {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 1) {
            do {
                ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.p()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iV = abstractC0207j.v();
        if ((iV & 7) != 0) {
            throw new C0222z("Failed to parse the message.");
        }
        int iB = abstractC0207j.b() + iV;
        do {
            ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.p()));
        } while (abstractC0207j.b() < iB);
    }

    public void G(List list) throws com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.W;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC0417p.z()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iF = abstractC0417p.F();
            V(iF);
            int iK = abstractC0417p.k() + iF;
            do {
                list.add(Long.valueOf(abstractC0417p.z()));
            } while (abstractC0417p.k() < iK);
            return;
        }
        com.google.protobuf.W w4 = (com.google.protobuf.W) list;
        int i5 = this.f4519b & 7;
        if (i5 == 1) {
            do {
                w4.h(abstractC0417p.z());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iF2 = abstractC0417p.F();
        V(iF2);
        int iK2 = abstractC0417p.k() + iF2;
        do {
            w4.h(abstractC0417p.z());
        } while (abstractC0417p.k() < iK2);
    }

    public void H(InterfaceC0219w interfaceC0219w) throws C0222z, com.google.protobuf.N {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 0) {
            do {
                ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.q()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iB = abstractC0207j.b() + abstractC0207j.v();
        do {
            ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.q()));
        } while (abstractC0207j.b() < iB);
        R(iB);
    }

    public void I(List list) throws C0222z, com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.H;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0417p.A()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iK = abstractC0417p.k() + abstractC0417p.F();
            do {
                list.add(Integer.valueOf(abstractC0417p.A()));
            } while (abstractC0417p.k() < iK);
            R(iK);
            return;
        }
        com.google.protobuf.H h = (com.google.protobuf.H) list;
        int i5 = this.f4519b & 7;
        if (i5 == 0) {
            do {
                h.h(abstractC0417p.A());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iK2 = abstractC0417p.k() + abstractC0417p.F();
        do {
            h.h(abstractC0417p.A());
        } while (abstractC0417p.k() < iK2);
        R(iK2);
    }

    public void J(InterfaceC0219w interfaceC0219w) throws C0222z, com.google.protobuf.N {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 0) {
            do {
                ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.r()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iB = abstractC0207j.b() + abstractC0207j.v();
        do {
            ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.r()));
        } while (abstractC0207j.b() < iB);
        R(iB);
    }

    public void K(List list) throws C0222z, com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.W;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0417p.B()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iK = abstractC0417p.k() + abstractC0417p.F();
            do {
                list.add(Long.valueOf(abstractC0417p.B()));
            } while (abstractC0417p.k() < iK);
            R(iK);
            return;
        }
        com.google.protobuf.W w4 = (com.google.protobuf.W) list;
        int i5 = this.f4519b & 7;
        if (i5 == 0) {
            do {
                w4.h(abstractC0417p.B());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iK2 = abstractC0417p.k() + abstractC0417p.F();
        do {
            w4.h(abstractC0417p.B());
        } while (abstractC0417p.k() < iK2);
        R(iK2);
    }

    public void L(InterfaceC0219w interfaceC0219w, boolean z4) throws C0221y, com.google.protobuf.M {
        String strS;
        int iU;
        if ((this.f4519b & 7) != 2) {
            throw C0222z.b();
        }
        do {
            AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
            if (z4) {
                S(2);
                strS = abstractC0207j.t();
            } else {
                S(2);
                strS = abstractC0207j.s();
            }
            ((T) interfaceC0219w).add(strS);
            if (abstractC0207j.c()) {
                return;
            } else {
                iU = abstractC0207j.u();
            }
        } while (iU == this.f4519b);
        this.f4521d = iU;
    }

    public void M(List list, boolean z4) throws C0221y, com.google.protobuf.M {
        String strC;
        int iE;
        int iE2;
        if ((this.f4519b & 7) != 2) {
            throw com.google.protobuf.N.d();
        }
        boolean z5 = list instanceof com.google.protobuf.S;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (z5 && !z4) {
            com.google.protobuf.S s4 = (com.google.protobuf.S) list;
            do {
                s4.d(k());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        do {
            if (z4) {
                S(2);
                strC = abstractC0417p.D();
            } else {
                S(2);
                strC = abstractC0417p.C();
            }
            list.add(strC);
            if (abstractC0417p.l()) {
                return;
            } else {
                iE = abstractC0417p.E();
            }
        } while (iE == this.f4519b);
        this.f4521d = iE;
    }

    public void N(InterfaceC0219w interfaceC0219w) throws C0222z, com.google.protobuf.N {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 0) {
            do {
                ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.v()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iB = abstractC0207j.b() + abstractC0207j.v();
        do {
            ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.v()));
        } while (abstractC0207j.b() < iB);
        R(iB);
    }

    public void O(List list) throws C0222z, com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.H;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0417p.F()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iK = abstractC0417p.k() + abstractC0417p.F();
            do {
                list.add(Integer.valueOf(abstractC0417p.F()));
            } while (abstractC0417p.k() < iK);
            R(iK);
            return;
        }
        com.google.protobuf.H h = (com.google.protobuf.H) list;
        int i5 = this.f4519b & 7;
        if (i5 == 0) {
            do {
                h.h(abstractC0417p.F());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iK2 = abstractC0417p.k() + abstractC0417p.F();
        do {
            h.h(abstractC0417p.F());
        } while (abstractC0417p.k() < iK2);
        R(iK2);
    }

    public void P(InterfaceC0219w interfaceC0219w) throws C0222z, com.google.protobuf.N {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 0) {
            do {
                ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.w()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iB = abstractC0207j.b() + abstractC0207j.v();
        do {
            ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.w()));
        } while (abstractC0207j.b() < iB);
        R(iB);
    }

    public void Q(List list) throws C0222z, com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.W;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0417p.G()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iK = abstractC0417p.k() + abstractC0417p.F();
            do {
                list.add(Long.valueOf(abstractC0417p.G()));
            } while (abstractC0417p.k() < iK);
            R(iK);
            return;
        }
        com.google.protobuf.W w4 = (com.google.protobuf.W) list;
        int i5 = this.f4519b & 7;
        if (i5 == 0) {
            do {
                w4.h(abstractC0417p.G());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iK2 = abstractC0417p.k() + abstractC0417p.F();
        do {
            w4.h(abstractC0417p.G());
        } while (abstractC0417p.k() < iK2);
        R(iK2);
    }

    public void R(int i) throws C0222z, com.google.protobuf.N {
        switch (this.f4518a) {
            case 0:
                if (((AbstractC0207j) this.f4522e).b() != i) {
                    throw C0222z.e();
                }
                return;
            default:
                if (((AbstractC0417p) this.f4522e).k() != i) {
                    throw com.google.protobuf.N.h();
                }
                return;
        }
    }

    public void S(int i) throws C0221y, com.google.protobuf.M {
        switch (this.f4518a) {
            case 0:
                if ((this.f4519b & 7) != i) {
                    throw C0222z.b();
                }
                return;
            default:
                if ((this.f4519b & 7) != i) {
                    throw com.google.protobuf.N.d();
                }
                return;
        }
    }

    public boolean T() {
        int i;
        int i5;
        switch (this.f4518a) {
            case 0:
                AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
                if (abstractC0207j.c() || (i = this.f4519b) == this.f4520c) {
                    return false;
                }
                return abstractC0207j.x(i);
            default:
                AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
                if (abstractC0417p.l() || (i5 = this.f4519b) == this.f4520c) {
                    return false;
                }
                return abstractC0417p.H(i5);
        }
    }

    public void a(int i, int i5) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i6 = this.f4521d;
        int i7 = i6 * 2;
        int[] iArr = (int[]) this.f4522e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f4522e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int[] iArr3 = new int[i6 * 4];
            this.f4522e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f4522e;
        iArr4[i7] = i;
        iArr4[i7 + 1] = i5;
        this.f4521d++;
    }

    public void b(RecyclerView recyclerView, boolean z4) {
        this.f4521d = 0;
        int[] iArr = (int[]) this.f4522e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0910Q abstractC0910Q = recyclerView.f4759q;
        if (recyclerView.f4757p == null || abstractC0910Q == null || !abstractC0910Q.i) {
            return;
        }
        if (z4) {
            if (!recyclerView.f4737d.y()) {
                abstractC0910Q.i(recyclerView.f4757p.a(), this);
            }
        } else if (!recyclerView.K()) {
            abstractC0910Q.h(this.f4519b, this.f4520c, recyclerView.f4745i0, this);
        }
        int i = this.f4521d;
        if (i > abstractC0910Q.f9921j) {
            abstractC0910Q.f9921j = i;
            abstractC0910Q.f9922k = z4;
            recyclerView.f4733b.k();
        }
    }

    public int c() {
        switch (this.f4518a) {
            case 0:
                int i = this.f4521d;
                if (i != 0) {
                    this.f4519b = i;
                    this.f4521d = 0;
                } else {
                    this.f4519b = ((AbstractC0207j) this.f4522e).u();
                }
                int i5 = this.f4519b;
                return (i5 == 0 || i5 == this.f4520c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i5 >>> 3;
            default:
                int i6 = this.f4521d;
                if (i6 != 0) {
                    this.f4519b = i6;
                    this.f4521d = 0;
                } else {
                    this.f4519b = ((AbstractC0417p) this.f4522e).E();
                }
                int i7 = this.f4519b;
                return (i7 == 0 || i7 == this.f4520c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i7 >>> 3;
        }
    }

    public void d(Object obj, V v4, C0211n c0211n) {
        int i = this.f4520c;
        this.f4520c = ((this.f4519b >>> 3) << 3) | 4;
        try {
            v4.e(obj, this, c0211n);
            if (this.f4519b == this.f4520c) {
            } else {
                throw new C0222z("Failed to parse the message.");
            }
        } finally {
            this.f4520c = i;
        }
    }

    public void e(Object obj, InterfaceC0425t0 interfaceC0425t0, com.google.protobuf.v vVar) {
        int i = this.f4520c;
        this.f4520c = ((this.f4519b >>> 3) << 3) | 4;
        try {
            interfaceC0425t0.j(obj, this, vVar);
            if (this.f4519b == this.f4520c) {
            } else {
                throw com.google.protobuf.N.g();
            }
        } finally {
            this.f4520c = i;
        }
    }

    public void f(Object obj, V v4, C0211n c0211n) throws C0222z {
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        int iV = abstractC0207j.v();
        if (abstractC0207j.f4515a >= 100) {
            throw new C0222z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = abstractC0207j.e(iV);
        abstractC0207j.f4515a++;
        v4.e(obj, this, c0211n);
        abstractC0207j.a(0);
        abstractC0207j.f4515a--;
        abstractC0207j.d(iE);
    }

    public void g(Object obj, InterfaceC0425t0 interfaceC0425t0, com.google.protobuf.v vVar) throws com.google.protobuf.N {
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        int iF = abstractC0417p.F();
        if (abstractC0417p.f6562a >= abstractC0417p.f6563b) {
            throw new com.google.protobuf.N("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iO = abstractC0417p.o(iF);
        abstractC0417p.f6562a++;
        interfaceC0425t0.j(obj, this, vVar);
        abstractC0417p.e(0);
        abstractC0417p.f6562a--;
        abstractC0417p.n(iO);
    }

    public void h(InterfaceC0219w interfaceC0219w) throws C0222z, com.google.protobuf.N {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 0) {
            do {
                ((T) interfaceC0219w).add(Boolean.valueOf(abstractC0207j.f()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iB = abstractC0207j.b() + abstractC0207j.v();
        do {
            ((T) interfaceC0219w).add(Boolean.valueOf(abstractC0207j.f()));
        } while (abstractC0207j.b() < iB);
        R(iB);
    }

    public void i(List list) throws C0222z, com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.f;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC0417p.p()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iK = abstractC0417p.k() + abstractC0417p.F();
            do {
                list.add(Boolean.valueOf(abstractC0417p.p()));
            } while (abstractC0417p.k() < iK);
            R(iK);
            return;
        }
        com.google.protobuf.f fVar = (com.google.protobuf.f) list;
        int i5 = this.f4519b & 7;
        if (i5 == 0) {
            do {
                fVar.h(abstractC0417p.p());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iK2 = abstractC0417p.k() + abstractC0417p.F();
        do {
            fVar.h(abstractC0417p.p());
        } while (abstractC0417p.k() < iK2);
        R(iK2);
    }

    public C0204g j() throws C0221y, com.google.protobuf.M {
        S(2);
        return ((AbstractC0207j) this.f4522e).g();
    }

    public AbstractC0409l k() throws C0221y, com.google.protobuf.M {
        S(2);
        return ((AbstractC0417p) this.f4522e).q();
    }

    public void l(InterfaceC0219w interfaceC0219w) throws C0221y {
        int iU;
        if ((this.f4519b & 7) != 2) {
            throw C0222z.b();
        }
        do {
            ((T) interfaceC0219w).add(j());
            AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
            if (abstractC0207j.c()) {
                return;
            } else {
                iU = abstractC0207j.u();
            }
        } while (iU == this.f4519b);
        this.f4521d = iU;
    }

    public void m(List list) throws com.google.protobuf.M {
        int iE;
        if ((this.f4519b & 7) != 2) {
            throw com.google.protobuf.N.d();
        }
        do {
            list.add(k());
            AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
            if (abstractC0417p.l()) {
                return;
            } else {
                iE = abstractC0417p.E();
            }
        } while (iE == this.f4519b);
        this.f4521d = iE;
    }

    public void n(InterfaceC0219w interfaceC0219w) throws C0222z {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 1) {
            do {
                ((T) interfaceC0219w).add(Double.valueOf(abstractC0207j.h()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iV = abstractC0207j.v();
        if ((iV & 7) != 0) {
            throw new C0222z("Failed to parse the message.");
        }
        int iB = abstractC0207j.b() + iV;
        do {
            ((T) interfaceC0219w).add(Double.valueOf(abstractC0207j.h()));
        } while (abstractC0207j.b() < iB);
    }

    public void o(List list) throws com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof AbstractC0424t;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(abstractC0417p.r()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iF = abstractC0417p.F();
            V(iF);
            int iK = abstractC0417p.k() + iF;
            do {
                list.add(Double.valueOf(abstractC0417p.r()));
            } while (abstractC0417p.k() < iK);
            return;
        }
        AbstractC0424t abstractC0424t = (AbstractC0424t) list;
        int i5 = this.f4519b & 7;
        if (i5 == 1) {
            do {
                abstractC0424t.h(abstractC0417p.r());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iF2 = abstractC0417p.F();
        V(iF2);
        int iK2 = abstractC0417p.k() + iF2;
        do {
            abstractC0424t.h(abstractC0417p.r());
        } while (abstractC0417p.k() < iK2);
    }

    public void p(InterfaceC0219w interfaceC0219w) throws C0222z, com.google.protobuf.N {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 0) {
            do {
                ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.i()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iB = abstractC0207j.b() + abstractC0207j.v();
        do {
            ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.i()));
        } while (abstractC0207j.b() < iB);
        R(iB);
    }

    public void q(List list) throws C0222z, com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.H;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0417p.s()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iK = abstractC0417p.k() + abstractC0417p.F();
            do {
                list.add(Integer.valueOf(abstractC0417p.s()));
            } while (abstractC0417p.k() < iK);
            R(iK);
            return;
        }
        com.google.protobuf.H h = (com.google.protobuf.H) list;
        int i5 = this.f4519b & 7;
        if (i5 == 0) {
            do {
                h.h(abstractC0417p.s());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iK2 = abstractC0417p.k() + abstractC0417p.F();
        do {
            h.h(abstractC0417p.s());
        } while (abstractC0417p.k() < iK2);
        R(iK2);
    }

    public Object r(q0 q0Var, Class cls, C0211n c0211n) throws C0222z, com.google.protobuf.M {
        int iOrdinal = q0Var.ordinal();
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        switch (iOrdinal) {
            case 0:
                S(1);
                return Double.valueOf(abstractC0207j.h());
            case 1:
                S(5);
                return Float.valueOf(abstractC0207j.l());
            case 2:
                S(0);
                return Long.valueOf(abstractC0207j.n());
            case 3:
                S(0);
                return Long.valueOf(abstractC0207j.w());
            case 4:
                S(0);
                return Integer.valueOf(abstractC0207j.m());
            case 5:
                S(1);
                return Long.valueOf(abstractC0207j.k());
            case 6:
                S(5);
                return Integer.valueOf(abstractC0207j.j());
            case 7:
                S(0);
                return Boolean.valueOf(abstractC0207j.f());
            case 8:
                S(2);
                return abstractC0207j.t();
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                S(2);
                V vA = S.f4448c.a(cls);
                AbstractC0218v abstractC0218vC = vA.c();
                f(abstractC0218vC, vA, c0211n);
                vA.d(abstractC0218vC);
                return abstractC0218vC;
            case 11:
                return j();
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                S(0);
                return Integer.valueOf(abstractC0207j.v());
            case 13:
                S(0);
                return Integer.valueOf(abstractC0207j.i());
            case 14:
                S(5);
                return Integer.valueOf(abstractC0207j.o());
            case 15:
                S(1);
                return Long.valueOf(abstractC0207j.p());
            case 16:
                S(0);
                return Integer.valueOf(abstractC0207j.q());
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                S(0);
                return Long.valueOf(abstractC0207j.r());
        }
    }

    public Object s(U0 u02, Class cls, com.google.protobuf.v vVar) throws C0221y, com.google.protobuf.N {
        int iOrdinal = u02.ordinal();
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        switch (iOrdinal) {
            case 0:
                S(1);
                return Double.valueOf(abstractC0417p.r());
            case 1:
                S(5);
                return Float.valueOf(abstractC0417p.v());
            case 2:
                S(0);
                return Long.valueOf(abstractC0417p.x());
            case 3:
                S(0);
                return Long.valueOf(abstractC0417p.G());
            case 4:
                S(0);
                return Integer.valueOf(abstractC0417p.w());
            case 5:
                S(1);
                return Long.valueOf(abstractC0417p.u());
            case 6:
                S(5);
                return Integer.valueOf(abstractC0417p.t());
            case 7:
                S(0);
                return Boolean.valueOf(abstractC0417p.p());
            case 8:
                S(2);
                return abstractC0417p.D();
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                S(2);
                InterfaceC0425t0 interfaceC0425t0A = C0414n0.f6548c.a(cls);
                com.google.protobuf.E eC = interfaceC0425t0A.c();
                g(eC, interfaceC0425t0A, vVar);
                interfaceC0425t0A.d(eC);
                return eC;
            case 11:
                return k();
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                S(0);
                return Integer.valueOf(abstractC0417p.F());
            case 13:
                S(0);
                return Integer.valueOf(abstractC0417p.s());
            case 14:
                S(5);
                return Integer.valueOf(abstractC0417p.y());
            case 15:
                S(1);
                return Long.valueOf(abstractC0417p.z());
            case 16:
                S(0);
                return Integer.valueOf(abstractC0417p.A());
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                S(0);
                return Long.valueOf(abstractC0417p.B());
        }
    }

    public void t(InterfaceC0219w interfaceC0219w) throws C0222z {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 2) {
            int iV = abstractC0207j.v();
            if ((iV & 3) != 0) {
                throw new C0222z("Failed to parse the message.");
            }
            int iB = abstractC0207j.b() + iV;
            do {
                ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.j()));
            } while (abstractC0207j.b() < iB);
            return;
        }
        if (i != 5) {
            throw C0222z.b();
        }
        do {
            ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.j()));
            if (abstractC0207j.c()) {
                return;
            } else {
                iU = abstractC0207j.u();
            }
        } while (iU == this.f4519b);
        this.f4521d = iU;
    }

    public void u(List list) throws com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.H;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 2) {
                int iF = abstractC0417p.F();
                U(iF);
                int iK = abstractC0417p.k() + iF;
                do {
                    list.add(Integer.valueOf(abstractC0417p.t()));
                } while (abstractC0417p.k() < iK);
                return;
            }
            if (i != 5) {
                throw com.google.protobuf.N.d();
            }
            do {
                list.add(Integer.valueOf(abstractC0417p.t()));
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE = abstractC0417p.E();
                }
            } while (iE == this.f4519b);
            this.f4521d = iE;
            return;
        }
        com.google.protobuf.H h = (com.google.protobuf.H) list;
        int i5 = this.f4519b & 7;
        if (i5 == 2) {
            int iF2 = abstractC0417p.F();
            U(iF2);
            int iK2 = abstractC0417p.k() + iF2;
            do {
                h.h(abstractC0417p.t());
            } while (abstractC0417p.k() < iK2);
            return;
        }
        if (i5 != 5) {
            throw com.google.protobuf.N.d();
        }
        do {
            h.h(abstractC0417p.t());
            if (abstractC0417p.l()) {
                return;
            } else {
                iE2 = abstractC0417p.E();
            }
        } while (iE2 == this.f4519b);
        this.f4521d = iE2;
    }

    public void v(InterfaceC0219w interfaceC0219w) throws C0222z {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 1) {
            do {
                ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.k()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iV = abstractC0207j.v();
        if ((iV & 7) != 0) {
            throw new C0222z("Failed to parse the message.");
        }
        int iB = abstractC0207j.b() + iV;
        do {
            ((T) interfaceC0219w).add(Long.valueOf(abstractC0207j.k()));
        } while (abstractC0207j.b() < iB);
    }

    public void w(List list) throws com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.W;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC0417p.u()));
                    if (abstractC0417p.l()) {
                        return;
                    } else {
                        iE = abstractC0417p.E();
                    }
                } while (iE == this.f4519b);
                this.f4521d = iE;
                return;
            }
            if (i != 2) {
                throw com.google.protobuf.N.d();
            }
            int iF = abstractC0417p.F();
            V(iF);
            int iK = abstractC0417p.k() + iF;
            do {
                list.add(Long.valueOf(abstractC0417p.u()));
            } while (abstractC0417p.k() < iK);
            return;
        }
        com.google.protobuf.W w4 = (com.google.protobuf.W) list;
        int i5 = this.f4519b & 7;
        if (i5 == 1) {
            do {
                w4.h(abstractC0417p.u());
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE2 = abstractC0417p.E();
                }
            } while (iE2 == this.f4519b);
            this.f4521d = iE2;
            return;
        }
        if (i5 != 2) {
            throw com.google.protobuf.N.d();
        }
        int iF2 = abstractC0417p.F();
        V(iF2);
        int iK2 = abstractC0417p.k() + iF2;
        do {
            w4.h(abstractC0417p.u());
        } while (abstractC0417p.k() < iK2);
    }

    public void x(InterfaceC0219w interfaceC0219w) throws C0222z {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 2) {
            int iV = abstractC0207j.v();
            if ((iV & 3) != 0) {
                throw new C0222z("Failed to parse the message.");
            }
            int iB = abstractC0207j.b() + iV;
            do {
                ((T) interfaceC0219w).add(Float.valueOf(abstractC0207j.l()));
            } while (abstractC0207j.b() < iB);
            return;
        }
        if (i != 5) {
            throw C0222z.b();
        }
        do {
            ((T) interfaceC0219w).add(Float.valueOf(abstractC0207j.l()));
            if (abstractC0207j.c()) {
                return;
            } else {
                iU = abstractC0207j.u();
            }
        } while (iU == this.f4519b);
        this.f4521d = iU;
    }

    public void y(List list) throws com.google.protobuf.N {
        int iE;
        int iE2;
        boolean z4 = list instanceof com.google.protobuf.A;
        AbstractC0417p abstractC0417p = (AbstractC0417p) this.f4522e;
        if (!z4) {
            int i = this.f4519b & 7;
            if (i == 2) {
                int iF = abstractC0417p.F();
                U(iF);
                int iK = abstractC0417p.k() + iF;
                do {
                    list.add(Float.valueOf(abstractC0417p.v()));
                } while (abstractC0417p.k() < iK);
                return;
            }
            if (i != 5) {
                throw com.google.protobuf.N.d();
            }
            do {
                list.add(Float.valueOf(abstractC0417p.v()));
                if (abstractC0417p.l()) {
                    return;
                } else {
                    iE = abstractC0417p.E();
                }
            } while (iE == this.f4519b);
            this.f4521d = iE;
            return;
        }
        com.google.protobuf.A a5 = (com.google.protobuf.A) list;
        int i5 = this.f4519b & 7;
        if (i5 == 2) {
            int iF2 = abstractC0417p.F();
            U(iF2);
            int iK2 = abstractC0417p.k() + iF2;
            do {
                a5.h(abstractC0417p.v());
            } while (abstractC0417p.k() < iK2);
            return;
        }
        if (i5 != 5) {
            throw com.google.protobuf.N.d();
        }
        do {
            a5.h(abstractC0417p.v());
            if (abstractC0417p.l()) {
                return;
            } else {
                iE2 = abstractC0417p.E();
            }
        } while (iE2 == this.f4519b);
        this.f4521d = iE2;
    }

    public void z(InterfaceC0219w interfaceC0219w) throws C0222z, com.google.protobuf.N {
        int iU;
        int i = this.f4519b & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) this.f4522e;
        if (i == 0) {
            do {
                ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.m()));
                if (abstractC0207j.c()) {
                    return;
                } else {
                    iU = abstractC0207j.u();
                }
            } while (iU == this.f4519b);
            this.f4521d = iU;
            return;
        }
        if (i != 2) {
            throw C0222z.b();
        }
        int iB = abstractC0207j.b() + abstractC0207j.v();
        do {
            ((T) interfaceC0219w).add(Integer.valueOf(abstractC0207j.m()));
        } while (abstractC0207j.b() < iB);
        R(iB);
    }

    public C0208k(AbstractC0207j abstractC0207j) {
        this.f4518a = 0;
        this.f4521d = 0;
        Charset charset = AbstractC0220x.f4563a;
        this.f4522e = abstractC0207j;
        abstractC0207j.f4516b = this;
    }

    public C0208k(AbstractC0417p abstractC0417p) {
        this.f4518a = 1;
        this.f4521d = 0;
        com.google.protobuf.L.a(abstractC0417p, "input");
        this.f4522e = abstractC0417p;
        abstractC0417p.f6564c = this;
    }
}
