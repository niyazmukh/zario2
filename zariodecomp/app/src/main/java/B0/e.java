package b0;

import S1.j;
import S1.k;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b0.1\e.smali */
public final class e {

    /* renamed from: n, reason: collision with root package name */
    public static final C0258c f4958n = new C0258c();

    /* renamed from: o, reason: collision with root package name */
    public static final C0258c f4959o = new C0258c();

    /* renamed from: p, reason: collision with root package name */
    public static final C0258c f4960p = new C0258c();

    /* renamed from: q, reason: collision with root package name */
    public static final C0258c f4961q = new C0258c();

    /* renamed from: r, reason: collision with root package name */
    public static final C0258c f4962r = new C0258c();

    /* renamed from: s, reason: collision with root package name */
    public static final C0258c f4963s = new C0258c();

    /* renamed from: a, reason: collision with root package name */
    public float f4964a;

    /* renamed from: b, reason: collision with root package name */
    public float f4965b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4966c;

    /* renamed from: d, reason: collision with root package name */
    public final k f4967d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4968e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4969f;

    /* renamed from: g, reason: collision with root package name */
    public long f4970g;
    public final float h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4971j;

    /* renamed from: k, reason: collision with root package name */
    public f f4972k;

    /* renamed from: l, reason: collision with root package name */
    public float f4973l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4974m;

    public e(k kVar) {
        j jVar = k.f2977u;
        this.f4964a = 0.0f;
        this.f4965b = Float.MAX_VALUE;
        this.f4966c = false;
        this.f4969f = false;
        this.f4970g = 0L;
        this.i = new ArrayList();
        this.f4971j = new ArrayList();
        this.f4967d = kVar;
        this.f4968e = jVar;
        if (jVar == f4960p || jVar == f4961q || jVar == f4962r) {
            this.h = 0.1f;
        } else if (jVar == f4963s || jVar == f4958n || jVar == f4959o) {
            this.h = 0.00390625f;
        } else {
            this.h = 1.0f;
        }
        this.f4972k = null;
        this.f4973l = Float.MAX_VALUE;
        this.f4974m = false;
    }

    public final void a(float f2) {
        this.f4968e.getClass();
        k kVar = this.f4967d;
        kVar.f2981s = f2 / 10000.0f;
        kVar.invalidateSelf();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4971j;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                throw new ClassCastException();
            }
            i++;
        }
    }

    public final void b() {
        if (this.f4972k.f4976b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f4969f) {
            this.f4974m = true;
        }
    }
}
