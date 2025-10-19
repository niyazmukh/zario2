package s3;

import a.AbstractC0183a;
import android.app.usage.UsageStatsManager;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\w.smali */
public final class w implements x {

    /* renamed from: g, reason: collision with root package name */
    public static final q f9799g = new q();
    public static final long h = Duration.ofHours(1).toMillis();
    public static final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public static final Q3.f f9800j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f9801k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f9802l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f9803m;

    /* renamed from: a, reason: collision with root package name */
    public final UsageStatsManager f9804a;

    /* renamed from: b, reason: collision with root package name */
    public final C0878a f9805b;

    /* renamed from: c, reason: collision with root package name */
    public final X3.a f9806c;

    /* renamed from: d, reason: collision with root package name */
    public final X3.p f9807d;

    /* renamed from: e, reason: collision with root package name */
    public final X3.p f9808e;

    /* renamed from: f, reason: collision with root package name */
    public final G f9809f;

    static {
        Object objV;
        z.f9810b.getClass();
        i = L3.j.t0(L3.j.n0(z.f9812d));
        f9800j = new Q3.f();
        try {
            objV = UsageStatsManager.class.getMethod("queryEvents", m.e());
        } catch (Throwable th) {
            objV = AbstractC0183a.v(th);
        }
        if (objV instanceof K3.f) {
            objV = null;
        }
        f9801k = (Method) objV;
        q qVar = f9799g;
        f9802l = new p(2, qVar, q.class, "defaultFilteredQuery", "defaultFilteredQuery(Landroid/app/usage/UsageStatsManager;Landroid/app/usage/UsageEventsQuery;)Landroid/app/usage/UsageEvents;", 0, 0);
        f9803m = new p(2, qVar, q.class, "defaultFilteredQueryFactory", "defaultFilteredQueryFactory(JJ)Landroid/app/usage/UsageEventsQuery;", 0, 1);
    }

    public w(UsageStatsManager usageStatsManager, C0878a c0878a, G g3) {
        n nVar = new n();
        p filteredQueryInvoker = f9802l;
        kotlin.jvm.internal.i.e(filteredQueryInvoker, "filteredQueryInvoker");
        p filteredQueryFactory = f9803m;
        kotlin.jvm.internal.i.e(filteredQueryFactory, "filteredQueryFactory");
        this.f9804a = usageStatsManager;
        this.f9805b = c0878a;
        this.f9806c = nVar;
        this.f9807d = filteredQueryInvoker;
        this.f9808e = filteredQueryFactory;
        this.f9809f = g3;
    }

    public static void a(LinkedHashMap linkedHashMap, String str, String str2) {
        Object linkedHashMap2 = linkedHashMap.get(str);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(str, linkedHashMap2);
        }
        v vVar = v.f9798a;
        ((Map) linkedHashMap2).merge(str2, 1, new o(3));
    }
}
