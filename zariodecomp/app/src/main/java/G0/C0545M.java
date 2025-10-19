package g0;

import android.util.Log;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: g0.M, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\M.smali */
public final class C0545M extends f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final C0544L f7362g = new C0544L(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7366d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7363a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7364b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7365c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f7367e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7368f = false;

    public C0545M(boolean z4) {
        this.f7366d = z4;
    }

    public final void b(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, boolean z4) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0567t);
        }
        d(abstractComponentCallbacksC0567t.f7531e, z4);
    }

    public final void c(String str, boolean z4) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        d(str, z4);
    }

    public final void d(String str, boolean z4) {
        HashMap map = this.f7364b;
        C0545M c0545m = (C0545M) map.get(str);
        if (c0545m != null) {
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c0545m.f7364b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0545m.c((String) it.next(), true);
                }
            }
            c0545m.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.f7365c;
        m0 m0Var = (m0) map2.get(str);
        if (m0Var != null) {
            m0Var.a();
            map2.remove(str);
        }
    }

    public final void e(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (this.f7368f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f7363a.remove(abstractComponentCallbacksC0567t.f7531e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0567t);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0545M.class != obj.getClass()) {
            return false;
        }
        C0545M c0545m = (C0545M) obj;
        return this.f7363a.equals(c0545m.f7363a) && this.f7364b.equals(c0545m.f7364b) && this.f7365c.equals(c0545m.f7365c);
    }

    public final int hashCode() {
        return this.f7365c.hashCode() + ((this.f7364b.hashCode() + (this.f7363a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.f0
    public final void onCleared() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f7367e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f7363a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f7364b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f7365c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
