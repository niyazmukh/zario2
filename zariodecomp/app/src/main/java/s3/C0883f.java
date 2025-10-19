package s3;

import java.util.ArrayList;

/* renamed from: s3.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\f.1.smali */
public final class C0883f extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f9763a;

    /* renamed from: b, reason: collision with root package name */
    public int f9764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9765c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0887j f9767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0883f(long j5, long j6, O3.d dVar, C0887j c0887j) {
        super(2, dVar);
        this.f9765c = j5;
        this.f9766d = j6;
        this.f9767e = c0887j;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0883f(this.f9765c, this.f9766d, dVar, this.f9767e);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0883f) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035a A[LOOP:0: B:138:0x0354->B:140:0x035a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable, java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C0883f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
