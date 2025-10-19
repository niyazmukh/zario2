package Z3;

import java.util.Random;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z3\c.smali */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final b f4013c = new b(0);

    @Override // Z3.a
    public final Random a() {
        Object obj = this.f4013c.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
