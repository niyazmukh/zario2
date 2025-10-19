package F0;

import N2.AbstractC0156x;
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\a.smali */
public final class a extends n {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f1577A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1578B;

    /* renamed from: C, reason: collision with root package name */
    public int f1579C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1580D;

    /* renamed from: E, reason: collision with root package name */
    public int f1581E;

    @Override // F0.n
    public final void A(TimeInterpolator timeInterpolator) {
        this.f1581E |= 1;
        ArrayList arrayList = this.f1577A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((n) this.f1577A.get(i)).A(timeInterpolator);
            }
        }
        this.f1620d = timeInterpolator;
    }

    @Override // F0.n
    public final void B(X1.e eVar) {
        super.B(eVar);
        this.f1581E |= 4;
        if (this.f1577A != null) {
            for (int i = 0; i < this.f1577A.size(); i++) {
                ((n) this.f1577A.get(i)).B(eVar);
            }
        }
    }

    @Override // F0.n
    public final void C() {
        this.f1581E |= 2;
        int size = this.f1577A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f1577A.get(i)).C();
        }
    }

    @Override // F0.n
    public final void D(long j5) {
        this.f1618b = j5;
    }

    @Override // F0.n
    public final String F(String str) {
        String strF = super.F(str);
        for (int i = 0; i < this.f1577A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strF);
            sb.append("\n");
            sb.append(((n) this.f1577A.get(i)).F(str + "  "));
            strF = sb.toString();
        }
        return strF;
    }

    public final void G(n nVar) {
        this.f1577A.add(nVar);
        nVar.f1625m = this;
        long j5 = this.f1619c;
        if (j5 >= 0) {
            nVar.y(j5);
        }
        if ((this.f1581E & 1) != 0) {
            nVar.A(this.f1620d);
        }
        if ((this.f1581E & 2) != 0) {
            nVar.C();
        }
        if ((this.f1581E & 4) != 0) {
            nVar.B(this.f1635w);
        }
        if ((this.f1581E & 8) != 0) {
            nVar.z(null);
        }
    }

    @Override // F0.n
    public final void c() {
        super.c();
        int size = this.f1577A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f1577A.get(i)).c();
        }
    }

    @Override // F0.n
    public final void d(s sVar) {
        if (s(sVar.f1644b)) {
            Iterator it = this.f1577A.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.s(sVar.f1644b)) {
                    nVar.d(sVar);
                    sVar.f1645c.add(nVar);
                }
            }
        }
    }

    @Override // F0.n
    public final void f(s sVar) {
        int size = this.f1577A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f1577A.get(i)).f(sVar);
        }
    }

    @Override // F0.n
    public final void g(s sVar) {
        if (s(sVar.f1644b)) {
            Iterator it = this.f1577A.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.s(sVar.f1644b)) {
                    nVar.g(sVar);
                    sVar.f1645c.add(nVar);
                }
            }
        }
    }

    @Override // F0.n
    /* renamed from: j */
    public final n clone() {
        a aVar = (a) super.clone();
        aVar.f1577A = new ArrayList();
        int size = this.f1577A.size();
        for (int i = 0; i < size; i++) {
            n nVarClone = ((n) this.f1577A.get(i)).clone();
            aVar.f1577A.add(nVarClone);
            nVarClone.f1625m = aVar;
        }
        return aVar;
    }

    @Override // F0.n
    public final void l(FrameLayout frameLayout, S0.i iVar, S0.i iVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j5 = this.f1618b;
        int size = this.f1577A.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) this.f1577A.get(i);
            if (j5 > 0 && (this.f1578B || i == 0)) {
                long j6 = nVar.f1618b;
                if (j6 > 0) {
                    nVar.D(j6 + j5);
                } else {
                    nVar.D(j5);
                }
            }
            nVar.l(frameLayout, iVar, iVar2, arrayList, arrayList2);
        }
    }

    @Override // F0.n
    public final void u(ViewGroup viewGroup) {
        super.u(viewGroup);
        int size = this.f1577A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f1577A.get(i)).u(viewGroup);
        }
    }

    @Override // F0.n
    public final void w(FrameLayout frameLayout) {
        super.w(frameLayout);
        int size = this.f1577A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f1577A.get(i)).w(frameLayout);
        }
    }

    @Override // F0.n
    public final void x() {
        if (this.f1577A.isEmpty()) {
            E();
            m();
            return;
        }
        h hVar = new h();
        hVar.f1600b = this;
        Iterator it = this.f1577A.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(hVar);
        }
        this.f1579C = this.f1577A.size();
        if (this.f1578B) {
            Iterator it2 = this.f1577A.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).x();
            }
            return;
        }
        for (int i = 1; i < this.f1577A.size(); i++) {
            ((n) this.f1577A.get(i - 1)).a(new h((n) this.f1577A.get(i), 1));
        }
        n nVar = (n) this.f1577A.get(0);
        if (nVar != null) {
            nVar.x();
        }
    }

    @Override // F0.n
    public final void y(long j5) {
        ArrayList arrayList;
        this.f1619c = j5;
        if (j5 < 0 || (arrayList = this.f1577A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f1577A.get(i)).y(j5);
        }
    }

    @Override // F0.n
    public final void z(AbstractC0156x abstractC0156x) {
        this.f1581E |= 8;
        int size = this.f1577A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f1577A.get(i)).z(abstractC0156x);
        }
    }
}
