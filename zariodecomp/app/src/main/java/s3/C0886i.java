package s3;

import A2.C0009i;
import a.AbstractC0183a;
import java.util.List;

/* renamed from: s3.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\i.1.smali */
public final class C0886i extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f9774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0887j f9775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0886i(long j5, long j6, O3.d dVar, C0887j c0887j) {
        super(2, dVar);
        this.f9775b = c0887j;
        this.f9776c = j5;
        this.f9777d = j6;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0886i(this.f9776c, this.f9777d, dVar, this.f9775b);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0886i) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9774a;
        C0887j c0887j = this.f9775b;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            v3.c cVar = c0887j.f9781c;
            this.f9774a = 1;
            obj = ((C0009i) cVar).f0(this.f9776c, this.f9777d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        int i5 = C0887j.f9778f;
        c0887j.getClass();
        long j5 = this.f9776c;
        long j6 = this.f9777d;
        return new J(j5, j6, C0887j.a((List) obj, j5, j6));
    }
}
