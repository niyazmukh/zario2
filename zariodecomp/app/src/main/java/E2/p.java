package E2;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.AbstractC0388a;
import java.util.HashSet;
import javax.net.ssl.SSLHandshakeException;
import z3.AbstractC1098w;
import z3.a0;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\p.smali */
public final class p extends AbstractC1098w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f1478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1479b;

    public p(q qVar, TaskCompletionSource taskCompletionSource) {
        this.f1479b = qVar;
        this.f1478a = taskCompletionSource;
    }

    @Override // z3.AbstractC1098w
    public final void g(k0 k0Var, a0 a0Var) {
        boolean zE = k0Var.e();
        TaskCompletionSource taskCompletionSource = this.f1478a;
        if (zE) {
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setException(new w2.p("Received onClose with status OK, but no message.", w2.o.INTERNAL));
        } else {
            this.f1479b.getClass();
            HashSet hashSet = C0106i.f1454d;
            Throwable th = k0Var.f11360c;
            if (th instanceof SSLHandshakeException) {
                th.getMessage().contains("no ciphers available");
            }
            taskCompletionSource.setException(F2.s.f(k0Var));
        }
    }

    @Override // z3.AbstractC1098w
    public final void i(AbstractC0388a abstractC0388a) {
        this.f1478a.setResult(abstractC0388a);
    }
}
