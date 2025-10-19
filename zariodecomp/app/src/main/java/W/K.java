package W;

import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\K.smali */
public final class K extends kotlin.jvm.internal.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public static final K f3512a = new K(2);

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        a0 msg = (a0) obj;
        Throwable cancellationException = (Throwable) obj2;
        kotlin.jvm.internal.i.e(msg, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.f3572b.R(cancellationException);
        return K3.k.f2288a;
    }
}
