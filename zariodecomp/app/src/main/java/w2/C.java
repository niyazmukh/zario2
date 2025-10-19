package w2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\C.smali */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10915a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10916b;

    public C(boolean z4, boolean z5) {
        this.f10915a = z4;
        this.f10916b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c5 = (C) obj;
        return this.f10915a == c5.f10915a && this.f10916b == c5.f10916b;
    }

    public final int hashCode() {
        return ((this.f10915a ? 1 : 0) * 31) + (this.f10916b ? 1 : 0);
    }

    public final String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f10915a + ", isFromCache=" + this.f10916b + '}';
    }
}
