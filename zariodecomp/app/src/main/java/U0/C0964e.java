package u0;

import K3.k;
import a.AbstractC0183a;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import i4.InterfaceC0613h;
import java.util.concurrent.Callable;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\e.1.smali */
public final class C0964e extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f10401a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f10403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f10404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f10405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0964e(AppDatabase_Impl appDatabase_Impl, String[] strArr, Callable callable, O3.d dVar) {
        super(2, dVar);
        this.f10403c = appDatabase_Impl;
        this.f10404d = strArr;
        this.f10405e = callable;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0964e c0964e = new C0964e(this.f10403c, this.f10404d, this.f10405e, dVar);
        c0964e.f10402b = obj;
        return c0964e;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0964e) create((InterfaceC0613h) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f10401a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            C0963d c0963d = new C0963d(this.f10403c, (InterfaceC0613h) this.f10402b, this.f10404d, this.f10405e, null);
            this.f10401a = 1;
            if (f4.E.g(c0963d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return k.f2288a;
    }
}
