package O3;

import X3.p;
import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O3\c.smali */
public final class c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f2658a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2659b;

    public c(g element, i left) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f2658a = left;
        this.f2659b = element;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i5 = 2;
            while (true) {
                i iVar = cVar2.f2658a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i5++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f2658a;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i5 != i) {
                return false;
            }
            while (true) {
                g gVar = this.f2659b;
                if (!kotlin.jvm.internal.i.a(cVar.get(gVar.getKey()), gVar)) {
                    zA = false;
                    break;
                }
                i iVar3 = this.f2658a;
                if (!(iVar3 instanceof c)) {
                    kotlin.jvm.internal.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    zA = kotlin.jvm.internal.i.a(cVar.get(gVar2.getKey()), gVar2);
                    break;
                }
                this = (c) iVar3;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // O3.i
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f2658a.fold(obj, pVar), this.f2659b);
    }

    @Override // O3.i
    public final g get(h key) {
        kotlin.jvm.internal.i.e(key, "key");
        while (true) {
            g gVar = this.f2659b.get(key);
            if (gVar != null) {
                return gVar;
            }
            i iVar = this.f2658a;
            if (!(iVar instanceof c)) {
                return iVar.get(key);
            }
            this = (c) iVar;
        }
    }

    public final int hashCode() {
        return this.f2659b.hashCode() + this.f2658a.hashCode();
    }

    @Override // O3.i
    public final i minusKey(h key) {
        kotlin.jvm.internal.i.e(key, "key");
        g gVar = this.f2659b;
        g gVar2 = gVar.get(key);
        i iVar = this.f2658a;
        if (gVar2 != null) {
            return iVar;
        }
        i iVarMinusKey = iVar.minusKey(key);
        return iVarMinusKey == iVar ? this : iVarMinusKey == j.f2661a ? gVar : new c(gVar, iVarMinusKey);
    }

    @Override // O3.i
    public final i plus(i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == j.f2661a ? this : (i) context.fold(this, b.f2656c);
    }

    public final String toString() {
        return "[" + ((String) fold("", b.f2655b)) + ']';
    }
}
