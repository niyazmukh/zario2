package z3;

import N2.AbstractC0156x;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\b.1.smali */
public final class C1078b {

    /* renamed from: b, reason: collision with root package name */
    public static final C1078b f11279b = new C1078b(new IdentityHashMap());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f11280a;

    public C1078b(IdentityHashMap identityHashMap) {
        this.f11280a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1078b.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.f11280a;
        int size = identityHashMap.size();
        IdentityHashMap identityHashMap2 = ((C1078b) obj).f11280a;
        if (size != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !AbstractC0156x.F(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f11280a.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f11280a.toString();
    }
}
