package A2;

import a.AbstractC0183a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import x2.C1037c;

/* renamed from: A2.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\n.1.smali */
public final /* synthetic */ class C0014n implements F2.q, N.z, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f220b;

    public /* synthetic */ C0014n(Object obj, int i) {
        this.f220b = obj;
        this.f219a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // N.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(android.view.View r5) {
        /*
            r4 = this;
            r5 = 2
            java.lang.Object r0 = r4.f220b
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            r0.getClass()
            r1 = 1
            int r4 = r4.f219a
            if (r4 == r1) goto L48
            if (r4 != r5) goto L10
            goto L48
        L10:
            java.lang.ref.WeakReference r2 = r0.f6103p
            if (r2 == 0) goto L44
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L1b
            goto L44
        L1b:
            java.lang.ref.WeakReference r2 = r0.f6103p
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            A2.o r3 = new A2.o
            r3.<init>(r0, r4, r5)
            android.view.ViewParent r4 = r2.getParent()
            if (r4 == 0) goto L40
            boolean r4 = r4.isLayoutRequested()
            if (r4 == 0) goto L40
            java.util.WeakHashMap r4 = M.S.f2363a
            boolean r4 = M.E.b(r2)
            if (r4 == 0) goto L40
            r2.post(r3)
            goto L47
        L40:
            r3.run()
            goto L47
        L44:
            r0.r(r4)
        L47:
            return r1
        L48:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "STATE_"
            r0.<init>(r2)
            if (r4 != r1) goto L56
            java.lang.String r4 = "DRAGGING"
            goto L58
        L56:
            java.lang.String r4 = "SETTLING"
        L58:
            java.lang.String r1 = " should not be set externally."
            java.lang.String r4 = B.a.m(r0, r4, r1)
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.C0014n.d(android.view.View):boolean");
    }

    @Override // F2.q
    public Object get() {
        r rVar = (r) this.f220b;
        D d5 = rVar.f235c;
        int i = this.f219a;
        C2.i iVarJ = d5.j(i);
        AbstractC0183a.N(iVarJ != null, "Attempt to reject nonexistent batch!", new Object[0]);
        rVar.f235c.f(iVarJ);
        rVar.f235c.b();
        rVar.f236d.d(i);
        C0009i c0009i = rVar.f238f;
        c0009i.d0(((J) c0009i.f204b).h(iVarJ.b()));
        return rVar.f238f.G(iVarJ.b());
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task taskForResult;
        C1037c c1037c = (C1037c) this.f220b;
        int i = this.f219a;
        synchronized (c1037c) {
            try {
                if (i != c1037c.f11022d) {
                    p1.b.p(1, "FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    taskForResult = c1037c.h();
                } else {
                    taskForResult = task.isSuccessful() ? Tasks.forResult(((o2.p) task.getResult()).f9220a) : Tasks.forException(task.getException());
                }
            } finally {
            }
        }
        return taskForResult;
    }
}
