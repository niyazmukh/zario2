package c0;

import A2.RunnableC0016p;
import android.content.Context;
import e2.InterfaceC0461i;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\l.smali */
public final class l implements h, InterfaceC0461i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5368a;

    public l(Context context, int i) {
        switch (i) {
            case 1:
                this.f5368a = context;
                break;
            default:
                this.f5368a = context.getApplicationContext();
                break;
        }
    }

    @Override // e2.InterfaceC0462j
    public Object a() {
        return this.f5368a;
    }

    @Override // c0.h
    public void a(p1.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0333a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0016p(this, bVar, threadPoolExecutor, 3));
    }
}
