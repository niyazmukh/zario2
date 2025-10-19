package w3;

import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w3.1\b.smali */
public final class b extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public c f10978a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10979b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f10981d;

    /* renamed from: e, reason: collision with root package name */
    public int f10982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Q3.c cVar2) {
        super(cVar2);
        this.f10981d = cVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f10980c = obj;
        this.f10982e |= Integer.MIN_VALUE;
        return this.f10981d.a(0L, 0L, this);
    }
}
