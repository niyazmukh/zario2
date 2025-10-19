package o0;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.d0;
import androidx.lifecycle.l0;
import l.C0708q;

/* renamed from: o0.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\i.1.smali */
public final class C0786i extends kotlin.jvm.internal.j implements X3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0787j f9067b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0786i(C0787j c0787j, int i) {
        super(0);
        this.f9066a = i;
        this.f9067b = c0787j;
    }

    @Override // X3.a
    public final Object invoke() {
        switch (this.f9066a) {
            case 0:
                C0787j c0787j = this.f9067b;
                Context context = c0787j.f9068a;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new d0(applicationContext instanceof Application ? (Application) applicationContext : null, c0787j, c0787j.c());
            default:
                C0787j c0787j2 = this.f9067b;
                if (!c0787j2.f9077n) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                C0242x c0242x = c0787j2.f9075l;
                if (c0242x.f4672d == EnumC0236o.f4658a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C0784g c0784g = new C0784g();
                c0784g.f9063a = (C0708q) c0787j2.f9076m.f88c;
                c0784g.f9064b = c0242x;
                return ((C0785h) new l0(c0787j2, c0784g).a(C0785h.class)).f9065a;
        }
    }
}
