package g0;

import android.util.Log;
import java.io.Writer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\T.smali */
public final class T extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f7402b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f7401a = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f7402b;
        if (sb.length() > 0) {
            Log.d(this.f7401a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c5 = cArr[i + i6];
            if (c5 == '\n') {
                a();
            } else {
                this.f7402b.append(c5);
            }
        }
    }
}
