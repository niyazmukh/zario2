package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m.C0735b;
import n.C0756a;
import n.C0758c;
import x0.C1031a;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\x.1.smali */
public final class C0242x {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f4669a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4670b = true;

    /* renamed from: c, reason: collision with root package name */
    public C0756a f4671c = new C0756a();

    /* renamed from: d, reason: collision with root package name */
    public EnumC0236o f4672d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f4673e;

    /* renamed from: f, reason: collision with root package name */
    public int f4674f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4675g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final i4.I f4676j;

    public C0242x(InterfaceC0241v interfaceC0241v) {
        EnumC0236o enumC0236o = EnumC0236o.f4659b;
        this.f4672d = enumC0236o;
        this.i = new ArrayList();
        this.f4673e = new WeakReference(interfaceC0241v);
        this.f4676j = i4.C.b(enumC0236o);
    }

    public final void a(InterfaceC0240u observer) {
        InterfaceC0239t c0229g;
        InterfaceC0241v interfaceC0241v;
        ArrayList arrayList = this.i;
        int i = 1;
        kotlin.jvm.internal.i.e(observer, "observer");
        c("addObserver");
        EnumC0236o enumC0236o = this.f4672d;
        EnumC0236o enumC0236o2 = EnumC0236o.f4658a;
        if (enumC0236o != enumC0236o2) {
            enumC0236o2 = EnumC0236o.f4659b;
        }
        w wVar = new w();
        HashMap map = AbstractC0243z.f4678a;
        boolean z4 = observer instanceof InterfaceC0239t;
        boolean z5 = observer instanceof c0.j;
        if (z4 && z5) {
            c0229g = new C0229g((c0.j) observer, (InterfaceC0239t) observer);
        } else if (z5) {
            c0229g = new C0229g((c0.j) observer, (InterfaceC0239t) null);
        } else if (z4) {
            c0229g = (InterfaceC0239t) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (AbstractC0243z.b(cls) == 2) {
                Object obj = AbstractC0243z.f4679b.get(cls);
                kotlin.jvm.internal.i.b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC0243z.a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC0231i[] interfaceC0231iArr = new InterfaceC0231i[size];
                if (size > 0) {
                    AbstractC0243z.a((Constructor) list.get(0), observer);
                    throw null;
                }
                c0229g = new C1031a(interfaceC0231iArr, i);
            } else {
                c0229g = new C0229g(observer);
            }
        }
        wVar.f4668b = c0229g;
        wVar.f4667a = enumC0236o2;
        if (((w) this.f4671c.g(observer, wVar)) == null && (interfaceC0241v = (InterfaceC0241v) this.f4673e.get()) != null) {
            boolean z6 = this.f4674f != 0 || this.f4675g;
            EnumC0236o enumC0236oB = b(observer);
            this.f4674f++;
            while (wVar.f4667a.compareTo(enumC0236oB) < 0 && this.f4671c.f8948e.containsKey(observer)) {
                arrayList.add(wVar.f4667a);
                C0234l c0234l = n.Companion;
                EnumC0236o enumC0236o3 = wVar.f4667a;
                c0234l.getClass();
                n nVarB = C0234l.b(enumC0236o3);
                if (nVarB == null) {
                    throw new IllegalStateException("no event up from " + wVar.f4667a);
                }
                wVar.a(interfaceC0241v, nVarB);
                arrayList.remove(arrayList.size() - 1);
                enumC0236oB = b(observer);
            }
            if (!z6) {
                h();
            }
            this.f4674f--;
        }
    }

    public final EnumC0236o b(InterfaceC0240u interfaceC0240u) {
        w wVar;
        HashMap map = this.f4671c.f8948e;
        C0758c c0758c = map.containsKey(interfaceC0240u) ? ((C0758c) map.get(interfaceC0240u)).f8955d : null;
        EnumC0236o enumC0236o = (c0758c == null || (wVar = (w) c0758c.f8953b) == null) ? null : wVar.f4667a;
        ArrayList arrayList = this.i;
        EnumC0236o enumC0236o2 = arrayList.isEmpty() ? null : (EnumC0236o) arrayList.get(arrayList.size() - 1);
        EnumC0236o state1 = this.f4672d;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (enumC0236o == null || enumC0236o.compareTo(state1) >= 0) {
            enumC0236o = state1;
        }
        return (enumC0236o2 == null || enumC0236o2.compareTo(enumC0236o) >= 0) ? enumC0236o : enumC0236o2;
    }

    public final void c(String str) {
        if (this.f4670b) {
            C0735b.q0().f8810a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(B.a.l("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(n event) {
        kotlin.jvm.internal.i.e(event, "event");
        c("handleLifecycleEvent");
        e(event.a());
    }

    public final void e(EnumC0236o enumC0236o) {
        EnumC0236o enumC0236o2 = this.f4672d;
        if (enumC0236o2 == enumC0236o) {
            return;
        }
        EnumC0236o enumC0236o3 = EnumC0236o.f4659b;
        EnumC0236o enumC0236o4 = EnumC0236o.f4658a;
        if (enumC0236o2 == enumC0236o3 && enumC0236o == enumC0236o4) {
            throw new IllegalStateException(("no event down from " + this.f4672d + " in component " + this.f4673e.get()).toString());
        }
        this.f4672d = enumC0236o;
        if (this.f4675g || this.f4674f != 0) {
            this.h = true;
            return;
        }
        this.f4675g = true;
        h();
        this.f4675g = false;
        if (this.f4672d == enumC0236o4) {
            this.f4671c = new C0756a();
        }
    }

    public final void f(InterfaceC0240u observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        c("removeObserver");
        this.f4671c.h(observer);
    }

    public final void g(EnumC0236o state) {
        kotlin.jvm.internal.i.e(state, "state");
        c("setCurrentState");
        e(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.h = false;
        r7.f4676j.L(r7.f4672d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0242x.h():void");
    }
}
