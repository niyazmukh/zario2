package V0;

import S0.i;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V0\b.smali */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3424a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3425b;

    public /* synthetic */ b(Object obj, int i) {
        this.f3424a = i;
        this.f3425b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3424a) {
            case 0:
                ((Handler) ((i) this.f3425b).f2860c).post(runnable);
                break;
            case 1:
                ((zau) this.f3425b).post(runnable);
                break;
            default:
                ((Handler) this.f3425b).post(runnable);
                break;
        }
    }

    public b() {
        this.f3424a = 2;
        this.f3425b = new Handler(Looper.getMainLooper());
    }
}
