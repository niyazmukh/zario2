package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0531f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\m.smali */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0641E f8240a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0531f f8241b;

    /* renamed from: c, reason: collision with root package name */
    public C0649h f8242c;

    @Override // k.x
    public final void a(l lVar, boolean z4) {
        DialogInterfaceC0531f dialogInterfaceC0531f;
        if ((z4 || lVar == this.f8240a) && (dialogInterfaceC0531f = this.f8241b) != null) {
            dialogInterfaceC0531f.dismiss();
        }
    }

    @Override // k.x
    public final boolean d(l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0649h c0649h = this.f8242c;
        if (c0649h.f8210f == null) {
            c0649h.f8210f = new C0648g(c0649h);
        }
        this.f8240a.q(c0649h.f8210f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f8242c.a(this.f8240a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0641E subMenuC0641E = this.f8240a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f8241b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f8241b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0641E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0641E.performShortcut(i, keyEvent, 0);
    }
}
