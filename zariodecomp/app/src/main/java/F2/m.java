package F2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\m.smali */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final m f1719d = new m(null, null, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final m f1721b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1722c;

    public m(m mVar, String str, int i) {
        this.f1721b = mVar;
        this.f1722c = str;
        this.f1720a = i;
    }

    public final String toString() {
        int i = this.f1720a;
        if (i == 0) {
            return "";
        }
        String str = this.f1722c;
        if (i == 1) {
            return str;
        }
        return this.f1721b.toString() + "." + str;
    }
}
