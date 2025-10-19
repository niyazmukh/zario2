package q;

import S1.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: q.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\h.smali */
public final class C0831h implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f9416b;

    public /* synthetic */ C0831h(o oVar, int i) {
        this.f9415a = i;
        this.f9416b = oVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f9415a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f9415a) {
            case 0:
                o oVar = this.f9416b;
                int iF = oVar.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    oVar.i(entry.getKey(), entry.getValue());
                }
                return iF != oVar.f();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f9415a) {
            case 0:
                this.f9416b.c();
                break;
            default:
                this.f9416b.c();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f9415a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                o oVar = this.f9416b;
                int iG = oVar.g(key);
                if (iG < 0) {
                    return false;
                }
                Object objD = oVar.d(iG, 1);
                Object value = entry.getValue();
                return objD == value || (objD != null && objD.equals(value));
            default:
                return this.f9416b.g(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f9415a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapE = this.f9416b.e();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapE.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f9415a) {
        }
        return o.n(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f9415a) {
            case 0:
                o oVar = this.f9416b;
                int iHashCode = 0;
                for (int iF = oVar.f() - 1; iF >= 0; iF--) {
                    Object objD = oVar.d(iF, 0);
                    Object objD2 = oVar.d(iF, 1);
                    iHashCode += (objD == null ? 0 : objD.hashCode()) ^ (objD2 == null ? 0 : objD2.hashCode());
                }
                return iHashCode;
            default:
                o oVar2 = this.f9416b;
                int iHashCode2 = 0;
                for (int iF2 = oVar2.f() - 1; iF2 >= 0; iF2--) {
                    Object objD3 = oVar2.d(iF2, 0);
                    iHashCode2 += objD3 == null ? 0 : objD3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f9415a) {
            case 0:
                if (this.f9416b.f() == 0) {
                }
                break;
            default:
                if (this.f9416b.f() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9415a) {
            case 0:
                return new C0832i(this.f9416b);
            default:
                return new C0830g(this.f9416b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f9415a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                o oVar = this.f9416b;
                int iG = oVar.g(obj);
                if (iG < 0) {
                    return false;
                }
                oVar.j(iG);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f9415a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapE = this.f9416b.e();
                int size = mapE.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapE.remove(it.next());
                }
                return size != mapE.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f9415a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapE = this.f9416b.e();
                int size = mapE.size();
                Iterator it = mapE.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapE.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f9415a) {
        }
        return this.f9416b.f();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f9415a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f9416b.t(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f9415a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                o oVar = this.f9416b;
                int iF = oVar.f();
                Object[] objArr = new Object[iF];
                for (int i = 0; i < iF; i++) {
                    objArr[i] = oVar.d(i, 0);
                }
                return objArr;
        }
    }
}
