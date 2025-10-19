package z3;

import B3.o2;
import java.nio.charset.Charset;
import java.util.BitSet;

/* renamed from: z3.E, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\E.smali */
public abstract class AbstractC1076E {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f11237a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final i2.c f11238b = a0.f11276e;

    public static Y a(String str, o2 o2Var) {
        boolean z4 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z4 = true;
        }
        BitSet bitSet = X.f11268d;
        return new Y(str, z4, o2Var);
    }
}
