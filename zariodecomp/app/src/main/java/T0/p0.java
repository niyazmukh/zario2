package t0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\p0.smali */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10101a;

    /* renamed from: b, reason: collision with root package name */
    public int f10102b;

    /* renamed from: c, reason: collision with root package name */
    public int f10103c;

    /* renamed from: d, reason: collision with root package name */
    public int f10104d;

    /* renamed from: e, reason: collision with root package name */
    public int f10105e;

    public final boolean a() {
        int i = this.f10101a;
        int i5 = 2;
        if ((i & 7) != 0) {
            int i6 = this.f10104d;
            int i7 = this.f10102b;
            if (((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i8 = this.f10104d;
            int i9 = this.f10103c;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i10 = this.f10105e;
            int i11 = this.f10102b;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i12 = this.f10105e;
            int i13 = this.f10103c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if (((i5 << 12) & i) == 0) {
                return false;
            }
        }
        return true;
    }
}
