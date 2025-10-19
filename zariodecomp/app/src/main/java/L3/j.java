package L3;

import N2.AbstractC0156x;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\j.smali */
public abstract class j extends p {
    public static ArrayList A0(List list, int i, int i5) {
        d4.f fVar;
        kotlin.jvm.internal.i.e(list, "<this>");
        if (i <= 0 || i5 <= 0) {
            throw new IllegalArgumentException((i != i5 ? "Both size " + i + " and step " + i5 + " must be greater than zero." : B.a.i("size ", i, " must be greater than zero.")).toString());
        }
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = list.iterator();
            kotlin.jvm.internal.i.e(iterator, "iterator");
            if (iterator.hasNext()) {
                D d5 = new D(i, i5, iterator, null);
                fVar = new d4.f();
                fVar.c = d5.create(fVar, fVar);
            } else {
                fVar = r.f2350a;
            }
            while (fVar.hasNext()) {
                arrayList.add((List) fVar.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i5) + (size % i5 == 0 ? 0 : 1));
        int i6 = 0;
        while (i6 >= 0 && i6 < size) {
            int i7 = size - i6;
            if (i <= i7) {
                i7 = i;
            }
            ArrayList arrayList3 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList3.add(list.get(i8 + i6));
            }
            arrayList2.add(arrayList3);
            i6 += i5;
        }
        return arrayList2;
    }

    public static boolean c0(Iterable iterable, Object obj) {
        int iIndexOf;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    k.Z();
                    throw null;
                }
                if (kotlin.jvm.internal.i.a(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static Object d0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object e0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object f0(int i, List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void g0(Iterable iterable, StringBuilder sb, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, X3.l lVar) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        sb.append(prefix);
        int i5 = 0;
        for (Object obj : iterable) {
            i5++;
            if (i5 > 1) {
                sb.append(separator);
            }
            if (i >= 0 && i5 > i) {
                break;
            } else {
                AbstractC0156x.d(sb, obj, lVar);
            }
        }
        if (i >= 0 && i5 > i) {
            sb.append(truncated);
        }
        sb.append(postfix);
    }

    public static String h0(Iterable iterable, String str, String str2, String str3, X3.l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String postfix = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        StringBuilder sb = new StringBuilder();
        g0(iterable, sb, separator, prefix, postfix, -1, "...", lVar);
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static Object i0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(k.X(list));
    }

    public static Object j0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable k0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList l0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            p.b0(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List m0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return u0(iterable);
        }
        List listX0 = x0(iterable);
        Collections.reverse(listX0);
        return listX0;
    }

    public static List n0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        if (collection.size() <= 1) {
            return u0(collection);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.i.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return i.q0(array);
    }

    public static List o0(Comparator comparator, Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listX0 = x0(iterable);
            if (((ArrayList) listX0).size() > 1) {
                Collections.sort(listX0, comparator);
            }
            return listX0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return u0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.i.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return i.q0(array);
    }

    public static long p0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        Iterator it = collection.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    public static List q0(int i, List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(B.a.i("Requested element count ", i, " is less than zero.").toString());
        }
        s sVar = s.f2351a;
        if (i == 0) {
            return sVar;
        }
        if (i >= list.size()) {
            return u0(list);
        }
        if (i == 1) {
            return p1.b.B(d0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i5++;
            if (i5 == i) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : p1.b.B(arrayList.get(0)) : sVar;
    }

    public static byte[] r0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void s0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] t0(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List u0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        s sVar = s.f2351a;
        if (!z4) {
            List listX0 = x0(iterable);
            ArrayList arrayList = (ArrayList) listX0;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listX0 : p1.b.B(arrayList.get(0)) : sVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return sVar;
        }
        if (size2 != 1) {
            return w0(collection);
        }
        return p1.b.B(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] v0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList w0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List x0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return w0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        s0(iterable, arrayList);
        return arrayList;
    }

    public static Set y0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set z0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        u uVar = u.f2353a;
        if (!z4) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            s0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return uVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            kotlin.jvm.internal.i.d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return uVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(x.a0(collection.size()));
            s0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        kotlin.jvm.internal.i.d(setSingleton2, "singleton(...)");
        return setSingleton2;
    }
}
