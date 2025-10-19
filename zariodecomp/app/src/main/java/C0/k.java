package c0;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\k.smali */
public final class k extends p1.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.b f5366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f5367g;

    public k(p1.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f5366f = bVar;
        this.f5367g = threadPoolExecutor;
    }

    @Override // p1.b
    public final void E(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f5367g;
        try {
            this.f5366f.E(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p1.b
    public final void F(S0.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f5367g;
        try {
            this.f5366f.F(iVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
