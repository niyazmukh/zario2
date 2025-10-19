package y2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: y2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\d.1.smali */
public final class C1055d extends k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11084b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f11085c;

    public C1055d(int i, List list) {
        this.f11083a = new ArrayList(list);
        this.f11084b = i;
    }

    @Override // y2.k
    public final String a() {
        boolean z4;
        String str;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f11083a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z4 = e();
            } else if (((k) it.next()) instanceof C1055d) {
                break;
            }
        }
        if (z4) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append(((k) it2.next()).a());
            }
            return sb.toString();
        }
        int i = this.f11084b;
        if (i == 1) {
            str = "and";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "or";
        }
        sb.append(str.concat("("));
        sb.append(TextUtils.join(",", arrayList));
        sb.append(")");
        return sb.toString();
    }

    @Override // y2.k
    public final List b() {
        return Collections.unmodifiableList(this.f11083a);
    }

    @Override // y2.k
    public final List c() {
        ArrayList arrayList = this.f11085c;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        this.f11085c = new ArrayList();
        Iterator it = this.f11083a.iterator();
        while (it.hasNext()) {
            this.f11085c.addAll(((k) it.next()).c());
        }
        return Collections.unmodifiableList(this.f11085c);
    }

    @Override // y2.k
    public final boolean d(B2.l lVar) {
        boolean zE = e();
        ArrayList arrayList = this.f11083a;
        if (zE) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((k) it.next()).d(lVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((k) it2.next()).d(lVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.f11084b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1055d)) {
            return false;
        }
        C1055d c1055d = (C1055d) obj;
        return this.f11084b == c1055d.f11084b && this.f11083a.equals(c1055d.f11083a);
    }

    public final int hashCode() {
        return this.f11083a.hashCode() + ((t.h.c(this.f11084b) + 1147) * 31);
    }

    public final String toString() {
        return a();
    }
}
