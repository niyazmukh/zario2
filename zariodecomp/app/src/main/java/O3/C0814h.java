package o3;

import Q1.l;
import V2.o;
import X3.p;
import a.AbstractC0183a;
import i4.I;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o3.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\h.smali */
public final class C0814h extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f9256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f9257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0814h(k kVar, o oVar, O3.d dVar) {
        super(2, dVar);
        this.f9256b = kVar;
        this.f9257c = oVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0814h c0814h = new C0814h(this.f9256b, this.f9257c, dVar);
        c0814h.f9255a = obj;
        return c0814h;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0814h c0814h = (C0814h) create((List) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        c0814h.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        int iU;
        List list;
        Object obj2;
        C0814h c0814h = this;
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        List<Y2.b> listO0 = L3.j.o0(new l(3), (List) c0814h.f9255a);
        k kVar = c0814h.f9256b;
        kVar.getClass();
        boolean zIsEmpty = listO0.isEmpty();
        ZoneId zoneId = kVar.f9269e;
        int i = 0;
        if (zIsEmpty) {
            iU = 0;
        } else {
            Iterator it = listO0.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            long j5 = ((Y2.b) it.next()).h;
            while (it.hasNext()) {
                long j6 = ((Y2.b) it.next()).h;
                if (j5 > j6) {
                    j5 = j6;
                }
            }
            iU = (int) (S0.f.u(ChronoUnit.DAYS.between(Instant.ofEpochMilli(j5).atZone(zoneId).toLocalDate(), LocalDate.now(zoneId)), 0L) + 1);
        }
        if (!listO0.isEmpty()) {
            Iterator it2 = listO0.iterator();
            while (it2.hasNext()) {
                if (((Y2.b) it2.next()).f3888j && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        int size = listO0.size();
        ArrayList arrayList = new ArrayList(L3.l.a0(listO0));
        for (Y2.b bVar : listO0) {
            EnumC0812f enumC0812f = bVar.f3888j ? EnumC0812f.f9244a : EnumC0812f.f9245b;
            String str = Instant.ofEpochMilli(bVar.i).atZone(zoneId).toLocalDate().format(kVar.f9270f);
            kotlin.jvm.internal.i.d(str, "format(...)");
            arrayList.add(new C0811e(bVar.f3881a, str, enumC0812f, bVar.f3890l));
        }
        while (true) {
            I i5 = kVar.f9267c;
            Object objK = i5.K();
            C0813g c0813g = (C0813g) objK;
            o oVar = c0814h.f9257c;
            String email = oVar.f3452a;
            Iterator it3 = listO0.iterator();
            if (it3.hasNext()) {
                Object next = it3.next();
                if (it3.hasNext()) {
                    long j7 = ((Y2.b) next).i;
                    while (true) {
                        Object next2 = it3.next();
                        list = listO0;
                        long j8 = ((Y2.b) next2).i;
                        if (j7 < j8) {
                            j7 = j8;
                            next = next2;
                        }
                        if (!it3.hasNext()) {
                            break;
                        }
                        listO0 = list;
                    }
                } else {
                    list = listO0;
                }
                obj2 = next;
            } else {
                obj2 = null;
                list = listO0;
            }
            Y2.b bVar2 = (Y2.b) obj2;
            int i6 = bVar2 != null ? bVar2.f3890l : oVar.f3457f;
            Integer num = new Integer(oVar.i);
            Integer num2 = new Integer(oVar.f3459j);
            c0813g.getClass();
            kotlin.jvm.internal.i.e(email, "email");
            ArrayList arrayList2 = arrayList;
            if (i5.J(objK, new C0813g(false, email, iU, i, size, i6, arrayList, oVar.f3456e, num, num2))) {
                return K3.k.f2288a;
            }
            c0814h = this;
            listO0 = list;
            arrayList = arrayList2;
        }
    }
}
