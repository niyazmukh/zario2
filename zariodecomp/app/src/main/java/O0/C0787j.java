package o0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.InterfaceC0232j;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import k0.C0655e;
import l.C0708q;
import x0.InterfaceC1033d;

/* renamed from: o0.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\j.1.smali */
public final class C0787j implements InterfaceC0241v, n0, InterfaceC0232j, InterfaceC1033d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9068a;

    /* renamed from: b, reason: collision with root package name */
    public x f9069b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f9070c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0236o f9071d;

    /* renamed from: e, reason: collision with root package name */
    public final r f9072e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9073f;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f9074k;

    /* renamed from: l, reason: collision with root package name */
    public final C0242x f9075l = new C0242x(this);

    /* renamed from: m, reason: collision with root package name */
    public final A2.G f9076m = new A2.G((InterfaceC1033d) this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f9077n;

    /* renamed from: o, reason: collision with root package name */
    public EnumC0236o f9078o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f9079p;

    public C0787j(Context context, x xVar, Bundle bundle, EnumC0236o enumC0236o, r rVar, String str, Bundle bundle2) {
        this.f9068a = context;
        this.f9069b = xVar;
        this.f9070c = bundle;
        this.f9071d = enumC0236o;
        this.f9072e = rVar;
        this.f9073f = str;
        this.f9074k = bundle2;
        K3.h hVarP = S0.f.P(new C0786i(this, 0));
        S0.f.P(new C0786i(this, 1));
        this.f9078o = EnumC0236o.f4659b;
        this.f9079p = (d0) hVarP.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0232j
    public final C0655e a() {
        C0655e c0655e = new C0655e(0);
        Context applicationContext = this.f9068a.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c0655e.b(g0.f4648a, application);
        }
        c0655e.b(a0.f4626a, this);
        c0655e.b(a0.f4627b, this);
        Bundle bundleC = c();
        if (bundleC != null) {
            c0655e.b(a0.f4628c, bundleC);
        }
        return c0655e;
    }

    @Override // x0.InterfaceC1033d
    public final C0708q b() {
        return (C0708q) this.f9076m.f88c;
    }

    public final Bundle c() {
        Bundle bundle = this.f9070c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void d(EnumC0236o maxState) {
        kotlin.jvm.internal.i.e(maxState, "maxState");
        this.f9078o = maxState;
        f();
    }

    @Override // androidx.lifecycle.n0
    public final m0 e() {
        if (!this.f9077n) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f9075l.f4672d == EnumC0236o.f4658a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        r rVar = this.f9072e;
        if (rVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = this.f9073f;
        kotlin.jvm.internal.i.e(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = rVar.f9110a;
        m0 m0Var = (m0) linkedHashMap.get(backStackEntryId);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0();
        linkedHashMap.put(backStackEntryId, m0Var2);
        return m0Var2;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof C0787j)) {
            return false;
        }
        C0787j c0787j = (C0787j) obj;
        if (!kotlin.jvm.internal.i.a(this.f9073f, c0787j.f9073f) || !kotlin.jvm.internal.i.a(this.f9069b, c0787j.f9069b) || !kotlin.jvm.internal.i.a(this.f9075l, c0787j.f9075l) || !kotlin.jvm.internal.i.a((C0708q) this.f9076m.f88c, (C0708q) c0787j.f9076m.f88c)) {
            return false;
        }
        Bundle bundle = this.f9070c;
        Bundle bundle2 = c0787j.f9070c;
        if (!kotlin.jvm.internal.i.a(bundle, bundle2)) {
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            if (!setKeySet.isEmpty()) {
                for (String str : setKeySet) {
                    if (!kotlin.jvm.internal.i.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void f() {
        if (!this.f9077n) {
            A2.G g3 = this.f9076m;
            g3.f();
            this.f9077n = true;
            if (this.f9072e != null) {
                a0.f(this);
            }
            g3.h(this.f9074k);
        }
        int iOrdinal = this.f9071d.ordinal();
        int iOrdinal2 = this.f9078o.ordinal();
        C0242x c0242x = this.f9075l;
        if (iOrdinal < iOrdinal2) {
            c0242x.g(this.f9071d);
        } else {
            c0242x.g(this.f9078o);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0241v
    public final C0242x g() {
        return this.f9075l;
    }

    @Override // androidx.lifecycle.InterfaceC0232j
    public final i0 h() {
        return this.f9079p;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f9069b.hashCode() + (this.f9073f.hashCode() * 31);
        Bundle bundle = this.f9070c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((C0708q) this.f9076m.f88c).hashCode() + ((this.f9075l.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0787j.class.getSimpleName());
        sb.append("(" + this.f9073f + ')');
        sb.append(" destination=");
        sb.append(this.f9069b);
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
