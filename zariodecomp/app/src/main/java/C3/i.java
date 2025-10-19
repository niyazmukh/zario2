package C3;

import B3.AbstractC0034d;
import B3.AbstractC0056k0;
import B3.AbstractC0065n0;
import B3.C0051i1;
import B3.C1;
import B3.D1;
import B3.EnumC0094y;
import B3.G0;
import B3.RunnableC0029b;
import B3.m2;
import B3.p2;
import g2.AbstractC0579b;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import z3.AbstractC1076E;
import z3.AbstractC1083g;
import z3.F;
import z3.V;
import z3.Y;
import z3.a0;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\i.smali */
public final class i extends AbstractC0065n0 implements u {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1161A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1162B;

    /* renamed from: C, reason: collision with root package name */
    public int f1163C;

    /* renamed from: D, reason: collision with root package name */
    public int f1164D;

    /* renamed from: E, reason: collision with root package name */
    public final d f1165E;

    /* renamed from: F, reason: collision with root package name */
    public final x f1166F;
    public final m G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1167H;

    /* renamed from: I, reason: collision with root package name */
    public final J3.c f1168I;

    /* renamed from: J, reason: collision with root package name */
    public v f1169J;

    /* renamed from: K, reason: collision with root package name */
    public int f1170K;

    /* renamed from: L, reason: collision with root package name */
    public final /* synthetic */ j f1171L;

    /* renamed from: v, reason: collision with root package name */
    public final int f1172v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f1173w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f1174x;

    /* renamed from: y, reason: collision with root package name */
    public final q4.d f1175y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1176z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, int i, m2 m2Var, Object obj, d dVar, x xVar, m mVar, int i5) {
        super(i, m2Var, jVar.f781c);
        this.f1171L = jVar;
        this.f922s = AbstractC0579b.f7599b;
        this.f1175y = new q4.d();
        this.f1176z = false;
        this.f1161A = false;
        this.f1162B = false;
        this.f1167H = true;
        this.f1170K = -1;
        S0.f.l(obj, "lock");
        this.f1173w = obj;
        this.f1165E = dVar;
        this.f1166F = xVar;
        this.G = mVar;
        this.f1163C = i5;
        this.f1164D = i5;
        this.f1172v = i5;
        J3.b.f2098a.getClass();
        this.f1168I = J3.a.f2096a;
    }

    public static void j(i iVar, a0 a0Var, String str) {
        j jVar = iVar.f1171L;
        String str2 = jVar.f1181m;
        boolean z4 = jVar.f1185q;
        m mVar = iVar.G;
        boolean z5 = mVar.f1193B == null;
        E3.b bVar = e.f1128a;
        S0.f.l(a0Var, "headers");
        S0.f.l(str, "defaultPath");
        S0.f.l(str2, "authority");
        a0Var.a(AbstractC0056k0.i);
        a0Var.a(AbstractC0056k0.f865j);
        V v4 = AbstractC0056k0.f866k;
        a0Var.a(v4);
        ArrayList arrayList = new ArrayList(a0Var.f11278b + 7);
        if (z5) {
            arrayList.add(e.f1129b);
        } else {
            arrayList.add(e.f1128a);
        }
        if (z4) {
            arrayList.add(e.f1131d);
        } else {
            arrayList.add(e.f1130c);
        }
        arrayList.add(new E3.b(E3.b.h, str2));
        arrayList.add(new E3.b(E3.b.f1536f, str));
        arrayList.add(new E3.b(v4.f11269a, jVar.f1179k));
        arrayList.add(e.f1132e);
        arrayList.add(e.f1133f);
        Logger logger = p2.f944a;
        Charset charset = AbstractC1076E.f11237a;
        int i = a0Var.f11278b * 2;
        byte[][] bArr = new byte[i][];
        Object[] objArr = a0Var.f11277a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i);
        } else {
            for (int i5 = 0; i5 < a0Var.f11278b; i5++) {
                int i6 = i5 * 2;
                bArr[i6] = a0Var.e(i5);
                int i7 = i6 + 1;
                Object obj = a0Var.f11277a[i7];
                if (!(obj instanceof byte[])) {
                    B.a.p(obj);
                    throw null;
                }
                bArr[i7] = (byte[]) obj;
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9 += 2) {
            byte[] bArr2 = bArr[i9];
            byte[] bArr3 = bArr[i9 + 1];
            if (p2.a(bArr2, p2.f945b)) {
                bArr[i8] = bArr2;
                bArr[i8 + 1] = AbstractC1076E.f11238b.c(bArr3).getBytes(AbstractC0579b.f7598a);
            } else {
                for (byte b5 : bArr3) {
                    if (b5 < 32 || b5 > 126) {
                        StringBuilder sbO = B.a.o("Metadata key=", new String(bArr2, AbstractC0579b.f7598a), ", value=");
                        sbO.append(Arrays.toString(bArr3));
                        sbO.append(" contains invalid ASCII characters");
                        p2.f944a.warning(sbO.toString());
                        break;
                    }
                }
                bArr[i8] = bArr2;
                bArr[i8 + 1] = bArr3;
            }
            i8 += 2;
        }
        if (i8 != i) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i8);
        }
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            q4.f fVarF = q4.f.f(bArr[i10]);
            byte[] bArr4 = fVarF.f9517a;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new E3.b(fVarF, q4.f.f(bArr[i10 + 1])));
            }
        }
        iVar.f1174x = arrayList;
        k0 k0Var = mVar.f1225v;
        if (k0Var != null) {
            jVar.f1182n.f(k0Var, EnumC0094y.f1025d, true, new a0());
            return;
        }
        if (mVar.f1217n.size() < mVar.f1194C) {
            mVar.u(jVar);
            return;
        }
        mVar.f1195D.add(jVar);
        if (!mVar.f1229z) {
            mVar.f1229z = true;
            G0 g02 = mVar.f1197F;
            if (g02 != null) {
                g02.b();
            }
        }
        if (jVar.f783e) {
            mVar.f1203M.c(jVar, true);
        }
    }

    public static void k(i iVar, q4.d dVar, boolean z4, boolean z5) {
        if (iVar.f1162B) {
            return;
        }
        if (!iVar.f1167H) {
            S0.f.q("streamId should be set", iVar.f1170K != -1);
            iVar.f1166F.a(z4, iVar.f1169J, dVar, z5);
        } else {
            iVar.f1175y.b(dVar, (int) dVar.f9515b);
            iVar.f1176z |= z4;
            iVar.f1161A |= z5;
        }
    }

    @Override // B3.AbstractC0031c
    public final void a(int i) {
        int i5 = this.f1164D - i;
        this.f1164D = i5;
        float f2 = i5;
        int i6 = this.f1172v;
        if (f2 <= i6 * 0.5f) {
            int i7 = i6 - i5;
            this.f1163C += i7;
            this.f1164D = i5 + i7;
            this.f1165E.m(this.f1170K, i7);
        }
    }

    @Override // B3.AbstractC0031c
    public final void c(boolean z4) {
        boolean z5 = this.f763n;
        EnumC0094y enumC0094y = EnumC0094y.f1022a;
        if (z5) {
            this.G.j(this.f1170K, null, enumC0094y, false, null, null);
        } else {
            this.G.j(this.f1170K, null, enumC0094y, false, E3.a.CANCEL, null);
        }
        S0.f.q("status should have been reported on deframer closed", this.f764o);
        this.f761l = true;
        if (this.f765p && z4) {
            g(k0.f11354m.g("Encountered end-of-stream mid-frame"), true, new a0());
        }
        RunnableC0029b runnableC0029b = this.f762m;
        if (runnableC0029b != null) {
            runnableC0029b.run();
            this.f762m = null;
        }
    }

    public final void l(k0 k0Var, boolean z4, a0 a0Var) throws EOFException {
        if (this.f1162B) {
            return;
        }
        this.f1162B = true;
        if (!this.f1167H) {
            this.G.j(this.f1170K, k0Var, EnumC0094y.f1022a, z4, E3.a.CANCEL, a0Var);
            return;
        }
        m mVar = this.G;
        LinkedList linkedList = mVar.f1195D;
        j jVar = this.f1171L;
        linkedList.remove(jVar);
        mVar.o(jVar);
        this.f1174x = null;
        q4.d dVar = this.f1175y;
        dVar.p(dVar.f9515b);
        this.f1167H = false;
        if (a0Var == null) {
            a0Var = new a0();
        }
        g(k0Var, true, a0Var);
    }

    public final void m(Throwable th) {
        l(k0.d(th), true, new a0());
    }

    public final void n(int i, q4.d dVar, boolean z4) throws Throwable {
        boolean z5;
        Throwable th;
        boolean z6 = true;
        long j5 = dVar.f9515b;
        int i5 = this.f1163C - (((int) j5) + i);
        this.f1163C = i5;
        this.f1164D -= i;
        if (i5 < 0) {
            this.f1165E.l(this.f1170K, E3.a.FLOW_CONTROL_ERROR);
            this.G.j(this.f1170K, k0.f11354m.g("Received data size exceeded our receiving window size"), EnumC0094y.f1022a, false, null, null);
            return;
        }
        q qVar = new q(dVar);
        k0 k0Var = this.f920q;
        if (k0Var != null) {
            Charset charset = this.f922s;
            C1 c12 = D1.f396a;
            S0.f.l(charset, "charset");
            int i6 = (int) dVar.f9515b;
            byte[] bArr = new byte[i6];
            qVar.o(bArr, 0, i6);
            this.f920q = k0Var.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            qVar.close();
            if (this.f920q.f11359b.length() > 1000 || z4) {
                l(this.f920q, false, this.f921r);
                return;
            }
            return;
        }
        if (!this.f923t) {
            l(k0.f11354m.g("headers not received before payload"), false, new a0());
            return;
        }
        int i7 = (int) j5;
        try {
            if (this.f764o) {
                AbstractC0034d.i.log(Level.INFO, "Received data on closed stream");
                qVar.close();
            } else {
                try {
                    C0051i1 c0051i1 = this.f752a;
                    c0051i1.getClass();
                    try {
                        if (c0051i1.e() || c0051i1.f842u) {
                            qVar.close();
                        } else {
                            c0051i1.f837p.t(qVar);
                            try {
                                c0051i1.a();
                            } catch (Throwable th2) {
                                th = th2;
                                z5 = false;
                                if (z5) {
                                    qVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        z5 = true;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        m(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        z6 = false;
                        if (z6) {
                            qVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z4) {
                if (i7 > 0) {
                    this.f920q = k0.f11354m.g("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f920q = k0.f11354m.g("Received unexpected EOS on empty DATA frame from server");
                }
                a0 a0Var = new a0();
                this.f921r = a0Var;
                g(this.f920q, false, a0Var);
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void o(ArrayList arrayList, boolean z4) throws EOFException {
        k0 k0VarI;
        StringBuilder sb;
        k0 k0VarA;
        Y y4 = AbstractC0065n0.f919u;
        if (z4) {
            byte[][] bArrA = y.a(arrayList);
            int length = bArrA.length / 2;
            a0 a0Var = new a0();
            a0Var.f11278b = length;
            a0Var.f11277a = bArrA;
            if (this.f920q == null && !this.f923t) {
                k0 k0VarI2 = AbstractC0065n0.i(a0Var);
                this.f920q = k0VarI2;
                if (k0VarI2 != null) {
                    this.f921r = a0Var;
                }
            }
            k0 k0Var = this.f920q;
            if (k0Var != null) {
                k0 k0VarA2 = k0Var.a("trailers: " + a0Var);
                this.f920q = k0VarA2;
                l(k0VarA2, false, this.f921r);
                return;
            }
            Y y5 = F.f11240b;
            k0 k0Var2 = (k0) a0Var.c(y5);
            if (k0Var2 != null) {
                k0VarA = k0Var2.g((String) a0Var.c(F.f11239a));
            } else if (this.f923t) {
                k0VarA = k0.f11350g.g("missing GRPC status in response");
            } else {
                Integer num = (Integer) a0Var.c(y4);
                k0VarA = (num != null ? AbstractC0056k0.g(num.intValue()) : k0.f11354m.g("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
            }
            a0Var.a(y4);
            a0Var.a(y5);
            a0Var.a(F.f11239a);
            if (this.f764o) {
                AbstractC0034d.i.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{k0VarA, a0Var});
                return;
            }
            for (AbstractC1083g abstractC1083g : this.h.f910a) {
                abstractC1083g.e(a0Var);
            }
            g(k0VarA, false, a0Var);
            return;
        }
        byte[][] bArrA2 = y.a(arrayList);
        int length2 = bArrA2.length / 2;
        a0 a0Var2 = new a0();
        a0Var2.f11278b = length2;
        a0Var2.f11277a = bArrA2;
        k0 k0Var3 = this.f920q;
        if (k0Var3 != null) {
            this.f920q = k0Var3.a("headers: " + a0Var2);
            return;
        }
        try {
            if (this.f923t) {
                k0VarI = k0.f11354m.g("Received headers twice");
                this.f920q = k0VarI;
                sb = new StringBuilder("headers: ");
            } else {
                Integer num2 = (Integer) a0Var2.c(y4);
                if (num2 == null || num2.intValue() < 100 || num2.intValue() >= 200) {
                    this.f923t = true;
                    k0VarI = AbstractC0065n0.i(a0Var2);
                    this.f920q = k0VarI;
                    if (k0VarI != null) {
                        sb = new StringBuilder("headers: ");
                    } else {
                        a0Var2.a(y4);
                        a0Var2.a(F.f11240b);
                        a0Var2.a(F.f11239a);
                        d(a0Var2);
                        k0VarI = this.f920q;
                        if (k0VarI == null) {
                            return;
                        } else {
                            sb = new StringBuilder("headers: ");
                        }
                    }
                } else {
                    k0VarI = this.f920q;
                    if (k0VarI == null) {
                        return;
                    } else {
                        sb = new StringBuilder("headers: ");
                    }
                }
            }
            sb.append(a0Var2);
            this.f920q = k0VarI.a(sb.toString());
            this.f921r = a0Var2;
            this.f922s = AbstractC0065n0.h(a0Var2);
        } catch (Throwable th) {
            k0 k0Var4 = this.f920q;
            if (k0Var4 != null) {
                this.f920q = k0Var4.a("headers: " + a0Var2);
                this.f921r = a0Var2;
                this.f922s = AbstractC0065n0.h(a0Var2);
            }
            throw th;
        }
    }
}
