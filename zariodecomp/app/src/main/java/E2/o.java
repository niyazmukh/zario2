package E2;

import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import z3.AbstractC1081e;
import z3.AbstractC1097v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\o.smali */
public final class o extends AbstractC1097v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1081e[] f1475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f1476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f1477c;

    public o(q qVar, AbstractC1081e[] abstractC1081eArr, Task task) {
        this.f1477c = qVar;
        this.f1475a = abstractC1081eArr;
        this.f1476b = task;
    }

    @Override // z3.AbstractC1097v, z3.AbstractC1081e
    public final void b() {
        if (this.f1475a[0] != null) {
            super.b();
            return;
        }
        this.f1476b.addOnSuccessListener(this.f1477c.f1482a.f1704a, new n(0));
    }

    @Override // z3.AbstractC1097v
    public final AbstractC1081e f() {
        AbstractC1081e[] abstractC1081eArr = this.f1475a;
        AbstractC0183a.N(abstractC1081eArr[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
        return abstractC1081eArr[0];
    }
}
