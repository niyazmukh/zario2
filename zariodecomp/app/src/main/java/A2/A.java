package A2;

import a.AbstractC0183a;
import com.google.protobuf.AbstractC0409l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s2.C0870e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\A.smali */
public final class A implements D {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f66a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public C0870e f67b = new C0870e(Collections.emptyList(), C0003c.f170c);

    /* renamed from: c, reason: collision with root package name */
    public int f68c = 1;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0409l f69d = E2.I.f1420u;

    /* renamed from: e, reason: collision with root package name */
    public final B f70e;

    /* renamed from: f, reason: collision with root package name */
    public final h1.i f71f;

    public A(B b5) {
        this.f70e = b5;
        this.f71f = b5.f74d;
    }

    @Override // A2.D
    public final AbstractC0409l a() {
        return this.f69d;
    }

    @Override // A2.D
    public final void b() {
        if (this.f66a.isEmpty()) {
            AbstractC0183a.N(this.f67b.f9681a.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // A2.D
    public final C2.i c(int i) {
        int iK = k(i + 1);
        if (iK < 0) {
            iK = 0;
        }
        ArrayList arrayList = this.f66a;
        if (arrayList.size() > iK) {
            return (C2.i) arrayList.get(iK);
        }
        return null;
    }

    @Override // A2.D
    public final C2.i d(l2.o oVar, ArrayList arrayList, List list) {
        AbstractC0183a.N(!list.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i = this.f68c;
        this.f68c = i + 1;
        ArrayList arrayList2 = this.f66a;
        int size = arrayList2.size();
        if (size > 0) {
            AbstractC0183a.N(((C2.i) arrayList2.get(size - 1)).f1087a < i, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        C2.i iVar = new C2.i(i, oVar, arrayList, list);
        arrayList2.add(iVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2.h hVar = (C2.h) it.next();
            this.f67b = this.f67b.f(new C0003c(hVar.f1084a, i));
            ((g1.i) this.f71f.f7641b).i(hVar.f1084a.d());
        }
        return iVar;
    }

    @Override // A2.D
    public final void e(C2.i iVar, AbstractC0409l abstractC0409l) {
        int i = iVar.f1087a;
        int iK = k(i);
        ArrayList arrayList = this.f66a;
        AbstractC0183a.N(iK >= 0 && iK < arrayList.size(), "Batches must exist to be %s", "acknowledged");
        AbstractC0183a.N(iK == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        C2.i iVar2 = (C2.i) arrayList.get(iK);
        AbstractC0183a.N(i == iVar2.f1087a, "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(i), Integer.valueOf(iVar2.f1087a));
        abstractC0409l.getClass();
        this.f69d = abstractC0409l;
    }

    @Override // A2.D
    public final void f(C2.i iVar) {
        int iK = k(iVar.f1087a);
        ArrayList arrayList = this.f66a;
        AbstractC0183a.N(iK >= 0 && iK < arrayList.size(), "Batches must exist to be %s", "removed");
        AbstractC0183a.N(iK == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        arrayList.remove(0);
        C0870e c0870eH = this.f67b;
        Iterator it = iVar.f1090d.iterator();
        while (it.hasNext()) {
            B2.h hVar = ((C2.h) it.next()).f1084a;
            this.f70e.f77g.c(hVar);
            c0870eH = c0870eH.h(new C0003c(hVar, iVar.f1087a));
        }
        this.f67b = c0870eH;
    }

    @Override // A2.D
    public final void g(AbstractC0409l abstractC0409l) {
        abstractC0409l.getClass();
        this.f69d = abstractC0409l;
    }

    @Override // A2.D
    public final List h() {
        return Collections.unmodifiableList(this.f66a);
    }

    @Override // A2.D
    public final ArrayList i(Set set) {
        List listEmptyList = Collections.emptyList();
        E2.n nVar = F2.s.f1736a;
        C0870e c0870e = new C0870e(listEmptyList, new C0002b(8));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            s2.d dVarG = this.f67b.g(new C0003c(hVar, 0));
            while (((Iterator) dVarG.f9680b).hasNext()) {
                C0003c c0003c = (C0003c) dVarG.next();
                if (!hVar.equals(c0003c.f172a)) {
                    break;
                }
                c0870e = c0870e.f(Integer.valueOf(c0003c.f173b));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c0870e.iterator();
        while (true) {
            s2.d dVar = (s2.d) it2;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return arrayList;
            }
            C2.i iVarJ = j(((Integer) dVar.next()).intValue());
            if (iVarJ != null) {
                arrayList.add(iVarJ);
            }
        }
    }

    @Override // A2.D
    public final C2.i j(int i) {
        int iK = k(i);
        if (iK < 0) {
            return null;
        }
        ArrayList arrayList = this.f66a;
        if (iK >= arrayList.size()) {
            return null;
        }
        C2.i iVar = (C2.i) arrayList.get(iK);
        AbstractC0183a.N(iVar.f1087a == i, "If found batch must match", new Object[0]);
        return iVar;
    }

    public final int k(int i) {
        ArrayList arrayList = this.f66a;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return i - ((C2.i) arrayList.get(0)).f1087a;
    }

    @Override // A2.D
    public final void start() {
        if (this.f66a.isEmpty()) {
            this.f68c = 1;
        }
    }
}
