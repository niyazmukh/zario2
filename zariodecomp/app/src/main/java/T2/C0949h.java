package t2;

import W.InterfaceC0167i;
import X3.l;
import android.content.Context;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;

/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t2.1\h.smali */
public final class C0949h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c4.h[] f10199d;

    /* renamed from: a, reason: collision with root package name */
    public final String f10200a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f10201b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0167i f10202c;

    static {
        m mVar = new m(kotlin.jvm.internal.b.NO_RECEIVER, C0949h.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s.f8432a.getClass();
        f10199d = new c4.h[]{mVar};
    }

    public C0949h(Context context, String name) {
        i.e(context, "context");
        i.e(name, "name");
        this.f10200a = name;
        this.f10201b = new ThreadLocal();
        this.f10202c = p1.b.K(name, new h1.i(new C0942a(this, 0), 10), new C0942a(this, 1), 8).a(context, f10199d[0]);
    }

    public final void a(l lVar) {
    }
}
