package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;

/* renamed from: b3.C, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\C.smali */
public final class C0280C extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5125c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280C(C0294S c0294s, String str, O3.d dVar) {
        super(1, dVar);
        this.f5124b = c0294s;
        this.f5125c = str;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0280C(this.f5124b, this.f5125c, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0280C) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5123a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            Task taskB = this.f5124b.f(this.f5125c).b();
            kotlin.jvm.internal.i.d(taskB, "get(...)");
            this.f5123a = 1;
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
