package u0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import y0.InterfaceC1045d;

/* renamed from: u0.C, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\C.smali */
public final class C0955C implements y0.e, InterfaceC1045d {

    /* renamed from: m, reason: collision with root package name */
    public static final TreeMap f10362m = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f10363a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f10364b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f10365c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f10366d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f10367e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f10368f;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f10369k;

    /* renamed from: l, reason: collision with root package name */
    public int f10370l;

    public C0955C(int i) {
        this.f10363a = i;
        int i5 = i + 1;
        this.f10369k = new int[i5];
        this.f10365c = new long[i5];
        this.f10366d = new double[i5];
        this.f10367e = new String[i5];
        this.f10368f = new byte[i5][];
    }

    public static final C0955C k(int i, String query) {
        kotlin.jvm.internal.i.e(query, "query");
        TreeMap treeMap = f10362m;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                C0955C c0955c = new C0955C(i);
                c0955c.f10364b = query;
                c0955c.f10370l = i;
                return c0955c;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C0955C c0955c2 = (C0955C) entryCeilingEntry.getValue();
            c0955c2.getClass();
            c0955c2.f10364b = query;
            c0955c2.f10370l = i;
            return c0955c2;
        }
    }

    @Override // y0.e
    public final void a(InterfaceC1045d interfaceC1045d) {
        int i = this.f10370l;
        if (1 > i) {
            return;
        }
        int i5 = 1;
        while (true) {
            int i6 = this.f10369k[i5];
            if (i6 == 1) {
                interfaceC1045d.f(i5);
            } else if (i6 == 2) {
                interfaceC1045d.d(i5, this.f10365c[i5]);
            } else if (i6 == 3) {
                interfaceC1045d.g(i5, this.f10366d[i5]);
            } else if (i6 == 4) {
                String str = this.f10367e[i5];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC1045d.c(i5, str);
            } else if (i6 == 5) {
                byte[] bArr = this.f10368f[i5];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC1045d.j(bArr, i5);
            }
            if (i5 == i) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // y0.InterfaceC1045d
    public final void c(int i, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f10369k[i] = 4;
        this.f10367e[i] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // y0.InterfaceC1045d
    public final void d(int i, long j5) {
        this.f10369k[i] = 2;
        this.f10365c[i] = j5;
    }

    @Override // y0.e
    public final String e() {
        String str = this.f10364b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // y0.InterfaceC1045d
    public final void f(int i) {
        this.f10369k[i] = 1;
    }

    @Override // y0.InterfaceC1045d
    public final void g(int i, double d5) {
        this.f10369k[i] = 3;
        this.f10366d[i] = d5;
    }

    @Override // y0.InterfaceC1045d
    public final void j(byte[] bArr, int i) {
        this.f10369k[i] = 5;
        this.f10368f[i] = bArr;
    }

    public final void l() {
        TreeMap treeMap = f10362m;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f10363a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.i.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
