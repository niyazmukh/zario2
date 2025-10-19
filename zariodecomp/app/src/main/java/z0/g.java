package z0;

import K3.h;
import K3.j;
import android.content.Context;
import u0.C0954B;
import y0.InterfaceC1044c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z0.1\g.smali */
public final class g implements InterfaceC1044c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11192b;

    /* renamed from: c, reason: collision with root package name */
    public final C0954B f11193c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11194d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11195e;

    /* renamed from: f, reason: collision with root package name */
    public final h f11196f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11197k;

    public g(Context context, String str, C0954B callback, boolean z4, boolean z5) {
        kotlin.jvm.internal.i.e(callback, "callback");
        this.f11191a = context;
        this.f11192b = str;
        this.f11193c = callback;
        this.f11194d = z4;
        this.f11195e = z5;
        this.f11196f = S0.f.P(new O0.g(this, 23));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11196f.f2282b != j.f2287a) {
            ((f) this.f11196f.getValue()).close();
        }
    }

    @Override // y0.InterfaceC1044c
    public final C1063b i() {
        return ((f) this.f11196f.getValue()).a(true);
    }

    @Override // y0.InterfaceC1044c
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        if (this.f11196f.f2282b != j.f2287a) {
            f sQLiteOpenHelper = (f) this.f11196f.getValue();
            kotlin.jvm.internal.i.e(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z4);
        }
        this.f11197k = z4;
    }
}
