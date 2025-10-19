package S0;

import J0.C0111e;
import a.AbstractC0183a;
import androidx.work.OverwritingInputMerger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\q.smali */
public final class q {

    /* renamed from: x, reason: collision with root package name */
    public static final String f2893x;

    /* renamed from: y, reason: collision with root package name */
    public static final E2.n f2894y;

    /* renamed from: a, reason: collision with root package name */
    public final String f2895a;

    /* renamed from: b, reason: collision with root package name */
    public int f2896b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2897c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2898d;

    /* renamed from: e, reason: collision with root package name */
    public final J0.h f2899e;

    /* renamed from: f, reason: collision with root package name */
    public final J0.h f2900f;

    /* renamed from: g, reason: collision with root package name */
    public long f2901g;
    public final long h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public C0111e f2902j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2903k;

    /* renamed from: l, reason: collision with root package name */
    public int f2904l;

    /* renamed from: m, reason: collision with root package name */
    public long f2905m;

    /* renamed from: n, reason: collision with root package name */
    public long f2906n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2907o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2908p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2909q;

    /* renamed from: r, reason: collision with root package name */
    public int f2910r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2911s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2912t;

    /* renamed from: u, reason: collision with root package name */
    public final long f2913u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2914v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2915w;

    static {
        String strF = J0.t.f("WorkSpec");
        kotlin.jvm.internal.i.d(strF, "tagWithPrefix(\"WorkSpec\")");
        f2893x = strF;
        f2894y = new E2.n(3);
    }

    public q(String id, int i, String workerClassName, String inputMergerClassName, J0.h input, J0.h output, long j5, long j6, long j7, C0111e constraints, int i5, int i6, long j8, long j9, long j10, long j11, boolean z4, int i7, int i8, int i9, long j12, int i10, int i11) {
        kotlin.jvm.internal.i.e(id, "id");
        B.a.r(i, "state");
        kotlin.jvm.internal.i.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.i.e(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.i.e(input, "input");
        kotlin.jvm.internal.i.e(output, "output");
        kotlin.jvm.internal.i.e(constraints, "constraints");
        B.a.r(i6, "backoffPolicy");
        B.a.r(i7, "outOfQuotaPolicy");
        this.f2895a = id;
        this.f2896b = i;
        this.f2897c = workerClassName;
        this.f2898d = inputMergerClassName;
        this.f2899e = input;
        this.f2900f = output;
        this.f2901g = j5;
        this.h = j6;
        this.i = j7;
        this.f2902j = constraints;
        this.f2903k = i5;
        this.f2904l = i6;
        this.f2905m = j8;
        this.f2906n = j9;
        this.f2907o = j10;
        this.f2908p = j11;
        this.f2909q = z4;
        this.f2910r = i7;
        this.f2911s = i8;
        this.f2912t = i9;
        this.f2913u = j12;
        this.f2914v = i10;
        this.f2915w = i11;
    }

    public final long a() {
        return AbstractC0183a.l(this.f2896b == 1 && this.f2903k > 0, this.f2903k, this.f2904l, this.f2905m, this.f2906n, this.f2911s, c(), this.f2901g, this.i, this.h, this.f2913u);
    }

    public final boolean b() {
        return !kotlin.jvm.internal.i.a(C0111e.i, this.f2902j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.i.a(this.f2895a, qVar.f2895a) && this.f2896b == qVar.f2896b && kotlin.jvm.internal.i.a(this.f2897c, qVar.f2897c) && kotlin.jvm.internal.i.a(this.f2898d, qVar.f2898d) && kotlin.jvm.internal.i.a(this.f2899e, qVar.f2899e) && kotlin.jvm.internal.i.a(this.f2900f, qVar.f2900f) && this.f2901g == qVar.f2901g && this.h == qVar.h && this.i == qVar.i && kotlin.jvm.internal.i.a(this.f2902j, qVar.f2902j) && this.f2903k == qVar.f2903k && this.f2904l == qVar.f2904l && this.f2905m == qVar.f2905m && this.f2906n == qVar.f2906n && this.f2907o == qVar.f2907o && this.f2908p == qVar.f2908p && this.f2909q == qVar.f2909q && this.f2910r == qVar.f2910r && this.f2911s == qVar.f2911s && this.f2912t == qVar.f2912t && this.f2913u == qVar.f2913u && this.f2914v == qVar.f2914v && this.f2915w == qVar.f2915w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = B.a.e(B.a.e(B.a.e(B.a.e((t.h.c(this.f2904l) + B.a.c(this.f2903k, (this.f2902j.hashCode() + B.a.e(B.a.e(B.a.e((this.f2900f.hashCode() + ((this.f2899e.hashCode() + B.a.f(B.a.f((t.h.c(this.f2896b) + (this.f2895a.hashCode() * 31)) * 31, 31, this.f2897c), 31, this.f2898d)) * 31)) * 31, 31, this.f2901g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.f2905m), 31, this.f2906n), 31, this.f2907o), 31, this.f2908p);
        boolean z4 = this.f2909q;
        int i = z4;
        if (z4 != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f2915w) + B.a.c(this.f2914v, B.a.e(B.a.c(this.f2912t, B.a.c(this.f2911s, (t.h.c(this.f2910r) + ((iE + i) * 31)) * 31, 31), 31), 31, this.f2913u), 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f2895a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(String str, int i, String str2, String str3, J0.h hVar, J0.h hVar2, long j5, long j6, long j7, C0111e c0111e, int i5, int i6, long j8, long j9, long j10, long j11, boolean z4, int i7, int i8, long j12, int i9, int i10, int i11) {
        J0.h hVar3;
        J0.h hVar4;
        int i12 = (i11 & 2) != 0 ? 1 : i;
        String name = (i11 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        if ((i11 & 16) != 0) {
            J0.h EMPTY = J0.h.f2050c;
            kotlin.jvm.internal.i.d(EMPTY, "EMPTY");
            hVar3 = EMPTY;
        } else {
            hVar3 = hVar;
        }
        if ((i11 & 32) != 0) {
            J0.h EMPTY2 = J0.h.f2050c;
            kotlin.jvm.internal.i.d(EMPTY2, "EMPTY");
            hVar4 = EMPTY2;
        } else {
            hVar4 = hVar2;
        }
        this(str, i12, str2, name, hVar3, hVar4, (i11 & 64) != 0 ? 0L : j5, (i11 & 128) != 0 ? 0L : j6, (i11 & 256) != 0 ? 0L : j7, (i11 & 512) != 0 ? C0111e.i : c0111e, (i11 & 1024) != 0 ? 0 : i5, (i11 & 2048) != 0 ? 1 : i6, (i11 & 4096) != 0 ? 30000L : j8, (i11 & 8192) != 0 ? -1L : j9, (i11 & 16384) != 0 ? 0L : j10, (32768 & i11) != 0 ? -1L : j11, (65536 & i11) != 0 ? false : z4, (131072 & i11) == 0 ? i7 : 1, (262144 & i11) != 0 ? 0 : i8, 0, (1048576 & i11) != 0 ? Long.MAX_VALUE : j12, (2097152 & i11) != 0 ? 0 : i9, (i11 & 4194304) != 0 ? -256 : i10);
    }
}
