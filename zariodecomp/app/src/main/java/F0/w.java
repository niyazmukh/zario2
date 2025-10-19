package F0;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\w.smali */
public final class w extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f1647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1649c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f1650d;

    public w(j jVar, FrameLayout frameLayout, View view, View view2) {
        this.f1650d = jVar;
        this.f1647a = frameLayout;
        this.f1648b = view;
        this.f1649c = view2;
    }

    @Override // F0.m
    public final void b(n nVar) {
        this.f1649c.setTag(2131231144, null);
        this.f1647a.getOverlay().remove(this.f1648b);
        nVar.v(this);
    }

    @Override // F0.o, F0.m
    public final void c() {
        this.f1647a.getOverlay().remove(this.f1648b);
    }

    @Override // F0.o, F0.m
    public final void e() {
        View view = this.f1648b;
        if (view.getParent() == null) {
            this.f1647a.getOverlay().add(view);
        } else {
            this.f1650d.c();
        }
    }
}
