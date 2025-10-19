package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\j.1.smali */
public abstract class AbstractC0207j {

    /* renamed from: a, reason: collision with root package name */
    public int f4515a;

    /* renamed from: b, reason: collision with root package name */
    public C0208k f4516b;

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract C0204g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i);

    public final void y() {
        int iU;
        do {
            iU = u();
            if (iU == 0) {
                return;
            }
            int i = this.f4515a;
            if (i >= 100) {
                throw new C0222z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f4515a = i + 1;
            this.f4515a--;
        } while (x(iU));
    }
}
