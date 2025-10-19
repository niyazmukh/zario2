package v;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\g.smali */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f10540m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f10534e = 2;
        } else {
            this.f10534e = 3;
        }
    }

    @Override // v.f
    public final void d(int i) {
        if (this.f10537j) {
            return;
        }
        this.f10537j = true;
        this.f10536g = i;
        Iterator it = this.f10538k.iterator();
        while (it.hasNext()) {
            InterfaceC0975d interfaceC0975d = (InterfaceC0975d) it.next();
            interfaceC0975d.a(interfaceC0975d);
        }
    }
}
