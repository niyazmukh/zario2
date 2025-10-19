package B3;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import z3.AbstractC1083g;

/* renamed from: B3.v, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\v.1.smali */
public final class RunnableC0085v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0088w f993b;

    public RunnableC0085v(C0088w c0088w, long j5) {
        this.f993b = c0088w;
        this.f992a = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1.i iVar = new g1.i(3);
        C0088w c0088w = this.f993b;
        c0088w.f1006j.e(iVar);
        long j5 = this.f992a;
        long jAbs = Math.abs(j5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit.toNanos(1L);
        long jAbs2 = Math.abs(j5) % timeUnit.toNanos(1L);
        StringBuilder sb = new StringBuilder("deadline exceeded after ");
        if (j5 < 0) {
            sb.append('-');
        }
        sb.append(nanos);
        Locale locale = Locale.US;
        sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb.append("s. ");
        sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) c0088w.i.a(AbstractC1083g.f11307a)) == null ? 0.0d : r3.longValue() / C0088w.f998r)));
        sb.append(iVar);
        c0088w.f1006j.h(z3.k0.h.a(sb.toString()));
    }
}
