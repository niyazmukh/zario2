package o0;

import android.os.Bundle;

/* renamed from: o0.L, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\L.smali */
public abstract class AbstractC0777L {

    /* renamed from: b, reason: collision with root package name */
    public static final C0771F f9024b = new C0771F(5, false);

    /* renamed from: c, reason: collision with root package name */
    public static final C0771F f9025c = new C0771F(8, false);

    /* renamed from: d, reason: collision with root package name */
    public static final C0771F f9026d = new C0771F(4, true);

    /* renamed from: e, reason: collision with root package name */
    public static final C0771F f9027e = new C0771F(7, false);

    /* renamed from: f, reason: collision with root package name */
    public static final C0771F f9028f = new C0771F(6, true);

    /* renamed from: g, reason: collision with root package name */
    public static final C0771F f9029g = new C0771F(3, false);
    public static final C0771F h = new C0771F(2, true);
    public static final C0771F i = new C0771F(1, false);

    /* renamed from: j, reason: collision with root package name */
    public static final C0771F f9030j = new C0771F(0, true);

    /* renamed from: k, reason: collision with root package name */
    public static final C0771F f9031k = new C0771F(10, true);

    /* renamed from: l, reason: collision with root package name */
    public static final C0771F f9032l = new C0771F(9, true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9033a;

    public AbstractC0777L(boolean z4) {
        this.f9033a = z4;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
