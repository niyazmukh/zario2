package androidx.work;

import B0.b;
import E2.j;
import J0.C0108b;
import J0.t;
import K0.r;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\WorkManagerInitializer.smali */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4839a = t.f("WrkMgrInitializer");

    @Override // B0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // B0.b
    public final Object b(Context context) {
        t.d().a(f4839a, "Initializing WorkManager with default configuration.");
        r.c(context, new C0108b(new j(4)));
        return r.b(context);
    }
}
