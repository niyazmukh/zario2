package s3;

import f4.C0525y;
import f4.N;
import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import v3.InterfaceC1003a;

/* renamed from: s3.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\j.1.smali */
public final class C0887j {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9778f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final w3.c f9779a;

    /* renamed from: b, reason: collision with root package name */
    public final L f9780b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.c f9781c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1003a f9782d;

    /* renamed from: e, reason: collision with root package name */
    public final C0878a f9783e;

    static {
        Duration.ofDays(1L).toMillis();
    }

    public C0887j(w3.c cVar, L l4, v3.c cVar2, InterfaceC1003a interfaceC1003a, C0878a c0878a) {
        this.f9779a = cVar;
        this.f9780b = l4;
        this.f9781c = cVar2;
        this.f9782d = interfaceC1003a;
        this.f9783e = c0878a;
    }

    public static Map a(List list, long j5, long j6) {
        if (list.isEmpty()) {
            return L3.t.f2352a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v3.e eVar = (v3.e) it.next();
            long jMax = Math.max(j5, eVar.f10683b);
            long jMin = Math.min(j6, eVar.f10684c);
            if (jMin > jMax) {
                Long lValueOf = Long.valueOf(jMin - jMax);
                final C0525y c0525y = new C0525y(7);
                linkedHashMap.merge(eVar.f10682a, lValueOf, new BiFunction() { // from class: s3.b
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return (Long) c0525y.invoke(obj, obj2);
                    }
                });
            }
        }
        return linkedHashMap;
    }

    public final Object b(long j5, long j6, Q3.c cVar) throws Throwable {
        m4.e eVar = N.f7027a;
        Object objB = f4.E.B(m4.d.f8928c, new C0883f(j5, j6, null, this), cVar);
        return objB == P3.a.f2678a ? objB : K3.k.f2288a;
    }
}
