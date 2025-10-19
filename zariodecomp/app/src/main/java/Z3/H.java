package z3;

import A2.C0020u;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\H.smali */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11241a = 0;

    /* renamed from: b, reason: collision with root package name */
    public List f11242b;

    /* renamed from: c, reason: collision with root package name */
    public C1078b f11243c;

    /* renamed from: d, reason: collision with root package name */
    public Object[][] f11244d;

    public /* synthetic */ H() {
    }

    public static H d() {
        H h = new H();
        h.f11243c = C1078b.f11279b;
        h.f11244d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return h;
    }

    public void a(L l4) {
        C1084h c1084h = M.f11254c;
        int length = 0;
        while (true) {
            Object[][] objArr = this.f11244d;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (c1084h.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f11244d.length + 1, 2);
            Object[][] objArr3 = this.f11244d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11244d = objArr2;
            length = objArr2.length - 1;
        }
        this.f11244d[length] = new Object[]{c1084h, l4};
    }

    public H b() {
        return new H(this.f11242b, this.f11243c, this.f11244d);
    }

    public Object c() {
        C1084h c1084h = M.f11254c;
        int i = 0;
        while (true) {
            Object[][] objArr = this.f11244d;
            if (i >= objArr.length) {
                return null;
            }
            if (c1084h.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public void e(List list) {
        S0.f.g("addrs is empty", !list.isEmpty());
        this.f11242b = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        switch (this.f11241a) {
            case 1:
                C0020u c0020uX = r1.d.X(this);
                c0020uX.a(this.f11242b, "addrs");
                c0020uX.a(this.f11243c, "attrs");
                c0020uX.a(Arrays.deepToString(this.f11244d), "customOptions");
                return c0020uX.toString();
            default:
                return super.toString();
        }
    }

    public H(List list, C1078b c1078b, Object[][] objArr) {
        S0.f.l(list, "addresses are not set");
        this.f11242b = list;
        S0.f.l(c1078b, "attrs");
        this.f11243c = c1078b;
        S0.f.l(objArr, "customOptions");
        this.f11244d = objArr;
    }
}
