package d4;

import L3.q;
import Y3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d4\c.smali */
public final class c implements Iterator, a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f6804b;

    /* renamed from: d, reason: collision with root package name */
    public Object f6806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f6807e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6803a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f6805c = -1;

    public c(q qVar) {
        this.f6807e = qVar;
        this.f6804b = new l((k) qVar.f2349b);
    }

    public void a() {
        Object next;
        do {
            Iterator it = this.f6804b;
            if (!it.hasNext()) {
                this.f6805c = 0;
                return;
            } else {
                next = it.next();
                ((q) this.f6807e).getClass();
            }
        } while (((Boolean) j.f6813a.invoke(next)).booleanValue());
        this.f6806d = next;
        this.f6805c = 1;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X3.l, kotlin.jvm.internal.j] */
    public void b() {
        Iterator it = this.f6804b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((k) this.f6807e).f6816c.invoke(next)).booleanValue()) {
                this.f6805c = 1;
                this.f6806d = next;
                return;
            }
        }
        this.f6805c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6803a) {
            case 0:
                if (this.f6805c == -1) {
                    a();
                }
                if (this.f6805c == 1) {
                }
                break;
            default:
                if (this.f6805c == -1) {
                    b();
                }
                if (this.f6805c == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6803a) {
            case 0:
                if (this.f6805c == -1) {
                    a();
                }
                if (this.f6805c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f6806d;
                this.f6806d = null;
                this.f6805c = -1;
                return obj;
            default:
                if (this.f6805c == -1) {
                    b();
                }
                if (this.f6805c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f6806d;
                this.f6806d = null;
                this.f6805c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6803a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(k kVar) {
        this.f6807e = kVar;
        this.f6804b = ((e) kVar.f6815b).iterator();
    }
}
