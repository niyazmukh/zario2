package k4;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\q.smali */
public final class q {
    private volatile AtomicReferenceArray<Object> array;

    public q(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, m4.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, aVar);
            return;
        }
        int i5 = i + 1;
        int i6 = length * 2;
        if (i5 < i6) {
            i5 = i6;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i5);
        for (int i7 = 0; i7 < length; i7++) {
            atomicReferenceArray2.set(i7, atomicReferenceArray.get(i7));
        }
        atomicReferenceArray2.set(i, aVar);
        this.array = atomicReferenceArray2;
    }
}
