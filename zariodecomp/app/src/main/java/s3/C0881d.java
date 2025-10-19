package s3;

import A2.C0009i;
import a.AbstractC0183a;
import android.os.CancellationSignal;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase_Impl;
import java.util.ArrayList;
import java.util.List;
import u0.C0955C;
import z2.C1071b;

/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\d.1.smali */
public final class C0881d extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f9754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0887j f9758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f9759f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0881d(long j5, long j6, long j7, C0887j c0887j, long j8, O3.d dVar) {
        super(2, dVar);
        this.f9755b = j5;
        this.f9756c = j6;
        this.f9757d = j7;
        this.f9758e = c0887j;
        this.f9759f = j8;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0881d(this.f9755b, this.f9756c, this.f9757d, this.f9758e, this.f9759f, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0881d) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [L3.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        Object objE;
        P3.a aVar = P3.a.f2678a;
        int i = this.f9754a;
        Object arrayList = L3.s.f2351a;
        C0887j c0887j = this.f9758e;
        long j5 = this.f9757d;
        long j6 = this.f9756c;
        long j7 = this.f9755b;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            if (j7 <= 0) {
                throw new IllegalArgumentException("bucketSizeMs must be positive");
            }
            if (j6 >= j5) {
                return arrayList;
            }
            v3.c cVar = c0887j.f9781c;
            this.f9754a = 1;
            C0009i c0009i = (C0009i) cVar;
            C0955C c0955cK = C0955C.k(3, "\n        SELECT * FROM usage_sessions \n        WHERE dayStartMs = ? \n          AND startMs < ? \n          AND endMs > ? \n        ORDER BY startMs\n    ");
            c0955cK.d(1, this.f9759f);
            c0955cK.d(2, j5);
            c0955cK.d(3, j6);
            objE = C1071b.e((UsageAggregationDatabase_Impl) c0009i.f204b, false, new CancellationSignal(), new v3.d(c0009i, c0955cK, 0), this);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            objE = obj;
        }
        List list = (List) objE;
        int i5 = C0887j.f9778f;
        c0887j.getClass();
        if (!list.isEmpty()) {
            arrayList = new ArrayList();
            long j8 = (j6 / j7) * j7;
            while (j8 < j5) {
                long j9 = j8 + j7;
                long j10 = j7;
                long jMin = Math.min(j5, j9);
                long jMax = Math.max(j8, j6);
                if (jMax >= jMin) {
                    j8 = j9;
                } else {
                    arrayList.add(new C0888k(j8, jMin, C0887j.a(list, jMax, jMin)));
                    j8 = jMin;
                }
                j7 = j10;
            }
        }
        return arrayList;
    }
}
