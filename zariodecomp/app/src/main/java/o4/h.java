package o4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o4\h.smali */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h1.i f9284b;

    /* renamed from: c, reason: collision with root package name */
    public static final h1.i f9285c;

    /* renamed from: d, reason: collision with root package name */
    public static final h1.i f9286d;

    /* renamed from: e, reason: collision with root package name */
    public static final h1.i f9287e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f9283a = k4.a.l("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* renamed from: f, reason: collision with root package name */
    public static final int f9288f = k4.a.l("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i = 18;
        f9284b = new h1.i("PERMIT", i);
        f9285c = new h1.i("TAKEN", i);
        f9286d = new h1.i("BROKEN", i);
        f9287e = new h1.i("CANCELLED", i);
    }
}
