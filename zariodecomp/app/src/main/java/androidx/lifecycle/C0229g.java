package androidx.lifecycle;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import l.C0708q;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\g.1.smali */
public final class C0229g implements InterfaceC0239t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4645a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4646b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4647c;

    public C0229g(c0.j defaultLifecycleObserver, InterfaceC0239t interfaceC0239t) {
        kotlin.jvm.internal.i.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f4646b = defaultLifecycleObserver;
        this.f4647c = interfaceC0239t;
    }

    @Override // androidx.lifecycle.InterfaceC0239t
    public final void onStateChanged(InterfaceC0241v interfaceC0241v, n nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f4645a) {
            case 0:
                int i = AbstractC0228f.f4644a[nVar.ordinal()];
                c0.j jVar = (c0.j) this.f4646b;
                switch (i) {
                    case 1:
                        jVar.getClass();
                        break;
                    case 2:
                        jVar.getClass();
                        break;
                    case 3:
                        jVar.f5365b.getClass();
                        c0.b.a(Looper.getMainLooper()).postDelayed(new c0.m(), 500L);
                        jVar.f5364a.f(jVar);
                        break;
                    case 4:
                        jVar.getClass();
                        break;
                    case 5:
                        jVar.getClass();
                        break;
                    case 6:
                        jVar.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0239t interfaceC0239t = (InterfaceC0239t) this.f4647c;
                if (interfaceC0239t != null) {
                    interfaceC0239t.onStateChanged(interfaceC0241v, nVar);
                    return;
                }
                return;
            case 1:
                if (nVar == n.ON_START) {
                    ((C0242x) this.f4646b).f(this);
                    ((C0708q) this.f4647c).g();
                    return;
                }
                return;
            default:
                HashMap map = ((C0224b) this.f4647c).f4629a;
                List list = (List) map.get(nVar);
                InterfaceC0240u interfaceC0240u = (InterfaceC0240u) this.f4646b;
                C0224b.a(list, interfaceC0241v, nVar, interfaceC0240u);
                C0224b.a((List) map.get(n.ON_ANY), interfaceC0241v, nVar, interfaceC0240u);
                return;
        }
    }

    public C0229g(InterfaceC0240u interfaceC0240u) {
        this.f4646b = interfaceC0240u;
        C0226d c0226d = C0226d.f4638c;
        Class<?> cls = interfaceC0240u.getClass();
        C0224b c0224b = (C0224b) c0226d.f4639a.get(cls);
        this.f4647c = c0224b == null ? c0226d.a(cls, null) : c0224b;
    }

    public C0229g(C0242x c0242x, C0708q c0708q) {
        this.f4646b = c0242x;
        this.f4647c = c0708q;
    }
}
