package b3;

import A2.C0009i;
import A2.C0017q;
import A2.RunnableC0016p;
import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import y2.C1049B;

/* renamed from: b3.H, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\H.smali */
public final class C0284H extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.g f5142c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w2.g f5144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5145f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0284H(C0294S c0294s, w2.g gVar, int i, w2.g gVar2, Map map, O3.d dVar) {
        super(1, dVar);
        this.f5141b = c0294s;
        this.f5142c = gVar;
        this.f5143d = i;
        this.f5144e = gVar2;
        this.f5145f = map;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        w2.g gVar = this.f5144e;
        ?? r5 = this.f5145f;
        return new C0284H(this.f5141b, this.f5142c, this.f5143d, gVar, r5, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0284H) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Task task;
        P3.a aVar = P3.a.f2678a;
        int i = this.f5140a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            FirebaseFirestore firebaseFirestore = this.f5141b.f5190a;
            C0283G c0283g = new C0283G(this.f5142c, this.f5143d, this.f5144e, this.f5145f);
            firebaseFirestore.getClass();
            ThreadPoolExecutor threadPoolExecutor = C1049B.f11057f;
            firebaseFirestore.i.B();
            C0017q c0017q = new C0017q(firebaseFirestore, threadPoolExecutor, c0283g, 5);
            C0009i c0009i = firebaseFirestore.i;
            synchronized (c0009i) {
                c0009i.B();
                y2.o oVar = (y2.o) c0009i.f205c;
                oVar.c();
                F2.d dVar = oVar.f11126d.f1704a;
                y2.l lVar = new y2.l(oVar, c0017q);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                dVar.execute(new RunnableC0016p(lVar, dVar, taskCompletionSource, 1));
                task = taskCompletionSource.getTask();
            }
            kotlin.jvm.internal.i.d(task, "runTransaction(...)");
            this.f5140a = 1;
            obj = AbstractC0156x.e(task, this);
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
