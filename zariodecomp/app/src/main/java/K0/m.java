package K0;

import J0.v;
import J0.z;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\m.smali */
public final class m extends S0.f {

    /* renamed from: j, reason: collision with root package name */
    public static final String f2157j = J0.t.f("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    public final r f2158b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2159c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2160d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2161e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2162f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2163g = new ArrayList();
    public boolean h;
    public S0.c i;

    public m(r rVar, String str, int i, List list) {
        this.f2158b = rVar;
        this.f2159c = str;
        this.f2160d = i;
        this.f2161e = list;
        this.f2162f = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (i == 1 && ((v) list.get(i5)).f2067b.f2913u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((v) list.get(i5)).f2066a.toString();
            kotlin.jvm.internal.i.d(string, "id.toString()");
            this.f2162f.add(string);
            this.f2163g.add(string);
        }
    }

    public static HashSet y0(m mVar) {
        HashSet hashSet = new HashSet();
        mVar.getClass();
        return hashSet;
    }

    public final z x0() {
        if (this.h) {
            J0.t.d().g(f2157j, "Already enqueued work ids (" + TextUtils.join(", ", this.f2162f) + ")");
        } else {
            T0.d dVar = new T0.d(this);
            this.f2158b.f2175d.c(dVar);
            this.i = dVar.f3141b;
        }
        return this.i;
    }
}
