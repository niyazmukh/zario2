package X2;

import android.os.Binder;
import android.os.Process;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import java.util.concurrent.Callable;
import m0.RunnableC0738a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X2\k.smali */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3841b;

    public /* synthetic */ k(Object obj, int i) {
        this.f3840a = i;
        this.f3841b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AppDatabase_Impl appDatabase_Impl;
        S0.h hVar;
        z0.i iVarA;
        switch (this.f3840a) {
            case 0:
                o oVar = (o) this.f3841b;
                appDatabase_Impl = (AppDatabase_Impl) oVar.f3847a;
                hVar = (S0.h) oVar.f3855k;
                iVarA = hVar.a();
                try {
                    appDatabase_Impl.c();
                    try {
                        iVarA.e();
                        appDatabase_Impl.o();
                        hVar.q(iVarA);
                        return K3.k.f2288a;
                    } finally {
                    }
                } finally {
                }
            case 1:
                o oVar2 = (o) this.f3841b;
                hVar = (S0.h) oVar2.f3856l;
                appDatabase_Impl = (AppDatabase_Impl) oVar2.f3847a;
                iVarA = hVar.a();
                try {
                    appDatabase_Impl.c();
                    try {
                        iVarA.e();
                        appDatabase_Impl.o();
                        hVar.q(iVarA);
                        return K3.k.f2288a;
                    } finally {
                    }
                } finally {
                }
            case 2:
                o oVar3 = (o) this.f3841b;
                appDatabase_Impl = (AppDatabase_Impl) oVar3.f3847a;
                hVar = (S0.h) oVar3.f3857m;
                iVarA = hVar.a();
                try {
                    appDatabase_Impl.c();
                    try {
                        iVarA.e();
                        appDatabase_Impl.o();
                        hVar.q(iVarA);
                        return K3.k.f2288a;
                    } finally {
                    }
                } finally {
                }
            default:
                RunnableC0738a runnableC0738a = (RunnableC0738a) this.f3841b;
                runnableC0738a.f8823e.set(true);
                try {
                    Process.setThreadPriority(10);
                    runnableC0738a.f8825k.c();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
        }
    }
}
