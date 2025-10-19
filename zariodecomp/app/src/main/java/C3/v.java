package C3;

import B3.AbstractC0031c;
import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\v.smali */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final int f1252b;

    /* renamed from: c, reason: collision with root package name */
    public int f1253c;

    /* renamed from: d, reason: collision with root package name */
    public int f1254d;

    /* renamed from: e, reason: collision with root package name */
    public final u f1255e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f1257g;

    /* renamed from: a, reason: collision with root package name */
    public final q4.d f1251a = new q4.d();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1256f = false;

    public v(x xVar, int i, int i5, u uVar) {
        this.f1257g = xVar;
        this.f1252b = i;
        this.f1253c = i5;
        this.f1255e = uVar;
    }

    public final int a(int i) {
        if (i <= 0 || com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i >= this.f1253c) {
            int i5 = this.f1253c + i;
            this.f1253c = i5;
            return i5;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f1252b);
    }

    public final void b(int i, q4.d dVar, boolean z4) {
        boolean zE;
        do {
            int iMin = Math.min(i, ((d) this.f1257g.f1261c).f1126b.f1109a.d);
            int i5 = -iMin;
            ((v) this.f1257g.f1262d).a(i5);
            a(i5);
            try {
                boolean z5 = false;
                ((d) this.f1257g.f1261c).a(dVar.f9515b == ((long) iMin) && z4, this.f1252b, dVar, iMin);
                AbstractC0031c abstractC0031c = (AbstractC0031c) this.f1255e;
                synchronized (abstractC0031c.f753b) {
                    S0.f.q("onStreamAllocated was not called, but it seems the stream is active", abstractC0031c.f757f);
                    int i6 = abstractC0031c.f756e;
                    boolean z6 = i6 < 32768;
                    int i7 = i6 - iMin;
                    abstractC0031c.f756e = i7;
                    boolean z7 = i7 < 32768;
                    if (!z6 && z7) {
                        z5 = true;
                    }
                }
                if (z5) {
                    synchronized (abstractC0031c.f753b) {
                        zE = abstractC0031c.e();
                    }
                    if (zE) {
                        abstractC0031c.f759j.b();
                    }
                }
                i -= iMin;
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        } while (i > 0);
    }

    public final void c(int i, w wVar) {
        int i5 = this.f1253c;
        x xVar = this.f1257g;
        int iMin = Math.min(i, Math.min(i5, ((v) xVar.f1262d).f1253c));
        int i6 = 0;
        while (true) {
            q4.d dVar = this.f1251a;
            long j5 = dVar.f9515b;
            if (j5 <= 0 || iMin <= 0) {
                return;
            }
            if (iMin >= j5) {
                int i7 = (int) j5;
                i6 += i7;
                b(i7, dVar, this.f1256f);
            } else {
                i6 += iMin;
                b(iMin, dVar, false);
            }
            wVar.f1258a++;
            iMin = Math.min(i - i6, Math.min(this.f1253c, ((v) xVar.f1262d).f1253c));
        }
    }
}
