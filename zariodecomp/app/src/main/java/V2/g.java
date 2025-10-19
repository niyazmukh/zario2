package V2;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\g.smali */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c4.h[] f3434a;

    /* renamed from: b, reason: collision with root package name */
    public static final Z.b f3435b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z.b f3436c;

    static {
        l lVar = new l(g.class, "userSessionDataStore", "getUserSessionDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        s.f8432a.getClass();
        f3434a = new c4.h[]{lVar, new l(g.class, "evaluationDataStore", "getEvaluationDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
        f3435b = p1.b.K("user_session_prefs", null, null, 14);
        f3436c = p1.b.K("evaluation_prefs", null, null, 14);
    }
}
