package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0709q0;
import l.C0685e;
import l.C0687f;
import l.C0691h;
import l.C0693i;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\b.1.smali */
public final class C0643b extends AbstractViewOnTouchListenerC0709q0 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8171n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f8172o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f8172o = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0709q0
    public final InterfaceC0639C b() {
        C0685e c0685e;
        switch (this.f8171n) {
            case 0:
                AbstractC0644c abstractC0644c = ((ActionMenuItemView) this.f8172o).f4118p;
                if (abstractC0644c == null || (c0685e = ((C0687f) abstractC0644c).f8573a.f8613x) == null) {
                    return null;
                }
                return c0685e.a();
            default:
                C0685e c0685e2 = ((C0691h) this.f8172o).f8589d.f8612w;
                if (c0685e2 == null) {
                    return null;
                }
                return c0685e2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0709q0
    public final boolean c() {
        InterfaceC0639C interfaceC0639CB;
        switch (this.f8171n) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f8172o;
                k kVar = actionMenuItemView.f4116n;
                return kVar != null && kVar.a(actionMenuItemView.f4113k) && (interfaceC0639CB = b()) != null && interfaceC0639CB.b();
            default:
                ((C0691h) this.f8172o).f8589d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0709q0
    public boolean d() {
        switch (this.f8171n) {
            case 1:
                C0693i c0693i = ((C0691h) this.f8172o).f8589d;
                if (c0693i.f8614y != null) {
                    return false;
                }
                c0693i.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643b(C0691h c0691h, C0691h c0691h2) {
        super(c0691h2);
        this.f8172o = c0691h;
    }
}
