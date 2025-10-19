package m3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import f4.C;
import f4.E;

/* renamed from: m3.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\h.smali */
public final class C0754h extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterventionFragment f8867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0754h(InterventionFragment interventionFragment, O3.d dVar) {
        super(2, dVar);
        this.f8867b = interventionFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0754h c0754h = new C0754h(this.f8867b, dVar);
        c0754h.f8866a = obj;
        return c0754h;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0754h c0754h = (C0754h) create((C) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        c0754h.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        C c5 = (C) this.f8866a;
        InterventionFragment interventionFragment = this.f8867b;
        E.t(c5, null, null, new C0752f(interventionFragment, null), 3);
        E.t(c5, null, null, new C0753g(interventionFragment, null), 3);
        return K3.k.f2288a;
    }
}
