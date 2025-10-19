package s2;

import java.util.Iterator;

/* renamed from: s2.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\k.smali */
public final class C0875k implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final long f9688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9689b;

    public C0875k(int i) {
        int i5 = i + 1;
        int iFloor = (int) Math.floor(Math.log(i5) / Math.log(2.0d));
        this.f9689b = iFloor;
        this.f9688a = (((long) Math.pow(2.0d, iFloor)) - 1) & i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0867a(this);
    }
}
