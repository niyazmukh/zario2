package W;

import a.AbstractC0183a;
import java.util.List;

/* renamed from: W.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\e.1.smali */
public final class C0163e extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f3586a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0163e(List list, O3.d dVar) {
        super(2, dVar);
        this.f3588c = list;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0163e c0163e = new C0163e(this.f3588c, dVar);
        c0163e.f3587b = obj;
        return c0163e;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0163e) create((C0170l) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3586a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            C0170l c0170l = (C0170l) this.f3587b;
            this.f3586a = 1;
            if (AbstractC0183a.d(this.f3588c, c0170l, this) == aVar) {
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
