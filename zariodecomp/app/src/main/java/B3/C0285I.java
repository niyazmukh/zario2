package b3;

import A2.C0017q;
import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* renamed from: b3.I, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\I.smali */
public final class C0285I extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5148c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w2.g f5150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285I(C0294S c0294s, List list, String str, w2.g gVar, O3.d dVar) {
        super(1, dVar);
        this.f5147b = c0294s;
        this.f5148c = list;
        this.f5149d = str;
        this.f5150e = gVar;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0285I(this.f5147b, this.f5148c, this.f5149d, this.f5150e, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0285I) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5146a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            Task taskB = this.f5147b.f5190a.b(new C0017q(this.f5148c, this.f5149d, this.f5150e, 4));
            kotlin.jvm.internal.i.d(taskB, "runBatch(...)");
            this.f5146a = 1;
            if (AbstractC0156x.e(taskB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return K3.k.f2288a;
    }
}
