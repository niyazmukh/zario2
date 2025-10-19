package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: b3.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\i.1.smali */
public final class C0314i extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0316k f5261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R2.a f5262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0314i(C0316k c0316k, R2.a aVar, O3.d dVar) {
        super(1, dVar);
        this.f5261b = c0316k;
        this.f5262c = aVar;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0314i(this.f5261b, this.f5262c, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0314i) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5260a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            FirebaseAuth firebaseAuth = this.f5261b.f5270a;
            R2.a aVar2 = this.f5262c;
            String str = aVar2.f2836a;
            String str2 = aVar2.f2837b;
            firebaseAuth.getClass();
            com.google.android.gms.common.internal.C.d(str);
            com.google.android.gms.common.internal.C.d(str2);
            Task taskV = new o2.I(firebaseAuth, str, str2).V(firebaseAuth, firebaseAuth.i, firebaseAuth.f6378m);
            kotlin.jvm.internal.i.d(taskV, "createUserWithEmailAndPassword(...)");
            this.f5260a = 1;
            obj = AbstractC0156x.e(taskV, this);
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
