package l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\J0.smali */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8461a;

    /* renamed from: b, reason: collision with root package name */
    public int f8462b;

    /* renamed from: c, reason: collision with root package name */
    public int f8463c;

    /* renamed from: d, reason: collision with root package name */
    public int f8464d;

    /* renamed from: e, reason: collision with root package name */
    public int f8465e;

    /* renamed from: f, reason: collision with root package name */
    public int f8466f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8467g;
    public boolean h;

    public final void a(int i, int i5) {
        this.f8463c = i;
        this.f8464d = i5;
        this.h = true;
        if (this.f8467g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f8461a = i5;
            }
            if (i != Integer.MIN_VALUE) {
                this.f8462b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f8461a = i;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f8462b = i5;
        }
    }
}
