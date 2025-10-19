package x2;

import A2.C0004d;
import A2.C0013m;
import A2.C0014n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import p2.InterfaceC0821a;
import p2.e;
import q2.o;
import u0.AbstractC0967h;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\x2.1\c.smali */
public final class C1037c extends AbstractC0967h {

    /* renamed from: a, reason: collision with root package name */
    public final C1036b f11019a = new C1036b(this);

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0821a f11020b;

    /* renamed from: c, reason: collision with root package name */
    public C0013m f11021c;

    /* renamed from: d, reason: collision with root package name */
    public int f11022d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11023e;

    public C1037c(o oVar) {
        oVar.a(new C0004d(this, 18));
    }

    public final synchronized Task h() {
        InterfaceC0821a interfaceC0821a = this.f11020b;
        if (interfaceC0821a == null) {
            return Tasks.forException(new l2.b("auth is not available"));
        }
        Task taskB = ((FirebaseAuth) interfaceC0821a).b(this.f11023e);
        this.f11023e = false;
        return taskB.continueWithTask(F2.o.f1725b, new C0014n(this, this.f11022d));
    }

    public final synchronized C1038d i() {
        String str;
        o2.o oVar;
        try {
            InterfaceC0821a interfaceC0821a = this.f11020b;
            str = null;
            if (interfaceC0821a != null && (oVar = ((FirebaseAuth) interfaceC0821a).f6373f) != null) {
                str = ((e) oVar).f9329b.f9320a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str != null ? new C1038d(str) : C1038d.f11024b;
    }

    public final synchronized void j() {
        this.f11023e = true;
    }

    public final synchronized void k() {
        this.f11022d++;
        C0013m c0013m = this.f11021c;
        if (c0013m != null) {
            c0013m.a(i());
        }
    }
}
