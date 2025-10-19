package l;

import android.content.Context;
import android.view.View;
import k.SubMenuC0641E;
import k.l;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\e.1.smali */
public final class C0685e extends k.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8569l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0693i f8570m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0685e(C0693i c0693i, Context context, l lVar, View view) {
        super(2130903073, context, view, lVar, true);
        this.f8570m = c0693i;
        this.f8288f = 8388613;
        k.x xVar = c0693i.f8593A;
        this.h = xVar;
        k.t tVar = this.i;
        if (tVar != null) {
            tVar.k(xVar);
        }
    }

    @Override // k.w
    public final void c() {
        switch (this.f8569l) {
            case 0:
                C0693i c0693i = this.f8570m;
                c0693i.f8613x = null;
                c0693i.getClass();
                super.c();
                break;
            default:
                C0693i c0693i2 = this.f8570m;
                l lVar = c0693i2.f8596c;
                if (lVar != null) {
                    lVar.c(true);
                }
                c0693i2.f8612w = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0685e(C0693i c0693i, Context context, SubMenuC0641E subMenuC0641E, View view) {
        super(2130903073, context, view, subMenuC0641E, false);
        this.f8570m = c0693i;
        if (!subMenuC0641E.f8155A.f()) {
            View view2 = c0693i.f8602m;
            this.f8287e = view2 == null ? (View) c0693i.f8601l : view2;
        }
        k.x xVar = c0693i.f8593A;
        this.h = xVar;
        k.t tVar = this.i;
        if (tVar != null) {
            tVar.k(xVar);
        }
    }
}
