package o0;

/* renamed from: o0.D, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\D.smali */
public final class C0769D {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9006a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9007b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9008c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9009d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9010e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9011f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9012g;
    public final int h;
    public final int i;

    public C0769D(boolean z4, boolean z5, int i, boolean z6, boolean z7, int i5, int i6, int i7, int i8) {
        this.f9006a = z4;
        this.f9007b = z5;
        this.f9008c = i;
        this.f9009d = z6;
        this.f9010e = z7;
        this.f9011f = i5;
        this.f9012g = i6;
        this.h = i7;
        this.i = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0769D)) {
            return false;
        }
        C0769D c0769d = (C0769D) obj;
        return this.f9006a == c0769d.f9006a && this.f9007b == c0769d.f9007b && this.f9008c == c0769d.f9008c && kotlin.jvm.internal.i.a(null, null) && this.f9009d == c0769d.f9009d && this.f9010e == c0769d.f9010e && this.f9011f == c0769d.f9011f && this.f9012g == c0769d.f9012g && this.h == c0769d.h && this.i == c0769d.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f9006a ? 1 : 0) * 31) + (this.f9007b ? 1 : 0)) * 31) + this.f9008c) * 961) + (this.f9009d ? 1 : 0)) * 31) + (this.f9010e ? 1 : 0)) * 31) + this.f9011f) * 31) + this.f9012g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0769D.class.getSimpleName());
        sb.append("(");
        if (this.f9006a) {
            sb.append("launchSingleTop ");
        }
        if (this.f9007b) {
            sb.append("restoreState ");
        }
        int i = this.i;
        int i5 = this.h;
        int i6 = this.f9012g;
        int i7 = this.f9011f;
        if (i7 != -1 || i6 != -1 || i5 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i7));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i6));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i5));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
