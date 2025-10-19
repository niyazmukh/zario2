package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0642a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\e1.smali */
public final class e1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0642a f8571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f8572b;

    public e1(f1 f1Var) {
        this.f8572b = f1Var;
        Context context = f1Var.f8574a.getContext();
        CharSequence charSequence = f1Var.h;
        C0642a c0642a = new C0642a();
        c0642a.f8161e = 4096;
        c0642a.f8163g = 4096;
        c0642a.f8166l = null;
        c0642a.f8167m = null;
        c0642a.f8168n = false;
        c0642a.f8169o = false;
        c0642a.f8170p = 16;
        c0642a.i = context;
        c0642a.f8157a = charSequence;
        this.f8571a = c0642a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f1 f1Var = this.f8572b;
        Window.Callback callback = f1Var.f8582k;
        if (callback == null || !f1Var.f8583l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f8571a);
    }
}
