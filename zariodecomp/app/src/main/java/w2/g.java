package w2;

import A2.C0009i;
import N2.AbstractC0156x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import y2.C1053b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\g.smali */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final B2.h f10929a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f10930b;

    public g(B2.h hVar, FirebaseFirestore firebaseFirestore) {
        hVar.getClass();
        this.f10929a = hVar;
        this.f10930b = firebaseFirestore;
    }

    public final C1025b a(String str) {
        return new C1025b((B2.n) this.f10929a.f315a.a(B2.n.l(str)), this.f10930b);
    }

    public final Task b() {
        C1029f c1029f;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        y2.g gVar = new y2.g();
        gVar.f11093a = true;
        gVar.f11094b = true;
        gVar.f11095c = true;
        C1053b c1053b = new C1053b(F2.o.f1725b, new C1028e(this, new C1027d(taskCompletionSource, taskCompletionSource2, 0), 0));
        y2.v vVarA = y2.v.a(this.f10929a.f315a);
        C0009i c0009i = this.f10930b.i;
        synchronized (c0009i) {
            c0009i.B();
            y2.o oVar = (y2.o) c0009i.f205c;
            c1029f = new C1029f(c1053b, oVar, oVar.b(vVarA, gVar, c1053b), 0);
        }
        taskCompletionSource2.setResult(c1029f);
        return taskCompletionSource.getTask();
    }

    public final Task c(Map map, B b5) {
        Task taskD;
        AbstractC0156x.i(b5, "Provided options must not be null.");
        List listSingletonList = Collections.singletonList((b5.f10914a ? this.f10930b.f6403g.z(map) : this.f10930b.f6403g.A(map)).i0(this.f10929a, C2.n.f1102c));
        C0009i c0009i = this.f10930b.i;
        synchronized (c0009i) {
            c0009i.B();
            taskD = ((y2.o) c0009i.f205c).d(listSingletonList);
        }
        return taskD.continueWith(F2.o.f1725b, F2.s.f1736a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f10929a.equals(gVar.f10929a) && this.f10930b.equals(gVar.f10930b);
    }

    public final int hashCode() {
        return this.f10930b.hashCode() + (this.f10929a.f315a.hashCode() * 31);
    }
}
