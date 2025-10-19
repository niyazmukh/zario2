package y2;

import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import s2.C0870e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\w.smali */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final v f11151a;

    /* renamed from: b, reason: collision with root package name */
    public final g f11152b;

    /* renamed from: c, reason: collision with root package name */
    public final C1053b f11153c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11154d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f11155e = 1;

    /* renamed from: f, reason: collision with root package name */
    public C1051D f11156f;

    public w(v vVar, g gVar, C1053b c1053b) {
        this.f11151a = vVar;
        this.f11153c = c1053b;
        this.f11152b = gVar;
    }

    public final boolean a() {
        return !t.h.a(1, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(y2.C1051D r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = r15.f11073d
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L11
            boolean r0 = r15.f11076g
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            java.lang.String r3 = "We got a new snapshot with no changes?"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            a.AbstractC0183a.N(r0, r3, r4)
            y2.g r0 = r14.f11152b
            boolean r3 = r0.f11093a
            if (r3 != 0) goto L56
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r3 = r15.f11073d
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r3.next()
            y2.f r4 = (y2.C1057f) r4
            y2.e r5 = r4.f11091a
            y2.e r6 = y2.EnumC1056e.f11089d
            if (r5 == r6) goto L2a
            r8.add(r4)
            goto L2a
        L40:
            y2.D r3 = new y2.D
            y2.v r5 = r15.f11070a
            r12 = 1
            boolean r13 = r15.i
            B2.j r6 = r15.f11071b
            B2.j r7 = r15.f11072c
            boolean r9 = r15.f11074e
            s2.e r10 = r15.f11075f
            boolean r11 = r15.f11076g
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15 = r3
        L56:
            boolean r3 = r14.f11154d
            if (r3 != 0) goto L66
            int r0 = r14.f11155e
            boolean r0 = r14.d(r15, r0)
            if (r0 == 0) goto L9f
            r14.c(r15)
            goto La0
        L66:
            java.util.ArrayList r3 = r15.f11073d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L70
            r0 = r1
            goto L96
        L70:
            y2.D r3 = r14.f11156f
            if (r3 == 0) goto L8a
            s2.e r3 = r3.f11075f
            s2.c r3 = r3.f9681a
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            s2.e r4 = r15.f11075f
            s2.c r4 = r4.f9681a
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r1
            if (r3 == r4) goto L8a
            r3 = r1
            goto L8b
        L8a:
            r3 = r2
        L8b:
            boolean r4 = r15.f11076g
            if (r4 != 0) goto L94
            if (r3 == 0) goto L92
            goto L94
        L92:
            r0 = r2
            goto L96
        L94:
            boolean r0 = r0.f11094b
        L96:
            if (r0 == 0) goto L9f
            y2.b r0 = r14.f11153c
            r2 = 0
            r0.a(r15, r2)
            goto La0
        L9f:
            r1 = r2
        La0:
            r14.f11156f = r15
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.w.b(y2.D):boolean");
    }

    public final void c(C1051D c1051d) {
        AbstractC0183a.N(!this.f11154d, "Trying to raise initial event for second time", new Object[0]);
        v vVar = c1051d.f11070a;
        ArrayList arrayList = new ArrayList();
        B2.j jVar = c1051d.f11071b;
        Iterator it = jVar.f319b.iterator();
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                C1051D c1051d2 = new C1051D(vVar, jVar, new B2.j(B2.g.f312a, new C0870e(Collections.emptyList(), new B2.i(new G1.d(vVar.c()), 0))), arrayList, c1051d.f11074e, c1051d.f11075f, true, c1051d.h, c1051d.i);
                this.f11154d = true;
                this.f11153c.a(c1051d2, null);
                return;
            }
            arrayList.add(new C1057f(EnumC1056e.f11087b, (B2.l) dVar.next()));
        }
    }

    public final boolean d(C1051D c1051d, int i) {
        AbstractC0183a.N(!this.f11154d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!c1051d.f11074e || !a()) {
            return true;
        }
        boolean zA = t.h.a(i, 3);
        if (!this.f11152b.f11095c || zA) {
            return !c1051d.f11071b.f318a.isEmpty() || c1051d.i || t.h.a(i, 3);
        }
        AbstractC0183a.N(c1051d.f11074e, "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }
}
