package E2;

import java.util.BitSet;
import x2.C1035a;
import x2.C1037c;
import z3.AbstractC1098w;
import z3.C1084h;
import z3.V;
import z3.X;
import z3.a0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\l.smali */
public final class l extends AbstractC1098w {

    /* renamed from: c, reason: collision with root package name */
    public static final V f1467c;

    /* renamed from: d, reason: collision with root package name */
    public static final V f1468d;

    /* renamed from: a, reason: collision with root package name */
    public final C1037c f1469a;

    /* renamed from: b, reason: collision with root package name */
    public final C1035a f1470b;

    static {
        C1084h c1084h = a0.f11275d;
        BitSet bitSet = X.f11268d;
        f1467c = new V("Authorization", c1084h);
        f1468d = new V("x-firebase-appcheck", c1084h);
    }

    public l(C1037c c1037c, C1035a c1035a) {
        this.f1469a = c1037c;
        this.f1470b = c1035a;
    }
}
