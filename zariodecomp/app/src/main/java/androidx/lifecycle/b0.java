package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import l.C0708q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\b0.smali */
public final class b0 implements x0.c {

    /* renamed from: a, reason: collision with root package name */
    public final C0708q f4631a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4632b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f4633c;

    /* renamed from: d, reason: collision with root package name */
    public final K3.h f4634d;

    public b0(C0708q savedStateRegistry, n0 n0Var) {
        kotlin.jvm.internal.i.e(savedStateRegistry, "savedStateRegistry");
        this.f4631a = savedStateRegistry;
        this.f4634d = S0.f.P(new O0.g(n0Var, 3));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4633c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((c0) this.f4634d.getValue()).f4637a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((X) entry.getValue()).f4625e.a();
            if (!kotlin.jvm.internal.i.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f4632b = false;
        return bundle;
    }

    public final void b() {
        if (this.f4632b) {
            return;
        }
        Bundle bundleC = this.f4631a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4633c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleC != null) {
            bundle.putAll(bundleC);
        }
        this.f4633c = bundle;
        this.f4632b = true;
    }
}
