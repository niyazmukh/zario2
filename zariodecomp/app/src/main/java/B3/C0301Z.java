package b3;

import com.niyaz.zario.firebase.RemoteSyncWorker;

/* renamed from: b3.Z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\Z.smali */
public final class C0301Z extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public RemoteSyncWorker f5204a;

    /* renamed from: b, reason: collision with root package name */
    public Y2.d f5205b;

    /* renamed from: c, reason: collision with root package name */
    public RemoteSyncWorker f5206c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RemoteSyncWorker f5208e;

    /* renamed from: f, reason: collision with root package name */
    public int f5209f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301Z(RemoteSyncWorker remoteSyncWorker, Q3.c cVar) {
        super(cVar);
        this.f5208e = remoteSyncWorker;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5207d = obj;
        this.f5209f |= Integer.MIN_VALUE;
        return RemoteSyncWorker.c(this.f5208e, null, this);
    }
}
