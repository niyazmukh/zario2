package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.List;
import java.util.Map;

/* renamed from: b3.P, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\P.smali */
public final class C0292P extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w2.g f5185e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0292P(C0294S c0294s, List list, long j5, w2.g gVar, O3.d dVar) {
        super(1, dVar);
        this.f5182b = c0294s;
        this.f5183c = list;
        this.f5184d = j5;
        this.f5185e = gVar;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0292P(this.f5182b, this.f5183c, this.f5184d, this.f5185e, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0292P) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5181a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            FirebaseFirestore firebaseFirestore = this.f5182b.f5190a;
            final long j5 = this.f5184d;
            final w2.g gVar = this.f5185e;
            final List list = this.f5183c;
            Task taskB = firebaseFirestore.b(new w2.F() { // from class: b3.O
                @Override // w2.F
                public final void a(A2.G g3) {
                    int i5 = 0;
                    for (Object obj2 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            L3.k.Z();
                            throw null;
                        }
                        Map map = (Map) obj2;
                        g3.j(gVar.a("packages").b(r1.d.b(String.valueOf(j5), map, i5)), map, w2.B.f10913b);
                        i5 = i6;
                    }
                }
            });
            kotlin.jvm.internal.i.d(taskB, "runBatch(...)");
            this.f5181a = 1;
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
