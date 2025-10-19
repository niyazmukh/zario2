package W;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\Q.smali */
public class Q implements InterfaceC0159a {

    /* renamed from: a, reason: collision with root package name */
    public final File f3544a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f3545b = new AtomicBoolean(false);

    public Q(File file) {
        this.f3544a = file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [W.Q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(W.Q r9, Q3.c r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.Q.a(W.Q, Q3.c):java.lang.Object");
    }

    @Override // W.InterfaceC0159a
    public final void close() {
        this.f3545b.set(true);
    }
}
