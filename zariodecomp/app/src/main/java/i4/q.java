package i4;

import Q3.j;
import a.AbstractC0183a;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import java.util.LinkedHashSet;
import java.util.List;
import u0.C0955C;
import u0.C0964e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\q.smali */
public final class q extends j implements X3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7944a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f7945b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ InterfaceC0613h f7946c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(O3.d dVar, k3.u uVar) {
        super(3, dVar);
        this.f7948e = uVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Q3.j, X3.p] */
    public final Object c(Object obj, Object obj2, Object obj3) {
        InterfaceC0613h interfaceC0613h = (InterfaceC0613h) obj;
        O3.d dVar = (O3.d) obj3;
        switch (this.f7944a) {
            case 0:
                q qVar = new q((X3.p) this.f7948e, dVar);
                qVar.f7946c = interfaceC0613h;
                qVar.f7947d = obj2;
                return qVar.invokeSuspend(K3.k.f2288a);
            default:
                q qVar2 = new q(dVar, (k3.u) this.f7948e);
                qVar2.f7946c = interfaceC0613h;
                qVar2.f7947d = obj2;
                return qVar2.invokeSuspend(K3.k.f2288a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0613h interfaceC0613h;
        O0.i iVarQ;
        switch (this.f7944a) {
            case 0:
                P3.a aVar = P3.a.f2678a;
                int i = this.f7945b;
                if (i == 0) {
                    AbstractC0183a.m0(obj);
                    interfaceC0613h = this.f7946c;
                    Object obj2 = this.f7947d;
                    this.f7946c = interfaceC0613h;
                    this.f7945b = 1;
                    obj = ((j) this.f7948e).invoke(obj2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0183a.m0(obj);
                        return K3.k.f2288a;
                    }
                    interfaceC0613h = this.f7946c;
                    AbstractC0183a.m0(obj);
                }
                this.f7946c = null;
                this.f7945b = 2;
                if (interfaceC0613h.b(obj, this) == aVar) {
                    return aVar;
                }
                return K3.k.f2288a;
            default:
                P3.a aVar2 = P3.a.f2678a;
                int i5 = this.f7945b;
                K3.k kVar = K3.k.f2288a;
                if (i5 == 0) {
                    AbstractC0183a.m0(obj);
                    InterfaceC0613h interfaceC0613h2 = this.f7946c;
                    K3.i iVar = (K3.i) this.f7947d;
                    String str = (String) iVar.f2284a;
                    String str2 = (String) iVar.f2285b;
                    String str3 = (String) iVar.f2286c;
                    String str4 = str3 == null ? "" : str3;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (str2 != null && !e4.m.q0(str2)) {
                        linkedHashSet.add(str2);
                    }
                    String strA = str3 != null ? AbstractC0183a.A(str3) : null;
                    String str5 = strA != null ? strA : "";
                    if (!e4.m.q0(str5)) {
                        linkedHashSet.add(str5);
                    }
                    List<String> listU0 = L3.j.u0(linkedHashSet);
                    boolean zIsEmpty = listU0.isEmpty();
                    L3.s sVar = L3.s.f2351a;
                    if (zIsEmpty) {
                        listU0 = e4.m.q0(str4) ? sVar : p1.b.B("__none__");
                    }
                    if (listU0.isEmpty() && e4.m.q0(str4)) {
                        iVarQ = new O0.i(sVar, 2);
                    } else {
                        k3.u uVar = (k3.u) this.f7948e;
                        if (str == null || str.length() == 0) {
                            X2.a aVar3 = uVar.f8357a;
                            if (listU0.isEmpty()) {
                                listU0 = p1.b.B("__none__");
                            }
                            iVarQ = ((S0.e) aVar3).q(str4, listU0);
                        } else {
                            X2.a aVar4 = uVar.f8357a;
                            if (listU0.isEmpty()) {
                                listU0 = p1.b.B("__none__");
                            }
                            S0.e eVar = (S0.e) aVar4;
                            eVar.getClass();
                            StringBuilder sb = new StringBuilder();
                            sb.append("\n        SELECT * FROM evaluation_history\n        WHERE (userId IN (");
                            int size = listU0.size();
                            u0.o.a(size, sb);
                            sb.append(") OR (userEmail = ");
                            sb.append("?");
                            sb.append(" AND userId = ''))");
                            sb.append("\n");
                            sb.append("          AND planLabel = ");
                            sb.append("?");
                            sb.append("\n");
                            sb.append("        ORDER BY evaluationEndTime DESC");
                            sb.append("\n");
                            sb.append("        ");
                            int i6 = size + 2;
                            C0955C c0955cK = C0955C.k(i6, sb.toString());
                            int i7 = 1;
                            for (String str6 : listU0) {
                                if (str6 == null) {
                                    c0955cK.f(i7);
                                } else {
                                    c0955cK.c(i7, str6);
                                }
                                i7++;
                            }
                            c0955cK.c(size + 1, str4);
                            c0955cK.c(i6, str);
                            iVarQ = new O0.i(new C0964e((AppDatabase_Impl) eVar.f2851a, new String[]{"evaluation_history"}, new X2.b(eVar, c0955cK, 2), null));
                        }
                    }
                    this.f7945b = 1;
                    if (interfaceC0613h2 instanceof K) {
                        throw ((K) interfaceC0613h2).f7892a;
                    }
                    Object objC = iVarQ.c(interfaceC0613h2, this);
                    if (objC != P3.a.f2678a) {
                        objC = kVar;
                    }
                    if (objC == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0183a.m0(obj);
                }
                return kVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(X3.p pVar, O3.d dVar) {
        super(3, dVar);
        this.f7948e = (j) pVar;
    }
}
