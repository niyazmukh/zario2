package F0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\q.smali */
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public n f1638a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f1639b;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d5 A[EDGE_INSN: B:136:0x01d5->B:89:0x01d5 BREAK  A[LOOP:1: B:19:0x0088->B:88:0x01cf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fb  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.q.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f1639b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = r.f1642c;
        FrameLayout frameLayout2 = this.f1639b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) r.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((n) it.next()).w(frameLayout2);
            }
        }
        this.f1638a.i(true);
    }
}
