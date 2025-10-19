package N0;

import J0.t;
import J0.u;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N0\a.smali */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f2546c = t.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f2547a;

    /* renamed from: b, reason: collision with root package name */
    public final u f2548b;

    public a(Context context, u uVar) {
        this.f2548b = uVar;
        this.f2547a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
