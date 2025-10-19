package B2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\k.smali */
public final class k extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final k f320b = new k(Collections.singletonList("__name__"));

    /* renamed from: c, reason: collision with root package name */
    public static final k f321c = new k(Collections.emptyList());

    public static k l(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z4 = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
                if (i == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i));
            } else if (cCharAt == '.') {
                if (z4) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException(B.a.l("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z4 = !z4;
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        String string2 = sb.toString();
        if (string2.isEmpty()) {
            throw new IllegalArgumentException(B.a.l("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
        arrayList.add(string2);
        return new k(arrayList);
    }

    @Override // B2.e
    public final String c() {
        char cCharAt;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.f309a;
            if (i >= list.size()) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append(".");
            }
            String strReplace = ((String) list.get(i)).replace("\\", "\\\\").replace("`", "\\`");
            if (strReplace.isEmpty() || ((cCharAt = strReplace.charAt(0)) != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')))) {
                strReplace = "`" + strReplace + '`';
                break;
                break;
            }
            for (int i5 = 1; i5 < strReplace.length(); i5++) {
                char cCharAt2 = strReplace.charAt(i5);
                if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                    strReplace = "`" + strReplace + '`';
                    break;
                }
            }
            sb.append(strReplace);
            i++;
        }
    }

    @Override // B2.e
    public final e e(List list) {
        return new k(list);
    }
}
