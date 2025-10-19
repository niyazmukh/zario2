package d;

import A2.C0004d;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC0239t;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.n;
import b.C0250g;
import e.C0447a;
import java.util.HashMap;

/* renamed from: d.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d.1\d.smali */
public final class C0438d implements InterfaceC0239t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0004d f6768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0447a f6769c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0250g f6770d;

    public C0438d(C0250g c0250g, String str, C0004d c0004d, C0447a c0447a) {
        this.f6770d = c0250g;
        this.f6767a = str;
        this.f6768b = c0004d;
        this.f6769c = c0447a;
    }

    @Override // androidx.lifecycle.InterfaceC0239t
    public final void onStateChanged(InterfaceC0241v interfaceC0241v, n nVar) {
        boolean zEquals = n.ON_START.equals(nVar);
        C0250g c0250g = this.f6770d;
        String str = this.f6767a;
        HashMap map = c0250g.f4892e;
        if (!zEquals) {
            if (n.ON_STOP.equals(nVar)) {
                map.remove(str);
                return;
            } else {
                if (n.ON_DESTROY.equals(nVar)) {
                    c0250g.e(str);
                    return;
                }
                return;
            }
        }
        C0004d c0004d = this.f6768b;
        C0447a c0447a = this.f6769c;
        map.put(str, new C0439f(c0004d, c0447a));
        HashMap map2 = c0250g.f4893f;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            c0004d.j(obj);
        }
        Bundle bundle = c0250g.f4894g;
        C0435a c0435a = (C0435a) bundle.getParcelable(str);
        if (c0435a != null) {
            bundle.remove(str);
            c0004d.j(c0447a.T(c0435a.f6766b, c0435a.f6765a));
        }
    }
}
