package B2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\n.smali */
public final class n extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final n f332b = new n(Collections.emptyList());

    public static n l(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException(B.a.l("Invalid path (", str, "). Paths must not contain // in them."));
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new n(arrayList);
    }

    @Override // B2.e
    public final String c() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.f309a;
            if (i >= list.size()) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append("/");
            }
            sb.append((String) list.get(i));
            i++;
        }
    }

    @Override // B2.e
    public final e e(List list) {
        return new n(list);
    }
}
