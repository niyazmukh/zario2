package C3;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import y2.C1051D;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\x.smali */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f1259a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1260b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1261c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1262d;

    public x(m mVar, d dVar) {
        this.f1260b = mVar;
        this.f1261c = dVar;
        this.f1259a = 65535;
        this.f1262d = new v(this, 0, 65535, null);
    }

    public void a(boolean z4, v vVar, q4.d dVar, boolean z5) {
        S0.f.l(dVar, "source");
        int iMin = Math.min(vVar.f1253c, ((v) vVar.f1257g.f1262d).f1253c);
        q4.d dVar2 = vVar.f1251a;
        boolean z6 = dVar2.f9515b > 0;
        int i = (int) dVar.f9515b;
        if (z6 || iMin < i) {
            if (!z6 && iMin > 0) {
                vVar.b(iMin, dVar, false);
            }
            dVar2.b(dVar, (int) dVar.f9515b);
            vVar.f1256f = z4 | vVar.f1256f;
        } else {
            vVar.b(i, dVar, z4);
        }
        if (z5) {
            try {
                ((d) this.f1261c).flush();
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public void b(List list) {
        Iterator it = list.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            C1051D c1051d = (C1051D) it.next();
            y2.h hVar = (y2.h) ((HashMap) this.f1261c).get(c1051d.f11070a);
            if (hVar != null) {
                Iterator it2 = hVar.f11096a.iterator();
                while (it2.hasNext()) {
                    if (((y2.w) it2.next()).b(c1051d)) {
                        z4 = true;
                    }
                }
                hVar.f11097b = c1051d;
            }
        }
        if (z4) {
            c();
        }
    }

    public void c() {
        Iterator it = ((HashSet) this.f1262d).iterator();
        while (it.hasNext()) {
            ((w2.i) it.next()).a(null, null);
        }
    }

    public void d(v vVar, int i) {
        if (vVar == null) {
            ((v) this.f1262d).a(i);
            e();
            return;
        }
        vVar.a(i);
        w wVar = new w();
        vVar.c(Math.min(vVar.f1253c, ((v) vVar.f1257g.f1262d).f1253c), wVar);
        if (wVar.f1258a > 0) {
            try {
                ((d) this.f1261c).flush();
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void e() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f1260b
            C3.m r0 = (C3.m) r0
            C3.v[] r1 = r0.k()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f1262d
            C3.v r2 = (C3.v) r2
            int r2 = r2.f1253c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f1253c
            q4.d r10 = r8.f1251a
            long r11 = r10.f9515b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f1254d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f1254d
            int r11 = r11 + r9
            r8.f1254d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f1253c
            long r10 = r10.f9515b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f1254d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            C3.w r1 = new C3.w
            r1.<init>()
            C3.v[] r0 = r0.k()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f1254d
            r5.c(r6, r1)
            r5.f1254d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f1258a
            if (r0 <= 0) goto L96
            java.lang.Object r13 = r13.f1261c     // Catch: java.io.IOException -> L8f
            C3.d r13 = (C3.d) r13     // Catch: java.io.IOException -> L8f
            r13.flush()     // Catch: java.io.IOException -> L8f
            goto L96
        L8f:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r13)
            throw r0
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.x.e():void");
    }

    public x(X2.o oVar) {
        this.f1262d = new HashSet();
        this.f1259a = 1;
        this.f1260b = oVar;
        this.f1261c = new HashMap();
        oVar.f3857m = this;
    }
}
