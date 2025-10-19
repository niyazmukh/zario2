package u0;

import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\r.smali */
public final class r extends p {

    /* renamed from: b, reason: collision with root package name */
    public final s f10427b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f10428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s tracker, C0962c delegate) {
        super(delegate.f10422a);
        kotlin.jvm.internal.i.e(tracker, "tracker");
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f10427b = tracker;
        this.f10428c = new WeakReference(delegate);
    }

    @Override // u0.p
    public final void a(Set tables) {
        kotlin.jvm.internal.i.e(tables, "tables");
        p pVar = (p) this.f10428c.get();
        if (pVar == null) {
            this.f10427b.c(this);
        } else {
            pVar.a(tables);
        }
    }
}
