package r2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r2.1\e.smali */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f9629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.i f9630d;

    public /* synthetic */ e(f fVar, Runnable runnable, g1.i iVar, int i) {
        this.f9627a = i;
        this.f9628b = fVar;
        this.f9629c = runnable;
        this.f9630d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9627a) {
            case 0:
                f fVar = this.f9628b;
                fVar.getClass();
                final Runnable runnable = this.f9629c;
                final g1.i iVar = this.f9630d;
                final int i = 0;
                fVar.f9631a.execute(new Runnable() { // from class: r2.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e5) {
                                    iVar.D(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e6) {
                                    iVar.D(e6);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                g1.i iVar2 = iVar;
                                try {
                                    runnable2.run();
                                    h hVar = (h) iVar2.f7594b;
                                    hVar.getClass();
                                    if (r.h.f9559f.i(hVar, null, r.h.f9560k)) {
                                        r.h.d(hVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    iVar2.D(e7);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                f fVar2 = this.f9628b;
                fVar2.getClass();
                final Runnable runnable2 = this.f9629c;
                final g1.i iVar2 = this.f9630d;
                final int i5 = 2;
                fVar2.f9631a.execute(new Runnable() { // from class: r2.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e5) {
                                    iVar2.D(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e6) {
                                    iVar2.D(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                g1.i iVar22 = iVar2;
                                try {
                                    runnable22.run();
                                    h hVar = (h) iVar22.f7594b;
                                    hVar.getClass();
                                    if (r.h.f9559f.i(hVar, null, r.h.f9560k)) {
                                        r.h.d(hVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    iVar22.D(e7);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                f fVar3 = this.f9628b;
                fVar3.getClass();
                final Runnable runnable3 = this.f9629c;
                final g1.i iVar3 = this.f9630d;
                final int i6 = 1;
                fVar3.f9631a.execute(new Runnable() { // from class: r2.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e5) {
                                    iVar3.D(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e6) {
                                    iVar3.D(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                g1.i iVar22 = iVar3;
                                try {
                                    runnable22.run();
                                    h hVar = (h) iVar22.f7594b;
                                    hVar.getClass();
                                    if (r.h.f9559f.i(hVar, null, r.h.f9560k)) {
                                        r.h.d(hVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    iVar22.D(e7);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
