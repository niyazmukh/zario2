package g0;

import d.AbstractC0437c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g0.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\n.1.smali */
public final class C0562n extends AbstractC0437c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f7486a;

    public C0562n(AtomicReference atomicReference) {
        this.f7486a = atomicReference;
    }

    @Override // d.AbstractC0437c
    public final void a(Object obj) {
        AbstractC0437c abstractC0437c = (AbstractC0437c) this.f7486a.get();
        if (abstractC0437c == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC0437c.a("android.permission.POST_NOTIFICATIONS");
    }
}
