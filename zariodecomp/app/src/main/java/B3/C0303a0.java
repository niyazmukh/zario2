package b3;

import com.niyaz.zario.firebase.RemoteSyncWorker;
import java.util.Iterator;

/* renamed from: b3.a0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\a0.smali */
public final class C0303a0 extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public RemoteSyncWorker f5210a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.o f5211b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f5212c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5213d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5214e;

    /* renamed from: f, reason: collision with root package name */
    public RemoteSyncWorker f5215f;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5216k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RemoteSyncWorker f5217l;

    /* renamed from: m, reason: collision with root package name */
    public int f5218m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0303a0(RemoteSyncWorker remoteSyncWorker, Q3.c cVar) {
        super(cVar);
        this.f5217l = remoteSyncWorker;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5216k = obj;
        this.f5218m |= Integer.MIN_VALUE;
        return RemoteSyncWorker.d(this.f5217l, null, this);
    }
}
