package B3;

import java.util.LinkedHashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\K.smali */
public final class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f448b;

    public /* synthetic */ K(U0 u02, int i) {
        this.f447a = i;
        this.f448b = u02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f447a) {
            case 0:
                this.f448b.f561f.b();
                break;
            default:
                U0 u02 = this.f448b;
                LinkedHashSet linkedHashSet = u02.f567n.f576g.f623E;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(u02);
                    V0 v02 = u02.f567n;
                    if (v02.f576g.f623E.isEmpty()) {
                        Y0 y02 = v02.f576g;
                        y02.f645c0.c(y02.f624F, false);
                        Y0 y03 = v02.f576g;
                        y03.f623E = null;
                        if (y03.f627J.get()) {
                            v02.f576g.f626I.m(Y0.f614j0);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
