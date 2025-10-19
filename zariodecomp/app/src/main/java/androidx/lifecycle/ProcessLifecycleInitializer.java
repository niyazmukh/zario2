package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\ProcessLifecycleInitializer.smali */
public final class ProcessLifecycleInitializer implements B0.b {
    @Override // B0.b
    public final List a() {
        return L3.s.f2351a;
    }

    @Override // B0.b
    public final Object b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        B0.a aVarC = B0.a.c(context);
        kotlin.jvm.internal.i.d(aVarC, "getInstance(context)");
        if (!aVarC.f281b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0238s.f4666a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        M m5 = M.f4589l;
        m5.getClass();
        m5.f4594e = new Handler();
        m5.f4595f.d(n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new L(m5));
        return m5;
    }
}
