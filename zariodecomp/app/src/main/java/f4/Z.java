package f4;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\Z.smali */
public abstract class Z extends A implements Closeable, AutoCloseable {
    static {
        z baseKey = A.b;
        kotlin.jvm.internal.i.e(baseKey, "baseKey");
    }

    public abstract Executor o();
}
