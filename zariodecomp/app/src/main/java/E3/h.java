package E3;

import A2.G;
import B3.A0;
import B3.C0070p0;
import B3.EnumC0053j0;
import B3.EnumC0094y;
import B3.F0;
import B3.RunnableC0067o0;
import B3.RunnableC0095y0;
import C3.m;
import C3.v;
import C3.x;
import android.content.res.Resources;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import q4.i;
import z3.C1078b;
import z3.a0;
import z3.j0;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\h.smali */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final i f1565a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1566b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1567c;

    public h(i iVar) {
        this.f1565a = iVar;
        f fVar = new f(iVar);
        this.f1566b = fVar;
        this.f1567c = new c(fVar);
    }

    public final boolean a(C3.l lVar) throws Resources.NotFoundException, IOException {
        C0070p0 c0070p0;
        a aVar;
        v vVar;
        try {
            this.f1565a.l(9L);
            int iA = j.a(this.f1565a);
            if (iA < 0 || iA > 16384) {
                j.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                throw null;
            }
            byte bA = (byte) (this.f1565a.a() & 255);
            byte bA2 = (byte) (this.f1565a.a() & 255);
            int iK = this.f1565a.k() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            Logger logger = j.f1568a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, iK, iA, bA, bA2));
            }
            switch (bA) {
                case 0:
                    e(lVar, iA, bA2, iK);
                    return true;
                case 1:
                    l(lVar, iA, bA2, iK);
                    return true;
                case 2:
                    if (iA != 5) {
                        j.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                        throw null;
                    }
                    if (iK == 0) {
                        j.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    i iVar = this.f1565a;
                    iVar.k();
                    iVar.a();
                    lVar.getClass();
                    return true;
                case 3:
                    n(lVar, iA, iK);
                    return true;
                case 4:
                    o(lVar, iA, bA2, iK);
                    return true;
                case 5:
                    m(lVar, iA, bA2, iK);
                    return true;
                case 6:
                    if (iA != 8) {
                        j.c("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (iK != 0) {
                        j.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int iK2 = this.f1565a.k();
                    int iK3 = this.f1565a.k();
                    i = (bA2 & 1) != 0 ? 1 : 0;
                    long j5 = (iK2 << 32) | (iK3 & 4294967295L);
                    lVar.f1186a.i(1, j5);
                    if (i == 0) {
                        synchronized (lVar.f1189d.f1214k) {
                            lVar.f1189d.i.k(iK2, iK3, true);
                        }
                    } else {
                        synchronized (lVar.f1189d.f1214k) {
                            try {
                                m mVar = lVar.f1189d;
                                c0070p0 = mVar.f1227x;
                                if (c0070p0 != null) {
                                    long j6 = c0070p0.f935a;
                                    if (j6 == j5) {
                                        mVar.f1227x = null;
                                    } else {
                                        Logger logger2 = m.f1191Q;
                                        Level level = Level.WARNING;
                                        Locale locale = Locale.US;
                                        logger2.log(level, "Received unexpected ping ack. Expecting " + j6 + ", got " + j5);
                                    }
                                } else {
                                    m.f1191Q.warning("Received unexpected ping ack. No ping outstanding");
                                }
                                c0070p0 = null;
                            } finally {
                            }
                        }
                        if (c0070p0 != null) {
                            synchronized (c0070p0) {
                                try {
                                    if (!c0070p0.f938d) {
                                        c0070p0.f938d = true;
                                        long jA = c0070p0.f936b.a(TimeUnit.NANOSECONDS);
                                        c0070p0.f940f = jA;
                                        LinkedHashMap linkedHashMap = c0070p0.f937c;
                                        c0070p0.f937c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new RunnableC0067o0((F0) entry.getKey(), jA));
                                            } catch (Throwable th) {
                                                C0070p0.f934g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                    return true;
                case 7:
                    if (iA < 8) {
                        j.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (iK != 0) {
                        j.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    i iVar2 = this.f1565a;
                    int iK4 = iVar2.k();
                    int iK5 = iVar2.k();
                    int i = iA - 8;
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i < length) {
                            aVar = aVarArrValues[i];
                            if (aVar.f1533a != iK5) {
                                i++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        j.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iK5));
                        throw null;
                    }
                    q4.f fVarE = q4.f.f9516d;
                    if (i > 0) {
                        fVarE = iVar2.e(i);
                    }
                    lVar.f1186a.h(1, iK4, aVar, fVarE);
                    a aVar2 = a.ENHANCE_YOUR_CALM;
                    m mVar2 = lVar.f1189d;
                    if (aVar == aVar2) {
                        String strK = fVarE.k();
                        m.f1191Q.log(Level.WARNING, lVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strK);
                        if ("too_many_pings".equals(strK)) {
                            mVar2.f1200J.run();
                        }
                    }
                    long j7 = aVar.f1533a;
                    EnumC0053j0[] enumC0053j0Arr = EnumC0053j0.f848d;
                    EnumC0053j0 enumC0053j0 = (j7 >= ((long) enumC0053j0Arr.length) || j7 < 0) ? null : enumC0053j0Arr[(int) j7];
                    k0 k0VarA = (enumC0053j0 == null ? k0.c(EnumC0053j0.f847c.f851b.f11358a.f11339a).g("Unrecognized HTTP/2 error code: " + j7) : enumC0053j0.f851b).a("Received Goaway");
                    if (fVarE.b() > 0) {
                        k0VarA = k0VarA.a(fVarE.k());
                    }
                    Map map = m.f1190P;
                    mVar2.s(iK4, null, k0VarA);
                    return true;
                case 8:
                    if (iA != 4) {
                        j.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    long jK = this.f1565a.k() & 2147483647L;
                    if (jK == 0) {
                        j.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    lVar.f1186a.m(1, iK, jK);
                    if (jK != 0) {
                        synchronized (lVar.f1189d.f1214k) {
                            try {
                                if (iK == 0) {
                                    lVar.f1189d.f1213j.d(null, (int) jK);
                                } else {
                                    C3.j jVar = (C3.j) lVar.f1189d.f1217n.get(Integer.valueOf(iK));
                                    if (jVar != null) {
                                        x xVar = lVar.f1189d.f1213j;
                                        C3.i iVar3 = jVar.f1182n;
                                        synchronized (iVar3.f1173w) {
                                            vVar = iVar3.f1169J;
                                        }
                                        xVar.d(vVar, (int) jK);
                                    } else if (!lVar.f1189d.n(iK)) {
                                        i = 1;
                                    }
                                    if (i != 0) {
                                        m.g(lVar.f1189d, "Received window_update for unknown stream: " + iK);
                                    }
                                }
                            } finally {
                            }
                        }
                    } else if (iK == 0) {
                        m.g(lVar.f1189d, "Received 0 flow control window increment.");
                    } else {
                        lVar.f1189d.j(iK, k0.f11354m.g("Received 0 flow control window increment."), EnumC0094y.f1022a, false, a.PROTOCOL_ERROR, null);
                    }
                    return true;
                default:
                    this.f1565a.m(iA);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1565a.close();
    }

    public final void e(C3.l lVar, int i, byte b5, int i5) throws IOException {
        C3.j jVar;
        boolean z4 = (b5 & 1) != 0;
        if ((b5 & 32) != 0) {
            j.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short sA = (b5 & 8) != 0 ? (short) (this.f1565a.a() & 255) : (short) 0;
        int iB = j.b(i, b5, sA);
        i iVar = this.f1565a;
        lVar.f1186a.g(1, i5, iVar.f9525b, iB, z4);
        m mVar = lVar.f1189d;
        synchronized (mVar.f1214k) {
            jVar = (C3.j) mVar.f1217n.get(Integer.valueOf(i5));
        }
        if (jVar != null) {
            long j5 = iB;
            iVar.l(j5);
            q4.d dVar = new q4.d();
            dVar.b(iVar.f9525b, j5);
            J3.c cVar = jVar.f1182n.f1168I;
            J3.b.f2098a.getClass();
            synchronized (lVar.f1189d.f1214k) {
                jVar.f1182n.n(i - iB, dVar, z4);
            }
        } else {
            if (!lVar.f1189d.n(i5)) {
                m.g(lVar.f1189d, "Received data for unknown stream: " + i5);
                this.f1565a.m(sA);
            }
            synchronized (lVar.f1189d.f1214k) {
                lVar.f1189d.i.l(i5, a.STREAM_CLOSED);
            }
            iVar.m(iB);
        }
        m mVar2 = lVar.f1189d;
        int i6 = mVar2.f1222s + i;
        mVar2.f1222s = i6;
        if (i6 >= mVar2.f1211f * 0.5f) {
            synchronized (mVar2.f1214k) {
                lVar.f1189d.i.m(0, r13.f1222s);
            }
            lVar.f1189d.f1222s = 0;
        }
        this.f1565a.m(sA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        throw new java.io.IOException(B.a.g(r6, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList k(int r5, short r6, byte r7, int r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.h.k(int, short, byte, int):java.util.ArrayList");
    }

    public final void l(C3.l lVar, int i, byte b5, int i5) throws IOException {
        k0 k0VarG = null;
        boolean z4 = false;
        if (i5 == 0) {
            j.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z5 = (b5 & 1) != 0;
        short sA = (b5 & 8) != 0 ? (short) (this.f1565a.a() & 255) : (short) 0;
        if ((b5 & 32) != 0) {
            i iVar = this.f1565a;
            iVar.k();
            iVar.a();
            lVar.getClass();
            i -= 5;
        }
        ArrayList arrayListK = k(j.b(i, b5, sA), sA, b5, i5);
        S0.c cVar = lVar.f1186a;
        if (cVar.f()) {
            ((Logger) cVar.f2847b).log((Level) cVar.f2848c, "INBOUND HEADERS: streamId=" + i5 + " headers=" + arrayListK + " endStream=" + z5);
        }
        if (lVar.f1189d.f1201K != Integer.MAX_VALUE) {
            long jB = 0;
            for (int i6 = 0; i6 < arrayListK.size(); i6++) {
                b bVar = (b) arrayListK.get(i6);
                jB += bVar.f1539b.b() + bVar.f1538a.b() + 32;
            }
            int iMin = (int) Math.min(jB, 2147483647L);
            int i7 = lVar.f1189d.f1201K;
            if (iMin > i7) {
                k0 k0Var = k0.f11352k;
                Locale locale = Locale.US;
                k0VarG = k0Var.g("Response " + (z5 ? "trailer" : "header") + " metadata larger than " + i7 + ": " + iMin);
            }
        }
        synchronized (lVar.f1189d.f1214k) {
            try {
                C3.j jVar = (C3.j) lVar.f1189d.f1217n.get(Integer.valueOf(i5));
                if (jVar == null) {
                    if (lVar.f1189d.n(i5)) {
                        lVar.f1189d.i.l(i5, a.STREAM_CLOSED);
                    } else {
                        z4 = true;
                    }
                } else if (k0VarG == null) {
                    J3.c cVar2 = jVar.f1182n.f1168I;
                    J3.b.f2098a.getClass();
                    jVar.f1182n.o(arrayListK, z5);
                } else {
                    if (!z5) {
                        lVar.f1189d.i.l(i5, a.CANCEL);
                    }
                    jVar.f1182n.g(k0VarG, false, new a0());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            m.g(lVar.f1189d, "Received header for unknown stream: " + i5);
        }
    }

    public final void m(C3.l lVar, int i, byte b5, int i5) throws IOException {
        if (i5 == 0) {
            j.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short sA = (b5 & 8) != 0 ? (short) (this.f1565a.a() & 255) : (short) 0;
        int iK = this.f1565a.k() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayListK = k(j.b(i - 4, b5, sA), sA, b5, i5);
        S0.c cVar = lVar.f1186a;
        if (cVar.f()) {
            ((Logger) cVar.f2847b).log((Level) cVar.f2848c, "INBOUND PUSH_PROMISE: streamId=" + i5 + " promisedStreamId=" + iK + " headers=" + arrayListK);
        }
        synchronized (lVar.f1189d.f1214k) {
            lVar.f1189d.i.l(i5, a.PROTOCOL_ERROR);
        }
    }

    public final void n(C3.l lVar, int i, int i5) throws IOException {
        a aVar;
        if (i != 4) {
            j.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i5 == 0) {
            j.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int iK = this.f1565a.k();
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i6];
            if (aVar.f1533a == iK) {
                break;
            } else {
                i6++;
            }
        }
        if (aVar == null) {
            j.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iK));
            throw null;
        }
        lVar.f1186a.j(1, i5, aVar);
        k0 k0VarA = m.w(aVar).a("Rst Stream");
        j0 j0Var = k0VarA.f11358a;
        boolean z4 = j0Var == j0.CANCELLED || j0Var == j0.DEADLINE_EXCEEDED;
        synchronized (lVar.f1189d.f1214k) {
            try {
                C3.j jVar = (C3.j) lVar.f1189d.f1217n.get(Integer.valueOf(i5));
                if (jVar != null) {
                    J3.c cVar = jVar.f1182n.f1168I;
                    J3.b.f2098a.getClass();
                    lVar.f1189d.j(i5, k0VarA, aVar == a.REFUSED_STREAM ? EnumC0094y.f1023b : EnumC0094y.f1022a, z4, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void o(C3.l lVar, int i, byte b5, int i5) throws IOException {
        boolean z4;
        char c5;
        int i6;
        short sL;
        if (i5 != 0) {
            j.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b5 & 1) != 0) {
            if (i == 0) {
                lVar.getClass();
                return;
            } else {
                j.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i % 6 != 0) {
            j.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        E2.j jVar = new E2.j(1);
        for (int i7 = 0; i7 < i; i7 += 6) {
            i iVar = this.f1565a;
            iVar.l(2L);
            q4.d dVar = iVar.f9525b;
            if (dVar.f9515b < 2) {
                throw new EOFException();
            }
            q4.j jVar2 = dVar.f9514a;
            kotlin.jvm.internal.i.b(jVar2);
            int i8 = jVar2.f9528b;
            int i9 = jVar2.f9529c;
            if (i9 - i8 < 2) {
                sL = (short) (((dVar.l() & 255) << 8) | (dVar.l() & 255));
            } else {
                int i10 = i8 + 1;
                byte[] bArr = jVar2.f9527a;
                int i11 = (bArr[i8] & 255) << 8;
                int i12 = i8 + 2;
                int i13 = i11 | (bArr[i10] & 255);
                dVar.f9515b -= 2;
                if (i12 == i9) {
                    dVar.f9514a = jVar2.a();
                    q4.k.a(jVar2);
                } else {
                    jVar2.f9528b = i12;
                }
                sL = (short) i13;
            }
            int iK = this.f1565a.k();
            switch (sL) {
                case 1:
                case 6:
                    jVar.c(sL, iK);
                case 2:
                    if (iK != 0 && iK != 1) {
                        j.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    jVar.c(sL, iK);
                    break;
                case 3:
                    sL = 4;
                    jVar.c(sL, iK);
                case 4:
                    if (iK < 0) {
                        j.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    sL = 7;
                    jVar.c(sL, iK);
                case 5:
                    if (iK < 16384 || iK > 16777215) {
                        j.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iK));
                        throw null;
                    }
                    jVar.c(sL, iK);
                    break;
                default:
            }
        }
        lVar.f1186a.l(1, jVar);
        synchronized (lVar.f1189d.f1214k) {
            try {
                if (jVar.b(4)) {
                    lVar.f1189d.f1194C = ((int[]) jVar.f1460c)[4];
                }
                if (jVar.b(7)) {
                    int i14 = ((int[]) jVar.f1460c)[7];
                    x xVar = lVar.f1189d.f1213j;
                    if (i14 < 0) {
                        xVar.getClass();
                        throw new IllegalArgumentException(B.a.g(i14, "Invalid initial window size: "));
                    }
                    int i15 = i14 - xVar.f1259a;
                    xVar.f1259a = i14;
                    for (v vVar : ((m) xVar.f1260b).k()) {
                        vVar.a(i15);
                    }
                    z4 = i15 > 0;
                } else {
                    z4 = false;
                }
                if (lVar.f1188c) {
                    m mVar = lVar.f1189d;
                    G g3 = mVar.h;
                    C1078b c1078b = mVar.f1224u;
                    Iterator it = ((A0) g3.f88c).f356j.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    mVar.f1224u = c1078b;
                    G g5 = lVar.f1189d.h;
                    A0 a02 = (A0) g5.f88c;
                    a02.i.l(2, "READY");
                    a02.f357k.execute(new RunnableC0095y0(g5, 0));
                    lVar.f1188c = false;
                }
                C3.d dVar2 = lVar.f1189d.i;
                S0.c cVar = dVar2.f1127c;
                if (cVar.f()) {
                    ((Logger) cVar.f2847b).log((Level) cVar.f2848c, "OUTBOUND".concat(" SETTINGS: ack=true"));
                }
                try {
                    dVar2.f1126b.a(jVar);
                } catch (IOException e5) {
                    dVar2.f1125a.p(e5);
                }
                if (z4) {
                    lVar.f1189d.f1213j.e();
                }
                lVar.f1189d.t();
            } catch (Throwable th) {
                throw th;
            }
        }
        int i16 = jVar.f1459b;
        if ((i16 & 2) != 0) {
            c5 = 1;
            i6 = ((int[]) jVar.f1460c)[1];
        } else {
            c5 = 1;
            i6 = -1;
        }
        if (i6 >= 0) {
            c cVar2 = this.f1567c;
            int i17 = (i16 & 2) != 0 ? ((int[]) jVar.f1460c)[c5] : -1;
            cVar2.f1543c = i17;
            cVar2.f1544d = i17;
            int i18 = cVar2.h;
            if (i17 < i18) {
                if (i17 != 0) {
                    cVar2.a(i18 - i17);
                    return;
                }
                Arrays.fill(cVar2.f1545e, (Object) null);
                cVar2.f1546f = cVar2.f1545e.length - 1;
                cVar2.f1547g = 0;
                cVar2.h = 0;
            }
        }
    }
}
