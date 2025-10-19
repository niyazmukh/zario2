package q4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\k.smali */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f9534a = new j(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f9535b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f9536c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9535b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f9536c = atomicReferenceArr;
    }

    public static final void a(j segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        if (segment.f9532f != null || segment.f9533g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f9530d) {
            return;
        }
        AtomicReference atomicReference = f9536c[(int) (Thread.currentThread().getId() & (f9535b - 1))];
        j jVar = f9534a;
        j jVar2 = (j) atomicReference.getAndSet(jVar);
        if (jVar2 == jVar) {
            return;
        }
        int i = jVar2 != null ? jVar2.f9529c : 0;
        if (i >= 65536) {
            atomicReference.set(jVar2);
            return;
        }
        segment.f9532f = jVar2;
        segment.f9528b = 0;
        segment.f9529c = i + 8192;
        atomicReference.set(segment);
    }

    public static final j b() {
        AtomicReference atomicReference = f9536c[(int) (Thread.currentThread().getId() & (f9535b - 1))];
        j jVar = f9534a;
        j jVar2 = (j) atomicReference.getAndSet(jVar);
        if (jVar2 == jVar) {
            return new j();
        }
        if (jVar2 == null) {
            atomicReference.set(null);
            return new j();
        }
        atomicReference.set(jVar2.f9532f);
        jVar2.f9532f = null;
        jVar2.f9529c = 0;
        return jVar2;
    }
}
