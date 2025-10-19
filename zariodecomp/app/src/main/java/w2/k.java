package w2;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\k.smali */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f10935b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: a, reason: collision with root package name */
    public final B2.k f10936a;

    static {
        B2.k kVar = B2.k.f320b;
    }

    public k(List list) {
        B2.k kVar = B2.k.f320b;
        this.f10936a = list.isEmpty() ? B2.k.f321c : new B2.k(list);
    }

    public static k a(String str) {
        if (f10935b.matcher(str).find()) {
            throw new IllegalArgumentException("Use FieldPath.of() for field names containing '~*/[]'.");
        }
        try {
            return b(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(B.a.l("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
    }

    public static k b(String... strArr) {
        if (!(strArr.length > 0)) {
            throw new IllegalArgumentException("Invalid field path. Provided path must not be empty.");
        }
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            boolean z4 = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder("Invalid field name at argument ");
            i++;
            sb.append(i);
            sb.append(". Field names must not be null or empty.");
            String string = sb.toString();
            Object[] objArr = new Object[0];
            if (!z4) {
                throw new IllegalArgumentException(String.format(string, objArr));
            }
        }
        return new k(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f10936a.equals(((k) obj).f10936a);
    }

    public final int hashCode() {
        return this.f10936a.hashCode();
    }

    public final String toString() {
        return this.f10936a.c();
    }
}
