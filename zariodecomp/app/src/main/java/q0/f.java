package Q0;

import A2.RunnableC0012l;
import android.content.Context;
import java.util.LinkedHashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q0\f.smali */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final V0.a f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2715b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2716c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2717d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2718e;

    public f(Context context, V0.a taskExecutor) {
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        this.f2714a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        this.f2715b = applicationContext;
        this.f2716c = new Object();
        this.f2717d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f2716c) {
            Object obj2 = this.f2718e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f2718e = obj;
                ((V0.b) ((S0.i) this.f2714a).f2861d).execute(new RunnableC0012l(13, L3.j.u0(this.f2717d), this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
