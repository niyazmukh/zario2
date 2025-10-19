package C3;

import B3.G0;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\l.smali */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final E3.h f1187b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f1189d;

    /* renamed from: a, reason: collision with root package name */
    public final S0.c f1186a = new S0.c(Level.FINE);

    /* renamed from: c, reason: collision with root package name */
    public boolean f1188c = true;

    public l(m mVar, E3.h hVar) {
        this.f1189d = mVar;
        this.f1187b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        k0 k0VarG;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.f1187b.a(this)) {
            try {
                G0 g02 = this.f1189d.f1197F;
                if (g02 != null) {
                    g02.a();
                }
            } catch (Throwable th) {
                try {
                    m mVar2 = this.f1189d;
                    E3.a aVar = E3.a.PROTOCOL_ERROR;
                    k0 k0VarF = k0.f11354m.g("error in frame handler").f(th);
                    Map map = m.f1190P;
                    mVar2.s(0, aVar, k0VarF);
                    try {
                        this.f1187b.close();
                    } catch (IOException e5) {
                        m.f1191Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e5);
                    } catch (RuntimeException e6) {
                        if (!"bio == null".equals(e6.getMessage())) {
                            throw e6;
                        }
                    }
                    mVar = this.f1189d;
                } catch (Throwable th2) {
                    try {
                        this.f1187b.close();
                    } catch (IOException e7) {
                        m.f1191Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e7);
                    } catch (RuntimeException e8) {
                        if (!"bio == null".equals(e8.getMessage())) {
                            throw e8;
                        }
                    }
                    this.f1189d.h.n();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        synchronized (this.f1189d.f1214k) {
            k0VarG = this.f1189d.f1225v;
        }
        if (k0VarG == null) {
            k0VarG = k0.f11355n.g("End of stream or IOException");
        }
        this.f1189d.s(0, E3.a.INTERNAL_ERROR, k0VarG);
        try {
            this.f1187b.close();
        } catch (IOException e9) {
            m.f1191Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e9);
        } catch (RuntimeException e10) {
            if (!"bio == null".equals(e10.getMessage())) {
                throw e10;
            }
        }
        mVar = this.f1189d;
        mVar.h.n();
        Thread.currentThread().setName(name);
    }
}
