package o2;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import x2.C1036b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\J.smali */
public final class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9190a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9191b;

    public J(FirebaseAuth firebaseAuth) {
        this.f9191b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9190a) {
            case 0:
                FirebaseAuth firebaseAuth = this.f9191b;
                Iterator it = firebaseAuth.f6371d.iterator();
                while (it.hasNext()) {
                    ((C1036b) it.next()).f11018a.k();
                }
                Iterator it2 = firebaseAuth.f6369b.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                Iterator it3 = this.f9191b.f6370c.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    public J(FirebaseAuth firebaseAuth, I2.a aVar) {
        this.f9191b = firebaseAuth;
    }
}
