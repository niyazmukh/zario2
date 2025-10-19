package s3;

import A2.C0009i;
import a.AbstractC0183a;
import android.os.CancellationSignal;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase_Impl;
import u0.C0955C;
import z2.C1071b;

/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\e.1.smali */
public final class C0882e extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f9760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0887j f9761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0882e(C0887j c0887j, long j5, O3.d dVar) {
        super(2, dVar);
        this.f9761b = c0887j;
        this.f9762c = j5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0882e(this.f9761b, this.f9762c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0882e) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9760a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            v3.c cVar = this.f9761b.f9781c;
            this.f9760a = 1;
            C0009i c0009i = (C0009i) cVar;
            C0955C c0955cK = C0955C.k(2, "SELECT * FROM usage_sessions WHERE startMs <= ? AND endMs >= ? ORDER BY endMs DESC LIMIT 1");
            long j5 = this.f9762c;
            c0955cK.d(1, j5);
            c0955cK.d(2, j5);
            obj = C1071b.e((UsageAggregationDatabase_Impl) c0009i.f204b, false, new CancellationSignal(), new v3.d(c0009i, c0955cK, 2), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        v3.e eVar = (v3.e) obj;
        if (eVar != null) {
            return eVar.f10682a;
        }
        return null;
    }
}
