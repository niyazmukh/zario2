package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\m0.smali */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4657a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f4657a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).clear();
        }
        linkedHashMap.clear();
    }
}
