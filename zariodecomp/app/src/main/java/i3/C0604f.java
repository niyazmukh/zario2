package i3;

import K3.k;
import O0.i;
import Q3.j;
import V2.o;
import X3.p;
import a.AbstractC0183a;
import e4.m;
import f4.C;
import i4.I;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: i3.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i3.1\f.smali */
public final class C0604f extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public o f7851a;

    /* renamed from: b, reason: collision with root package name */
    public V2.f f7852b;

    /* renamed from: c, reason: collision with root package name */
    public int f7853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0605g f7854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0604f(C0605g c0605g, O3.d dVar) {
        super(2, dVar);
        this.f7854d = c0605g;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0604f(this.f7854d, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0604f) create((C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        V2.f condition;
        o oVar;
        List list;
        int iIntValue;
        P3.a aVar = P3.a.f2678a;
        int i = this.f7853c;
        k kVar = k.f2288a;
        C0605g c0605g = this.f7854d;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                o oVar2 = ((V2.p) c0605g.f7856b.f6945f.b()).f3462b;
                if (oVar2 == null) {
                    return kVar;
                }
                String str = oVar2.f3452a;
                V2.f fVar = oVar2.f3456e;
                String str2 = oVar2.f3453b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (str2 != null && !m.q0(str2)) {
                    linkedHashSet.add(str2);
                }
                String strA = str != null ? AbstractC0183a.A(str) : null;
                if (strA == null) {
                    strA = "";
                }
                if (!m.q0(strA)) {
                    linkedHashSet.add(strA);
                }
                List listU0 = L3.j.u0(linkedHashSet);
                if (listU0.isEmpty()) {
                    listU0 = p1.b.B("__none__");
                }
                i iVarQ = ((S0.e) c0605g.f7855a).q(str, listU0);
                this.f7851a = oVar2;
                this.f7852b = fVar;
                this.f7853c = 1;
                Object objI = i4.C.i(iVarQ, this);
                if (objI == aVar) {
                    return aVar;
                }
                condition = fVar;
                obj = objI;
                oVar = oVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                condition = this.f7852b;
                oVar = this.f7851a;
                AbstractC0183a.m0(obj);
            }
            list = (List) obj;
        } catch (Exception unused) {
            I i5 = c0605g.f7857c;
            C0599a c0599a = new C0599a(false, 0, 0, "", false);
            i5.getClass();
            i5.M(null, c0599a);
        }
        if (list.isEmpty()) {
            I i6 = c0605g.f7857c;
            C0599a c0599a2 = new C0599a(false, 0, 0, "", false);
            i6.getClass();
            i6.M(null, c0599a2);
            return kVar;
        }
        Y2.b bVar = (Y2.b) L3.j.d0(list);
        boolean z4 = bVar.f3888j;
        Integer num = new Integer(oVar.i);
        Integer num2 = new Integer(oVar.f3459j);
        kotlin.jvm.internal.i.e(condition, "condition");
        int iOrdinal = condition.ordinal();
        if (iOrdinal == 0) {
            iIntValue = z4 ? 20 : -10;
        } else if (iOrdinal == 1) {
            iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            if (!z4) {
                iIntValue = -iIntValue2;
            }
        } else {
            if (iOrdinal != 2) {
                throw new B0.c();
            }
            iIntValue = z4 ? 30 : -30;
        }
        int i7 = iIntValue;
        c0605g.getClass();
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext() && ((Y2.b) it.next()).f3888j) {
            i8++;
        }
        I i9 = c0605g.f7857c;
        C0599a c0599a3 = new C0599a(bVar.f3888j, i7, i8, bVar.f3884d, false);
        i9.getClass();
        i9.M(null, c0599a3);
        return kVar;
    }
}
