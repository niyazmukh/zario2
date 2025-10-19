package w2;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* renamed from: w2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\d.1.smali */
public final /* synthetic */ class C1027d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10921c;

    public /* synthetic */ C1027d(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, int i) {
        this.f10919a = i;
        this.f10920b = taskCompletionSource;
        this.f10921c = taskCompletionSource2;
    }

    @Override // w2.i
    public final void a(Object obj, p pVar) {
        switch (this.f10919a) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f10921c;
                h hVar = (h) obj;
                TaskCompletionSource taskCompletionSource2 = this.f10920b;
                if (pVar != null) {
                    taskCompletionSource2.setException(pVar);
                    return;
                }
                try {
                    ((C1029f) Tasks.await(taskCompletionSource.getTask())).a();
                    boolean z4 = hVar.f10933c != null;
                    C c5 = hVar.f10934d;
                    if (z4 || !c5.f10916b) {
                        taskCompletionSource2.setResult(hVar);
                    } else {
                        taskCompletionSource2.setException(new p("Failed to get document because the client is offline.", o.UNAVAILABLE));
                    }
                    return;
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    AssertionError assertionError = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a single document"));
                    assertionError.initCause(e5);
                    throw assertionError;
                } catch (ExecutionException e6) {
                    AssertionError assertionError2 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a single document"));
                    assertionError2.initCause(e6);
                    throw assertionError2;
                }
            default:
                TaskCompletionSource taskCompletionSource3 = this.f10921c;
                z zVar = (z) obj;
                TaskCompletionSource taskCompletionSource4 = this.f10920b;
                if (pVar != null) {
                    taskCompletionSource4.setException(pVar);
                    return;
                }
                try {
                    ((C1029f) Tasks.await(taskCompletionSource3.getTask())).a();
                    boolean z5 = zVar.f10976d.f10916b;
                    taskCompletionSource4.setResult(zVar);
                    return;
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    AssertionError assertionError3 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a query result"));
                    assertionError3.initCause(e7);
                    throw assertionError3;
                } catch (ExecutionException e8) {
                    AssertionError assertionError4 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a query result"));
                    assertionError4.initCause(e8);
                    throw assertionError4;
                }
        }
    }
}
