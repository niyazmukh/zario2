package f4;

import java.util.concurrent.CancellationException;

/* renamed from: f4.g0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\g0.1.smali */
public interface InterfaceC0506g0 extends O3.g {
    InterfaceC0519q attachChild(s sVar);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    d4.e getChildren();

    n4.a getOnJoin();

    P invokeOnCompletion(X3.l lVar);

    P invokeOnCompletion(boolean z4, boolean z5, X3.l lVar);

    boolean isActive();

    boolean isCompleted();

    Object join(O3.d dVar);

    InterfaceC0506g0 plus(InterfaceC0506g0 interfaceC0506g0);

    boolean start();
}
