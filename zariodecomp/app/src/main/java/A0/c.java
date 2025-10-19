package a0;

import K3.k;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a0.1\c.smali */
public final class c extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4019a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, O3.d dVar) {
        super(2, dVar);
        this.f4021c = (j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        c cVar = new c(this.f4021c, dVar);
        cVar.f4020b = obj;
        return cVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f4019a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            b bVar = (b) this.f4020b;
            this.f4019a = 1;
            obj = this.f4021c.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        b bVar2 = (b) obj;
        i.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f4018b.f7594b).set(true);
        return bVar2;
    }
}
