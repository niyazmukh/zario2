package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import n.C0757b;
import n.C0761f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\F.smali */
public final class F extends G {

    /* renamed from: l, reason: collision with root package name */
    public C0761f f4588l;

    @Override // androidx.lifecycle.D
    public final void f() {
        Iterator it = this.f4588l.iterator();
        while (true) {
            C0757b c0757b = (C0757b) it;
            if (!c0757b.hasNext()) {
                return;
            }
            E e5 = (E) ((Map.Entry) c0757b.next()).getValue();
            e5.f4585a.e(e5);
        }
    }

    @Override // androidx.lifecycle.D
    public final void g() {
        Iterator it = this.f4588l.iterator();
        while (true) {
            C0757b c0757b = (C0757b) it;
            if (!c0757b.hasNext()) {
                return;
            }
            E e5 = (E) ((Map.Entry) c0757b.next()).getValue();
            e5.f4585a.i(e5);
        }
    }
}
