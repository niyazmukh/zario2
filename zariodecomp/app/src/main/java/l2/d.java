package l2;

import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0340b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l2\d.smali */
public final class d implements InterfaceC0340b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f8766a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC0340b
    public final void a(boolean z4) {
        synchronized (f.f8769j) {
            try {
                Iterator it = new ArrayList(f.f8770k.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f8775e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = fVar.h.iterator();
                        while (it2.hasNext()) {
                            f fVar2 = ((c) it2.next()).f8765a;
                            if (z4) {
                                fVar2.getClass();
                            } else {
                                ((G2.d) fVar2.f8777g.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
