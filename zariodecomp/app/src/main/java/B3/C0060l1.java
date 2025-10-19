package B3;

import com.google.protobuf.AbstractC0388a;
import com.google.protobuf.AbstractC0422s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;
import z3.AbstractC1083g;
import z3.C1084h;
import z3.InterfaceC1085i;

/* renamed from: B3.l1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\l1.1.smali */
public final class C0060l1 implements InterfaceC0047h0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0034d f879a;

    /* renamed from: c, reason: collision with root package name */
    public C3.t f881c;

    /* renamed from: g, reason: collision with root package name */
    public final G2.e f885g;
    public final m2 h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f886j;

    /* renamed from: l, reason: collision with root package name */
    public long f888l;

    /* renamed from: b, reason: collision with root package name */
    public int f880b = -1;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1085i f882d = C1084h.f11313b;

    /* renamed from: e, reason: collision with root package name */
    public final C0057k1 f883e = new C0057k1(this);

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f884f = ByteBuffer.allocate(5);

    /* renamed from: k, reason: collision with root package name */
    public int f887k = -1;

    public C0060l1(AbstractC0034d abstractC0034d, G2.e eVar, m2 m2Var) {
        this.f879a = abstractC0034d;
        this.f885g = eVar;
        this.h = m2Var;
    }

    public static int i(G3.a aVar, OutputStream outputStream) throws IOException {
        AbstractC0388a abstractC0388a = aVar.f1867a;
        if (abstractC0388a != null) {
            int iC = ((com.google.protobuf.E) abstractC0388a).c(null);
            AbstractC0388a abstractC0388a2 = aVar.f1867a;
            abstractC0388a2.getClass();
            int iC2 = ((com.google.protobuf.E) abstractC0388a2).c(null);
            Logger logger = AbstractC0422s.f6578d;
            if (iC2 > 4096) {
                iC2 = 4096;
            }
            com.google.protobuf.r rVar = new com.google.protobuf.r(outputStream, iC2);
            abstractC0388a2.e(rVar);
            if (rVar.h > 0) {
                rVar.U0();
            }
            aVar.f1867a = null;
            return iC;
        }
        ByteArrayInputStream byteArrayInputStream = aVar.f1869c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        com.google.protobuf.v vVar = G3.c.f1874a;
        S0.f.l(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j5 = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i5 = (int) j5;
                aVar.f1869c = null;
                return i5;
            }
            outputStream.write(bArr, 0, i);
            j5 += i;
        }
    }

    @Override // B3.InterfaceC0047h0
    public final InterfaceC0047h0 a(InterfaceC1085i interfaceC1085i) {
        this.f882d = interfaceC1085i;
        return this;
    }

    @Override // B3.InterfaceC0047h0
    public final void b(int i) {
        S0.f.q("max size already set", this.f880b == -1);
        this.f880b = i;
    }

    @Override // B3.InterfaceC0047h0
    public final boolean c() {
        return this.i;
    }

    @Override // B3.InterfaceC0047h0
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        C3.t tVar = this.f881c;
        if (tVar != null && tVar.f1250c == 0) {
            this.f881c = null;
        }
        e(true, true);
    }

    @Override // B3.InterfaceC0047h0
    public final void d(G3.a aVar) {
        if (this.i) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f886j++;
        int i = this.f887k + 1;
        this.f887k = i;
        this.f888l = 0L;
        m2 m2Var = this.h;
        for (AbstractC1083g abstractC1083g : m2Var.f910a) {
            abstractC1083g.i(i);
        }
        boolean z4 = this.f882d != C1084h.f11313b;
        try {
            int iAvailable = aVar.available();
            int iJ = (iAvailable == 0 || !z4) ? j(aVar, iAvailable) : g(aVar);
            if (iAvailable != -1 && iJ != iAvailable) {
                throw new z3.m0(z3.k0.f11354m.g(B.a.h("Message length inaccurate ", iJ, iAvailable, " != ")));
            }
            long j5 = iJ;
            AbstractC1083g[] abstractC1083gArr = m2Var.f910a;
            for (AbstractC1083g abstractC1083g2 : abstractC1083gArr) {
                abstractC1083g2.k(j5);
            }
            long j6 = this.f888l;
            for (AbstractC1083g abstractC1083g3 : abstractC1083gArr) {
                abstractC1083g3.l(j6);
            }
            int i5 = this.f887k;
            long j7 = this.f888l;
            for (AbstractC1083g abstractC1083g4 : m2Var.f910a) {
                abstractC1083g4.j(i5, j7, j5);
            }
        } catch (IOException e5) {
            throw new z3.m0(z3.k0.f11354m.g("Failed to frame message").f(e5));
        } catch (z3.m0 e6) {
            throw e6;
        } catch (RuntimeException e7) {
            throw new z3.m0(z3.k0.f11354m.g("Failed to frame message").f(e7));
        }
    }

    public final void e(boolean z4, boolean z5) {
        C3.t tVar = this.f881c;
        this.f881c = null;
        this.f879a.v(tVar, z4, z5, this.f886j);
        this.f886j = 0;
    }

    public final void f(C0054j1 c0054j1, boolean z4) {
        ArrayList arrayList = c0054j1.f852a;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C3.t) it.next()).f1250c;
        }
        int i5 = this.f880b;
        if (i5 >= 0 && i > i5) {
            z3.k0 k0Var = z3.k0.f11352k;
            Locale locale = Locale.US;
            throw new z3.m0(k0Var.g("message too large " + i + " > " + i5));
        }
        ByteBuffer byteBuffer = this.f884f;
        byteBuffer.clear();
        byteBuffer.put(z4 ? (byte) 1 : (byte) 0).putInt(i);
        this.f885g.getClass();
        C3.t tVarA = G2.e.a(5);
        tVarA.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i == 0) {
            this.f881c = tVarA;
            return;
        }
        int i6 = this.f886j - 1;
        AbstractC0034d abstractC0034d = this.f879a;
        abstractC0034d.v(tVarA, false, false, i6);
        this.f886j = 1;
        for (int i7 = 0; i7 < arrayList.size() - 1; i7++) {
            abstractC0034d.v((C3.t) arrayList.get(i7), false, false, 0);
        }
        this.f881c = (C3.t) arrayList.get(arrayList.size() - 1);
        this.f888l = i;
    }

    @Override // B3.InterfaceC0047h0
    public final void flush() {
        C3.t tVar = this.f881c;
        if (tVar == null || tVar.f1250c <= 0) {
            return;
        }
        e(false, true);
    }

    public final int g(G3.a aVar) throws IOException {
        C0054j1 c0054j1 = new C0054j1(this);
        OutputStream outputStreamE = this.f882d.e(c0054j1);
        try {
            int i = i(aVar, outputStreamE);
            outputStreamE.close();
            int i5 = this.f880b;
            if (i5 < 0 || i <= i5) {
                f(c0054j1, true);
                return i;
            }
            z3.k0 k0Var = z3.k0.f11352k;
            Locale locale = Locale.US;
            throw new z3.m0(k0Var.g("message too large " + i + " > " + i5));
        } catch (Throwable th) {
            outputStreamE.close();
            throw th;
        }
    }

    public final void h(byte[] bArr, int i, int i5) {
        while (i5 > 0) {
            C3.t tVar = this.f881c;
            if (tVar != null && tVar.f1249b == 0) {
                e(false, false);
            }
            if (this.f881c == null) {
                this.f885g.getClass();
                this.f881c = G2.e.a(i5);
            }
            int iMin = Math.min(i5, this.f881c.f1249b);
            this.f881c.a(bArr, i, iMin);
            i += iMin;
            i5 -= iMin;
        }
    }

    public final int j(G3.a aVar, int i) throws IOException {
        if (i == -1) {
            C0054j1 c0054j1 = new C0054j1(this);
            int i5 = i(aVar, c0054j1);
            f(c0054j1, false);
            return i5;
        }
        this.f888l = i;
        int i6 = this.f880b;
        if (i6 >= 0 && i > i6) {
            z3.k0 k0Var = z3.k0.f11352k;
            Locale locale = Locale.US;
            throw new z3.m0(k0Var.g("message too large " + i + " > " + i6));
        }
        ByteBuffer byteBuffer = this.f884f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i);
        if (this.f881c == null) {
            int iPosition = byteBuffer.position() + i;
            this.f885g.getClass();
            this.f881c = G2.e.a(iPosition);
        }
        h(byteBuffer.array(), 0, byteBuffer.position());
        return i(aVar, this.f883e);
    }
}
