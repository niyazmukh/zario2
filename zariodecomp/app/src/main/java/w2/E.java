package w2;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\E.smali */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f10917a;

    public E(double[] dArr) {
        this.f10917a = (double[]) dArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10917a, ((E) obj).f10917a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10917a);
    }
}
