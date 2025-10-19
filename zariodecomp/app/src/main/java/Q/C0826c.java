package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\c.smali */
public final class C0826c implements Collection, Set {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9392e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f9393f = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public static Object[] f9394k;

    /* renamed from: l, reason: collision with root package name */
    public static int f9395l;

    /* renamed from: m, reason: collision with root package name */
    public static Object[] f9396m;

    /* renamed from: n, reason: collision with root package name */
    public static int f9397n;

    /* renamed from: a, reason: collision with root package name */
    public int[] f9398a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f9399b;

    /* renamed from: c, reason: collision with root package name */
    public int f9400c;

    /* renamed from: d, reason: collision with root package name */
    public C0825a f9401d;

    public C0826c(int i) {
        if (i == 0) {
            this.f9398a = f9392e;
            this.f9399b = f9393f;
        } else {
            f(i);
        }
        this.f9400c = 0;
    }

    public static void g(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0826c.class) {
                try {
                    if (f9397n < 10) {
                        objArr[0] = f9396m;
                        objArr[1] = iArr;
                        for (int i5 = i - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f9396m = objArr;
                        f9397n++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0826c.class) {
                try {
                    if (f9395l < 10) {
                        objArr[0] = f9394k;
                        objArr[1] = iArr;
                        for (int i6 = i - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f9394k = objArr;
                        f9395l++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iH;
        if (obj == null) {
            iH = i();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iH = h(iHashCode, obj);
        }
        if (iH >= 0) {
            return false;
        }
        int i5 = ~iH;
        int i6 = this.f9400c;
        int[] iArr = this.f9398a;
        if (i6 >= iArr.length) {
            int i7 = 8;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f9399b;
            f(i7);
            int[] iArr2 = this.f9398a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9399b, 0, objArr.length);
            }
            g(iArr, objArr, this.f9400c);
        }
        int i8 = this.f9400c;
        if (i5 < i8) {
            int[] iArr3 = this.f9398a;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr2 = this.f9399b;
            System.arraycopy(objArr2, i5, objArr2, i9, this.f9400c - i5);
        }
        this.f9398a[i5] = i;
        this.f9399b[i5] = obj;
        this.f9400c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f9400c;
        int[] iArr = this.f9398a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f9399b;
            f(size);
            int i = this.f9400c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f9398a, 0, i);
                System.arraycopy(objArr, 0, this.f9399b, 0, this.f9400c);
            }
            g(iArr, objArr, this.f9400c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f9400c;
        if (i != 0) {
            g(this.f9398a, this.f9399b, i);
            this.f9398a = f9392e;
            this.f9399b = f9393f;
            this.f9400c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f9400c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f9400c; i++) {
                try {
                    if (!set.contains(this.f9399b[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i) {
        if (i == 8) {
            synchronized (C0826c.class) {
                try {
                    Object[] objArr = f9396m;
                    if (objArr != null) {
                        this.f9399b = objArr;
                        f9396m = (Object[]) objArr[0];
                        this.f9398a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f9397n--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C0826c.class) {
                try {
                    Object[] objArr2 = f9394k;
                    if (objArr2 != null) {
                        this.f9399b = objArr2;
                        f9394k = (Object[]) objArr2[0];
                        this.f9398a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f9395l--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f9398a = new int[i];
        this.f9399b = new Object[i];
    }

    public final int h(int i, Object obj) {
        int i5 = this.f9400c;
        if (i5 == 0) {
            return -1;
        }
        int iA = AbstractC0827d.a(i5, i, this.f9398a);
        if (iA < 0 || obj.equals(this.f9399b[iA])) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i5 && this.f9398a[i6] == i) {
            if (obj.equals(this.f9399b[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f9398a[i7] == i; i7--) {
            if (obj.equals(this.f9399b[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f9398a;
        int i = this.f9400c;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public final int i() {
        int i = this.f9400c;
        if (i == 0) {
            return -1;
        }
        int iA = AbstractC0827d.a(i, 0, this.f9398a);
        if (iA < 0 || this.f9399b[iA] == null) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i && this.f9398a[i5] == 0) {
            if (this.f9399b[i5] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f9398a[i6] == 0; i6--) {
            if (this.f9399b[i6] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int indexOf(Object obj) {
        return obj == null ? i() : h(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9400c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f9401d == null) {
            this.f9401d = new C0825a(this, 1);
        }
        C0825a c0825a = this.f9401d;
        if (((C0831h) c0825a.f2999b) == null) {
            c0825a.f2999b = new C0831h(c0825a, 1);
        }
        return ((C0831h) c0825a.f2999b).iterator();
    }

    public final void j(int i) {
        Object[] objArr = this.f9399b;
        Object obj = objArr[i];
        int i5 = this.f9400c;
        if (i5 <= 1) {
            g(this.f9398a, objArr, i5);
            this.f9398a = f9392e;
            this.f9399b = f9393f;
            this.f9400c = 0;
            return;
        }
        int[] iArr = this.f9398a;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            int i6 = i5 - 1;
            this.f9400c = i6;
            if (i < i6) {
                int i7 = i + 1;
                System.arraycopy(iArr, i7, iArr, i, i6 - i);
                Object[] objArr2 = this.f9399b;
                System.arraycopy(objArr2, i7, objArr2, i, this.f9400c - i);
            }
            this.f9399b[this.f9400c] = null;
            return;
        }
        f(i5 > 8 ? i5 + (i5 >> 1) : 8);
        this.f9400c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f9398a, 0, i);
            System.arraycopy(objArr, 0, this.f9399b, 0, i);
        }
        int i8 = this.f9400c;
        if (i < i8) {
            int i9 = i + 1;
            System.arraycopy(iArr, i9, this.f9398a, i, i8 - i);
            System.arraycopy(objArr, i9, this.f9399b, i, this.f9400c - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        j(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z4 = false;
        for (int i = this.f9400c - 1; i >= 0; i--) {
            if (!collection.contains(this.f9399b[i])) {
                j(i);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f9400c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f9400c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f9399b, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9400c * 14);
        sb.append('{');
        for (int i = 0; i < this.f9400c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f9399b[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f9400c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f9400c);
        }
        System.arraycopy(this.f9399b, 0, objArr, 0, this.f9400c);
        int length = objArr.length;
        int i = this.f9400c;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
