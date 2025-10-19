package G2;

import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G2\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1841a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1842b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f1841a = str;
        this.f1842b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1841a.equals(aVar.f1841a) && this.f1842b.equals(aVar.f1842b);
    }

    public final int hashCode() {
        return this.f1842b.hashCode() ^ ((this.f1841a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f1841a + ", usedDates=" + this.f1842b + "}";
    }
}
