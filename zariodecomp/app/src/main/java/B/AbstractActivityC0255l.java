package b;

import A.y;
import A2.C0009i;
import A2.RunnableC0005e;
import B3.G;
import B3.N;
import M.InterfaceC0125k;
import M.S;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.InterfaceC0232j;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.V;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import c.InterfaceC0332a;
import g0.AbstractActivityC0570w;
import g0.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0655e;
import l.C0708q;
import x0.C1031a;
import x0.InterfaceC1033d;
import z2.C1071b;

/* renamed from: b.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\l.smali */
public abstract class AbstractActivityC0255l extends Activity implements n0, InterfaceC0232j, InterfaceC1033d, InterfaceC0241v, InterfaceC0125k {

    /* renamed from: a, reason: collision with root package name */
    public final C0242x f4902a = new C0242x(this);

    /* renamed from: b, reason: collision with root package name */
    public final G f4903b;

    /* renamed from: c, reason: collision with root package name */
    public final C0009i f4904c;

    /* renamed from: d, reason: collision with root package name */
    public final C0242x f4905d;

    /* renamed from: e, reason: collision with root package name */
    public final A2.G f4906e;

    /* renamed from: f, reason: collision with root package name */
    public m0 f4907f;

    /* renamed from: k, reason: collision with root package name */
    public d0 f4908k;

    /* renamed from: l, reason: collision with root package name */
    public x f4909l;

    /* renamed from: m, reason: collision with root package name */
    public final ExecutorC0254k f4910m;

    /* renamed from: n, reason: collision with root package name */
    public final A2.G f4911n;

    /* renamed from: o, reason: collision with root package name */
    public final C0250g f4912o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f4913p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f4914q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f4915r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f4916s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f4917t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4918u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4919v;

    public AbstractActivityC0255l() {
        G g3 = new G();
        g3.f411b = new CopyOnWriteArraySet();
        this.f4903b = g3;
        final AbstractActivityC0570w abstractActivityC0570w = (AbstractActivityC0570w) this;
        this.f4904c = new C0009i(new RunnableC0005e(abstractActivityC0570w, 17));
        C0242x c0242x = new C0242x(this);
        this.f4905d = c0242x;
        A2.G g5 = new A2.G((InterfaceC1033d) this);
        this.f4906e = g5;
        this.f4909l = null;
        this.f4910m = new ExecutorC0254k(abstractActivityC0570w);
        new X3.a() { // from class: b.d
            @Override // X3.a
            public final Object invoke() {
                abstractActivityC0570w.reportFullyDrawn();
                return null;
            }
        };
        A2.G g6 = new A2.G();
        g6.f87b = new Object();
        g6.f88c = new ArrayList();
        this.f4911n = g6;
        new AtomicInteger();
        this.f4912o = new C0250g(abstractActivityC0570w);
        this.f4913p = new CopyOnWriteArrayList();
        this.f4914q = new CopyOnWriteArrayList();
        this.f4915r = new CopyOnWriteArrayList();
        this.f4916s = new CopyOnWriteArrayList();
        this.f4917t = new CopyOnWriteArrayList();
        this.f4918u = false;
        this.f4919v = false;
        c0242x.a(new C0251h(abstractActivityC0570w, 0));
        c0242x.a(new C0251h(abstractActivityC0570w, 1));
        c0242x.a(new C0251h(abstractActivityC0570w, 2));
        g5.f();
        a0.f(this);
        ((C0708q) g5.f88c).f("android:support:activity-result", new C0248e(abstractActivityC0570w, 0));
        f(new C0249f(abstractActivityC0570w, 0));
    }

    @Override // androidx.lifecycle.InterfaceC0232j
    public final C0655e a() {
        C0655e c0655e = new C0655e(0);
        if (getApplication() != null) {
            c0655e.b(g0.f4648a, getApplication());
        }
        c0655e.b(a0.f4626a, this);
        c0655e.b(a0.f4627b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c0655e.b(a0.f4628c, getIntent().getExtras());
        }
        return c0655e;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        this.f4910m.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // x0.InterfaceC1033d
    public final C0708q b() {
        return (C0708q) this.f4906e.f88c;
    }

    public final void d(L.a aVar) {
        this.f4913p.add(aVar);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            WeakHashMap weakHashMap = S.f2363a;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            WeakHashMap weakHashMap = S.f2363a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.n0
    public final m0 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f4907f == null) {
            C0253j c0253j = (C0253j) getLastNonConfigurationInstance();
            if (c0253j != null) {
                this.f4907f = c0253j.f4897a;
            }
            if (this.f4907f == null) {
                this.f4907f = new m0();
            }
        }
        return this.f4907f;
    }

    public final void f(InterfaceC0332a interfaceC0332a) {
        G g3 = this.f4903b;
        g3.getClass();
        if (((AbstractActivityC0255l) g3.f410a) != null) {
            interfaceC0332a.a();
        }
        ((CopyOnWriteArraySet) g3.f411b).add(interfaceC0332a);
    }

    @Override // androidx.lifecycle.InterfaceC0241v
    public final C0242x g() {
        return this.f4905d;
    }

    @Override // androidx.lifecycle.InterfaceC0232j
    public i0 h() {
        if (this.f4908k == null) {
            this.f4908k = new d0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f4908k;
    }

    public final x i() {
        if (this.f4909l == null) {
            this.f4909l = new x(new N(this, 20));
            this.f4905d.a(new C1031a(this, 3));
        }
        return this.f4909l;
    }

    public final void j() {
        a0.k(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView, "<this>");
        decorView.setTag(2131231338, this);
        C1071b.j(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView2, "<this>");
        decorView2.setTag(2131231336, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView3, "<this>");
        decorView3.setTag(2131231134, this);
    }

    public final void k(Bundle bundle) {
        super.onCreate(bundle);
        int i = V.f4619a;
        a0.i(this);
    }

    public final void l(Bundle bundle) {
        EnumC0236o enumC0236o = EnumC0236o.f4660c;
        C0242x c0242x = this.f4902a;
        c0242x.getClass();
        c0242x.c("markState");
        c0242x.g(enumC0236o);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i5, Intent intent) {
        if (this.f4912o.a(i, i5, intent)) {
            return;
        }
        super.onActivityResult(i, i5, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f4913p.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f4906e.h(bundle);
        G g3 = this.f4903b;
        g3.getClass();
        g3.f410a = this;
        Iterator it = ((CopyOnWriteArraySet) g3.f411b).iterator();
        while (it.hasNext()) {
            ((InterfaceC0332a) it.next()).a();
        }
        k(bundle);
        int i = V.f4619a;
        a0.i(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f4904c.f205c).iterator();
        while (it.hasNext()) {
            ((C) it.next()).f7304a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4904c.f205c).iterator();
        while (it.hasNext()) {
            if (((C) it.next()).f7304a.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4) {
        if (this.f4918u) {
            return;
        }
        Iterator it = this.f4916s.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(new A.g(z4));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f4915r.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f4904c.f205c).iterator();
        while (it.hasNext()) {
            ((C) it.next()).f7304a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4) {
        if (this.f4919v) {
            return;
        }
        Iterator it = this.f4917t.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(new y(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f4904c.f205c).iterator();
        while (it.hasNext()) {
            ((C) it.next()).f7304a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f4912o.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0253j c0253j;
        m0 m0Var = this.f4907f;
        if (m0Var == null && (c0253j = (C0253j) getLastNonConfigurationInstance()) != null) {
            m0Var = c0253j.f4897a;
        }
        if (m0Var == null) {
            return null;
        }
        C0253j c0253j2 = new C0253j();
        c0253j2.f4897a = m0Var;
        return c0253j2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0242x c0242x = this.f4905d;
        if (c0242x != null) {
            c0242x.g(EnumC0236o.f4660c);
        }
        l(bundle);
        this.f4906e.i(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f4914q.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (p1.b.y()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            A2.G g3 = this.f4911n;
            synchronized (g3.f87b) {
                try {
                    g3.f86a = true;
                    Iterator it = ((ArrayList) g3.f88c).iterator();
                    while (it.hasNext()) {
                        ((X3.a) it.next()).invoke();
                    }
                    ((ArrayList) g3.f88c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        j();
        this.f4910m.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    public Context zza() {
        return getApplicationContext();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        this.f4918u = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.f4918u = false;
            Iterator it = this.f4916s.iterator();
            while (it.hasNext()) {
                ((L.a) it.next()).a(new A.g(0, z4));
            }
        } catch (Throwable th) {
            this.f4918u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        this.f4919v = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.f4919v = false;
            Iterator it = this.f4917t.iterator();
            while (it.hasNext()) {
                ((L.a) it.next()).a(new y(0, z4));
            }
        } catch (Throwable th) {
            this.f4919v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        this.f4910m.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        this.f4910m.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
