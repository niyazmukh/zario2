package e2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\b.1.smali */
public final class C0454b extends AbstractRunnableC0449A {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ IBinder f6860k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0456d f6861l;

    public C0454b(ServiceConnectionC0456d serviceConnectionC0456d, IBinder iBinder) {
        this.f6861l = serviceConnectionC0456d;
        this.f6860k = iBinder;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() throws RemoteException {
        ServiceConnectionC0456d serviceConnectionC0456d = this.f6861l;
        IInterface iInterface = (IInterface) serviceConnectionC0456d.f6864a.i.a(this.f6860k);
        C0457e c0457e = serviceConnectionC0456d.f6864a;
        c0457e.f6877n = iInterface;
        C0477z c0477z = c0457e.f6867b;
        c0477z.b("linkToDeath", new Object[0]);
        try {
            c0457e.f6877n.asBinder().linkToDeath(c0457e.f6874k, 0);
        } catch (RemoteException e5) {
            c0477z.a(e5, "linkToDeath failed", new Object[0]);
        }
        c0457e.f6872g = false;
        Iterator it = c0457e.f6869d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c0457e.f6869d.clear();
    }
}
