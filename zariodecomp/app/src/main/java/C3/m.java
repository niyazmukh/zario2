package C3;

import A2.C0020u;
import A2.G;
import B3.AbstractC0056k0;
import B3.C0070p0;
import B3.C0075r0;
import B3.E;
import B3.EnumC0094y;
import B3.F0;
import B3.G0;
import B3.InterfaceC0042f1;
import B3.InterfaceC0091x;
import B3.J;
import B3.N;
import B3.RunnableC0067o0;
import B3.f2;
import B3.i2;
import B3.m2;
import B3.o2;
import B3.q2;
import a.AbstractC0183a;
import com.google.android.gms.common.api.internal.F;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import z3.AbstractC1083g;
import z3.C1075D;
import z3.C1077a;
import z3.C1078b;
import z3.C1079c;
import z3.C1099x;
import z3.a0;
import z3.b0;
import z3.k0;
import z3.l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\m.smali */
public final class m implements E {

    /* renamed from: P, reason: collision with root package name */
    public static final Map f1190P;

    /* renamed from: Q, reason: collision with root package name */
    public static final Logger f1191Q;

    /* renamed from: A, reason: collision with root package name */
    public final SocketFactory f1192A;

    /* renamed from: B, reason: collision with root package name */
    public final SSLSocketFactory f1193B;

    /* renamed from: C, reason: collision with root package name */
    public int f1194C;

    /* renamed from: D, reason: collision with root package name */
    public final LinkedList f1195D;

    /* renamed from: E, reason: collision with root package name */
    public final D3.c f1196E;

    /* renamed from: F, reason: collision with root package name */
    public G0 f1197F;
    public boolean G;

    /* renamed from: H, reason: collision with root package name */
    public long f1198H;

    /* renamed from: I, reason: collision with root package name */
    public long f1199I;

    /* renamed from: J, reason: collision with root package name */
    public final N f1200J;

    /* renamed from: K, reason: collision with root package name */
    public final int f1201K;

    /* renamed from: L, reason: collision with root package name */
    public final q2 f1202L;

    /* renamed from: M, reason: collision with root package name */
    public final C0075r0 f1203M;

    /* renamed from: N, reason: collision with root package name */
    public final C1099x f1204N;

    /* renamed from: O, reason: collision with root package name */
    public final int f1205O;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f1206a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1207b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1208c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f1209d;

    /* renamed from: e, reason: collision with root package name */
    public final o2 f1210e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1211f;

    /* renamed from: g, reason: collision with root package name */
    public final E3.j f1212g;
    public G h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public x f1213j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1214k;

    /* renamed from: l, reason: collision with root package name */
    public final C1075D f1215l;

    /* renamed from: m, reason: collision with root package name */
    public int f1216m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f1217n;

    /* renamed from: o, reason: collision with root package name */
    public final Executor f1218o;

    /* renamed from: p, reason: collision with root package name */
    public final f2 f1219p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f1220q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1221r;

    /* renamed from: s, reason: collision with root package name */
    public int f1222s;

    /* renamed from: t, reason: collision with root package name */
    public l f1223t;

    /* renamed from: u, reason: collision with root package name */
    public C1078b f1224u;

    /* renamed from: v, reason: collision with root package name */
    public k0 f1225v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1226w;

    /* renamed from: x, reason: collision with root package name */
    public C0070p0 f1227x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1228y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1229z;

    static {
        EnumMap enumMap = new EnumMap(E3.a.class);
        E3.a aVar = E3.a.NO_ERROR;
        k0 k0Var = k0.f11354m;
        enumMap.put((EnumMap) aVar, (E3.a) k0Var.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) E3.a.PROTOCOL_ERROR, (E3.a) k0Var.g("Protocol error"));
        enumMap.put((EnumMap) E3.a.INTERNAL_ERROR, (E3.a) k0Var.g("Internal error"));
        enumMap.put((EnumMap) E3.a.FLOW_CONTROL_ERROR, (E3.a) k0Var.g("Flow control error"));
        enumMap.put((EnumMap) E3.a.STREAM_CLOSED, (E3.a) k0Var.g("Stream closed"));
        enumMap.put((EnumMap) E3.a.FRAME_TOO_LARGE, (E3.a) k0Var.g("Frame too large"));
        enumMap.put((EnumMap) E3.a.REFUSED_STREAM, (E3.a) k0.f11355n.g("Refused stream"));
        enumMap.put((EnumMap) E3.a.CANCEL, (E3.a) k0.f11349f.g("Cancelled"));
        enumMap.put((EnumMap) E3.a.COMPRESSION_ERROR, (E3.a) k0Var.g("Compression error"));
        enumMap.put((EnumMap) E3.a.CONNECT_ERROR, (E3.a) k0Var.g("Connect error"));
        enumMap.put((EnumMap) E3.a.ENHANCE_YOUR_CALM, (E3.a) k0.f11352k.g("Enhance your calm"));
        enumMap.put((EnumMap) E3.a.INADEQUATE_SECURITY, (E3.a) k0.i.g("Inadequate security"));
        f1190P = Collections.unmodifiableMap(enumMap);
        f1191Q = Logger.getLogger(m.class.getName());
    }

    public m(f fVar, InetSocketAddress inetSocketAddress, String str, C1078b c1078b, C1099x c1099x, N n5) {
        o2 o2Var = AbstractC0056k0.f873r;
        E3.j jVar = new E3.j();
        this.f1209d = new Random();
        Object obj = new Object();
        this.f1214k = obj;
        this.f1217n = new HashMap();
        this.f1194C = 0;
        this.f1195D = new LinkedList();
        this.f1203M = new C0075r0(this, 2);
        this.f1205O = 30000;
        S0.f.l(inetSocketAddress, "address");
        this.f1206a = inetSocketAddress;
        this.f1207b = str;
        this.f1221r = fVar.f1141l;
        this.f1211f = fVar.f1145p;
        Executor executor = fVar.f1135b;
        S0.f.l(executor, "executor");
        this.f1218o = executor;
        this.f1219p = new f2(fVar.f1135b);
        ScheduledExecutorService scheduledExecutorService = fVar.f1137d;
        S0.f.l(scheduledExecutorService, "scheduledExecutorService");
        this.f1220q = scheduledExecutorService;
        this.f1216m = 3;
        this.f1192A = SocketFactory.getDefault();
        this.f1193B = fVar.f1139f;
        D3.c cVar = fVar.f1140k;
        S0.f.l(cVar, "connectionSpec");
        this.f1196E = cVar;
        S0.f.l(o2Var, "stopwatchFactory");
        this.f1210e = o2Var;
        this.f1212g = jVar;
        this.f1208c = "grpc-java-okhttp/1.62.2";
        this.f1204N = c1099x;
        this.f1200J = n5;
        this.f1201K = fVar.f1146q;
        fVar.f1138e.getClass();
        this.f1202L = new q2();
        this.f1215l = C1075D.a(m.class, inetSocketAddress.toString());
        C1078b c1078b2 = C1078b.f11279b;
        C1077a c1077a = i2.f845b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c1077a, c1078b);
        for (Map.Entry entry : c1078b2.f11280a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C1077a) entry.getKey(), entry.getValue());
            }
        }
        this.f1224u = new C1078b(identityHashMap);
        synchronized (obj) {
        }
    }

    public static void g(m mVar, String str) {
        E3.a aVar = E3.a.PROTOCOL_ERROR;
        mVar.getClass();
        mVar.s(0, aVar, w(aVar).a(str));
    }

    public static Socket h(m mVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws l0, NumberFormatException, IOException {
        mVar.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = mVar.f1192A;
            Socket socketCreateSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(mVar.f1205O);
                q4.c cVarA0 = S0.f.a0(socketCreateSocket);
                q4.h hVar = new q4.h(S0.f.Y(socketCreateSocket));
                S0.c cVarI = mVar.i(inetSocketAddress, str, str2);
                g1.i iVar = (g1.i) cVarI.f2848c;
                F3.a aVar = (F3.a) cVarI.f2847b;
                Locale locale = Locale.US;
                hVar.m("CONNECT " + aVar.f1737a + ":" + aVar.f1738b + " HTTP/1.1");
                hVar.m("\r\n");
                int length = ((String[]) iVar.f7594b).length / 2;
                for (int i = 0; i < length; i++) {
                    int i5 = i * 2;
                    String[] strArr = (String[]) iVar.f7594b;
                    hVar.m((i5 < 0 || i5 >= strArr.length) ? null : strArr[i5]);
                    hVar.m(": ");
                    int i6 = i5 + 1;
                    hVar.m((i6 < 0 || i6 >= strArr.length) ? null : strArr[i6]);
                    hVar.m("\r\n");
                }
                hVar.m("\r\n");
                hVar.flush();
                C.d dVarF = C.d.f(q(cVarA0));
                while (!q(cVarA0).equals("")) {
                }
                int i7 = dVarF.f1046b;
                if (i7 >= 200 && i7 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                q4.d dVar = new q4.d();
                try {
                    socketCreateSocket.shutdownOutput();
                    cVarA0.h(dVar, 1024L);
                } catch (IOException e5) {
                    dVar.w("Unable to read body: " + e5.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new l0(k0.f11355n.g("Response returned from proxy was not successful (expected 2xx, got " + i7 + " " + ((String) dVarF.f1048d) + "). Response body:\n" + dVar.o(dVar.f9515b, e4.a.a)));
            } catch (IOException e6) {
                e = e6;
                socket = socketCreateSocket;
                if (socket != null) {
                    AbstractC0056k0.b(socket);
                }
                throw new l0(k0.f11355n.g("Failed trying to connect with proxy").f(e));
            }
        } catch (IOException e7) {
            e = e7;
        }
    }

    public static String q(q4.c cVar) throws EOFException {
        q4.j jVar;
        long j5;
        long j6;
        long j7;
        q4.d dVar = new q4.d();
        while (cVar.h(dVar, 1L) != -1) {
            if (dVar.e(dVar.f9515b - 1) == 10) {
                long j8 = dVar.f9515b;
                long j9 = Long.MAX_VALUE > j8 ? j8 : Long.MAX_VALUE;
                if (0 == j9 || (jVar = dVar.f9514a) == null) {
                    j6 = -1;
                    j7 = -1;
                } else if (j8 < 0) {
                    while (j8 > 0) {
                        jVar = jVar.f9533g;
                        kotlin.jvm.internal.i.b(jVar);
                        j8 -= jVar.f9529c - jVar.f9528b;
                    }
                    long j10 = 0;
                    loop4: while (j8 < j9) {
                        int iMin = (int) Math.min(jVar.f9529c, (jVar.f9528b + j9) - j8);
                        for (int i = (int) ((jVar.f9528b + j10) - j8); i < iMin; i++) {
                            if (jVar.f9527a[i] == 10) {
                                j5 = i - jVar.f9528b;
                                j7 = j5 + j8;
                                j6 = -1;
                                break loop4;
                            }
                        }
                        j10 = j8 + (jVar.f9529c - jVar.f9528b);
                        jVar = jVar.f9532f;
                        kotlin.jvm.internal.i.b(jVar);
                        j8 = j10;
                    }
                    j6 = -1;
                    j7 = -1;
                } else {
                    j8 = 0;
                    while (true) {
                        long j11 = (jVar.f9529c - jVar.f9528b) + j8;
                        if (j11 > 0) {
                            break;
                        }
                        jVar = jVar.f9532f;
                        kotlin.jvm.internal.i.b(jVar);
                        j8 = j11;
                    }
                    long j12 = 0;
                    loop7: while (j8 < j9) {
                        int iMin2 = (int) Math.min(jVar.f9529c, (jVar.f9528b + j9) - j8);
                        for (int i5 = (int) ((jVar.f9528b + j12) - j8); i5 < iMin2; i5++) {
                            if (jVar.f9527a[i5] == 10) {
                                j5 = i5 - jVar.f9528b;
                                j7 = j5 + j8;
                                j6 = -1;
                                break loop4;
                            }
                        }
                        j12 = (jVar.f9529c - jVar.f9528b) + j8;
                        jVar = jVar.f9532f;
                        kotlin.jvm.internal.i.b(jVar);
                        j8 = j12;
                    }
                    j6 = -1;
                    j7 = -1;
                }
                if (j7 != j6) {
                    return r4.a.a(dVar, j7);
                }
                if (Long.MAX_VALUE < dVar.f9515b && dVar.e(9223372036854775806L) == 13 && dVar.e(Long.MAX_VALUE) == 10) {
                    return r4.a.a(dVar, Long.MAX_VALUE);
                }
                q4.d dVar2 = new q4.d();
                long jMin = Math.min(32, dVar.f9515b);
                long j13 = 0;
                r1.d.n(dVar.f9515b, 0L, jMin);
                if (jMin != 0) {
                    dVar2.f9515b += jMin;
                    q4.j jVar2 = dVar.f9514a;
                    while (true) {
                        kotlin.jvm.internal.i.b(jVar2);
                        long j14 = jVar2.f9529c - jVar2.f9528b;
                        if (j13 < j14) {
                            break;
                        }
                        j13 -= j14;
                        jVar2 = jVar2.f9532f;
                    }
                    while (jMin > 0) {
                        kotlin.jvm.internal.i.b(jVar2);
                        q4.j jVarC = jVar2.c();
                        int i6 = jVarC.f9528b + ((int) j13);
                        jVarC.f9528b = i6;
                        jVarC.f9529c = Math.min(i6 + ((int) jMin), jVarC.f9529c);
                        q4.j jVar3 = dVar2.f9514a;
                        if (jVar3 == null) {
                            jVarC.f9533g = jVarC;
                            jVarC.f9532f = jVarC;
                            dVar2.f9514a = jVarC;
                        } else {
                            q4.j jVar4 = jVar3.f9533g;
                            kotlin.jvm.internal.i.b(jVar4);
                            jVar4.b(jVarC);
                        }
                        jMin -= jVarC.f9529c - jVarC.f9528b;
                        jVar2 = jVar2.f9532f;
                        j13 = 0;
                    }
                }
                throw new EOFException("\\n not found: limit=" + Math.min(dVar.f9515b, Long.MAX_VALUE) + " content=" + dVar2.n(dVar2.f9515b).c() + (char) 8230);
            }
        }
        throw new EOFException("\\n not found: " + dVar.n(dVar.f9515b).c());
    }

    public static k0 w(E3.a aVar) {
        k0 k0Var = (k0) f1190P.get(aVar);
        if (k0Var != null) {
            return k0Var;
        }
        return k0.f11350g.g("Unknown http2 error code: " + aVar.f1533a);
    }

    @Override // B3.InterfaceC0045g1
    public final Runnable a(InterfaceC0042f1 interfaceC0042f1) {
        this.h = (G) interfaceC0042f1;
        if (this.G) {
            G0 g02 = new G0(new h1.i(this, 2), this.f1220q, this.f1198H, this.f1199I);
            this.f1197F = g02;
            synchronized (g02) {
            }
        }
        c cVar = new c(this.f1219p, this);
        E3.j jVar = this.f1212g;
        q4.h hVar = new q4.h(cVar);
        jVar.getClass();
        b bVar = new b(cVar, new E3.i(hVar));
        synchronized (this.f1214k) {
            d dVar = new d(this, bVar);
            this.i = dVar;
            this.f1213j = new x(this, dVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f1219p.execute(new J(this, countDownLatch, cVar, 4));
        try {
            r();
            countDownLatch.countDown();
            this.f1219p.execute(new N(this, 13));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // B3.InterfaceC0045g1
    public final void b(k0 k0Var) {
        synchronized (this.f1214k) {
            try {
                if (this.f1225v != null) {
                    return;
                }
                this.f1225v = k0Var;
                this.h.m(k0Var);
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z3.InterfaceC1074C
    public final C1075D c() {
        return this.f1215l;
    }

    @Override // B3.InterfaceC0045g1
    public final void d(k0 k0Var) {
        b(k0Var);
        synchronized (this.f1214k) {
            try {
                Iterator it = this.f1217n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((j) entry.getValue()).f1182n.g(k0Var, false, new a0());
                    o((j) entry.getValue());
                }
                for (j jVar : this.f1195D) {
                    jVar.f1182n.f(k0Var, EnumC0094y.f1025d, true, new a0());
                    o(jVar);
                }
                this.f1195D.clear();
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B3.E
    public final C1078b e() {
        return this.f1224u;
    }

    @Override // B3.A
    public final InterfaceC0091x f(F f2, a0 a0Var, C1079c c1079c, AbstractC1083g[] abstractC1083gArr) {
        j jVar;
        S0.f.l(f2, "method");
        S0.f.l(a0Var, "headers");
        C1078b c1078b = this.f1224u;
        m2 m2Var = new m2(abstractC1083gArr);
        for (AbstractC1083g abstractC1083g : abstractC1083gArr) {
            abstractC1083g.n(c1078b, a0Var);
        }
        synchronized (this.f1214k) {
            jVar = new j(f2, a0Var, this.i, this, this.f1213j, this.f1214k, this.f1221r, this.f1211f, this.f1207b, this.f1208c, m2Var, this.f1202L, c1079c);
        }
        return jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0282, code lost:
    
        if ((r11 - r10) != 0) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fd A[EDGE_INSN: B:141:0x02fd->B:199:0x0470 BREAK  A[LOOP:11: B:186:0x044d->B:197:0x046c]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x027d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final S0.c i(java.net.InetSocketAddress r29, java.lang.String r30, java.lang.String r31) throws java.io.EOFException, java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.m.i(java.net.InetSocketAddress, java.lang.String, java.lang.String):S0.c");
    }

    public final void j(int i, k0 k0Var, EnumC0094y enumC0094y, boolean z4, E3.a aVar, a0 a0Var) {
        synchronized (this.f1214k) {
            try {
                j jVar = (j) this.f1217n.remove(Integer.valueOf(i));
                if (jVar != null) {
                    if (aVar != null) {
                        this.i.l(i, E3.a.CANCEL);
                    }
                    if (k0Var != null) {
                        i iVar = jVar.f1182n;
                        if (a0Var == null) {
                            a0Var = new a0();
                        }
                        iVar.f(k0Var, enumC0094y, z4, a0Var);
                    }
                    if (!t()) {
                        v();
                        o(jVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v[] k() {
        v[] vVarArr;
        v vVar;
        synchronized (this.f1214k) {
            vVarArr = new v[this.f1217n.size()];
            Iterator it = this.f1217n.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i5 = i + 1;
                i iVar = ((j) it.next()).f1182n;
                synchronized (iVar.f1173w) {
                    vVar = iVar.f1169J;
                }
                vVarArr[i] = vVar;
                i = i5;
            }
        }
        return vVarArr;
    }

    public final int l() {
        URI uriA = AbstractC0056k0.a(this.f1207b);
        return uriA.getPort() != -1 ? uriA.getPort() : this.f1206a.getPort();
    }

    public final l0 m() {
        synchronized (this.f1214k) {
            try {
                k0 k0Var = this.f1225v;
                if (k0Var != null) {
                    return new l0(k0Var);
                }
                return new l0(k0.f11355n.g("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(int r2) {
        /*
            r1 = this;
            java.lang.Object r0 = r1.f1214k
            monitor-enter(r0)
            int r1 = r1.f1216m     // Catch: java.lang.Throwable -> Lf
            if (r2 >= r1) goto Lc
            r1 = 1
            r2 = r2 & r1
            if (r2 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.m.n(int):boolean");
    }

    public final void o(j jVar) {
        if (this.f1229z && this.f1195D.isEmpty() && this.f1217n.isEmpty()) {
            this.f1229z = false;
            G0 g02 = this.f1197F;
            if (g02 != null) {
                synchronized (g02) {
                    int i = g02.f416d;
                    if (i == 2 || i == 3) {
                        g02.f416d = 1;
                    }
                    if (g02.f416d == 4) {
                        g02.f416d = 5;
                    }
                }
            }
        }
        if (jVar.f783e) {
            this.f1203M.c(jVar, false);
        }
    }

    public final void p(Exception exc) {
        s(0, E3.a.INTERNAL_ERROR, k0.f11355n.f(exc));
    }

    public final void r() {
        synchronized (this.f1214k) {
            try {
                d dVar = this.i;
                dVar.getClass();
                try {
                    dVar.f1126b.e();
                } catch (IOException e5) {
                    dVar.f1125a.p(e5);
                }
                E2.j jVar = new E2.j(1);
                jVar.c(7, this.f1211f);
                d dVar2 = this.i;
                dVar2.f1127c.l(2, jVar);
                try {
                    dVar2.f1126b.n(jVar);
                } catch (IOException e6) {
                    dVar2.f1125a.p(e6);
                }
                if (this.f1211f > 65535) {
                    this.i.m(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(int i, E3.a aVar, k0 k0Var) {
        synchronized (this.f1214k) {
            try {
                if (this.f1225v == null) {
                    this.f1225v = k0Var;
                    this.h.m(k0Var);
                }
                if (aVar != null && !this.f1226w) {
                    this.f1226w = true;
                    this.i.e(aVar, new byte[0]);
                }
                Iterator it = this.f1217n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((j) entry.getValue()).f1182n.f(k0Var, EnumC0094y.f1023b, false, new a0());
                        o((j) entry.getValue());
                    }
                }
                for (j jVar : this.f1195D) {
                    jVar.f1182n.f(k0Var, EnumC0094y.f1025d, true, new a0());
                    o(jVar);
                }
                this.f1195D.clear();
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        boolean z4 = false;
        while (true) {
            LinkedList linkedList = this.f1195D;
            if (linkedList.isEmpty() || this.f1217n.size() >= this.f1194C) {
                break;
            }
            u((j) linkedList.poll());
            z4 = true;
        }
        return z4;
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.b("logId", this.f1215l.f11236c);
        c0020uX.a(this.f1206a, "address");
        return c0020uX.toString();
    }

    public final void u(j jVar) {
        boolean zE;
        S0.f.q("StreamId already assigned", jVar.f1182n.f1170K == -1);
        this.f1217n.put(Integer.valueOf(this.f1216m), jVar);
        if (!this.f1229z) {
            this.f1229z = true;
            G0 g02 = this.f1197F;
            if (g02 != null) {
                g02.b();
            }
        }
        if (jVar.f783e) {
            this.f1203M.c(jVar, true);
        }
        i iVar = jVar.f1182n;
        int i = this.f1216m;
        if (!(iVar.f1170K == -1)) {
            throw new IllegalStateException(AbstractC0183a.U("the stream has been started with id %s", Integer.valueOf(i)));
        }
        iVar.f1170K = i;
        x xVar = iVar.f1166F;
        iVar.f1169J = new v(xVar, i, xVar.f1259a, iVar);
        i iVar2 = iVar.f1171L.f1182n;
        if (iVar2.f759j == null) {
            throw new IllegalStateException();
        }
        synchronized (iVar2.f753b) {
            S0.f.q("Already allocated", !iVar2.f757f);
            iVar2.f757f = true;
        }
        synchronized (iVar2.f753b) {
            zE = iVar2.e();
        }
        if (zE) {
            iVar2.f759j.b();
        }
        q2 q2Var = iVar2.f754c;
        q2Var.getClass();
        ((o2) q2Var.f952b).c();
        if (iVar.f1167H) {
            d dVar = iVar.f1165E;
            boolean z4 = iVar.f1171L.f1185q;
            int i5 = iVar.f1170K;
            ArrayList arrayList = iVar.f1174x;
            dVar.getClass();
            try {
                E3.i iVar3 = dVar.f1126b.f1109a;
                synchronized (iVar3) {
                    if (iVar3.e) {
                        throw new IOException("closed");
                    }
                    iVar3.e(i5, arrayList, z4);
                }
            } catch (IOException e5) {
                dVar.f1125a.p(e5);
            }
            for (AbstractC1083g abstractC1083g : iVar.f1171L.f1180l.f910a) {
                abstractC1083g.h();
            }
            iVar.f1174x = null;
            q4.d dVar2 = iVar.f1175y;
            if (dVar2.f9515b > 0) {
                iVar.f1166F.a(iVar.f1176z, iVar.f1169J, dVar2, iVar.f1161A);
            }
            iVar.f1167H = false;
        }
        b0 b0Var = (b0) jVar.f1178j.f5568c;
        if ((b0Var != b0.f11281a && b0Var != b0.f11282b) || jVar.f1185q) {
            this.i.flush();
        }
        int i6 = this.f1216m;
        if (i6 < 2147483645) {
            this.f1216m = i6 + 2;
        } else {
            this.f1216m = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            s(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, E3.a.NO_ERROR, k0.f11355n.g("Stream ids exhausted"));
        }
    }

    public final void v() {
        if (this.f1225v == null || !this.f1217n.isEmpty() || !this.f1195D.isEmpty() || this.f1228y) {
            return;
        }
        this.f1228y = true;
        G0 g02 = this.f1197F;
        if (g02 != null) {
            synchronized (g02) {
                try {
                    if (g02.f416d != 6) {
                        g02.f416d = 6;
                        ScheduledFuture scheduledFuture = g02.f417e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = g02.f418f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            g02.f418f = null;
                        }
                    }
                } finally {
                }
            }
        }
        C0070p0 c0070p0 = this.f1227x;
        if (c0070p0 != null) {
            l0 l0VarM = m();
            synchronized (c0070p0) {
                try {
                    if (!c0070p0.f938d) {
                        c0070p0.f938d = true;
                        c0070p0.f939e = l0VarM;
                        LinkedHashMap linkedHashMap = c0070p0.f937c;
                        c0070p0.f937c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new RunnableC0067o0((F0) entry.getKey(), l0VarM));
                            } catch (Throwable th) {
                                C0070p0.f934g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                            }
                        }
                    }
                } finally {
                }
            }
            this.f1227x = null;
        }
        if (!this.f1226w) {
            this.f1226w = true;
            this.i.e(E3.a.NO_ERROR, new byte[0]);
        }
        this.i.close();
    }
}
