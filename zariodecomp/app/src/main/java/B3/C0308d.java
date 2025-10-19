package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\d.1.smali */
public final class C0308d extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0316k f5236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0308d(C0316k c0316k, String str, String str2, O3.d dVar) {
        super(1, dVar);
        this.f5236b = c0316k;
        this.f5237c = str;
        this.f5238d = str2;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0308d(this.f5236b, this.f5237c, this.f5238d, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0308d) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5235a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            FirebaseAuth firebaseAuth = this.f5236b.f5270a;
            firebaseAuth.getClass();
            String str = this.f5237c;
            com.google.android.gms.common.internal.C.d(str);
            String str2 = this.f5238d;
            com.google.android.gms.common.internal.C.d(str2);
            String str3 = firebaseAuth.i;
            Task taskV = new o2.K(firebaseAuth, str, false, null, str2, str3).V(firebaseAuth, str3, firebaseAuth.f6377l);
            kotlin.jvm.internal.i.d(taskV, "signInWithEmailAndPassword(...)");
            this.f5235a = 1;
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
