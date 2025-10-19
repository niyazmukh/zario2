package X2;

import A2.C0009i;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase_Impl;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X2\j.smali */
public final class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3839c;

    public /* synthetic */ j(Object obj, long j5, int i) {
        this.f3837a = i;
        this.f3839c = obj;
        this.f3838b = j5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        S0.h hVar;
        z0.i iVarA;
        UsageAggregationDatabase_Impl usageAggregationDatabase_Impl;
        switch (this.f3837a) {
            case 0:
                o oVar = (o) this.f3839c;
                hVar = (S0.h) oVar.f3854j;
                AppDatabase_Impl appDatabase_Impl = (AppDatabase_Impl) oVar.f3847a;
                iVarA = hVar.a();
                iVarA.d(1, this.f3838b);
                try {
                    appDatabase_Impl.c();
                    try {
                        iVarA.e();
                        appDatabase_Impl.o();
                        hVar.q(iVarA);
                        return K3.k.f2288a;
                    } finally {
                        appDatabase_Impl.j();
                    }
                } finally {
                }
            case 1:
                C0009i c0009i = (C0009i) this.f3839c;
                hVar = (S0.h) c0009i.f206d;
                usageAggregationDatabase_Impl = (UsageAggregationDatabase_Impl) c0009i.f204b;
                iVarA = hVar.a();
                iVarA.d(1, this.f3838b);
                try {
                    usageAggregationDatabase_Impl.c();
                    try {
                        iVarA.e();
                        usageAggregationDatabase_Impl.o();
                        hVar.q(iVarA);
                        return K3.k.f2288a;
                    } finally {
                    }
                } finally {
                }
            default:
                C0009i c0009i2 = (C0009i) this.f3839c;
                usageAggregationDatabase_Impl = (UsageAggregationDatabase_Impl) c0009i2.f204b;
                hVar = (S0.h) c0009i2.f206d;
                iVarA = hVar.a();
                iVarA.d(1, this.f3838b);
                try {
                    usageAggregationDatabase_Impl.c();
                    try {
                        iVarA.e();
                        usageAggregationDatabase_Impl.o();
                        hVar.q(iVarA);
                        return K3.k.f2288a;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
