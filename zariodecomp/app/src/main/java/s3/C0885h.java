package s3;

import A2.C0009i;
import a.AbstractC0183a;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase_Impl;
import v3.InterfaceC1003a;
import z2.C1071b;

/* renamed from: s3.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\h.1.smali */
public final class C0885h extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f9771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0887j f9772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0885h(C0887j c0887j, long j5, O3.d dVar) {
        super(2, dVar);
        this.f9772b = c0887j;
        this.f9773c = j5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0885h(this.f9772b, this.f9773c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0885h) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9771a;
        long j5 = this.f9773c;
        C0887j c0887j = this.f9772b;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            v3.c cVar = c0887j.f9781c;
            this.f9771a = 1;
            C0009i c0009i = (C0009i) cVar;
            if (C1071b.d((UsageAggregationDatabase_Impl) c0009i.f204b, new X2.j(c0009i, j5, 2), this) == aVar) {
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
            AbstractC0183a.m0(obj);
        }
        InterfaceC1003a interfaceC1003a = c0887j.f9782d;
        this.f9771a = 2;
        C0009i c0009i2 = (C0009i) interfaceC1003a;
        if (C1071b.d((UsageAggregationDatabase_Impl) c0009i2.f204b, new X2.j(c0009i2, j5, 1), this) == aVar) {
            return aVar;
        }
        return K3.k.f2288a;
    }
}
