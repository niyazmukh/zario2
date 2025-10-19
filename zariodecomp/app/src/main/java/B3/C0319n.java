package b3;

import a.AbstractC0183a;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u0.AbstractC0953A;

/* renamed from: b3.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\n.1.smali */
public final class C0319n extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y2.b f5282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f5284f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0324s f5285k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0319n(String str, String str2, Y2.b bVar, int i, List list, C0324s c0324s, O3.d dVar) {
        super(2, dVar);
        this.f5280b = str;
        this.f5281c = str2;
        this.f5282d = bVar;
        this.f5283e = i;
        this.f5284f = list;
        this.f5285k = c0324s;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0319n(this.f5280b, this.f5281c, this.f5282d, this.f5283e, this.f5284f, this.f5285k, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0319n) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5279a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            return obj;
        }
        AbstractC0183a.m0(obj);
        Y2.b bVar = this.f5282d;
        String strValueOf = String.valueOf(bVar.i);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.f5281c;
        final Y2.d dVar = new Y2.d(0L, this.f5280b, str, strValueOf, bVar.f3884d, bVar.f3885e, bVar.f3886f, bVar.f3887g, bVar.h, bVar.i, bVar.f3888j, bVar.f3889k, this.f5283e, 0, null, jCurrentTimeMillis);
        List list = this.f5284f;
        ArrayList arrayList = new ArrayList(L3.l.a0(list));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            Y2.a aVar2 = (Y2.a) it.next();
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new Y2.f(this.f5280b, str, aVar2.f3877d, aVar2.f3878e, aVar2.f3879f, aVar2.f3880g, aVar2.h, aVar2.i, Y2.e.f3910a));
            arrayList = arrayList2;
        }
        final ArrayList arrayList3 = arrayList;
        C0324s c0324s = this.f5285k;
        this.f5279a = 1;
        final X2.o oVar = (X2.o) c0324s.f5308c;
        oVar.getClass();
        Object objE = AbstractC0953A.e((AppDatabase_Impl) oVar.f3847a, new X3.l() { // from class: X2.h
            @Override // X3.l
            public final Object invoke(Object obj2) {
                o oVar2 = oVar;
                oVar2.getClass();
                return S0.f.L(oVar2, dVar, arrayList3, (O3.d) obj2);
            }
        }, this);
        return objE == aVar ? aVar : objE;
    }
}
