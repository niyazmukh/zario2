package G2;

import E2.G;
import android.content.Context;
import q2.C0849a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G2\b.smali */
public final /* synthetic */ class b implements H2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1845c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f1843a = i;
        this.f1844b = obj;
        this.f1845c = obj2;
    }

    @Override // H2.b
    public final Object get() {
        switch (this.f1843a) {
            case 0:
                return new l((Context) this.f1844b, (String) this.f1845c);
            default:
                q2.f fVar = (q2.f) this.f1844b;
                fVar.getClass();
                C0849a c0849a = (C0849a) this.f1845c;
                return c0849a.f9472e.a(new G(c0849a, fVar));
        }
    }
}
