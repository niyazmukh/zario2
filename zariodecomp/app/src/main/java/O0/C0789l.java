package o0;

import android.util.Log;
import androidx.lifecycle.InterfaceC0239t;
import androidx.lifecycle.InterfaceC0241v;
import g0.AbstractComponentCallbacksC0567t;
import java.util.Iterator;
import l.C0708q;

/* renamed from: o0.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\l.1.smali */
public final /* synthetic */ class C0789l implements InterfaceC0239t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9085b;

    public /* synthetic */ C0789l(Object obj, int i) {
        this.f9084a = i;
        this.f9085b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0239t
    public final void onStateChanged(InterfaceC0241v interfaceC0241v, androidx.lifecycle.n nVar) {
        switch (this.f9084a) {
            case 0:
                C0767B this$0 = (C0767B) this.f9085b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.f8993q = nVar.a();
                if (this$0.f8981c != null) {
                    Iterator it = this$0.f8985g.iterator();
                    while (it.hasNext()) {
                        C0787j c0787j = (C0787j) it.next();
                        c0787j.getClass();
                        c0787j.f9071d = nVar.a();
                        c0787j.f();
                    }
                    break;
                }
                break;
            case 1:
                q0.m this$02 = (q0.m) this.f9085b;
                kotlin.jvm.internal.i.e(this$02, "this$0");
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = (AbstractComponentCallbacksC0567t) interfaceC0241v;
                    Object obj = null;
                    for (Object obj2 : (Iterable) ((i4.I) this$02.b().f9091f.f7964a).K()) {
                        if (kotlin.jvm.internal.i.a(((C0787j) obj2).f9073f, abstractComponentCallbacksC0567t.f7506C)) {
                            obj = obj2;
                        }
                    }
                    C0787j c0787j2 = (C0787j) obj;
                    if (c0787j2 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + c0787j2 + " due to fragment " + interfaceC0241v + " lifecycle reaching DESTROYED");
                        }
                        this$02.b().b(c0787j2);
                        break;
                    }
                }
                break;
            default:
                C0708q this$03 = (C0708q) this.f9085b;
                kotlin.jvm.internal.i.e(this$03, "this$0");
                if (nVar == androidx.lifecycle.n.ON_START) {
                    this$03.f8663e = true;
                    break;
                } else if (nVar == androidx.lifecycle.n.ON_STOP) {
                    this$03.f8663e = false;
                    break;
                }
                break;
        }
    }
}
