package u0;

import N2.AbstractC0156x;
import java.util.Collections;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\q.smali */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f10423a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10424b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f10425c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f10426d;

    public q(p pVar, int[] iArr, String[] strArr) {
        Set setSingleton;
        this.f10423a = pVar;
        this.f10424b = iArr;
        this.f10425c = strArr;
        if (strArr.length == 0) {
            setSingleton = L3.u.f2353a;
        } else {
            setSingleton = Collections.singleton(strArr[0]);
            kotlin.jvm.internal.i.d(setSingleton, "singleton(...)");
        }
        this.f10426d = setSingleton;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set invalidatedTablesIds) {
        kotlin.jvm.internal.i.e(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.f10424b;
        int length = iArr.length;
        Set setF = L3.u.f2353a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                M3.i iVar = new M3.i();
                int length2 = iArr.length;
                int i5 = 0;
                while (i < length2) {
                    int i6 = i5 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i]))) {
                        iVar.add(this.f10425c[i5]);
                    }
                    i++;
                    i5 = i6;
                }
                setF = AbstractC0156x.f(iVar);
            } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                setF = this.f10426d;
            }
        }
        if (setF.isEmpty()) {
            return;
        }
        this.f10423a.a(setF);
    }
}
