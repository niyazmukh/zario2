package m3;

import android.util.Log;
import androidx.lifecycle.a0;
import com.niyaz.zario.worker.UsageMonitoringWorker;
import com.niyaz.zario.worker.WorkProgressUpdate;
import f4.E;
import i4.I;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\l.smali */
public final class l implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f8872a;

    public l(q qVar) {
        this.f8872a = qVar;
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) {
        WorkProgressUpdate workProgressUpdate = (WorkProgressUpdate) obj;
        boolean z4 = workProgressUpdate instanceof WorkProgressUpdate.Running;
        q qVar = this.f8872a;
        if (z4) {
            Log.d("InterventionViewModel", "Worker is running – updating in-flight progress");
            J0.h progress = ((WorkProgressUpdate.Running) workProgressUpdate).getProgress();
            qVar.getClass();
            E.t(a0.h(qVar), null, null, new p(progress, qVar, null), 3);
        } else if (workProgressUpdate instanceof WorkProgressUpdate.Succeeded) {
            Log.d("InterventionViewModel", "Worker succeeded, updating progress");
            WorkProgressUpdate.Succeeded succeeded = (WorkProgressUpdate.Succeeded) workProgressUpdate;
            Object obj2 = succeeded.getOutput().f2051a.get(UsageMonitoringWorker.OUTPUT_EVALUATION_COMPLETE);
            boolean zBooleanValue = obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false;
            J0.h output = succeeded.getOutput();
            qVar.getClass();
            E.t(a0.h(qVar), null, null, new p(output, qVar, null), 3);
            if (zBooleanValue) {
                Log.i("InterventionViewModel", "Evaluation completed – worker chain continues");
            }
        } else if (workProgressUpdate instanceof WorkProgressUpdate.Failed) {
            Log.e("InterventionViewModel", "Worker failed");
            I i = qVar.f8900f;
            String string = qVar.f8895a.getString(2131886223);
            kotlin.jvm.internal.i.d(string, "getString(...)");
            V2.j jVar = new V2.j(string);
            i.getClass();
            i.M(null, jVar);
        } else {
            if (!(workProgressUpdate instanceof WorkProgressUpdate.Cancelled)) {
                throw new B0.c();
            }
            new Integer(Log.d("InterventionViewModel", "Worker was cancelled"));
        }
        return K3.k.f2288a;
    }
}
