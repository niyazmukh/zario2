package K2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K2\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2272a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2273b;

    public b(Set set, c cVar) {
        this.f2272a = b(set);
        this.f2273b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f2270a);
            sb.append('/');
            sb.append(aVar.f2271b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        c cVar = this.f2273b;
        synchronized (((HashSet) cVar.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f2272a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.b);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
