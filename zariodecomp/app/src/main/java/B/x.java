package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.InterfaceC0241v;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\x.smali */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4942a;

    /* renamed from: b, reason: collision with root package name */
    public final L3.h f4943b = new L3.h();

    /* renamed from: c, reason: collision with root package name */
    public n f4944c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f4945d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f4946e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4947f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4948g;

    public x(Runnable runnable) {
        this.f4942a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f4945d = i >= 34 ? t.f4934a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : r.f4929a.a(new p(this, 2));
        }
    }

    public final void a(InterfaceC0241v interfaceC0241v, n onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        C0242x c0242xG = interfaceC0241v.g();
        if (c0242xG.f4672d == EnumC0236o.f4658a) {
            return;
        }
        onBackPressedCallback.f4921b.add(new u(this, c0242xG, onBackPressedCallback));
        d();
        onBackPressedCallback.f4922c = new w(0, this, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object objPrevious;
        L3.e eVar = this.f4943b;
        ListIterator listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((n) objPrevious).f4920a) {
                    break;
                }
            }
        }
        n nVar = (n) objPrevious;
        this.f4944c = null;
        if (nVar != null) {
            nVar.a();
            return;
        }
        Runnable runnable = this.f4942a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4946e;
        OnBackInvokedCallback onBackInvokedCallback = this.f4945d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f4929a;
        if (z4 && !this.f4947f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f4947f = true;
        } else {
            if (z4 || !this.f4947f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4947f = false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [L3.h, java.util.AbstractList] */
    public final void d() {
        boolean z4 = this.f4948g;
        boolean z5 = false;
        ?? r22 = this.f4943b;
        if (r22 == 0 || !r22.isEmpty()) {
            Iterator it = r22.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((n) it.next()).f4920a) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f4948g = z5;
        if (z5 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z5);
    }
}
