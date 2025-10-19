package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\d0.smali */
public final class d0 {
    public static c0 a(Object obj) {
        AbstractC0218v abstractC0218v = (AbstractC0218v) obj;
        c0 c0Var = abstractC0218v.unknownFields;
        if (c0Var != c0.f4480f) {
            return c0Var;
        }
        c0 c0Var2 = new c0(0, new int[8], new Object[8], true);
        abstractC0218v.unknownFields = c0Var2;
        return c0Var2;
    }

    public static void b(Object obj) {
        c0 c0Var = ((AbstractC0218v) obj).unknownFields;
        if (c0Var.f4485e) {
            c0Var.f4485e = false;
        }
    }

    public static boolean c(int i, C0208k c0208k, Object obj) throws C0222z, com.google.protobuf.M {
        int i5 = c0208k.f4519b;
        int i6 = i5 >>> 3;
        int i7 = i5 & 7;
        AbstractC0207j abstractC0207j = (AbstractC0207j) c0208k.f4522e;
        if (i7 == 0) {
            c0208k.S(0);
            ((c0) obj).c(i6 << 3, Long.valueOf(abstractC0207j.n()));
            return true;
        }
        if (i7 == 1) {
            c0208k.S(1);
            ((c0) obj).c((i6 << 3) | 1, Long.valueOf(abstractC0207j.k()));
            return true;
        }
        if (i7 == 2) {
            ((c0) obj).c((i6 << 3) | 2, c0208k.j());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw C0222z.b();
            }
            c0208k.S(5);
            ((c0) obj).c(5 | (i6 << 3), Integer.valueOf(abstractC0207j.j()));
            return true;
        }
        c0 c0Var = new c0(0, new int[8], new Object[8], true);
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        int i10 = i + 1;
        if (i10 >= 100) {
            throw new C0222z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0208k.c() != Integer.MAX_VALUE && c(i10, c0208k, c0Var)) {
        }
        if (i9 != c0208k.f4519b) {
            throw new C0222z("Protocol message end-group tag did not match expected tag.");
        }
        if (c0Var.f4485e) {
            c0Var.f4485e = false;
        }
        ((c0) obj).c(i8 | 3, c0Var);
        return true;
    }
}
