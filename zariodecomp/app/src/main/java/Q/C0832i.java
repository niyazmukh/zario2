package q;

import S1.o;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\i.smali */
public final class C0832i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f9417a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f9420d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9419c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f9418b = -1;

    public C0832i(o oVar) {
        this.f9420d = oVar;
        this.f9417a = oVar.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f9419c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f9418b;
        o oVar = this.f9420d;
        Object objD = oVar.d(i, 0);
        if (key != objD && (key == null || !key.equals(objD))) {
            return false;
        }
        Object value = entry.getValue();
        Object objD2 = oVar.d(this.f9418b, 1);
        return value == objD2 || (value != null && value.equals(objD2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f9419c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f9420d.d(this.f9418b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f9419c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f9420d.d(this.f9418b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9418b < this.f9417a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f9419c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f9418b;
        o oVar = this.f9420d;
        Object objD = oVar.d(i, 0);
        Object objD2 = oVar.d(this.f9418b, 1);
        return (objD == null ? 0 : objD.hashCode()) ^ (objD2 != null ? objD2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9418b++;
        this.f9419c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9419c) {
            throw new IllegalStateException();
        }
        this.f9420d.j(this.f9418b);
        this.f9418b--;
        this.f9417a--;
        this.f9419c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f9419c) {
            return this.f9420d.k(this.f9418b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
