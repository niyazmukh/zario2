package G2;

import I.n;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import q2.m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G2\d.smali */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final m f1848a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1849b;

    /* renamed from: c, reason: collision with root package name */
    public final H2.b f1850c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f1851d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1852e;

    public d(Context context, String str, Set set, H2.b bVar, Executor executor) {
        this.f1848a = new m(new b(0, context, str));
        this.f1851d = set;
        this.f1852e = executor;
        this.f1850c = bVar;
        this.f1849b = context;
    }

    public final Task a() {
        if (!n.a(this.f1849b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f1852e, new c(this, 0));
    }

    public final void b() {
        if (this.f1851d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!n.a(this.f1849b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f1852e, new c(this, 1));
        }
    }
}
