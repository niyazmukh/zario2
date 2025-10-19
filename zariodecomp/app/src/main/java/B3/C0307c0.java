package b3;

import com.niyaz.zario.firebase.RemoteSyncWorker;

/* renamed from: b3.c0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\c0.smali */
public final class C0307c0 extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public RemoteSyncWorker f5229a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f5230b;

    /* renamed from: c, reason: collision with root package name */
    public Y2.f f5231c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RemoteSyncWorker f5233e;

    /* renamed from: f, reason: collision with root package name */
    public int f5234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0307c0(RemoteSyncWorker remoteSyncWorker, Q3.c cVar) {
        super(cVar);
        this.f5233e = remoteSyncWorker;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5232d = obj;
        this.f5234f |= Integer.MIN_VALUE;
        return this.f5233e.f(null, null, this);
    }
}
