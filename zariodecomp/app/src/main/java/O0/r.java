package o0;

import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import g0.C0544L;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\r.smali */
public final class r extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0544L f9109b = new C0544L(2);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9110a = new LinkedHashMap();

    @Override // androidx.lifecycle.f0
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f9110a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((m0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f9110a.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
