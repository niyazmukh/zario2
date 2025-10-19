package b3;

import com.niyaz.zario.firebase.RemoteSyncWorker;

/* renamed from: b3.W, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\W.smali */
public final class C0298W extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RemoteSyncWorker f5194b;

    /* renamed from: c, reason: collision with root package name */
    public int f5195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0298W(RemoteSyncWorker remoteSyncWorker, Q3.c cVar) {
        super(cVar);
        this.f5194b = remoteSyncWorker;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5193a = obj;
        this.f5195c |= Integer.MIN_VALUE;
        return this.f5194b.doWork(this);
    }
}
