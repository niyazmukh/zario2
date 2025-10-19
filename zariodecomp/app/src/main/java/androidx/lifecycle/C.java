package androidx.lifecycle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\C.smali */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public final H f4572a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4573b;

    /* renamed from: c, reason: collision with root package name */
    public int f4574c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f4575d;

    public C(D d5, H h) {
        this.f4575d = d5;
        this.f4572a = h;
    }

    public final void a(boolean z4) {
        if (z4 == this.f4573b) {
            return;
        }
        this.f4573b = z4;
        int i = z4 ? 1 : -1;
        D d5 = this.f4575d;
        int i5 = d5.f4579c;
        d5.f4579c = i + i5;
        if (!d5.f4580d) {
            d5.f4580d = true;
            while (true) {
                try {
                    int i6 = d5.f4579c;
                    if (i5 == i6) {
                        break;
                    }
                    boolean z5 = i5 == 0 && i6 > 0;
                    boolean z6 = i5 > 0 && i6 == 0;
                    if (z5) {
                        d5.f();
                    } else if (z6) {
                        d5.g();
                    }
                    i5 = i6;
                } catch (Throwable th) {
                    d5.f4580d = false;
                    throw th;
                }
            }
            d5.f4580d = false;
        }
        if (this.f4573b) {
            d5.c(this);
        }
    }

    public void b() {
    }

    public boolean c(InterfaceC0241v interfaceC0241v) {
        return false;
    }

    public abstract boolean d();
}
