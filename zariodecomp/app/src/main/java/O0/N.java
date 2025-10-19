package o0;

import W.d0;
import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\N.smali */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public C0790m f9034a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9035b;

    public abstract x a();

    public final C0790m b() {
        C0790m c0790m = this.f9034a;
        if (c0790m != null) {
            return c0790m;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public x c(x xVar, Bundle bundle, C0769D c0769d) {
        return xVar;
    }

    public void d(List list, C0769D c0769d) {
        d4.c cVar = new d4.c(new L3.q(new d4.k(new L3.q(list, 0), new d0(2, this, c0769d), 1), 1));
        while (cVar.hasNext()) {
            b().g((C0787j) cVar.next());
        }
    }

    public void e(C0790m c0790m) {
        this.f9034a = c0790m;
        this.f9035b = true;
    }

    public void f(C0787j c0787j) {
        x xVar = c0787j.f9069b;
        if (xVar == null) {
            xVar = null;
        }
        if (xVar == null) {
            return;
        }
        c(xVar, null, p1.b.D(C0779b.f9052o));
        b().c(c0787j);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(C0787j popUpTo, boolean z4) {
        kotlin.jvm.internal.i.e(popUpTo, "popUpTo");
        List list = (List) ((i4.I) b().f9090e.f7964a).K();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0787j c0787j = null;
        while (j()) {
            c0787j = (C0787j) listIterator.previous();
            if (kotlin.jvm.internal.i.a(c0787j, popUpTo)) {
                break;
            }
        }
        if (c0787j != null) {
            b().d(c0787j, z4);
        }
    }

    public boolean j() {
        return true;
    }
}
