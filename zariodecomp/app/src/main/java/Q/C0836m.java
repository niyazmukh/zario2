package q;

import L3.w;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\m.smali */
public final class C0836m extends w {

    /* renamed from: a, reason: collision with root package name */
    public int f9434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0835l f9435b;

    public C0836m(C0835l c0835l) {
        this.f9435b = c0835l;
    }

    @Override // L3.w
    public final int a() {
        int i = this.f9434a;
        this.f9434a = i + 1;
        return this.f9435b.d(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9434a < this.f9435b.f();
    }
}
