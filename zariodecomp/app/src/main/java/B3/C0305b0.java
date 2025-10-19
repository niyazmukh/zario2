package b3;

import com.niyaz.zario.firebase.RemoteSyncWorker;

/* renamed from: b3.b0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\b0.smali */
public final class C0305b0 extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public RemoteSyncWorker f5220a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f5221b;

    /* renamed from: c, reason: collision with root package name */
    public Y2.d f5222c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RemoteSyncWorker f5224e;

    /* renamed from: f, reason: collision with root package name */
    public int f5225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0305b0(RemoteSyncWorker remoteSyncWorker, Q3.c cVar) {
        super(cVar);
        this.f5224e = remoteSyncWorker;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5223d = obj;
        this.f5225f |= Integer.MIN_VALUE;
        return this.f5224e.e(null, null, this);
    }
}
