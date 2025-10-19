package W;

import java.io.File;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\S.smali */
public final class S extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public static final S f3546a = new S(1);

    @Override // X3.l
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.i.e(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.i.d(absolutePath, "file.canonicalFile.absolutePath");
        return new i0(absolutePath);
    }
}
