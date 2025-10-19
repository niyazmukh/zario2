package y2;

import E2.C0106i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: y2.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\B.smali */
public final class C1049B {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadPoolExecutor f11057f;

    /* renamed from: a, reason: collision with root package name */
    public final C0106i f11058a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11061d;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11059b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11060c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f11062e = new HashSet();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11057f = threadPoolExecutor;
    }

    public C1049B(C0106i c0106i) {
        this.f11058a = c0106i;
    }

    public final C2.n a(B2.h hVar) {
        B2.o oVar = (B2.o) this.f11059b.get(hVar);
        return (this.f11062e.contains(hVar) || oVar == null) ? C2.n.f1102c : oVar.equals(B2.o.f333b) ? new C2.n(null, Boolean.FALSE) : new C2.n(oVar, null);
    }
}
