package j;

import M.X;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\k.smali */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f8029c;

    /* renamed from: d, reason: collision with root package name */
    public S0.f f8030d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8031e;

    /* renamed from: b, reason: collision with root package name */
    public long f8028b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final j f8032f = new j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8027a = new ArrayList();

    public final void a() {
        if (this.f8031e) {
            Iterator it = this.f8027a.iterator();
            while (it.hasNext()) {
                ((X) it.next()).b();
            }
            this.f8031e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f8031e) {
            return;
        }
        Iterator it = this.f8027a.iterator();
        while (it.hasNext()) {
            X x3 = (X) it.next();
            long j5 = this.f8028b;
            if (j5 >= 0) {
                x3.c(j5);
            }
            BaseInterpolator baseInterpolator = this.f8029c;
            if (baseInterpolator != null && (view = (View) x3.f2367a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f8030d != null) {
                x3.d(this.f8032f);
            }
            View view2 = (View) x3.f2367a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f8031e = true;
    }
}
