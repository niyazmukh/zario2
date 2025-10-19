package G3;

import S0.f;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G3\b.smali */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1870d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0410l0 f1871a;

    /* renamed from: b, reason: collision with root package name */
    public final E f1872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1873c;

    public b(E e5) {
        f.l(e5, "defaultInstance cannot be null");
        this.f1872b = e5;
        this.f1871a = (InterfaceC0410l0) e5.j(7);
        this.f1873c = -1;
    }
}
