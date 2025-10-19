package i4;

import com.google.protobuf.AbstractC0417p;
import j4.AbstractC0632b;
import j4.AbstractC0633c;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\J.smali */
public final class J extends AbstractC0633c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7891a = new AtomicReference(null);

    @Override // j4.AbstractC0633c
    public final boolean a(AbstractC0417p abstractC0417p) {
        AtomicReference atomicReference = this.f7891a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(C.f7875b);
        return true;
    }

    @Override // j4.AbstractC0633c
    public final O3.d[] b(AbstractC0417p abstractC0417p) {
        this.f7891a.set(null);
        return AbstractC0632b.f8070a;
    }
}
