package u0;

import K3.k;
import a.AbstractC0183a;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import i4.InterfaceC0613h;
import java.util.concurrent.Callable;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\d.1.smali */
public final class C0963d extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f10395a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f10397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0613h f10398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f10399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Callable f10400f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963d(AppDatabase_Impl appDatabase_Impl, InterfaceC0613h interfaceC0613h, String[] strArr, Callable callable, O3.d dVar) {
        super(2, dVar);
        this.f10397c = appDatabase_Impl;
        this.f10398d = interfaceC0613h;
        this.f10399e = strArr;
        this.f10400f = callable;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0963d c0963d = new C0963d(this.f10397c, this.f10398d, this.f10399e, this.f10400f, dVar);
        c0963d.f10396b = obj;
        return c0963d;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0963d) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f10395a;
        k kVar = k.f2288a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            f4.C c5 = (f4.C) this.f10396b;
            h4.g gVarC = AbstractC0183a.c(-1, 6, null);
            C0962c c0962c = new C0962c(this.f10399e, gVarC, 0);
            gVarC.c(kVar);
            C0959G c0959g = (C0959G) c5.e().get(C0959G.f10383c);
            AppDatabase_Impl appDatabase_Impl = this.f10397c;
            O3.f fVarD = c0959g != null ? c0959g.f10384a : AbstractC0967h.d(appDatabase_Impl);
            h4.g gVarC2 = AbstractC0183a.c(0, 7, null);
            f4.E.t(c5, fVarD, null, new C0961b(appDatabase_Impl, c0962c, gVarC, this.f10400f, gVarC2, null), 2);
            this.f10395a = 1;
            Object objH = i4.C.h(this.f10398d, gVarC2, true, this);
            if (objH != aVar) {
                objH = kVar;
            }
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return kVar;
    }
}
