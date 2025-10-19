package g0;

import A2.C0004d;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import b.C0250g;
import com.niyaz.zario.ui.permissions.PermissionsFragment;
import d.C0438d;
import d.C0440g;
import e.C0447a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g0.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\q.1.smali */
public final class C0565q extends AbstractC0566s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.i f7489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f7490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0447a f7491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0004d f7492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PermissionsFragment f7493e;

    public C0565q(PermissionsFragment permissionsFragment, g1.i iVar, AtomicReference atomicReference, C0447a c0447a, C0004d c0004d) {
        this.f7493e = permissionsFragment;
        this.f7489a = iVar;
        this.f7490b = atomicReference;
        this.f7491c = c0447a;
        this.f7492d = c0004d;
    }

    @Override // g0.AbstractC0566s
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        PermissionsFragment permissionsFragment = this.f7493e;
        sb.append(permissionsFragment.f7531e);
        sb.append("_rq#");
        sb.append(permissionsFragment.f7525W.getAndIncrement());
        String string = sb.toString();
        g1.i iVar = this.f7489a;
        iVar.getClass();
        PermissionsFragment permissionsFragment2 = (PermissionsFragment) iVar.f7594b;
        C0569v c0569v = permissionsFragment2.f7546x;
        C0250g c0250g = c0569v != null ? c0569v.f7555e.f4912o : permissionsFragment2.R().f4912o;
        c0250g.getClass();
        C0242x c0242x = permissionsFragment.f7520R;
        if (c0242x.f4672d.compareTo(EnumC0236o.f4661d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + permissionsFragment + " is attempting to register while current state is " + c0242x.f4672d + ". LifecycleOwners must call register before they are STARTED.");
        }
        c0250g.d(string);
        HashMap map = c0250g.f4890c;
        C0440g c0440g = (C0440g) map.get(string);
        if (c0440g == null) {
            c0440g = new C0440g(c0242x);
        }
        C0004d c0004d = this.f7492d;
        C0447a c0447a = this.f7491c;
        C0438d c0438d = new C0438d(c0250g, string, c0004d, c0447a);
        c0440g.f6777a.a(c0438d);
        c0440g.f6778b.add(c0438d);
        map.put(string, c0440g);
        this.f7490b.set(new d.e(c0250g, string, c0447a, 0));
    }
}
