package h2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\g.smali */
public abstract class g extends AbstractC0592a implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7673c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient e f7674b;

    public static int l(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            S0.f.g("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static g m(int i, Object... objArr) {
        if (i == 0) {
            return o.f7697n;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new p(obj);
        }
        int iL = l(i);
        Object[] objArr2 = new Object[iL];
        int i5 = iL - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new NullPointerException(B.a.g(i8, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iZ = S0.f.Z(iHashCode);
            while (true) {
                int i9 = iZ & i5;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += iHashCode;
                    i7++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZ++;
            }
        }
        Arrays.fill(objArr, i7, i, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new p(obj4);
        }
        if (l(i7) < iL / 2) {
            return m(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new o(objArr, i6, objArr2, i5, i7);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g) && (this instanceof o)) {
            g gVar = (g) obj;
            gVar.getClass();
            if ((gVar instanceof o) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // h2.AbstractC0592a
    public e f() {
        e eVar = this.f7674b;
        if (eVar != null) {
            return eVar;
        }
        e eVarN = n();
        this.f7674b = eVarN;
        return eVarN;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public e n() {
        Object[] array = toArray(AbstractC0592a.f7658a);
        c cVar = e.f7669b;
        return e.l(array.length, array);
    }
}
