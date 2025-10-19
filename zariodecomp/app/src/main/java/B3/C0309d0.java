package b3;

/* renamed from: b3.d0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\d0.smali */
public final class C0309d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5240b;

    public C0309d0(int i, String str) {
        this.f5239a = i;
        this.f5240b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0309d0)) {
            return false;
        }
        C0309d0 c0309d0 = (C0309d0) obj;
        return this.f5239a == c0309d0.f5239a && kotlin.jvm.internal.i.a(this.f5240b, c0309d0.f5240b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5239a) * 31;
        String str = this.f5240b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SyncFailureContext(attempts=" + this.f5239a + ", lastError=" + this.f5240b + ")";
    }
}
