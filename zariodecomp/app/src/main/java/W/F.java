package W;

import a.AbstractC0183a;
import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\F.smali */
public final class F extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f3493a;

    /* renamed from: b, reason: collision with root package name */
    public int f3494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f3495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f3496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f3497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(kotlin.jvm.internal.r rVar, O o5, kotlin.jvm.internal.p pVar, O3.d dVar) {
        super(1, dVar);
        this.f3495c = rVar;
        this.f3496d = o5;
        this.f3497e = pVar;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new F(this.f3495c, this.f3496d, this.f3497e, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((F) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.r rVar;
        kotlin.jvm.internal.p pVar;
        P3.a aVar = P3.a.f2678a;
        int i = this.f3494b;
        kotlin.jvm.internal.p pVar2 = this.f3497e;
        kotlin.jvm.internal.r rVar2 = this.f3495c;
        O o5 = this.f3496d;
        try {
        } catch (C0160b unused) {
            Object obj2 = rVar2.f8431a;
            this.f3493a = pVar2;
            this.f3494b = 3;
            obj = o5.j(obj2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f3493a = rVar2;
            this.f3494b = 1;
            obj = o5.i(this);
            if (obj == aVar) {
                return aVar;
            }
            rVar = rVar2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    pVar = (kotlin.jvm.internal.p) this.f3493a;
                    AbstractC0183a.m0(obj);
                    pVar.f8429a = ((Number) obj).intValue();
                    return K3.k.f2288a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar2 = (kotlin.jvm.internal.p) this.f3493a;
                AbstractC0183a.m0(obj);
                pVar2.f8429a = ((Number) obj).intValue();
                return K3.k.f2288a;
            }
            rVar = (kotlin.jvm.internal.r) this.f3493a;
            AbstractC0183a.m0(obj);
        }
        rVar.f8431a = obj;
        i0 i0VarF = o5.f();
        this.f3493a = pVar2;
        this.f3494b = 2;
        obj = i0VarF.a();
        if (obj == aVar) {
            return aVar;
        }
        pVar = pVar2;
        pVar.f8429a = ((Number) obj).intValue();
        return K3.k.f2288a;
    }
}
