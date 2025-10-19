package w3;

import kotlin.jvm.internal.o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w3.1\g.smali */
public final class g extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public l f10988a;

    /* renamed from: b, reason: collision with root package name */
    public v3.b f10989b;

    /* renamed from: c, reason: collision with root package name */
    public o f10990c;

    /* renamed from: d, reason: collision with root package name */
    public o4.c f10991d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f10993f;

    /* renamed from: k, reason: collision with root package name */
    public int f10994k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Q3.c cVar) {
        super(cVar);
        this.f10993f = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f10992e = obj;
        this.f10994k |= Integer.MIN_VALUE;
        return l.a(this.f10993f, (u3.h) null, this);
    }
}
