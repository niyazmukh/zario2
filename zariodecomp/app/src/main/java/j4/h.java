package j4;

import h4.v;
import i4.InterfaceC0612g;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\h.smali */
public abstract class h extends AbstractC0636f {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0612g f8086d;

    public h(InterfaceC0612g interfaceC0612g, O3.i iVar, int i, h4.a aVar) {
        super(iVar, i, aVar);
        this.f8086d = interfaceC0612g;
    }

    @Override // j4.AbstractC0636f
    public final Object b(v vVar, O3.d dVar) {
        Object objF = f(new C(vVar), dVar);
        return objF == P3.a.f2678a ? objF : K3.k.f2288a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    @Override // j4.AbstractC0636f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(i4.InterfaceC0613h r6, O3.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            K3.k r0 = K3.k.f2288a
            int r1 = r5.f8081b
            r2 = -3
            if (r1 != r2) goto L71
            O3.i r1 = r7.getContext()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            f4.y r3 = new f4.y
            r4 = 0
            r3.<init>(r4)
            O3.i r4 = r5.f8080a
            java.lang.Object r2 = r4.fold(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L26
            O3.i r2 = r1.plus(r4)
            goto L2b
        L26:
            r2 = 0
            O3.i r2 = f4.E.j(r1, r4, r2)
        L2b:
            boolean r3 = kotlin.jvm.internal.i.a(r2, r1)
            if (r3 == 0) goto L3b
            java.lang.Object r5 = r5.f(r6, r7)
            P3.a r6 = P3.a.f2678a
            if (r5 != r6) goto L7a
        L39:
            r0 = r5
            goto L7a
        L3b:
            O3.e r3 = O3.e.f2660a
            O3.g r4 = r2.get(r3)
            O3.g r1 = r1.get(r3)
            boolean r1 = kotlin.jvm.internal.i.a(r4, r1)
            if (r1 == 0) goto L71
            O3.i r1 = r7.getContext()
            boolean r3 = r6 instanceof j4.C
            if (r3 != 0) goto L5e
            boolean r3 = r6 instanceof j4.x
            if (r3 == 0) goto L58
            goto L5e
        L58:
            i4.e r3 = new i4.e
            r3.<init>(r6, r1)
            r6 = r3
        L5e:
            j4.g r1 = new j4.g
            r3 = 0
            r1.<init>(r5, r3)
            java.lang.Object r5 = k4.a.m(r2)
            java.lang.Object r5 = j4.AbstractC0632b.a(r2, r6, r5, r1, r7)
            P3.a r6 = P3.a.f2678a
            if (r5 != r6) goto L7a
            goto L39
        L71:
            java.lang.Object r5 = super.c(r6, r7)
            P3.a r6 = P3.a.f2678a
            if (r5 != r6) goto L7a
            goto L39
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.h.c(i4.h, O3.d):java.lang.Object");
    }

    public abstract Object f(InterfaceC0613h interfaceC0613h, O3.d dVar);

    @Override // j4.AbstractC0636f
    public final String toString() {
        return this.f8086d + " -> " + super.toString();
    }
}
