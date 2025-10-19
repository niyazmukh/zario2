package A2;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\a0.smali */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f164a;

    /* renamed from: b, reason: collision with root package name */
    public final int f165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f166c;

    public a0(String str, int i, int i5) {
        this.f164a = str;
        this.f165b = i;
        this.f166c = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f165b == a0Var.f165b && this.f166c == a0Var.f166c && Objects.equals(this.f164a, a0Var.f164a);
    }

    public final int hashCode() {
        return Objects.hash(this.f164a, Integer.valueOf(this.f165b), Integer.valueOf(this.f166c));
    }

    public final String toString() {
        return "DocumentTypeBackfiller.BackfillKey(path=" + this.f164a + ", readTimeSeconds=" + this.f165b + ", readTimeNanos=" + this.f166c + ")";
    }
}
