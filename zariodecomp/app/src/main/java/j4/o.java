package j4;

import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\o.smali */
public final class o extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
