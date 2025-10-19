package C2;

import java.util.HashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\f.smali */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f1080b = new f(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1081a;

    public f(HashSet hashSet) {
        this.f1081a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return this.f1081a.equals(((f) obj).f1081a);
    }

    public final int hashCode() {
        return this.f1081a.hashCode();
    }

    public final String toString() {
        return "FieldMask{mask=" + this.f1081a.toString() + "}";
    }
}
