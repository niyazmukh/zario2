package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

/* renamed from: b3.N, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\N.smali */
public final class C0290N extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.g f5173c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5176f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f5177k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0290N(C0294S c0294s, w2.g gVar, String str, long j5, long j6, long j7, O3.d dVar) {
        super(1, dVar);
        this.f5172b = c0294s;
        this.f5173c = gVar;
        this.f5174d = str;
        this.f5175e = j5;
        this.f5176f = j6;
        this.f5177k = j7;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0290N(this.f5172b, this.f5173c, this.f5174d, this.f5175e, this.f5176f, this.f5177k, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0290N) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5171a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            FirebaseFirestore firebaseFirestore = this.f5172b.f5190a;
            final w2.g gVar = this.f5173c;
            final long j5 = this.f5176f;
            final long j6 = this.f5177k;
            final String str = this.f5174d;
            final long j7 = this.f5175e;
            Task taskB = firebaseFirestore.b(new w2.F() { // from class: b3.M
                @Override // w2.F
                public final void a(A2.G g3) {
                    g3.j(gVar, L3.x.c0(new K3.e("planLabel", str), new K3.e("cycleStartTime", Long.valueOf(j7)), new K3.e("hourStartTime", Long.valueOf(j5)), new K3.e("hourEndTime", Long.valueOf(j6))), w2.B.f10913b);
                }
            });
            kotlin.jvm.internal.i.d(taskB, "runBatch(...)");
            this.f5171a = 1;
            obj = AbstractC0156x.e(taskB, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return obj;
    }
}
