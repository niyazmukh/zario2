package q4;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\m.smali */
public interface m extends Closeable, Flushable {
    void b(d dVar, long j5);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
