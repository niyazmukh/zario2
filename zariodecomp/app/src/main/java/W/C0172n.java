package W;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* renamed from: W.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\n.1.smali */
public final class C0172n extends kotlin.jvm.internal.j implements X3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f3649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0172n(O o5, int i) {
        super(0);
        this.f3648a = i;
        this.f3649b = o5;
    }

    @Override // X3.a
    public final Object invoke() throws IOException {
        switch (this.f3648a) {
            case 0:
                return ((W) this.f3649b.f3536n.getValue()).f3561b;
            default:
                T t4 = this.f3649b.f3527a;
                File canonicalFile = ((File) t4.b.invoke()).getCanonicalFile();
                synchronized (T.d) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = T.c;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.i.d(path, "path");
                    linkedHashSet.add(path);
                }
                return new W(canonicalFile, (i0) t4.a.invoke(canonicalFile), new O0.g(canonicalFile, 1));
        }
    }
}
