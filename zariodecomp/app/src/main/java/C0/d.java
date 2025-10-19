package c0;

import B3.RunnableC0040f;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\d.smali */
public final class d extends p1.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f5349f;

    public d(e eVar) {
        this.f5349f = eVar;
    }

    @Override // p1.b
    public final void E(Throwable th) {
        this.f5349f.f5350a.d(th);
    }

    @Override // p1.b
    public final void F(S0.i iVar) {
        e eVar = this.f5349f;
        eVar.f5352c = iVar;
        eVar.f5351b = new S0.c(eVar.f5352c, new J3.c(), eVar.f5350a.h);
        i iVar2 = eVar.f5350a;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        iVar2.f5357a.writeLock().lock();
        try {
            iVar2.f5359c = 1;
            arrayList.addAll(iVar2.f5358b);
            iVar2.f5358b.clear();
            iVar2.f5357a.writeLock().unlock();
            iVar2.f5360d.post(new RunnableC0040f(arrayList, iVar2.f5359c, (Throwable) null));
        } catch (Throwable th) {
            iVar2.f5357a.writeLock().unlock();
            throw th;
        }
    }
}
