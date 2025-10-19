package F0;

import M.E;
import M.S;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\r.smali */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1640a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1641b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f1642c;

    static {
        a aVar = new a();
        aVar.f1577A = new ArrayList();
        aVar.f1580D = false;
        aVar.f1581E = 0;
        aVar.f1578B = false;
        aVar.G(new j(2));
        aVar.G(new g());
        aVar.G(new j(1));
        f1640a = aVar;
        f1641b = new ThreadLocal();
        f1642c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, n nVar) {
        ArrayList arrayList = f1642c;
        if (arrayList.contains(frameLayout)) {
            return;
        }
        WeakHashMap weakHashMap = S.f2363a;
        if (E.c(frameLayout)) {
            arrayList.add(frameLayout);
            if (nVar == null) {
                nVar = f1640a;
            }
            n nVarClone = nVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).u(frameLayout);
                }
            }
            if (nVarClone != null) {
                nVarClone.h(frameLayout, true);
            }
            if (frameLayout.getTag(2131231254) != null) {
                throw new ClassCastException();
            }
            frameLayout.setTag(2131231254, null);
            if (nVarClone != null) {
                q qVar = new q();
                qVar.f1638a = nVarClone;
                qVar.f1639b = frameLayout;
                frameLayout.addOnAttachStateChangeListener(qVar);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(qVar);
            }
        }
    }

    public static q.b b() {
        q.b bVar;
        ThreadLocal threadLocal = f1641b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (q.b) weakReference.get()) != null) {
            return bVar;
        }
        q.b bVar2 = new q.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
