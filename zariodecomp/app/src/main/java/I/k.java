package I;

import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\k.smali */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f1917b = new k(new l(j.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final l f1918a;

    public k(l lVar) {
        this.f1918a = lVar;
    }

    public static k a(String str) {
        if (str == null || str.isEmpty()) {
            return f1917b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = i.a(strArrSplit[i]);
        }
        return new k(new l(j.a(localeArr)));
    }

    public final boolean b() {
        return this.f1918a.f1919a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (this.f1918a.equals(((k) obj).f1918a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1918a.f1919a.hashCode();
    }

    public final String toString() {
        return this.f1918a.f1919a.toString();
    }
}
