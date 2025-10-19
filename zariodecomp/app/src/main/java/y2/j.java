package y2;

import N2.n0;
import a.AbstractC0183a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\j.smali */
public class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final i f11110a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f11111b;

    /* renamed from: c, reason: collision with root package name */
    public final B2.k f11112c;

    public j(B2.k kVar, i iVar, n0 n0Var) {
        this.f11112c = kVar;
        this.f11110a = iVar;
        this.f11111b = n0Var;
    }

    public static j e(B2.k kVar, i iVar, n0 n0Var) {
        boolean zEquals = kVar.equals(B2.k.f320b);
        i iVar2 = i.ARRAY_CONTAINS_ANY;
        i iVar3 = i.ARRAY_CONTAINS;
        i iVar4 = i.NOT_IN;
        i iVar5 = i.IN;
        if (zEquals) {
            if (iVar == iVar5) {
                return new q(kVar, n0Var, 0);
            }
            if (iVar == iVar4) {
                return new q(kVar, n0Var, 1);
            }
            AbstractC0183a.N((iVar == iVar3 || iVar == iVar2) ? false : true, iVar.f11109a.concat("queries don't make sense on document keys"), new Object[0]);
            return new q(kVar, iVar, n0Var);
        }
        if (iVar == iVar3) {
            return new C1052a(kVar, iVar3, n0Var, 1);
        }
        if (iVar == iVar5) {
            p pVar = new p(kVar, iVar5, n0Var);
            AbstractC0183a.N(B2.p.f(n0Var), "InFilter expects an ArrayValue", new Object[0]);
            return pVar;
        }
        if (iVar == iVar2) {
            C1052a c1052a = new C1052a(kVar, iVar2, n0Var, 0);
            AbstractC0183a.N(B2.p.f(n0Var), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
            return c1052a;
        }
        if (iVar != iVar4) {
            return new j(kVar, iVar, n0Var);
        }
        C1052a c1052a2 = new C1052a(kVar, iVar4, n0Var, 2);
        AbstractC0183a.N(B2.p.f(n0Var), "NotInFilter expects an ArrayValue", new Object[0]);
        return c1052a2;
    }

    @Override // y2.k
    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11112c.c());
        sb.append(this.f11110a.f11109a);
        n0 n0Var = B2.p.f335a;
        StringBuilder sb2 = new StringBuilder();
        B2.p.a(sb2, this.f11111b);
        sb.append(sb2.toString());
        return sb.toString();
    }

    @Override // y2.k
    public final List b() {
        return Collections.singletonList(this);
    }

    @Override // y2.k
    public final List c() {
        return Collections.singletonList(this);
    }

    @Override // y2.k
    public boolean d(B2.l lVar) {
        n0 n0VarF = lVar.f326e.f(this.f11112c);
        i iVar = i.NOT_EQUAL;
        n0 n0Var = this.f11111b;
        return this.f11110a == iVar ? (n0VarF == null || n0VarF.S() || !g(B2.p.b(n0VarF, n0Var))) ? false : true : n0VarF != null && B2.p.k(n0VarF) == B2.p.k(n0Var) && g(B2.p.b(n0VarF, n0Var));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11110a == jVar.f11110a && this.f11112c.equals(jVar.f11112c) && this.f11111b.equals(jVar.f11111b);
    }

    public final boolean f() {
        return Arrays.asList(i.LESS_THAN, i.LESS_THAN_OR_EQUAL, i.GREATER_THAN, i.GREATER_THAN_OR_EQUAL, i.NOT_EQUAL, i.NOT_IN).contains(this.f11110a);
    }

    public final boolean g(int i) {
        i iVar = this.f11110a;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            return i < 0;
        }
        if (iOrdinal == 1) {
            return i <= 0;
        }
        if (iOrdinal == 2) {
            return i == 0;
        }
        if (iOrdinal == 3) {
            return i != 0;
        }
        if (iOrdinal == 4) {
            return i > 0;
        }
        if (iOrdinal == 5) {
            return i >= 0;
        }
        AbstractC0183a.z("Unknown FieldFilter operator: %s", iVar);
        throw null;
    }

    public final int hashCode() {
        return this.f11111b.hashCode() + ((this.f11112c.hashCode() + ((this.f11110a.hashCode() + 1147) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}
