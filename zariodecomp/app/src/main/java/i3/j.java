package I3;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import z3.C1094s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\j.smali */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f1948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1949b;

    public j(C1094s c1094s) {
        S0.f.l(c1094s, "eag");
        List list = c1094s.f11399a;
        this.f1948a = new String[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f1948a[i] = ((SocketAddress) it.next()).toString();
            i++;
        }
        Arrays.sort(this.f1948a);
        this.f1949b = Arrays.hashCode(this.f1948a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f1949b == this.f1949b) {
            String[] strArr = jVar.f1948a;
            int length = strArr.length;
            String[] strArr2 = this.f1948a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1949b;
    }

    public final String toString() {
        return Arrays.toString(this.f1948a);
    }
}
