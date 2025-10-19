package e2;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\c.1.smali */
public final class C0455c extends AbstractRunnableC0449A {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6862k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6863l;

    public /* synthetic */ C0455c(Object obj, int i) {
        this.f6862k = i;
        this.f6863l = obj;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() {
        switch (this.f6862k) {
            case 0:
                ServiceConnectionC0456d serviceConnectionC0456d = (ServiceConnectionC0456d) this.f6863l;
                C0457e c0457e = serviceConnectionC0456d.f6864a;
                c0457e.f6867b.b("unlinkToDeath", new Object[0]);
                c0457e.f6877n.asBinder().unlinkToDeath(c0457e.f6874k, 0);
                C0457e c0457e2 = serviceConnectionC0456d.f6864a;
                c0457e2.f6877n = null;
                c0457e2.f6872g = false;
                return;
            default:
                synchronized (((C0457e) this.f6863l).f6871f) {
                    try {
                        if (((C0457e) this.f6863l).f6875l.get() > 0 && ((C0457e) this.f6863l).f6875l.decrementAndGet() > 0) {
                            ((C0457e) this.f6863l).f6867b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C0457e c0457e3 = (C0457e) this.f6863l;
                        if (c0457e3.f6877n != null) {
                            c0457e3.f6867b.b("Unbind from service.", new Object[0]);
                            C0457e c0457e4 = (C0457e) this.f6863l;
                            c0457e4.f6866a.unbindService(c0457e4.f6876m);
                            C0457e c0457e5 = (C0457e) this.f6863l;
                            c0457e5.f6872g = false;
                            c0457e5.f6877n = null;
                            c0457e5.f6876m = null;
                        }
                        ((C0457e) this.f6863l).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
