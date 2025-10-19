package q2;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import r2.ThreadFactoryC0860a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\e.smali */
public final /* synthetic */ class e implements H2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9476a;

    public /* synthetic */ e(int i) {
        this.f9476a = i;
    }

    @Override // H2.b
    public final Object get() {
        switch (this.f9476a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                m mVar = ExecutorsRegistrar.f6393a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new r2.f(Executors.newFixedThreadPool(4, new ThreadFactoryC0860a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f6396d.get());
            case 3:
                m mVar2 = ExecutorsRegistrar.f6393a;
                return new r2.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC0860a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f6396d.get());
            case 4:
                m mVar3 = ExecutorsRegistrar.f6393a;
                return new r2.f(Executors.newCachedThreadPool(new ThreadFactoryC0860a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f6396d.get());
            default:
                m mVar4 = ExecutorsRegistrar.f6393a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0860a("Firebase Scheduler", 0, null));
        }
    }
}
