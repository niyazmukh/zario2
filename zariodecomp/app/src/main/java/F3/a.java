package F3;

import C.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F3\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1737a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1738b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1739c;

    public a(d dVar) {
        int i;
        String str = (String) dVar.f1047c;
        this.f1737a = (String) dVar.f1048d;
        int i5 = dVar.f1046b;
        if (i5 == -1) {
            if (str.equals("http")) {
                i = 80;
            } else if (str.equals("https")) {
                i = 443;
            } else {
                i5 = -1;
            }
            i5 = i;
        }
        this.f1738b = i5;
        this.f1739c = dVar.toString();
    }

    public static int a(char c5) {
        if (c5 >= '0' && c5 <= '9') {
            return c5 - '0';
        }
        if (c5 >= 'a' && c5 <= 'f') {
            return c5 - 'W';
        }
        if (c5 < 'A' || c5 > 'F') {
            return -1;
        }
        return c5 - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f1739c.equals(this.f1739c);
    }

    public final int hashCode() {
        return this.f1739c.hashCode();
    }

    public final String toString() {
        return this.f1739c;
    }
}
