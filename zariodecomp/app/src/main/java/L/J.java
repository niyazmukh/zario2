package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0527b;
import g.DialogInterfaceC0531f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\J.smali */
public final class J implements O, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0531f f8457a;

    /* renamed from: b, reason: collision with root package name */
    public K f8458b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f8459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f8460d;

    public J(P p5) {
        this.f8460d = p5;
    }

    @Override // l.O
    public final void a(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.O
    public final boolean b() {
        b.m mVar = this.f8457a;
        if (mVar != null) {
            return mVar.isShowing();
        }
        return false;
    }

    @Override // l.O
    public final int d() {
        return 0;
    }

    @Override // l.O
    public final void dismiss() {
        DialogInterfaceC0531f dialogInterfaceC0531f = this.f8457a;
        if (dialogInterfaceC0531f != null) {
            dialogInterfaceC0531f.dismiss();
            this.f8457a = null;
        }
    }

    @Override // l.O
    public final void e(int i, int i5) {
        if (this.f8458b == null) {
            return;
        }
        P p5 = this.f8460d;
        E2.j jVar = new E2.j(p5.getPopupContext());
        CharSequence charSequence = this.f8459c;
        C0527b c0527b = (C0527b) jVar.f1460c;
        if (charSequence != null) {
            c0527b.f7160d = charSequence;
        }
        K k5 = this.f8458b;
        int selectedItemPosition = p5.getSelectedItemPosition();
        c0527b.f7165k = k5;
        c0527b.f7166l = this;
        c0527b.f7168n = selectedItemPosition;
        c0527b.f7167m = true;
        DialogInterfaceC0531f dialogInterfaceC0531fA = jVar.a();
        this.f8457a = dialogInterfaceC0531fA;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0531fA.f7201f.f7180f;
        H.d(alertController$RecycleListView, i);
        H.c(alertController$RecycleListView, i5);
        this.f8457a.show();
    }

    @Override // l.O
    public final int g() {
        return 0;
    }

    @Override // l.O
    public final Drawable h() {
        return null;
    }

    @Override // l.O
    public final CharSequence i() {
        return this.f8459c;
    }

    @Override // l.O
    public final void k(CharSequence charSequence) {
        this.f8459c = charSequence;
    }

    @Override // l.O
    public final void l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.O
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.O
    public final void o(ListAdapter listAdapter) {
        this.f8458b = (K) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        P p5 = this.f8460d;
        p5.setSelection(i);
        if (p5.getOnItemClickListener() != null) {
            p5.performItemClick(null, i, this.f8458b.getItemId(i));
        }
        dismiss();
    }

    @Override // l.O
    public final void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
