package G1;

import B2.k;
import B2.l;
import B2.p;
import N2.AbstractC0156x;
import N2.n0;
import a.AbstractC0183a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import r.AbstractC0854a;
import s3.I;
import s3.r;
import y2.u;
import z3.i0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G1\d.smali */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1832a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1833b;

    public /* synthetic */ d(Object obj, int i) {
        this.f1832a = i;
        this.f1833b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int iA;
        int iB;
        switch (this.f1832a) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f5879s).compareTo(Boolean.valueOf(materialButton2.f5879s));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f1833b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 1:
                int iCompare = ((r) this.f1833b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC0156x.j(Long.valueOf(((I) obj).f9726b), Long.valueOf(((I) obj2).f9726b));
            case 2:
                l lVar = (l) obj;
                l lVar2 = (l) obj2;
                Iterator it = ((List) this.f1833b).iterator();
                do {
                    i = 0;
                    if (it.hasNext()) {
                        u uVar = (u) it.next();
                        uVar.getClass();
                        k kVar = k.f320b;
                        k kVar2 = uVar.f11143b;
                        boolean zEquals = kVar2.equals(kVar);
                        int i5 = uVar.f11142a;
                        if (zEquals) {
                            iA = AbstractC0854a.a(i5);
                            iB = lVar.f322a.compareTo(lVar2.f322a);
                        } else {
                            n0 n0VarF = lVar.f326e.f(kVar2);
                            n0 n0VarF2 = lVar2.f326e.f(kVar2);
                            AbstractC0183a.N((n0VarF == null || n0VarF2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
                            iA = AbstractC0854a.a(i5);
                            iB = p.b(n0VarF, n0VarF2);
                        }
                        i = iB * iA;
                    }
                    return i;
                } while (i == 0);
                return i;
            default:
                i0 i0Var = (i0) this.f1833b;
                int iB2 = i0Var.b(obj) - i0Var.b(obj2);
                return iB2 != 0 ? iB2 : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    public d(List list) {
        boolean z4;
        this.f1832a = 2;
        Iterator it = list.iterator();
        loop0: while (true) {
            z4 = false;
            while (it.hasNext()) {
                z4 = (z4 || ((u) it.next()).f11143b.equals(k.f320b)) ? true : z4;
            }
        }
        if (!z4) {
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }
        this.f1833b = list;
    }
}
