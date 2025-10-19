package g;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import android.view.View;
import g0.V;
import java.util.LinkedHashSet;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\v.smali */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public Object f7230a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7231b;

    public v(Context context) {
        this.f7230a = context;
    }

    public void c() {
        Q0.d dVar = (Q0.d) this.f7230a;
        if (dVar != null) {
            try {
                ((y) this.f7231b).f7287o.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f7230a = null;
        }
    }

    public void d() {
        V v4 = (V) this.f7230a;
        I.g gVar = (I.g) this.f7231b;
        LinkedHashSet linkedHashSet = v4.f7410e;
        if (linkedHashSet.remove(gVar) && linkedHashSet.isEmpty()) {
            v4.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof F.a)) {
            return menuItem;
        }
        F.a aVar = (F.a) menuItem;
        if (((C0834k) this.f7231b) == null) {
            this.f7231b = new C0834k();
        }
        MenuItem menuItem2 = (MenuItem) ((C0834k) this.f7231b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k.s sVar = new k.s((Context) this.f7230a, aVar);
        ((C0834k) this.f7231b).put(aVar, sVar);
        return sVar;
    }

    public boolean h() {
        V v4 = (V) this.f7230a;
        View view = v4.f7408c.f7512J;
        kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
        int iD = p1.b.d(view);
        int i = v4.f7406a;
        return iD == i || !(iD == 2 || i == 2);
    }

    public abstract void i();

    public void j() {
        c();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((Q0.d) this.f7230a) == null) {
            this.f7230a = new Q0.d(this, 1);
        }
        ((y) this.f7231b).f7287o.registerReceiver((Q0.d) this.f7230a, intentFilterE);
    }

    public v(V v4, I.g gVar) {
        this.f7230a = v4;
        this.f7231b = gVar;
    }

    public v(y yVar) {
        this.f7231b = yVar;
    }
}
