package Z3;

import java.util.Random;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z3\b.smali */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4012a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f4012a) {
            case 0:
                return new Random();
            case 1:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
