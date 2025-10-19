package o0;

import android.os.Bundle;
import java.util.Set;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\e.1.smali */
public final class C0782e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9056a;

    /* renamed from: b, reason: collision with root package name */
    public C0769D f9057b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f9058c = null;

    public C0782e(int i) {
        this.f9056a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0782e)) {
            return false;
        }
        C0782e c0782e = (C0782e) obj;
        if (this.f9056a == c0782e.f9056a && kotlin.jvm.internal.i.a(this.f9057b, c0782e.f9057b)) {
            if (kotlin.jvm.internal.i.a(this.f9058c, c0782e.f9058c)) {
                return true;
            }
            Bundle bundle = this.f9058c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                if (setKeySet.isEmpty()) {
                    return true;
                }
                for (String str : setKeySet) {
                    Bundle bundle2 = this.f9058c;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = c0782e.f9058c;
                    if (!kotlin.jvm.internal.i.a(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.f9056a) * 31;
        C0769D c0769d = this.f9057b;
        int iHashCode2 = iHashCode + (c0769d != null ? c0769d.hashCode() : 0);
        Bundle bundle = this.f9058c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i = iHashCode2 * 31;
                Bundle bundle2 = this.f9058c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0782e.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f9056a));
        sb.append(")");
        if (this.f9057b != null) {
            sb.append(" navOptions=");
            sb.append(this.f9057b);
        }
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
