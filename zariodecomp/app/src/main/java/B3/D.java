package B3;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\D.smali */
public final class D extends AbstractC0037e {

    /* renamed from: e, reason: collision with root package name */
    public static final o2 f386e = new o2(2);

    /* renamed from: f, reason: collision with root package name */
    public static final o2 f387f = new o2(3);

    /* renamed from: k, reason: collision with root package name */
    public static final o2 f388k = new o2(4);

    /* renamed from: l, reason: collision with root package name */
    public static final o2 f389l = new o2(5);

    /* renamed from: m, reason: collision with root package name */
    public static final o2 f390m = new o2(6);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f391a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f392b;

    /* renamed from: c, reason: collision with root package name */
    public int f393c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f394d;

    public D() {
        new ArrayDeque(2);
        this.f391a = new ArrayDeque();
    }

    @Override // B3.AbstractC0037e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f391a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((AbstractC0037e) arrayDeque.remove()).close();
            }
        }
        if (this.f392b != null) {
            while (!this.f392b.isEmpty()) {
                ((AbstractC0037e) this.f392b.remove()).close();
            }
        }
    }

    @Override // B3.AbstractC0037e
    public final void e() throws IOException {
        ArrayDeque arrayDeque = this.f392b;
        ArrayDeque arrayDeque2 = this.f391a;
        if (arrayDeque == null) {
            this.f392b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f392b.isEmpty()) {
            ((AbstractC0037e) this.f392b.remove()).close();
        }
        this.f394d = true;
        AbstractC0037e abstractC0037e = (AbstractC0037e) arrayDeque2.peek();
        if (abstractC0037e != null) {
            abstractC0037e.e();
        }
    }

    @Override // B3.AbstractC0037e
    public final boolean k() {
        Iterator it = this.f391a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0037e) it.next()).k()) {
                return false;
            }
        }
        return true;
    }

    @Override // B3.AbstractC0037e
    public final AbstractC0037e l(int i) throws IOException {
        AbstractC0037e abstractC0037eL;
        int i5;
        AbstractC0037e abstractC0037eL2;
        if (i <= 0) {
            return D1.f396a;
        }
        a(i);
        this.f393c -= i;
        AbstractC0037e abstractC0037e = null;
        D d5 = null;
        while (true) {
            ArrayDeque arrayDeque = this.f391a;
            AbstractC0037e abstractC0037e2 = (AbstractC0037e) arrayDeque.peek();
            int iQ = abstractC0037e2.q();
            if (iQ > i) {
                abstractC0037eL2 = abstractC0037e2.l(i);
                i5 = 0;
            } else {
                if (this.f394d) {
                    abstractC0037eL = abstractC0037e2.l(iQ);
                    u();
                } else {
                    abstractC0037eL = (AbstractC0037e) arrayDeque.poll();
                }
                AbstractC0037e abstractC0037e3 = abstractC0037eL;
                i5 = i - iQ;
                abstractC0037eL2 = abstractC0037e3;
            }
            if (abstractC0037e == null) {
                abstractC0037e = abstractC0037eL2;
            } else {
                if (d5 == null) {
                    d5 = new D(i5 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    d5.t(abstractC0037e);
                    abstractC0037e = d5;
                }
                d5.t(abstractC0037eL2);
            }
            if (i5 <= 0) {
                return abstractC0037e;
            }
            i = i5;
        }
    }

    @Override // B3.AbstractC0037e
    public final void m(OutputStream outputStream, int i) throws IOException {
        v(f390m, i, outputStream, 0);
    }

    @Override // B3.AbstractC0037e
    public final void n(ByteBuffer byteBuffer) {
        w(f389l, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // B3.AbstractC0037e
    public final void o(byte[] bArr, int i, int i5) {
        w(f388k, i5, bArr, i);
    }

    @Override // B3.AbstractC0037e
    public final int p() {
        return w(f386e, 1, null, 0);
    }

    @Override // B3.AbstractC0037e
    public final int q() {
        return this.f393c;
    }

    @Override // B3.AbstractC0037e
    public final void r() {
        if (!this.f394d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f391a;
        AbstractC0037e abstractC0037e = (AbstractC0037e) arrayDeque.peek();
        if (abstractC0037e != null) {
            int iQ = abstractC0037e.q();
            abstractC0037e.r();
            this.f393c = (abstractC0037e.q() - iQ) + this.f393c;
        }
        while (true) {
            AbstractC0037e abstractC0037e2 = (AbstractC0037e) this.f392b.pollLast();
            if (abstractC0037e2 == null) {
                return;
            }
            abstractC0037e2.r();
            arrayDeque.addFirst(abstractC0037e2);
            this.f393c = abstractC0037e2.q() + this.f393c;
        }
    }

    @Override // B3.AbstractC0037e
    public final void s(int i) {
        w(f387f, i, null, 0);
    }

    public final void t(AbstractC0037e abstractC0037e) throws IOException {
        boolean z4 = this.f394d;
        ArrayDeque arrayDeque = this.f391a;
        boolean z5 = z4 && arrayDeque.isEmpty();
        if (abstractC0037e instanceof D) {
            D d5 = (D) abstractC0037e;
            while (!d5.f391a.isEmpty()) {
                arrayDeque.add((AbstractC0037e) d5.f391a.remove());
            }
            this.f393c += d5.f393c;
            d5.f393c = 0;
            d5.close();
        } else {
            arrayDeque.add(abstractC0037e);
            this.f393c = abstractC0037e.q() + this.f393c;
        }
        if (z5) {
            ((AbstractC0037e) arrayDeque.peek()).e();
        }
    }

    public final void u() throws IOException {
        boolean z4 = this.f394d;
        ArrayDeque arrayDeque = this.f391a;
        if (!z4) {
            ((AbstractC0037e) arrayDeque.remove()).close();
            return;
        }
        this.f392b.add((AbstractC0037e) arrayDeque.remove());
        AbstractC0037e abstractC0037e = (AbstractC0037e) arrayDeque.peek();
        if (abstractC0037e != null) {
            abstractC0037e.e();
        }
    }

    public final int v(C c5, int i, Object obj, int i5) throws IOException {
        a(i);
        ArrayDeque arrayDeque = this.f391a;
        if (!arrayDeque.isEmpty() && ((AbstractC0037e) arrayDeque.peek()).q() == 0) {
            u();
        }
        while (i > 0 && !arrayDeque.isEmpty()) {
            AbstractC0037e abstractC0037e = (AbstractC0037e) arrayDeque.peek();
            int iMin = Math.min(i, abstractC0037e.q());
            i5 = c5.b(abstractC0037e, iMin, obj, i5);
            i -= iMin;
            this.f393c -= iMin;
            if (((AbstractC0037e) arrayDeque.peek()).q() == 0) {
                u();
            }
        }
        if (i <= 0) {
            return i5;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final int w(o2 o2Var, int i, Object obj, int i5) {
        try {
            return v(o2Var, i, obj, i5);
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public D(int i) {
        new ArrayDeque(2);
        this.f391a = new ArrayDeque(i);
    }
}
