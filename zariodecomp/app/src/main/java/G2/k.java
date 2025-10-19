package G2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G2\k.smali */
public final /* synthetic */ class k implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1862c;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.f1860a = i;
        this.f1861b = obj;
        this.f1862c = obj2;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f1860a) {
            case 0:
                a0.b bVar = (a0.b) obj;
                l lVar = (l) this.f1861b;
                lVar.getClass();
                a0.d dVar = l.f1865d;
                String str = (String) this.f1862c;
                bVar.e(dVar, str);
                lVar.d(bVar, str);
                break;
            case 1:
                ((g4.d) this.f1861b).f7607c.removeCallbacks((A3.a) this.f1862c);
                break;
            default:
                ((o4.b) this.f1862c).getClass();
                ((o4.c) this.f1861b).e(null);
                break;
        }
        return K3.k.f2288a;
    }
}
