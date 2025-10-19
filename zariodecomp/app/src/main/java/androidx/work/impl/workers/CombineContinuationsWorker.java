package androidx.work.impl.workers;

import J0.q;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\workers\CombineContinuationsWorker.smali */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        i.e(context, "context");
        i.e(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public final q a() {
        return new q(getInputData());
    }
}
