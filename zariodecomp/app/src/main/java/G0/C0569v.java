package g0;

import a.AbstractC0183a;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import l.C0708q;
import x0.InterfaceC1033d;

/* renamed from: g0.v, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\v.1.smali */
public final class C0569v extends AbstractC0183a implements n0, InterfaceC0241v, InterfaceC1033d, InterfaceC0546N {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0570w f7551a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0570w f7552b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f7553c;

    /* renamed from: d, reason: collision with root package name */
    public final C0542J f7554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0570w f7555e;

    public C0569v(AbstractActivityC0570w abstractActivityC0570w) {
        this.f7555e = abstractActivityC0570w;
        Handler handler = new Handler();
        this.f7554d = new C0542J();
        this.f7551a = abstractActivityC0570w;
        this.f7552b = abstractActivityC0570w;
        this.f7553c = handler;
    }

    @Override // a.AbstractC0183a
    public final View Y(int i) {
        return this.f7555e.findViewById(i);
    }

    @Override // a.AbstractC0183a
    public final boolean Z() {
        Window window = this.f7555e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // g0.InterfaceC0546N
    public final void a(C0542J c0542j, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        this.f7555e.getClass();
    }

    @Override // x0.InterfaceC1033d
    public final C0708q b() {
        return (C0708q) this.f7555e.f4906e.f88c;
    }

    @Override // androidx.lifecycle.n0
    public final m0 e() {
        return this.f7555e.e();
    }

    @Override // androidx.lifecycle.InterfaceC0241v
    public final C0242x g() {
        return this.f7555e.f7558x;
    }
}
