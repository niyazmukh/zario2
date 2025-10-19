package L3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q.C0835l;

/* renamed from: L3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\a.1.smali */
public class C0112a implements Iterator, Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2335a;

    /* renamed from: b, reason: collision with root package name */
    public int f2336b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2337c;

    public /* synthetic */ C0112a(Object obj, int i) {
        this.f2335a = i;
        this.f2337c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2335a) {
            case 0:
                if (this.f2336b < ((AbstractC0115d) this.f2337c).f()) {
                }
                break;
            case 1:
                if (this.f2336b < ((Object[]) this.f2337c).length) {
                }
                break;
            default:
                if (this.f2336b < ((C0835l) this.f2337c).f()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2335a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f2336b;
                this.f2336b = i + 1;
                return ((AbstractC0115d) this.f2337c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f2337c;
                    int i5 = this.f2336b;
                    this.f2336b = i5 + 1;
                    return objArr[i5];
                } catch (ArrayIndexOutOfBoundsException e5) {
                    this.f2336b--;
                    throw new NoSuchElementException(e5.getMessage());
                }
            default:
                int i6 = this.f2336b;
                this.f2336b = i6 + 1;
                return ((C0835l) this.f2337c).g(i6);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2335a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0112a(Object[] array) {
        this.f2335a = 1;
        kotlin.jvm.internal.i.e(array, "array");
        this.f2337c = array;
    }
}
