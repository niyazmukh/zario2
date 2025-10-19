package J0;

import L3.AbstractC0115d;
import W.O;
import W.W;
import W.Z;
import android.util.Log;
import androidx.lifecycle.InterfaceC0239t;
import androidx.lifecycle.InterfaceC0241v;
import i4.I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k2.InterfaceFutureC0659b;
import o0.C0787j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\m.smali */
public final class m extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2059b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i) {
        super(1);
        this.f2058a = i;
        this.f2059b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [K3.c, java.lang.Object] */
    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f2058a) {
            case 0:
                Throwable th = (Throwable) obj;
                n nVar = (n) this.f2059b;
                if (th == null) {
                    if (!nVar.a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    nVar.a.cancel(true);
                } else {
                    U0.k kVar = nVar.a;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    kVar.k(th);
                }
                return K3.k.f2288a;
            case 1:
                ((InterfaceFutureC0659b) this.f2059b).cancel(false);
                return K3.k.f2288a;
            case 2:
                return obj == ((AbstractC0115d) this.f2059b) ? "(this Collection)" : String.valueOf(obj);
            case 3:
                Throwable th2 = (Throwable) obj;
                O o5 = (O) this.f2059b;
                if (th2 != null) {
                    o5.f3534l.E(new Z(th2));
                }
                if (o5.f3536n.f2282b != K3.j.f2287a) {
                    ((W) o5.f3536n.getValue()).close();
                }
                return K3.k.f2288a;
            case 4:
                String key = (String) obj;
                kotlin.jvm.internal.i.e(key, "key");
                o0.v vVar = (o0.v) this.f2059b;
                ArrayList arrayList = vVar.f9122d;
                Collection collectionValues = ((Map) vVar.h.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    L3.p.b0(((o0.s) it.next()).f9112b, arrayList2);
                }
                return Boolean.valueOf(!L3.j.l0(L3.j.l0(arrayList, arrayList2), (List) vVar.f9127k.getValue()).contains(key));
            default:
                final C0787j entry = (C0787j) obj;
                kotlin.jvm.internal.i.e(entry, "entry");
                final q0.m mVar = (q0.m) this.f2059b;
                return new InterfaceC0239t() { // from class: q0.j
                    @Override // androidx.lifecycle.InterfaceC0239t
                    public final void onStateChanged(InterfaceC0241v interfaceC0241v, androidx.lifecycle.n nVar2) {
                        m this$0 = mVar;
                        kotlin.jvm.internal.i.e(this$0, "this$0");
                        C0787j entry2 = entry;
                        kotlin.jvm.internal.i.e(entry2, "$entry");
                        if (nVar2 == androidx.lifecycle.n.ON_RESUME && ((List) ((I) this$0.b().f9090e.f7964a).K()).contains(entry2)) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry2 + " due to fragment " + interfaceC0241v + " view lifecycle reaching RESUMED");
                            }
                            this$0.b().b(entry2);
                        }
                        if (nVar2 == androidx.lifecycle.n.ON_DESTROY) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry2 + " due to fragment " + interfaceC0241v + " view lifecycle reaching DESTROYED");
                            }
                            this$0.b().b(entry2);
                        }
                    }
                };
        }
    }
}
