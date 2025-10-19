package E2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: E2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\e.1.smali */
public final class ComponentCallbacks2C0102e implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f1445a;

    public ComponentCallbacks2C0102e(AtomicBoolean atomicBoolean) {
        this.f1445a = atomicBoolean;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.f1445a.set(true);
        }
    }
}
