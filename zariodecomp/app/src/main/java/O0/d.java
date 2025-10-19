package O0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O0\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2614a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2615b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2616c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2617d;

    public d(boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f2614a = z4;
        this.f2615b = z5;
        this.f2616c = z6;
        this.f2617d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2614a == dVar.f2614a && this.f2615b == dVar.f2615b && this.f2616c == dVar.f2616c && this.f2617d == dVar.f2617d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z4 = this.f2614a;
        int i = z4;
        if (z4 != 0) {
            i = 1;
        }
        int i5 = i * 31;
        boolean z5 = this.f2615b;
        int i6 = z5;
        if (z5 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z6 = this.f2616c;
        int i8 = z6;
        if (z6 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z7 = this.f2617d;
        return i9 + (z7 ? 1 : z7 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f2614a + ", isValidated=" + this.f2615b + ", isMetered=" + this.f2616c + ", isNotRoaming=" + this.f2617d + ')';
    }
}
