package y2;

import m.ExecutorC0734a;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\b.1.smali */
public final class C1053b implements w2.i {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC0734a f11078a;

    /* renamed from: b, reason: collision with root package name */
    public final w2.i f11079b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f11080c = false;

    public C1053b(ExecutorC0734a executorC0734a, w2.i iVar) {
        this.f11078a = executorC0734a;
        this.f11079b = iVar;
    }

    @Override // w2.i
    public final void a(Object obj, w2.p pVar) {
        this.f11078a.getClass();
        if (this.f11080c) {
            return;
        }
        this.f11079b.a(obj, pVar);
    }
}
