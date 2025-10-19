package w2;

import A2.C0009i;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import m.ExecutorC0734a;
import y2.C1053b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\x.smali */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final y2.v f10971a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f10972b;

    public x(y2.v vVar, FirebaseFirestore firebaseFirestore) {
        this.f10971a = vVar;
        firebaseFirestore.getClass();
        this.f10972b = firebaseFirestore;
    }

    public final Task a() {
        C1029f c1029f;
        y2.v vVar = this.f10971a;
        if (t.h.a(1, 2) && vVar.f11144a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        y2.g gVar = new y2.g();
        gVar.f11093a = true;
        gVar.f11094b = true;
        gVar.f11095c = true;
        ExecutorC0734a executorC0734a = F2.o.f1725b;
        C1027d c1027d = new C1027d(taskCompletionSource, taskCompletionSource2, 1);
        y2.v vVar2 = this.f10971a;
        if (t.h.a(1, 2) && vVar2.f11144a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        C1053b c1053b = new C1053b(executorC0734a, new C1028e(this, c1027d, 1));
        C0009i c0009i = this.f10972b.i;
        synchronized (c0009i) {
            c0009i.B();
            y2.o oVar = (y2.o) c0009i.f205c;
            c1029f = new C1029f(c1053b, oVar, oVar.b(this.f10971a, gVar, c1053b), 1);
        }
        taskCompletionSource2.setResult(c1029f);
        return taskCompletionSource.getTask();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f10971a.equals(xVar.f10971a) && this.f10972b.equals(xVar.f10972b);
    }

    public final int hashCode() {
        return this.f10972b.hashCode() + (this.f10971a.hashCode() * 31);
    }
}
