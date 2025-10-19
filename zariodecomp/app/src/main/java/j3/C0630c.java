package j3;

import X3.p;
import a.AbstractC0183a;
import com.niyaz.zario.ui.flexstakes.FlexStakesFragment;
import f4.C;
import f4.E;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j3.1\c.smali */
public final class C0630c extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexStakesFragment f8046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630c(FlexStakesFragment flexStakesFragment, O3.d dVar) {
        super(2, dVar);
        this.f8046b = flexStakesFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0630c c0630c = new C0630c(this.f8046b, dVar);
        c0630c.f8045a = obj;
        return c0630c;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0630c c0630c = (C0630c) create((C) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        c0630c.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        E.t((C) this.f8045a, null, null, new C0629b(this.f8046b, null), 3);
        return K3.k.f2288a;
    }
}
