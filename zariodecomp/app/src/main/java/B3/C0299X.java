package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.niyaz.zario.firebase.RemoteSyncWorker;
import o2.C0803g;

/* renamed from: b3.X, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\X.smali */
public final class C0299X extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RemoteSyncWorker f5197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0299X(RemoteSyncWorker remoteSyncWorker, O3.d dVar) {
        super(1, dVar);
        this.f5197b = remoteSyncWorker;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0299X(this.f5197b, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0299X) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o2.g, p2.s] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5196a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            o2.o oVar = this.f5197b.f6639a.f6373f;
            if (oVar != null) {
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(l2.f.d(((p2.e) oVar).f9330c));
                firebaseAuth.getClass();
                Task<Void> taskZza = firebaseAuth.f6372e.zza(firebaseAuth.f6368a, oVar, (p2.s) new C0803g(firebaseAuth, 0));
                if (taskZza != null) {
                    this.f5196a = 1;
                    obj = AbstractC0156x.e(taskZza, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0183a.m0(obj);
        return (Void) obj;
    }
}
