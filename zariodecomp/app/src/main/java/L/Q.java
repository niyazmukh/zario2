package l;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\Q.smali */
public final class Q extends C.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f8492g;
    public final /* synthetic */ W h;

    public Q(W w4, int i, int i5, WeakReference weakReference) {
        this.h = w4;
        this.f8490e = i;
        this.f8491f = i5;
        this.f8492g = weakReference;
    }

    @Override // C.b
    public final void g(int i) {
    }

    @Override // C.b
    public final void h(Typeface typeface) {
        int i = this.f8490e;
        if (i != -1) {
            typeface = V.a(typeface, i, (this.f8491f & 2) != 0);
        }
        W w4 = this.h;
        if (w4.f8539m) {
            w4.f8538l = typeface;
            TextView textView = (TextView) this.f8492g.get();
            if (textView != null) {
                WeakHashMap weakHashMap = M.S.f2363a;
                if (M.E.b(textView)) {
                    textView.post(new F1.b(textView, typeface, w4.f8536j, 5));
                } else {
                    textView.setTypeface(typeface, w4.f8536j);
                }
            }
        }
    }
}
