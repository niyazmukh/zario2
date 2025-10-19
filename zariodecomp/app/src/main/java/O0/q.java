package o0;

import android.os.Bundle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\q.smali */
public final class q extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f9105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0767B f9106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f9107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f9108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlin.jvm.internal.o oVar, C0767B c0767b, x xVar, Bundle bundle) {
        super(1);
        this.f9105a = oVar;
        this.f9106b = c0767b;
        this.f9107c = xVar;
        this.f9108d = bundle;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        C0787j it = (C0787j) obj;
        kotlin.jvm.internal.i.e(it, "it");
        this.f9105a.f8428a = true;
        L3.s sVar = L3.s.f2351a;
        this.f9106b.a(this.f9107c, this.f9108d, it, sVar);
        return K3.k.f2288a;
    }
}
