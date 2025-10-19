package k;

import M.S;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\w.smali */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8283a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8284b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8285c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8286d;

    /* renamed from: e, reason: collision with root package name */
    public View f8287e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8289g;
    public x h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8290j;

    /* renamed from: f, reason: collision with root package name */
    public int f8288f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final u f8291k = new u(this, 0);

    public w(int i, Context context, View view, l lVar, boolean z4) {
        this.f8283a = context;
        this.f8284b = lVar;
        this.f8287e = view;
        this.f8285c = z4;
        this.f8286d = i;
    }

    public final t a() {
        t viewOnKeyListenerC0640D;
        if (this.i == null) {
            Context context = this.f8283a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131099670)) {
                viewOnKeyListenerC0640D = new ViewOnKeyListenerC0647f(context, this.f8287e, this.f8286d, this.f8285c);
            } else {
                View view = this.f8287e;
                Context context2 = this.f8283a;
                boolean z4 = this.f8285c;
                viewOnKeyListenerC0640D = new ViewOnKeyListenerC0640D(this.f8286d, context2, view, this.f8284b, z4);
            }
            viewOnKeyListenerC0640D.l(this.f8284b);
            viewOnKeyListenerC0640D.r(this.f8291k);
            viewOnKeyListenerC0640D.n(this.f8287e);
            viewOnKeyListenerC0640D.k(this.h);
            viewOnKeyListenerC0640D.o(this.f8289g);
            viewOnKeyListenerC0640D.p(this.f8288f);
            this.i = viewOnKeyListenerC0640D;
        }
        return this.i;
    }

    public final boolean b() {
        t tVar = this.i;
        return tVar != null && tVar.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f8290j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i5, boolean z4, boolean z5) {
        t tVarA = a();
        tVarA.s(z5);
        if (z4) {
            int i6 = this.f8288f;
            View view = this.f8287e;
            WeakHashMap weakHashMap = S.f2363a;
            if ((Gravity.getAbsoluteGravity(i6, M.C.d(view)) & 7) == 5) {
                i -= this.f8287e.getWidth();
            }
            tVarA.q(i);
            tVarA.t(i5);
            int i7 = (int) ((this.f8283a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f8280a = new Rect(i - i7, i5 - i7, i + i7, i5 + i7);
        }
        tVarA.f();
    }
}
